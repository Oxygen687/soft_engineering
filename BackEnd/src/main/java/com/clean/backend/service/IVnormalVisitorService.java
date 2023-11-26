package com.clean.backend.service;

import com.clean.backend.entity.Application;
import com.clean.backend.entity.NormalVisitor;

public interface IVnormalVisitorService {
    //查看自己的申请
    String getMyapplication(String name);
    //传入信息到visitor表
    String insertVisitor(String name);
    //传入信息到normalVisitor表
    String insertinfo(NormalVisitor normalVisitor);
    //插入信息到application表
    String insertapplication(Application application);
}
