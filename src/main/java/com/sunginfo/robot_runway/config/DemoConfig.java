package com.sunginfo.robot_runway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

@ConfigurationProperties(prefix = "demo")
@Component
@Data
public class DemoConfig {
    private String company;
}
