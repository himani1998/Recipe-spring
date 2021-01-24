package himani.recipe.Recipespring.services;

import himani.recipe.Recipespring.domain.Ingredient;
import himani.recipe.Recipespring.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    public Recipe findById(Long id);
    public Recipe saveRecipe(Recipe recipe);
    public String deleteRecipe(Long id);
    public Set<Ingredient> findIngredients(Long id);


}
