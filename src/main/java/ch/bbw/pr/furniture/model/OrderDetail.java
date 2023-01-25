package ch.bbw.pr.furniture.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name= "orderDetail")
public class OrderDetail{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long OrderDetailid;

  
  @Column(name = "ProductQuantity")
  private int ProductQuantity;

  //Beziehung ManyToMany
  @ManyToMany()
  List<Delivery> deliveries = new ArrayList<>();

  @OneToOne
  @JoinColumn(name = "orderidfs")
  private Order order;
}