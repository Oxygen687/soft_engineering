package com.clean.backend.service;

public interface IVGeneralApartmentService {
    String getApproval();
    String agreeApplication(int id);
    String refuseApplication(int id);
}
