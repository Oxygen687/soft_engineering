package com.clean.backend.service;
import com.clean.backend.entity.*;
public interface IVWorkerService {
    String getMyapplication(String name);
    String insertMyapplication(Worker worker,Visit visit,Application application);

    String insertAnswer(String name,String answer1,String answer2);
    String getQuestion();
}
