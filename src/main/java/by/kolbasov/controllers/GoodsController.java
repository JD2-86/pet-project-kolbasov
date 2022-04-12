package by.kolbasov.controllers;


import by.kolbasov.entity.Camera;
import by.kolbasov.entity.Intercom;
import by.kolbasov.entity.Registrator;
import by.kolbasov.service.CamService;
import by.kolbasov.service.IntercomService;
import by.kolbasov.service.RegistratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GoodsController {
    @Autowired
    private CamService camService;
    @Autowired
    private RegistratorService registratorService;
    @Autowired
    private IntercomService intercomService;

    @GetMapping("/addCamera")
    public String AddCamera(Model model) {
        model.addAttribute("camera", new Camera());
        return "addCamera";
    }

    @PostMapping("/addCamera")
    public String SaveGoods(@ModelAttribute("camera") Camera camera) {
        camService.save(camera);
        return "redirect:/cameras";
    }

    @GetMapping("/addRegistrator")
    public String AddRegistrator(Model model) {
        model.addAttribute("registrator", new Registrator());
        return "addRegistrator";
    }

    @PostMapping("/addRegistrator")
    public String SaveRegistrator(@ModelAttribute("registrator") Registrator registrator) {
        registratorService.save(registrator);
        return "redirect:/registrators";
    }

    @GetMapping("/addIntercom")
    public String AddIntercom(Model model) {
        model.addAttribute("intercom", new Intercom());
        return "addIntercom";
    }

    @PostMapping("/addIntercom")
    public String SaveIntercom(@ModelAttribute("intercom") Intercom intercom) {
        intercomService.save(intercom);
        return "redirect:/intercoms";
    }

}
