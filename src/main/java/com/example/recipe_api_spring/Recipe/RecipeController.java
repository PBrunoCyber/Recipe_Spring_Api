package com.example.recipe_api_spring.Recipe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/recipe")
public class RecipeController {
    private final RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public List<Recipe> getRecipe() {
        return recipeService.getRecipes();
    }

    @PostMapping
    public void addNewRecipe(Recipe recipe) {
        recipeService.addNewRecipe(recipe);
    }

    @DeleteMapping
    public void removeRecipe(Long id) {
        recipeService.removeRecipe(id);
    }

}
