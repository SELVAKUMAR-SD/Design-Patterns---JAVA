package meal.product.driver;

import meal.product.Product;
import meal.product.builder.MealBuilder;

public class Driver {
    private final MealBuilder mealBuilder;

    public Driver(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Product constructMeal() {
        this.mealBuilder.buildMainDish();
        this.mealBuilder.buildSideDish();
        this.mealBuilder.buildDrink();
        this.mealBuilder.buildDesert();
        return this.mealBuilder.getMeal();
    }
}
