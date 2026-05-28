package com.sparta.paymentsystem.domain.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sparta.paymentsystem.domain.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
