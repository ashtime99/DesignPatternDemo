package com.ash.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author ash
 * @version 1.0
 * @since 2022/7/19 18:16
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.getPrice();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.getName());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.getPrice());
        }
    }
}
