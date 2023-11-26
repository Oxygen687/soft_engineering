package com.clean.backend.controller;

import com.clean.backend.service.impl.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/Administrator")
public class AdministratorController {
    @Autowired
    AdministratorService administratorService;

    @GetMapping("/get")
    public String getMyApproval(@RequestParam(name = "name") String name) {
        return administratorService.getMyApproval(name);
    }

    @PostMapping
    public String login(@RequestParam String administrator,
                        @RequestParam int password){
        return administratorService.login(administrator,password);
    }
}
