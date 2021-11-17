package com.graphql.example.graphqlexample.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.example.graphqlexample.dto.ProductDto;
import com.graphql.example.graphqlexample.entity.Product;
import com.graphql.example.graphqlexample.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductMutationResolver implements GraphQLMutationResolver {

    private final ProductRepository productRepository;

    public Product createProduct(ProductDto productDto) {
        return productRepository.save(map(productDto));
    }

    private Product map(ProductDto productDto) {
        final Product product = new Product();
        product.setTitle(productDto.getTitle());
        product.setDescription(productDto.getDescription());
        product.setStock(productDto.getStock());

        return product;
    }

}
