package com.example.inventory_service.controller;

import com.example.inventory_service.dto.InventoryResponse;
import com.example.inventory_service.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/inventory")
@RestController
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    //      http://localhost:8083/api/v1/inventory?sku-code=iphone-13&sku-code=iphone-14
    @GetMapping()
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}
