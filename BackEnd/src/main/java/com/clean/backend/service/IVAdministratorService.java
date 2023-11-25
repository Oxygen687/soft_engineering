package com.clean.backend.service;

public interface IVAdministratorService {
    String  agreeApplication(int visitorId);
    String refuseApplication(int visitorId);
    String getMyApproval(int id);

    String startVisit(int id);
    String finishVisit(int id);

    String startVIPVisit(int id);
    String finishVIPVisitor(int id);

    String login(String administratorName,int password);
}
