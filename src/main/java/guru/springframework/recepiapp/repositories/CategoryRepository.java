package guru.springframework.recepiapp.repositories;


import guru.springframework.recepiapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 6/13/17.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
