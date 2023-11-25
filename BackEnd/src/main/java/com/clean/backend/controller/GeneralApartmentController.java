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
}
