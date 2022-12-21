package com.example.recipe_api_spring.Recipe;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getRecipes() {
        return recipeRepository.findAll();
    }

    public List<String> emptyFieldsVerify(Recipe recipe) {
        List<String> erros = new ArrayList<>();
        if (recipe.getName().isEmpty())
            erros.add("The field name is required");
        if (recipe.getImage().isEmpty())
            erros.add("The field image is required");
        if (recipe.getDescription().isEmpty())
            erros.add("The field description is required");
        if (String.valueOf(recipe.getRating()).isEmpty())
            erros.add("The field rating is required");
        if (recipe.getTotalTime().isEmpty())
            erros.add("The field total time is required");
        return erros;
    }

    public void addNewRecipe(Recipe recipe) {
        String error = String.join(", ", emptyFieldsVerify(recipe));
        if (!error.isEmpty())
            throw new IllegalStateException(error);
        recipeRepository.save(recipe);
    }

    public void removeRecipe(Long id) {
        boolean exists = recipeRepository.existsById(id);
        if (!exists)
            throw new IllegalStateException("Recipe does not exists");
        recipeRepository.deleteById(id);
    }

}