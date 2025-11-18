package com.ecommerce_monorepo.backend.service;

import com.ecommerce_monorepo.backend.dto.ExternalProduct;
import com.ecommerce_monorepo.backend.model.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> findAll();

    ExternalProduct[] syncProducts();
}
