package com.ash.builder;

/**
 * <p>
 * 食物项目，比如汉堡、薯条
 * </p>
 *
 * @author ash
 * @version 1.0
 * @since 2022/7/19 17:54
 */
public interface Item {
    /**
     * 获取名字
     *
     * @param
     * @return java.lang.String
     * @author ash
     */
    String getName();

    /**
     * 打包
     *
     * @param
     * @return java.lang.String
     * @author ash
     */
    Packing packing();

    /**
     * 获取价格
     *
     * @param
     * @return java.lang.String
     * @author ash
     */
    float getPrice();
}
