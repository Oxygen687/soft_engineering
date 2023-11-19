package com.clean.backend.controller;

import com.clean.backend.service.impl.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:8081")
@RequestMapping("/Visitor")
public class VisitorController {
    @Autowired
    VisitorService visitorService;

    @GetMapping("/get")
    public String getVisitor(@RequestParam(name = "id") int id) {
        return visitorService.getVisitorById(id);
    }
}
