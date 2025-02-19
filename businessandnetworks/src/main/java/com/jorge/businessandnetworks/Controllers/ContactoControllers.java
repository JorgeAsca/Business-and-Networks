package com.jorge.businessandnetworks.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/contacto")
public class ContactoControllers {

    @GetMapping("/contacto")
    public String contacto(){
        return "/www/site/contacto.html";
    }

}
