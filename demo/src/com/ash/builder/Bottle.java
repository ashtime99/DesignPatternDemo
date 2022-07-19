package com.ash.builder;

/**
 * <p>
 * 瓶子
 * </p>
 *
 * @author ash
 * @version 1.0
 * @since 2022/7/19 18:00
 */
public class Bottle implements Packing{
    @Override
    public String pack() {
        return "Bottle";
    }
}
