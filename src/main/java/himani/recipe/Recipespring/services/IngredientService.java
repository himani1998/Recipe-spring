package himani.recipe.Recipespring.services;

import himani.recipe.Recipespring.domain.Ingredient;


public interface IngredientService {
    public Ingredient findById(Long id);
    public Ingredient save(Ingredient ingredient);
    public String deleteIngredient(Long id);

}
