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

import ch.bbw.pr.furniture.model.OrderDetail;
import ch.bbw.pr.furniture.repository.OrderDetailRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/orderdetails")
public class OrderDetailController {
    @Autowired
    private OrderDetailRepository orderdetailRepository;
    @GetMapping
    public List<OrderDetail> getAlldOrderies(){
        return orderdetailRepository.findAll();
    }
    // build create Location REST API
    @PostMapping
    public OrderDetail createLocation(@RequestBody OrderDetail orderDetail) {
        return orderdetailRepository.save(orderDetail);
    }
    // build get Location by id REST API
    @GetMapping("{id}")
    public ResponseEntity<OrderDetail> getLocationById(@PathVariable  long id){
        OrderDetail orderDetail = orderdetailRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Location existiert nicht mit id:" + id));
        return ResponseEntity.ok(orderDetail);
    }
    
    // build delete Location REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteLocation(@PathVariable long id){
        OrderDetail orderDetail= OrderDetailRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Location existiert nicht mit id: " + id));
                OrderDetailRepository.delete(orderDetail);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
  }