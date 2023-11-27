package com.clean.backend.controller;

import com.clean.backend.entity.*;
import com.clean.backend.service.impl.normalVisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/normalVisitor")
public class normalVisitorController {
    @Autowired
    normalVisitorService normalVisitorService;


    @GetMapping("/get")
    public String getMyapplication(@RequestParam(name = "name") String name) {
        return normalVisitorService.getMyapplication(name);
    }

    @GetMapping("/insertinfo")
    public String insertinfo(@RequestParam(name = "name")String name,@RequestParam(name="company")String company,@RequestParam(name="phone")String phone,@RequestParam(name="licensePlateNumber")String licensePlateNumber,@RequestParam(name="visitApartment")String visitApartment,@RequestParam(name="visitAdministrator")String visitAdministator){
        NormalVisitor normalVisitor = new NormalVisitor(1,name,company,phone,licensePlateNumber,visitApartment);
        Application application = new Application(1,name,visitApartment,visitAdministator);
        Visit visit = new Visit(1,name,visitApartment,visitAdministator);
        return normalVisitorService.insertinfo(normalVisitor,application,visit,name);
    }


}
