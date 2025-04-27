package com.example.product_service.service;

import com.example.product_service.dto.ProductRequest;
import com.example.product_service.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    public void creteProduct(ProductRequest productRequest);
    public List<ProductResponse> getAllProducts();
}
