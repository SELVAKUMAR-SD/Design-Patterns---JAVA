package meal;

import meal.product.Product;
import meal.product.builder.Lunch;
import meal.product.builder.MealBuilder;
import meal.product.driver.Driver;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        MealBuilder lunchBuilder = new Lunch(product);
        Driver driver = new Driver(lunchBuilder);
        driver.constructMeal();
    }
}
