package com.sgrestaurant.controller;

import com.sgrestaurant.model.MenuItem;
import com.sgrestaurant.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/veg")
    public String vegMenu(Model model) {
        model.addAttribute("items", menuService.getVegItems());
        return "veg";
    }

    @GetMapping("/nonveg")
    public String nonVegMenu(Model model) {
        model.addAttribute("items", menuService.getNonVegItems());
        return "nonveg";
    }
}