package ch.bbw.pr.furniture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.bbw.pr.furniture.model.Product;

public interface ProductRepository extends JpaRepository <Product, Long>{
 
  }
