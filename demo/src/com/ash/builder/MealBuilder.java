package com.ash.builder;

/**
 * <p>
 *
 * </p>
 *
 * @author ash
 * @version 1.0
 * @since 2022/7/19 17:53
 */
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        // meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        // meal.addItem(new Pepsi());
        return meal;
    }
}
