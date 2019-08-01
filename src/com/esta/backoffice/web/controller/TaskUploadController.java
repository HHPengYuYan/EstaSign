package com.esta.backoffice.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("administrator")
public class TaskUploadController {
    @RequestMapping("submit")
    public void select(){
        System.out.println("接收到数据");
    }
}
