package himani.recipe.Recipespring.repositories;

import himani.recipe.Recipespring.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
