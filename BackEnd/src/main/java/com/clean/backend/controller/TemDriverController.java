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

    @GetMapping("/getSurvey")
    public String selectSurvey(){
        return temDriverService.selectSurvey();
    }

    @GetMapping("insertTemDriver")
    public String insertTemDriver(@RequestParam(name="driverName") String driverName,@RequestParam(name="phone")String phone,@RequestParam(name="company")String company,@RequestParam(name="licensePlateNumber")String licensePlateNumber,@RequestParam(name="planTimes")int planTimes, @RequestParam(name="ans1") int ans1, @RequestParam(name="ans2") int ans2,@RequestParam(name="ans3") int ans3, @RequestParam(name="ans4") int ans4,@RequestParam(name="ans5") int ans5){
        TemDriver temDriver  = new TemDriver(1,driverName,company,phone,licensePlateNumber,planTimes);
        return  temDriverService.insertTemDriver(temDriver,ans1,ans2,ans3,ans4,ans5);
    }
}
