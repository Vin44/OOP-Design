package com.w_design.demo.service;

import com.w_design.demo.dto.DigitalProduct;
import com.w_design.demo.dto.PhysicalProduct;
import com.w_design.demo.dto.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    List<Product> productList = new ArrayList<>();
    Product testDigitalProduct = new DigitalProduct(2131L, "Konindu", 200.00, "https://newworld/1234", 35.5);
    Product testPhysicalProduct = new PhysicalProduct(5678L, "Yoosuf", 500.00, 85.9, "4D");

    Long nextId = 1L;

    public ProductService(){
        productList.add(new DigitalProduct(
                nextId++, "Konindu", 200.00, "https://newworld/1234", 35.5
        ));

        productList.add(new PhysicalProduct(
                nextId++, "Yoosuf", 500.00, 85.9, "4D"
        ));

    }


    public List<Product> getProductList(){
        return  productList;
    }

    public Product addProduct(Product product){
        product.setId(nextId++);
        productList.add(product);
        return product;
    }


}
