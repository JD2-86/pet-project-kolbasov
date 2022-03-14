package by.kolbasov.controllers;

import by.kolbasov.dao.CamerasDaoImpl;
import by.kolbasov.entity.Cameras;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class CamDetailsController {
    @Autowired
    CamerasDaoImpl service;
    @GetMapping("/cameras/{id}")
    public String CameraDetails(@PathVariable(value = "id")long id, Model model){
       Cameras cam = service.findById(id);
        model.addAttribute("cam",cam);

        return "camera_details";
    }
}

