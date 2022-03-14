package by.kolbasov.controllers;


import by.kolbasov.dao.CamerasDaoImpl;
import by.kolbasov.entity.Cameras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;


@Controller
public class CamerasController {
    @Autowired
    CamerasDaoImpl service;

    @GetMapping(path = "/cameras")
    public String cameras(Model model){
       List<Cameras> cam =service.findAll();
       model.addAttribute("cam",cam);
        return "cameras";
    }



}
