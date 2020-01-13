package com.nous.project.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nous.project.template.domain.ShoppingCart;

import java.util.List;

/**
 * Created by sahan on 4/9/2016.
 */
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    List<ShoppingCart> findByStatus(String status);
}
