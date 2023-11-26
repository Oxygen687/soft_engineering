package com.clean.backend.controller;

import com.clean.backend.entity.Application;
import com.clean.backend.entity.Visit;
import com.clean.backend.entity.Worker;
import com.clean.backend.service.impl.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/api//worker")
public class WorkerController {
    @Autowired
    WorkerService workerService;

    @GetMapping("/getMyapplication")
    public String getMyapplication(@RequestParam(name="name") String name){
        return  workerService.getMyapplication(name);
    }
    @GetMapping("insertMyapplication")
    public String insertMyapplication(@RequestParam(name="name")String name,@RequestParam(name="company")String company,@RequestParam(name="phone")String phone,@RequestParam(name="licensePlateNumber")String licensePlateNumber,@RequestParam(name="visitApartment")String visitApartment,@RequestParam(name="cardId")String cardId,@RequestParam(name="visitAdministrator")String vititAdministrator){
        Worker worker = new Worker(1,name,company,phone,licensePlateNumber,visitApartment,cardId);
        Visit visit = new Visit(1,name,visitApartment,vititAdministrator);
        Application application = new Application(1,name,visitApartment,vititAdministrator);
        return workerService.insertMyapplication(worker,visit,application);
    }
    @GetMapping("/insertAnswer")
    public String insertAnswer(@RequestParam(name="name") String name,@RequestParam(name="answer1") String answer1,@RequestParam(name="answer2") String answer2){
        return workerService.insertAnswer(name,answer1,answer2);
    }
    @GetMapping("/getQuestion")
    public String getQuestion(){
        return workerService.getQuestion();
    }
}
