package de.neuefische.hhjava222helloworld.controller;

import de.neuefische.hhjava222helloworld.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingsController {


    private final GreetingService service;

    public GreetingsController(GreetingService service) {
        this.service = service;
    }

    @GetMapping(path = "{id}")
    public String sayHello(@PathVariable String id){
        return service.getGreetingById(id);
    }


}
