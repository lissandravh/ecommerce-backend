package com.ecommerce_monorepo.backend.dto;

public record ExternalProduct(
        long id,
        String title,
        double price,
        String description,
        String category,
        String image,
        ExternalRating rating
) {
}
