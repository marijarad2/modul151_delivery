
package ch.bbw.pr.furniture.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.JoinColumn;


//import javax.persistence.*;

//testtest first commit

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "delivery")
public class Delivery {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long deliveryid;
  @Column(name = "deliveryDate")
  private Date deliveryDate;

  @ManyToMany(cascade = {CascadeType.ALL}) 
  @JoinTable( 
   name = "OrderDetailDelivery", 
   joinColumns = {@JoinColumn(name = "orderdetailidfs")}, 
   inverseJoinColumns = {@JoinColumn(name = "deliveryidfs")} 
  ) 
  List<OrderDetail> orderdetails = new ArrayList<>();
}
