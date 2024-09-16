package com.lilase.recipesweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipesController {
    @GetMapping("/Rezepte")
    public String index() {
        return "Rezepte";
    }
}
