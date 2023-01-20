package ch.bbw.pr.furniture.repository;

import ch.bbw.pr.furniture.model.Furniture;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Peter Rutschmann
 * @version 19.01.2023
 */
public interface FurnitureRepository  extends CrudRepository<Furniture, Integer> {
}
