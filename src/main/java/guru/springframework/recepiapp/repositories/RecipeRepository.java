package guru.springframework.recepiapp.repositories;

import guru.springframework.recepiapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
