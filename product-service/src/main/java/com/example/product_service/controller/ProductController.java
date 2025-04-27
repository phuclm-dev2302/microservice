package com.example.product_service.controller;

import com.example.product_service.dto.ProductRequest;
import com.example.product_service.dto.ProductResponse;
import com.example.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("")
    public void creteProduct(@RequestBody ProductRequest productRequest) {
        productService.creteProduct(productRequest);
    }

    @GetMapping()
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }

}
