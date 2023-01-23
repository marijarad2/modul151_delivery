package ch.bbw.pr.furniture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.bbw.pr.furniture.model.Order;

public interface OrderRepository extends JpaRepository <Order, Long>{
 
  }
