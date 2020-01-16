package com.nous.project.template.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nous.project.template.domain.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
	List<ShoppingCart> findByStatus(String status);
}
