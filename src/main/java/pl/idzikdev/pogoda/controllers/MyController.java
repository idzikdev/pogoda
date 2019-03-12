package pl.idzikdev.pogoda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.idzikdev.pogoda.services.MyService;

@Controller
public class MyController {
    final private MyService service;

    @Autowired
    public MyController(MyService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String hello(){
        return "index";
    }

    @PostMapping("/pogoda")
    public String index(@RequestParam("city") String city,
                        Model model){
        model.addAttribute("weather",service.getWeather(city));
        return "index";
    }

}
