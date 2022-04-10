package by.kolbasov.controllers;


import by.kolbasov.entity.goods.Camera;
import by.kolbasov.entity.goods.Intercom;
import by.kolbasov.entity.goods.Registrator;
import by.kolbasov.repository.IntercomRepository;
import by.kolbasov.service.camService.CamService;
import by.kolbasov.service.intercomService.IntercomService;
import by.kolbasov.service.regService.RegistratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddGoodsController {
    @Autowired
    private CamService camService;
    @Autowired
    private RegistratorService registratorService;
    @Autowired
    private IntercomService intercomService;

    @GetMapping("/addGoods")
    public String AddGoods(Model model) {
        model.addAttribute("camera", new Camera());
        return "addCamera";
    }

    @PostMapping("/addGoods")
    public String SaveGoods(@ModelAttribute("camera") Camera camera) {
        Camera newCamera = camera;
        camService.save(newCamera);
        return "redirect:/cameras";
    }

    @GetMapping("/addRegistrator")
    public String AddRegistrator(Model model) {
        model.addAttribute("registrator", new Registrator());
        return "addRegistrator";
    }

    @PostMapping("/addRegistrator")
    public String SaveRegistrator(@ModelAttribute("registrator") Registrator registrator) {
        Registrator newReistrator = registrator;
        registratorService.save(newReistrator);
        return "redirect:/registrators";
    }

    @GetMapping("/addIntercom")
    public String AddIntercom(Model model) {
        model.addAttribute("intercom", new Intercom());
        return "addIntercom";
    }

    @PostMapping("/addIntercom")
    public String SaveIntercom(@ModelAttribute("intercom") Intercom intercom) {
        Intercom newIntercom = intercom;
        intercomService.save(newIntercom);
        return "redirect:/intercoms";
    }

}
