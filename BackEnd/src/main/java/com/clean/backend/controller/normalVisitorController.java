package com.clean.backend.controller;

import com.clean.backend.service.impl.normalVisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/normalVisitor")
public class normalVisitorController {
    @Autowired
    normalVisitorService normalVisitorService;


    @GetMapping("/get")
    public String getMyapplication(@RequestParam(name = "id") int id) {
        return normalVisitorService.getMyapplication(id);
    }
}
