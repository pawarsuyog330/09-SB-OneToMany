package com.ashokit.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.jpa.entities.ProductEntity;

public interface ProductEntityRepository extends JpaRepository<ProductEntity, Integer> {

}
