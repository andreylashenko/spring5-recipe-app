package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long id);

    void deleteRecipeIngredient(Long recipeId, Long id);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
