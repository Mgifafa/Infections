package com.zombie.apocalyse.report;

import com.zombie.apocalyse.robot.Robot;
import com.zombie.apocalyse.survivor.Survivor;

import java.util.List;

public interface ReportService {
    public double  calculatePercentageInfectedSurvivors();
    public double calculatePercentageNonInfectedSurvivors();

    public int getInfectedSurvivors();

    public List<Survivor> getNonInfectedSurvivors();

}
