package com.clean.backend.controller;

import com.clean.backend.entity.TemDriver;
import com.clean.backend.service.impl.TemDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/temDriver")
public class TemDriverController {
    @Autowired
    TemDriverService temDriverService;

    @GetMapping("insertTemDriver")
    public String insertTemDriver(@RequestParam(name="driverName") String driverName,@RequestParam(name="phone")String phone,@RequestParam(name="company")String company,@RequestParam(name="licensePlateNumber")String licensePlateNumber,@RequestParam(name="planTimes")int planTimes){
        TemDriver temDriver  = new TemDriver(1,driverName,company,phone,licensePlateNumber,planTimes);
        return  temDriverService.insertTemDriver(temDriver);
    }
}
