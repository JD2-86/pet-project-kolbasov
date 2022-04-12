//package by.kolbasov.controllers;
//
//import by.kolbasov.entity.Registrator;
//import by.kolbasov.service.CartService;
//import by.kolbasov.service.RegistratorService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//
//@Controller
//public class RegDetailsController {
//    @Autowired
//    private RegistratorService registratorService;
//    @Autowired
//    private CartService cartService;
//
//    @GetMapping("/registrators/{id}")
//    public String CameraDetails(@PathVariable(value = "id") long id, Model model) {
//        Registrator registrator = registratorService.findById(id);
//        model.addAttribute("registrator", registrator);
//        return "registratorDetails";
//    }
//
//    @PostMapping(path = "/registrators/{id}")
//    public String buy(@PathVariable(value = "id") long id) {
//        cartService.saveRegistrator(id,SecurityContextHolder.getContext()
//                .getAuthentication().getName());
//        return "redirect:/registrators";
//    }
//}
