package com.clean.backend.controller;

import com.clean.backend.entity.VipVisitor;
import com.clean.backend.service.impl.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/administrator")
public class AdministratorController {
    @Autowired
    AdministratorService administratorService;

    @GetMapping("/getApproval")
    public String getMyApproval(@RequestParam(name = "name") String name) {
        return administratorService.getMyApproval(name);
    }

    @PostMapping
    public String login(@RequestParam String administrator,
                        @RequestParam int password) {
        return administratorService.login(administrator, password);
    }

    @GetMapping("/agreeApplication")
    public String agreeApplication(@RequestParam(name = "name") String name) {
        return  administratorService.agreeApplication(name);
    }

    @GetMapping("/refuseApplication")
    public String refuseApplication(@RequestParam(name = "name") String name) {
        return  administratorService.refuseApplication(name);
    }

    @GetMapping("/startVisit")
    public String startVisit(@RequestParam(name = "name") String name){
        return administratorService.startVisit(name);
    }
    @GetMapping("/finishVisit")
    public String finishVisit(@RequestParam(name = "name") String name){
        return administratorService.finishVisit(name);
    }
    @GetMapping("/startVIPVisit")
    public String startVIPVisit(int id){
        return  administratorService.startVIPVisit(id);
    }

    @GetMapping("/finishVIPVisit")
    public String finishVIPVisit(int id){
        return  administratorService.finishVIPVisit(id);
    }

    //查看访问列表
    @GetMapping("/getVisit")
    public String getVisit(@RequestParam(name="visitAdministrator") String visitAdministrator){
        return administratorService.getVisit(visitAdministrator);
    }

    //申请VIP访客
    @GetMapping("/insertVIP")
    public String insertVIP(@RequestParam(name="company")String company,@RequestParam(name="licensePlateNumber")String licensePlateNumber){
        VipVisitor vipVisitor = new VipVisitor(1,company,licensePlateNumber);
        return administratorService.insertVIP(vipVisitor);
    }
    //查看VIP访客
    @GetMapping("/selectVIP")
    public String selectVIP(){
        return  administratorService.selectVIP();
    }

    @GetMapping("selectVIPStatue")
    public String selectVIPStatue(@RequestParam(name="id") int id){
        return administratorService.selectVIPStatue(id);
    }
}

