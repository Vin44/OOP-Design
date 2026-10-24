package com.w_design.demo.controller;

import com.w_design.demo.dto.Product;
import com.w_design.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

@Autowired
    ProductService productService;

    @GetMapping("getProductById/{id}")
    public Product getProductById(@PathVariable Long id) {
        Product pr1 =  new Product(id,"laptop",5000.00);
        return pr1;


    }

    @GetMapping("/hello-spring")
    public String hello(){
        return "Hello from Spring Boot!";
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(){
        return productService.getProductList();
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
}