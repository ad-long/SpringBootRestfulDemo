package com.sunginfo.robot_runway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunginfo.robot_runway.config.DemoConfig;
import com.sunginfo.robot_runway.model.Demo;
import com.sunginfo.robot_runway.service.DemoService;

@RestController
public class DemoController {
    @Autowired
    DemoConfig demoConfig;

    @Autowired
    private DemoService demoService;

    @GetMapping("/demo/get")
    public ResponseEntity<Demo> getBranch() {
        Demo ret = demoService.getDemoInfo(0);
        ret.company = demoConfig.getCompany();
        return new ResponseEntity<>(ret, HttpStatus.CREATED);
    }
};
