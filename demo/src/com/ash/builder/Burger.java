package com.ash.builder;

/**
 * <p>
 * 汉堡
 * </p>
 *
 * @author ash
 * @version 1.0
 * @since 2022/7/19 18:01
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float getPrice();
}
