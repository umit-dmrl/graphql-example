package com.graphql.example.graphqlexample.repository;

import com.graphql.example.graphqlexample.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> getByTitleLike(String title);
}
