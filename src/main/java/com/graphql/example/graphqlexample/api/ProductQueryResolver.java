package com.graphql.example.graphqlexample.api;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.example.graphqlexample.entity.Product;
import com.graphql.example.graphqlexample.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ProductQueryResolver implements GraphQLQueryResolver {

    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProducts(String title) {
        return productRepository.getByTitleLike(title);
    }

    public Optional<Product> getProduct(Long id) {
        return productRepository.findById(id);
    }
}
