//package by.kolbasov.controllers;
//
//import by.kolbasov.entity.Camera;
//import by.kolbasov.service.CamService;
//import by.kolbasov.service.CartService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//
//@Controller
//public class CamDetailsController {
//
//    @Autowired
//    private CamService camService;
//
//    @Autowired
//    private CartService cartService;
//
//    @GetMapping("/cameras/{id}")
//    public String сameraDetails(@PathVariable(value = "id") long id, Model model) {
//        Camera cam = camService.findById(id);
//        model.addAttribute("cam", cam);
//        return "cameraDetails";
//    }
//
//    @PostMapping("/cameras/{id}")
//    public String buy(@PathVariable(value = "id") long id) {
//        cartService.saveCamera(id,SecurityContextHolder.getContext()
//                .getAuthentication().getName());
//        return "redirect:/cameras";
//    }
//}
//
