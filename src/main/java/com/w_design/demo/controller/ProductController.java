package com.w_design.demo.controller;

import com.w_design.demo.dto.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {


    @GetMapping("getProductById/{id}")
    public Product getProductById(@PathVariable Integer id) {
        Product pr1 =  new Product(id,"laptop",5000.00);
        return pr1;


    }

    @PostMapping("addProduct")
    public Product addProduct(@RequestBody Product product){
        System.out.println(product);

        return product;
    }

    @GetMapping("/hello-spring")
    public String hello(){
        return "Hello from Spring Boot!";
    }

}