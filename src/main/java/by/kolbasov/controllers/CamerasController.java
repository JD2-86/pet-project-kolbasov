package by.kolbasov.controllers;


import by.kolbasov.entity.goods.Camera;
import by.kolbasov.service.camService.CamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class CamerasController {
  //  private static final Logger logger = LogManager.getLogger(CamerasController.class);
    @Autowired
    private CamService camService;


    @GetMapping(path = "/cameras")
    public String cameras(Model model) {

       // logger.info("Cameras logger: hello!");

        List<Camera> cameras = camService.findAll();
        model.addAttribute("url","cameras");
        model.addAttribute("goods", cameras);
        return "goods";
    }

}
