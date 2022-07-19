package com.ash.builder;

/**
 * <p>
 *
 * </p>
 *
 * @author ash
 * @version 1.0
 * @since 2022/7/19 18:05
 */
public class ChickenBurger extends Burger {
    @Override
    public String getName() {
        return "香辣鸡腿堡";
    }

    @Override
    public float getPrice() {
        return 15.5F;
    }
}
