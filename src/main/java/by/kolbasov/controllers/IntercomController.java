package by.kolbasov.controllers;

import by.kolbasov.entity.goods.Intercom;
import by.kolbasov.entity.goods.Registrator;
import by.kolbasov.service.intercomService.IntercomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IntercomController {
    @Autowired
    private IntercomService intercomService;

    @GetMapping("/intercoms")
    String Registrator(Model model) {
        List<Intercom> intercoms = intercomService.findAll();
        model.addAttribute("url", "intercoms");
        model.addAttribute("goods", intercoms);
        return "goods";
    }
}
