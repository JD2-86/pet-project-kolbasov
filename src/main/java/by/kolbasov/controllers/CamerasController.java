package by.kolbasov.controllers;


import by.kolbasov.entity.Cameras;
import by.kolbasov.service.CamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class CamerasController {

    @Autowired
    private CamService camService;

    @GetMapping(path = "/cameras")
    public String cameras(Model model) {
        List<Cameras> cam = camService.findAll();
        model.addAttribute("cam", cam);
        return "cameras";
    }

}
