package com.nous.project.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nous.project.template.domain.Product;

/**
 * Created by sahan on 4/8/2016.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
