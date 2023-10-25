package com.sunginfo.robot_runway.service.impl;

import org.springframework.stereotype.Service;
import com.sunginfo.robot_runway.model.Demo;
import com.sunginfo.robot_runway.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
    public Demo getDemoInfo(int id) {
        Demo ret = new Demo();
        ret.app = "agv";
        ret.val = 1;
        return ret;
    }
}
