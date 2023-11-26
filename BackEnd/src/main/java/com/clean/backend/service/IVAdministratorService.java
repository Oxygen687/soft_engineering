package com.clean.backend.service;

import com.clean.backend.entity.VipVisitor;

public interface IVAdministratorService {
    String  agreeApplication(String name);
    String refuseApplication(String name);
    String getMyApproval(String name);

    String startVisit(String name);
    String finishVisit(String name);

    String startVIPVisit(int id);
    String finishVIPVisit(int id);

    String login(String administratorName,int password);
    String getVisit(String visitAdministrator);
    String insertVIP(VipVisitor visitor);
    String selectVIPStatue(int id);
}
