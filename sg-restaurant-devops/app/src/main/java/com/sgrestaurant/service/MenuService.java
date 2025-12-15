package com.sgrestaurant.service;

import com.sgrestaurant.model.MenuItem;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MenuService {

    public List<MenuItem> getVegItems() {
        return Arrays.asList(
                new MenuItem("Veg Biryani", 120),
                new MenuItem("Paneer Butter Masala", 160),
                new MenuItem("Veg Thali", 100)
        );
    }

    public List<MenuItem> getNonVegItems() {
        return Arrays.asList(
                new MenuItem("Chicken Biryani", 180),
                new MenuItem("Mutton Fry", 240),
                new MenuItem("Fish Curry", 200)
        );
    }

    public MenuItem getItem(String name) {
        return new MenuItem(name, 150);
    }
}