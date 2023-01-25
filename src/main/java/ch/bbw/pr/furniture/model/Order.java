package ch.bbw.pr.furniture.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "order")
public class Order{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long orderid;


  @Column(name = "OrderDate")
  private Date OrderDate;

  @OneToOne(mappedBy = "order")
  private OrderDetail orderDetail;
 
}
