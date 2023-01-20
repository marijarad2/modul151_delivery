package ch.bbw.pr.furniture.control;

import ch.bbw.pr.furniture.model.Furniture;
import ch.bbw.pr.furniture.repository.FurnitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Peter Rutschmann
 * @version 19.01.2023
 */
@Controller
public class ViewController {
   @Autowired
   private FurnitureRepository repo;

   @GetMapping("/")
   public String hello(){
      repo.save(new Furniture());
      return"index";
   }
}
