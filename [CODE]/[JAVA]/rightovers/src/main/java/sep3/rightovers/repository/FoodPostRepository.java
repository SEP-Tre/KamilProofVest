package sep3.rightovers.repository;

import org.springframework.data.repository.CrudRepository;
import sep3.rightovers.model.FoodPost;

public interface FoodPostRepository extends CrudRepository<FoodPost, Integer> {
}
