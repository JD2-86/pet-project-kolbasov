package by.kolbasov.controllers;


import by.kolbasov.dto.CameraDto;
import by.kolbasov.entity.Camera;
import by.kolbasov.service.CamService;
import by.kolbasov.service.CartService;
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
public class CamerasController {
    //  private static final Logger logger = LogManager.getLogger(CamerasController.class);
    @Autowired
    private CamService camService;
    @Autowired
    private CartService cartService;

    @GetMapping(path = "/cameras")
    public String cameras(Model model) {

        // logger.info("Cameras logger: hello!");

        List<CameraDto> cameras = camService.findAll();
        model.addAttribute("url", "cameras");
        model.addAttribute("goods", cameras);
        return "goods";
    }

    @GetMapping("/cameras/{id}")
    public String сameraDetails(@PathVariable(value = "id") long id, Model model) {
        CameraDto cam = camService.findById(id);
        model.addAttribute("cam", cam);
        return "cameraDetails";
    }

    @PostMapping("/cameras/{id}")
    public String buy(@PathVariable(value = "id") long id) {
        cartService.saveCamera(id, SecurityContextHolder.getContext()
                .getAuthentication().getName());
        return "redirect:/cameras";
    }

    @PostMapping("/cameras/{id}/remove")
    public String removeCamera(@PathVariable(value = "id") long id, Model model) {
        camService.delete(id);
        return "redirect:/cameras";
    }

    @GetMapping("/cameras/{id}/edit")
    public String editCamera(@PathVariable(value = "id") long id, Model model) {
        CameraDto cam = camService.findById(id);
        model.addAttribute("cam", cam);
        return "camEdit";
    }

    @PostMapping("/cameras/{id}/edit")
    public String saveChange(@ModelAttribute("cam") Camera cam) {
        camService.save(cam);
        return "redirect:/cameras";
    }

}
