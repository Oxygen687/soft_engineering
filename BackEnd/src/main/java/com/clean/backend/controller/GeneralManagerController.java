package com.clean.backend.controller;

import com.clean.backend.service.impl.GeneralManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/GeneralManager")
public class GeneralManagerController {
    @Autowired
    GeneralManagerService generalManagerService;
}
