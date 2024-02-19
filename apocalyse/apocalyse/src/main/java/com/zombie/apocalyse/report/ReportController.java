package com.zombie.apocalyse.report;
import com.zombie.apocalyse.survivor.Survivor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zombie.apocalyse.robot.Robot;
import com.zombie.apocalyse.robot.RobotService;
import com.zombie.apocalyse.survivor.Survivor;
import com.zombie.apocalyse.survivor.SurvivorService;

import java.util.List;

@RestController

public class ReportController {


        public ReportController(ReportService reportService) {
            this.reportService = reportService;
        }

        private ReportService reportService;

        @GetMapping("/percentage-infected-survivors")
        public ResponseEntity<Double> getPercentageInfectedSurvivors() {
            double percentageInfected = reportService.calculatePercentageInfectedSurvivors();
            return ResponseEntity.ok(percentageInfected);
        }

        @GetMapping("/percentage-non-infected-survivors")
        public ResponseEntity<Double> getPercentageNonInfectedSurvivors() {
            double percentageNonInfected = reportService.calculatePercentageNonInfectedSurvivors();
            return ResponseEntity.ok(percentageNonInfected);
        }

        @GetMapping("/infected-survivors")
        public ResponseEntity<List<Survivor>> getInfectedSurvivors() {
            int infectedSurvivors = reportService.getInfectedSurvivors();
            return getInfectedSurvivors();
        }

        @GetMapping("/non-infected-survivors")
        public ResponseEntity<List<Survivor>> getNonInfectedSurvivors() {
            List<Survivor> nonInfectedSurvivors = reportService.getNonInfectedSurvivors();
            return ResponseEntity.ok(nonInfectedSurvivors);
        }

        @GetMapping("/robots")
        public ResponseEntity<List<Robot>> getAllRobots() {
            List<Robot> allRobots = RobotService.getRobots();
            return ResponseEntity.ok(allRobots);
        }


}
