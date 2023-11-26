package com.clean.backend.service.impl;

import com.clean.backend.dao.VisitorDao;
import com.clean.backend.entity.ApiResponse;
import com.clean.backend.entity.Visitor;
import com.clean.backend.service.IVisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitorService implements IVisitorService {
    @Autowired
    VisitorDao visitorDao;






}
