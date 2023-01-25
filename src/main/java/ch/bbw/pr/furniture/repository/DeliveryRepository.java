package ch.bbw.pr.furniture.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import ch.bbw.pr.furniture.model.Delivery;

//Auswertung der Daten mittels SQL Queries 
public interface DeliveryRepository extends JpaRepository <Delivery, Long>{
 
}
