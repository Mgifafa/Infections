package com.zombie.apocalyse.report.impl;
import com.zombie.apocalyse.report.ReportService;
import com.zombie.apocalyse.robot.Robot;
import com.zombie.apocalyse.robot.RobotService;
import com.zombie.apocalyse.survivor.Survivor;
import com.zombie.apocalyse.survivor.SurvivorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ReportServiceImpl implements ReportService {
    private SurvivorService survivorService;
    private RobotService robotService;

    public double calculatePercentageInfectedSurvivors() {
        List<Survivor> listAllSurvivors = survivorService.getAllSurvivors();
        long totalSurvivors = listAllSurvivors.size();
        long infectedSurvivors =listAllSurvivors.stream().filter(Survivor::isInfected).count();
        return (double) (infectedSurvivors * 100) / totalSurvivors;
    }

    public double calculatePercentageNonInfectedSurvivors() {
        return 100 - calculatePercentageInfectedSurvivors();
    }

    public int getInfectedSurvivors() {
        return survivorService.getInfectedCount();
    }

    public List<Survivor> getNonInfectedSurvivors() {
        return survivorService.getAllSurvivors();
    }



}
