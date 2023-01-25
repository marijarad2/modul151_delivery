package ch.bbw.pr.furniture.control;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ch.bbw.pr.furniture.model.Delivery;
import ch.bbw.pr.furniture.repository.DeliveryRepository;

import java.util.List;
/**
 * Location-controller
 * Build Location REST API | Postman
 * @author Marija Radovanovic
 * @version 02.01.2023
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/deliveries")
public class DeliveryController {
    @Autowired
    private DeliveryRepository deliveryRepository;
    @GetMapping
    public List<Delivery> getAlldDeliveries(){
        return deliveryRepository.findAll();
    }
    // build create Location REST API
    @PostMapping
    public Delivery createLocation(@RequestBody Delivery delivery) {
        return deliveryRepository.save(delivery);
    }
    // build get Location by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Delivery> getLocationById(@PathVariable  long id){
        Delivery delivery = deliveryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Location existiert nicht mit id:" + id));
        return ResponseEntity.ok(delivery);
    }
    
    // build delete Location REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteLocation(@PathVariable long id){
        Delivery delivery= deliveryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Location existiert nicht mit id: " + id));
        deliveryRepository.delete(delivery);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
  }