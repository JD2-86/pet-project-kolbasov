package by.kolbasov.controllers;

import by.kolbasov.dto.IntercomDto;
import by.kolbasov.entity.Intercom;
import by.kolbasov.service.CartService;
import by.kolbasov.service.IntercomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class IntercomController {
    @Autowired
    private IntercomService intercomService;
    @Autowired
    private CartService cartService;
    @GetMapping("/intercoms")
    String Registrator(Model model) {
        List<IntercomDto> intercoms = intercomService.findAll();
        model.addAttribute("url", "intercoms");
        model.addAttribute("goods", intercoms);
        return "goods";
    }

    @GetMapping("/intercoms/{id}")
    public String CameraDetails(@PathVariable(value = "id") long id, Model model) {
        IntercomDto intercom = intercomService.findById(id);
        model.addAttribute("intercom", intercom);
        return "intercomDetails";
    }

    @PostMapping( "/intercoms/{id}")
    public String buy(@PathVariable(value = "id") long id) {
        cartService.saveIntercom(id, SecurityContextHolder.getContext()
                .getAuthentication().getName());
        return "redirect:/intercoms";
    }
    @PostMapping("/intercoms/{id}/remove")
    public String removeGoods(@PathVariable(value = "id") long id,@PathVariable(value = "id") String url, Model model)
    {
        intercomService.delete(id);
        return "redirect:/intercoms";
    }
    @GetMapping("/intercoms/{id}/edit")
    public String editRegistrator(@PathVariable(value = "id") long id, Model model) {
        IntercomDto intercom = intercomService.findById(id);
        model.addAttribute("intercom", intercom);
        return "intercomEdit";
    }

    @PostMapping("/intercoms/{id}/edit")
    public String saveChange(@ModelAttribute("intercom") Intercom intercom) {
        intercomService.save(intercom);
        return "redirect:/intercoms";
    }
}
