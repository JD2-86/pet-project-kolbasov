package by.kolbasov.controllers;

import by.kolbasov.dto.RegistratorDto;
import by.kolbasov.entity.Registrator;
import by.kolbasov.repository.RegistratorRepository;
import by.kolbasov.service.CartService;
import by.kolbasov.service.RegistratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RegistratorController {
    @Autowired
    private RegistratorService registratorService;
    @Autowired
    private CartService cartService;
    @Autowired
    private RegistratorRepository registratorRepository;

    @GetMapping("/registrators")
//    String Registrator(Model model,
//                       @RequestParam(value = "size", required = false,defaultValue = "0") Integer size,
//                       @RequestParam(value = "page", required = false,defaultValue = "9") Integer page) {
//        Page<Registrator> registrators = registratorService.findAll(PageRequest.of(page,size));
//        model.addAttribute("url", "registrators");
//        model.addAttribute("goods", registrators);
//        model.addAttribute("numbers", IntStream.range(0,registrators.getTotalPages()).toArray());
//        return "goods";
    String Registrator(Model model) {
        List <Registrator> registrators = registratorRepository.findAll();
        model.addAttribute("url", "registrators");
        model.addAttribute("goods", registrators);
        return "goods";
    }

    @GetMapping("/registrators/{id}")
    public String CameraDetails(@PathVariable(value = "id") long id, Model model) {
        RegistratorDto registrator = registratorService.findById(id);
        model.addAttribute("registrator", registrator);
        return "registratorDetails";
    }

    @PostMapping(path = "/registrators/{id}")
    public String buy(@PathVariable(value = "id") long id) {
        cartService.saveRegistrator(id, SecurityContextHolder.getContext()
                .getAuthentication().getName());
        return "redirect:/registrators";
    }

    @PostMapping("/registrators/{id}/remove")
    public String removeGoods(@PathVariable(value = "id") long id, @PathVariable(value = "id") String url, Model model) {
        registratorService.delete(id);
        return "redirect:/registrators";
    }

    @GetMapping("/registrators/{id}/edit")
    public String editRegistrator(@PathVariable(value = "id") long id, Model model) {
        RegistratorDto registrator = registratorService.findById(id);
        model.addAttribute("registrator", registrator);
        return "registratorEdit";
    }

    @PostMapping("/registrators/{id}/edit")
    public String saveChange(@ModelAttribute("registrator") Registrator registrator) {
        registratorService.save(registrator);
        return "redirect:/registrator";
    }
}
