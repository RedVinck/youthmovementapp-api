package be.tandro.youthmovementapp.api.controller;

import be.tandro.youthmovementapp.api.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class APIController {

    @Autowired
    private WebService webService;

}
