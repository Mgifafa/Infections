package com.zombie.apocalyse.robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/robots")
public class RobotController {


    public RobotController(RobotService robotService) {
        this.robotService = robotService;
    }

  final private RobotService robotService;

    @GetMapping
    public ResponseEntity<List<Robot>> getAllRobots() {
        List<Robot> robots = RobotService.getRobots();
        return ResponseEntity.ok(robots);
    }
}
