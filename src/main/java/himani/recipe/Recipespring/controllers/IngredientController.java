package himani.recipe.Recipespring.controllers;

import himani.recipe.Recipespring.domain.Ingredient;
import himani.recipe.Recipespring.domain.Recipe;
import himani.recipe.Recipespring.services.IngredientService;
import himani.recipe.Recipespring.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@Slf4j
@RestController
public class IngredientController {
    private final RecipeService recipeService;

    private final IngredientService ingredientService;

    public IngredientController(RecipeService recipeService, IngredientService ingredientService) {
        this.recipeService = recipeService;
        this.ingredientService = ingredientService;
    }


    @RequestMapping("recipe/{id}/ingredients")
    public Set<Ingredient> getListIngredients(@PathVariable String id){
        return recipeService.findIngredients(Long.parseLong(id));
    }

    @RequestMapping("recipe/{recipeid}/ingredient/{id}")
        public Ingredient getIngredient(@PathVariable String id){
            return ingredientService.findById(Long.parseLong(id));
    }

    @RequestMapping("recipe/{recipeid}/ingredient/save")
         public Ingredient saveIngredient(@PathVariable String recipeid ,@RequestBody Ingredient ingredient){
        //ingredient.setRecipe(recipeService.findById(Long.parseLong(recipeid)));
        return ingredientService.save(ingredient);
    }
    @RequestMapping("ingredient/{id}/delete")
    public String deleteIngredient(@PathVariable String id){
        return ingredientService.deleteIngredient(Long.parseLong(id));
    }


}
