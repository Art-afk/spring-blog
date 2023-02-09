package com.madgods.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
   // public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    @GetMapping("/about")
     public String about(Model model) {
        model.addAttribute("title", "page about us");
        return "about";
    }
}