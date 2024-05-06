package meal.product.builder;

import meal.product.Product;

public interface MealBuilder {
    public void buildMainDish();

    public void buildSideDish();

    public void buildDrink();

    public void buildDesert();

    Product getMeal();
}
