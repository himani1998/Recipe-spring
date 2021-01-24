package himani.recipe.Recipespring.services;

import himani.recipe.Recipespring.domain.Recipe;
import himani.recipe.Recipespring.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


class RecipeImplServiceTest {
     RecipeService recipeService;

     @Mock
     RecipeRepository recipeRepository;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        recipeService= new RecipeImplService(recipeRepository);
    }

    @Test
    void getRecipes() {
        Recipe recipe= new Recipe();
        Set<Recipe> recipeSet= new HashSet<>();
        recipeSet.add(recipe);
        when(recipeRepository.findAll()).thenReturn(recipeSet);

        Set<Recipe> recipes= recipeService.getRecipes();
        assertEquals(1,recipes.size());
        verify(recipeRepository,times(1)).findAll();

    }
}