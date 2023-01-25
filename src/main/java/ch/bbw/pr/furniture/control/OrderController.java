package ch.bbw.pr.furniture.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.bbw.pr.furniture.model.Order;
import ch.bbw.pr.furniture.repository.OrderRepository;

/**
 * Location-controller
 * Build Location REST API | Postman
 * @author Marija Radovanovic
 * @version 02.01.2023
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;
    @GetMapping
    public List<Order> getAlldOrderies(){
        return orderRepository.findAll();
    }
    // build create Location REST API
    @PostMapping
    public Order createLocation(@RequestBody Order order) {
        return orderRepository.save(order);
    }
    // build get Location by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Order> getLocationById(@PathVariable  long id){
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Location existiert nicht mit id:" + id));
        return ResponseEntity.ok(order);
    }
    
    // build delete Location REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteLocation(@PathVariable long id){
        Order order= OrderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Location existiert nicht mit id: " + id));
        orderRepository.delete(order);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
  }