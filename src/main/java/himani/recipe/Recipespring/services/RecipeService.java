package himani.recipe.Recipespring.services;

import himani.recipe.Recipespring.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
