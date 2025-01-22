package com.example.inventory.bill.generation.Controllers;

import com.example.inventory.bill.generation.Models.Product;
import com.example.inventory.bill.generation.Models.ResponseDTO;
import com.example.inventory.bill.generation.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("saveProduct")
    public ResponseDTO<List<Product>> saveProduct(@RequestBody List<Product> products) {
        return productService.saveProduct(products);
    }

}