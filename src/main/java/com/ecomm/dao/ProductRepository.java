package com.ecomm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecomm.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
