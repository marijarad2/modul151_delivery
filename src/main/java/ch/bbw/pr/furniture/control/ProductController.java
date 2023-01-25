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

import ch.bbw.pr.furniture.model.Product;
import ch.bbw.pr.furniture.repository.ProductRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping
    public List<Product> getAlldOrderies(){
        return productRepository.findAll();
    }
    // build create Location REST API
    @PostMapping
    public Product createLocation(@RequestBody Product product) {
        return productRepository.save(product);
    }
    // build get Location by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Product> getLocationById(@PathVariable  long id){
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Location existiert nicht mit id:" + id));
        return ResponseEntity.ok(product);
    }
    
    // build delete Location REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteLocation(@PathVariable long id){
        Product product= ProductRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Location existiert nicht mit id: " + id));
                productRepository.delete(product);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
  }
