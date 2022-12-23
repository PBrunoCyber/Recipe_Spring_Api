package com.example.recipe_api_spring.Recipe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

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


    public void addNewRecipe(Recipe recipe) {
        if (recipe.getName().isEmpty() || 
            recipe.getDescription().isEmpty() || 
            recipe.getImage().isEmpty() ||
            recipe.getName().isEmpty() || 
            recipe.getRating() == 0 || 
            recipe.getTotalTime().isEmpty()
        )
            throw new IllegalStateException("Há campo(s) vazio(s), verifique e tente novamente!");
        recipeRepository.save(recipe);
    }

    public void removeRecipe(Long id) {
        boolean exists = recipeRepository.existsById(id);
        if (!exists)
            throw new IllegalStateException("Recipe does not exists");
        recipeRepository.deleteById(id);
    }

    @Transactional
    public void updateRecipe(Long id, String name, String description,
            String image, String totalTime, double rating) {
        Recipe recipe = recipeRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Recipe was not found!"));
        if (name != null && name.length() > 0)
            recipe.setName(name);
        if (description != null && description.length() > 0)
            recipe.setDescription(description);
        if (totalTime != null && totalTime.length() > 0)
            recipe.setTotalTime(totalTime);
        if (image != null && image.length() > 0)
            recipe.setImage(image);
        if (!String.valueOf(rating).isEmpty())
            recipe.setRating(rating);

    }

}
