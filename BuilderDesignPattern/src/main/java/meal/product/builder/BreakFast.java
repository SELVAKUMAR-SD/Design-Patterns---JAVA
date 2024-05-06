package meal.product.builder;

import meal.product.Product;

public class BreakFast implements MealBuilder {
    private final Product product;

    BreakFast(Product product) {
        this.product = product;
    }

    @Override
    public void buildMainDish() {
        this.product.setMainDish("");
    }

    @Override
    public void buildSideDish() {
        this.product.setSideDish("");
    }

    @Override
    public void buildDrink() {
        this.product.setDrink("");
    }

    @Override
    public void buildDesert() {
        this.product.setDesert("");
    }

    @Override
    public Product getMeal() {
        return this.product;
    }
}
