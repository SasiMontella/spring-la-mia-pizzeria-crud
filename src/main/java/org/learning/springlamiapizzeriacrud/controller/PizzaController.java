package org.learning.springlamiapizzeriacrud.controller;

import org.learning.springlamiapizzeriacrud.model.Pizza;
import org.learning.springlamiapizzeriacrud.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pizza")
public class PizzaController {
    @Autowired
    private PizzaRepository pizzarepository;
    @GetMapping
    public String index(Model model){
        List<Pizza> pizzalist = pizzarepository.findAll();
        model.addAttribute("pizzalist", pizzalist);
        return "";
    }
}
