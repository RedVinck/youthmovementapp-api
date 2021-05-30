package be.tandro.youthmovementapp.api.controller;

import be.tandro.youthmovementapp.api.model.Person;
import be.tandro.youthmovementapp.api.service.WebService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

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

    @GetMapping("/person/overview")
    public String personOverview(Model model) {
        model.addAttribute("persons", webService.findAllPersons());
        return "person-overview";
    }

    @GetMapping("/person/add")
    public String personAdd(Person person) {
        return "person-add";
    }

    @PostMapping("/person/add")
    public String add(@Valid Person person, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "person-add";
        }
        try {
            webService.add(person);
        } catch (ServiceException se) {
            model.addAttribute("nameDubble", se.getMessage());
            return "person-add";
        }
        return "redirect:/person/overview";
    }





}
