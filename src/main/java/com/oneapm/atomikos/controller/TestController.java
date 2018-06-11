package com.oneapm.atomikos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oneapm.atomikos.service.OutterService;

@RequestMapping("/user/")
@Controller
@Scope
public class TestController {

    @Autowired
    private OutterService outterService;

    @RequestMapping("/update.do")
    public String update() {
        outterService.insertTwoTables();

        return "ok";
    }
}
