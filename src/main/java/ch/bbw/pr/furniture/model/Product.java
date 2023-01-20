package ch.bbw.pr.furniture.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "product")
public class Product{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long Productid;

  @ManyToOne 
  @JoinColumn(name = "orderDetailidfs")
  private OrderDetail orderDetail;

  
}

