package be.tandro.youthmovementapp.api.controller;

import be.tandro.youthmovementapp.api.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class
WebController {

    @Autowired
    private WebService webService;


    @GetMapping("/login")
    public String Login() {
        return "login";
    }

    @GetMapping("/index")
    public String home() {
        return "index";
    }

}
