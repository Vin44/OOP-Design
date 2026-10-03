package com.w_design.demo.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class Product {

    private Integer id;
    private String name;
    private double price;

    }
}
