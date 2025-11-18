package com.ecommerce_monorepo.backend.service;

import com.ecommerce_monorepo.backend.dto.ExternalProduct;
import com.ecommerce_monorepo.backend.model.ProductEntity;
import com.ecommerce_monorepo.backend.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
@AllArgsConstructor
@Log
public class ProductServiceImpl implements ProductService {
    private final RestClient restClient;
    private final ProductRepository productRepository;


    @Override
    public List<ProductEntity> findAll() {
        return productRepository.findAll();
    }

    @Override
    public ExternalProduct[] syncProducts() {
        if (!findAll().isEmpty()) {
            log.info("Borrowing all products");
            productRepository.deleteAll();
        }

        ExternalProduct[] externalProducts = restClient.get()
                .uri("/products")
                .retrieve()
                .body(ExternalProduct[].class);
        log.info("Productos encontrados: " + externalProducts.length);

        List<ProductEntity> products = Arrays.stream(externalProducts)
                .map(ext -> {
                    ProductEntity p = new ProductEntity();
                    p.setExternalId(ext.id());
                    p.setTitle(ext.title());
                    p.setPrice(ext.price());
                    p.setDescription(ext.description());
                    p.setCategory(ext.category());
                    p.setImage(ext.image());
                    if (ext.rating() != null) {
                        p.setRate(ext.rating().rate());
                        p.setCount(ext.rating().count());
                    }
                    return p;
                })
                .toList();
        productRepository.saveAll(products);

        return externalProducts;
    }
}
