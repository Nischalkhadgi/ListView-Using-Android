package com.example.batman.dec6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProvider {

    public static List<Product> productList = new ArrayList<>();
    public static Map<String, Product> productMap = new HashMap<>();

    static {
        addProduct("shirt101",
                "training tank",
                "It is made up of organic cotton",
                35
        );
        addProduct("jacket101",
                "Bamboo thermal ski coat",
                "You’ll be the most environmentally conscious skier on the slopes - and the most stylish - wearing our fitted bamboo thermal ski coat, made from organic bamboo with recycled plastic down filling.",
                128);

        addProduct("pants101",
                "Stretchy dance pants",
                "Whether dancing the samba, mastering a yoga pose, or scaling the climbing wall, our stretchy dance pants, made from 80% organic cotton and 20% Lycra, are the most versatile and comfortable workout pants you’ll ever have the pleasure of wearing.",
                85);

        addProduct("shirt102",
                "Ultra-soft tank top",
                "This versatile tank can be worn in the gym, under a blazer, or for a day out in the sun. Made from our patented organic bamboo and cotton mix, our ultra-soft tank never stops feeling soft, even when you forget the fabric softener.",
                23);
    }
    private static void addProduct(String itemId, String name,
                                   String description, double price) {
        Product item = new Product(itemId, name, description, price);
        productList.add(item);
        productMap.put(itemId, item);
    }
}
