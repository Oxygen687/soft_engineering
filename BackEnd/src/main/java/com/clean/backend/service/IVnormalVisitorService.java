package com.clean.backend.service;

import com.clean.backend.entity.Application;
import com.clean.backend.entity.NormalVisitor;
import com.clean.backend.entity.Visit;

public interface IVnormalVisitorService {
    //查看自己的申请
    String getMyapplication(String name);
    String insertinfo(NormalVisitor normalVisitor, Application application, Visit visit, String name);

}
