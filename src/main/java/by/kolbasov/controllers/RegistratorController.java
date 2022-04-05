package by.kolbasov.controllers;

import by.kolbasov.entity.goods.Registrator;
import by.kolbasov.repository.RegistratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RegistratorController {
    @Autowired
   private RegistratorRepository registratorRepository;
    @GetMapping("/registrators")
    String Registrator (Model model){
        List<Registrator> registrators = registratorRepository.findAll();
        model.addAttribute("url","registrators");
        model.addAttribute("goods", registrators);
        return "goods";
    }
}
