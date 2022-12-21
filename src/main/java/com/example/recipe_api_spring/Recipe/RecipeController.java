package com.example.recipe_api_spring.Recipe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public void addNewRecipe(@RequestBody Recipe recipe) {
        recipeService.addNewRecipe(recipe);
    }

    @DeleteMapping(path = "{recipeId}")
    public void removeRecipe(@PathVariable("recipeId") Long id) {
        recipeService.removeRecipe(id);
    }

    @PutMapping(path = "{recipeId}")
    public void updateRecipe(@PathVariable("recipeId") Long id, @RequestParam(required = false) String name,
            @RequestParam(required = false) String description, @RequestParam(required = false) String totalTime,
            @RequestParam(required = false) double rating, @RequestParam(required = false) String image) {
        recipeService.updateRecipe(id, name, description, image, totalTime, rating);
    }

}
