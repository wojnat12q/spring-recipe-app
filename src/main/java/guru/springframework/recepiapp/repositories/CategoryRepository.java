package guru.springframework.recepiapp.repositories;

import guru.springframework.recepiapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
