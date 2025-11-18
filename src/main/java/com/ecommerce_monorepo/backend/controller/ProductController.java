package com.ecommerce_monorepo.backend.controller;

import com.ecommerce_monorepo.backend.dto.ExternalProduct;
import com.ecommerce_monorepo.backend.model.ProductEntity;
import com.ecommerce_monorepo.backend.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ProductController {

    private final ProductService  productService;


    @PostMapping("/seed")
    public ResponseEntity<ExternalProduct[]> sync() {
        return ResponseEntity.ok(productService.syncProducts());
    }


    @GetMapping("/products")
    public ResponseEntity<List<ProductEntity>> getAllProducts() {
    return ResponseEntity.ok(productService.findAll());
}
}
