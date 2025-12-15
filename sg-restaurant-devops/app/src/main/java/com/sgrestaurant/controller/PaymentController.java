package com.sgrestaurant.controller;

import com.sgrestaurant.model.MenuItem;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {

    @GetMapping("/payment")
    public String payment(HttpSession session, Model model) {
        MenuItem item = (MenuItem) session.getAttribute("cartItem");
        model.addAttribute("amount", item != null ? item.getPrice() : 0);
        return "payment";
    }

    @GetMapping("/success")
    public String success() {
        return "success";
    }
}