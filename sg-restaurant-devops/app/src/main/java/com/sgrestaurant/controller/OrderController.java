package com.sgrestaurant.controller;

import com.sgrestaurant.model.MenuItem;
import com.sgrestaurant.service.MenuService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class OrderController {

    @Autowired
    private MenuService menuService;

    @PostMapping("/addToCart")
    public String addToCart(@RequestParam String name, HttpSession session) {
        MenuItem item = menuService.getItem(name);
        session.setAttribute("cartItem", item);
        return "redirect:/cart";
    }

    @GetMapping("/cart")
    public String viewCart(HttpSession session, Model model) {
        model.addAttribute("item", session.getAttribute("cartItem"));
        return "cart";
    }
}