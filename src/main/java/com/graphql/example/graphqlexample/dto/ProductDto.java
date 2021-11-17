package com.graphql.example.graphqlexample.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ProductDto {

    private String title;
    private String description;
    private Long stock;
}
