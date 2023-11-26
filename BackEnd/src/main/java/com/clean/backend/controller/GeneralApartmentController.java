package com.clean.backend.controller;

import com.clean.backend.service.impl.GeneralApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/GeneralApartment")
public class GeneralApartmentController {
    @Autowired
    GeneralApartmentService generalApartmentService;

    @GetMapping ("/getApproval")
    public String getApproval(){
        return  generalApartmentService.getApproval();
    }
    @GetMapping("/agree")
    public String agreeApplication(@RequestParam(name="id") int id){
        return generalApartmentService.agreeApplication(id);
    }
    @GetMapping("/refuse")
    public String refuseApplication(@RequestParam(name="id") int id){
        return generalApartmentService.refuseApplication(id);
    }
}
