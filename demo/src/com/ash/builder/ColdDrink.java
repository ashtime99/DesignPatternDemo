package com.ash.builder;

/**
 * <p>
 * 冷饮
 * </p>
 *
 * @author ash
 * @version 1.0
 * @since 2022/7/19 18:03
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float getPrice();
}
