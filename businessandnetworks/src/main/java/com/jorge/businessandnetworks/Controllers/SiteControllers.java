package com.jorge.businessandnetworks.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteControllers {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("titulo", "Página de Inicio");
        return "/www/site/index";
    }

    // @GetMapping("/about")
    // public String about(Model model) {
    //     model.addAttribute("titulo", "Sobre Nosotros");
    //     return "views/about";
    // }
}
