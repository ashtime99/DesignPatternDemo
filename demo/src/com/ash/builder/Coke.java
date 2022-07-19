package com.ash.builder;

/**
 * <p>
 * 可乐
 * </p>
 *
 * @author ash
 * @version 1.0
 * @since 2022/7/19 18:08
 */
public class Coke extends ColdDrink{
    @Override
    public String getName() {
        return "可口可乐";
    }

    @Override
    public float getPrice() {
        return 5.5F;
    }
}
