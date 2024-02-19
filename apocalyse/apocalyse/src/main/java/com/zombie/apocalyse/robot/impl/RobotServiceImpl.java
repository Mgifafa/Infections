package com.zombie.apocalyse.robot.impl;

import com.zombie.apocalyse.robot.Robot;
import com.zombie.apocalyse.robot.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class RobotServiceImpl implements RobotService {

    private static final String ROBOT_CPU_URL = "https://robotstakeover20210903110417.azurewebsites.net/robotcpu";

    public RobotServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

   final private RestTemplate restTemplate;

    public List<Robot> getRobots() {
        ResponseEntity<Robot[]> responseEntity = restTemplate.getForEntity(ROBOT_CPU_URL, Robot[].class);
        Robot[] robots = responseEntity.getBody();
        if (robots != null) {
            return Arrays.asList(robots);
        } else {
            return Collections.emptyList();
        }
    }


}
