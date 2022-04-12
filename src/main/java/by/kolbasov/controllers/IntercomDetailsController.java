//package by.kolbasov.controllers;
//
//import by.kolbasov.entity.Intercom;
//import by.kolbasov.service.CartService;
//import by.kolbasov.service.IntercomService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class IntercomDetailsController {
//    @Autowired
//    private IntercomService intercomService;
//
//    @Autowired
//    private CartService cartService;
//
//    @GetMapping("/intercoms/{id}")
//    public String CameraDetails(@PathVariable(value = "id") long id, Model model) {
//        Intercom intercom = intercomService.findById(id);
//        model.addAttribute("intercom", intercom);
//        return "intercomDetails";
//    }
//
//    @PostMapping( "/intercoms/{id}")
//    public String buy(@PathVariable(value = "id") long id) {
//        cartService.saveIntercom(id,SecurityContextHolder.getContext()
//                .getAuthentication().getName());
//        return "redirect:/intercoms";
//    }
//
//}
