package com.clean.backend.service;

public interface IVAdministratorService {
    String  agreeApplication(String name);
    String refuseApplication(String name);
    String getMyApproval(String name);

    String startVisit(String visitorName);
    String finishVisit(String visitorName);

    String startVIPVisit(int id);
    String finishVIPVisitor(int id);

    String login(String administratorName,int password);
}
