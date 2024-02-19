package com.zombie.apocalyse.survivor;
import java.util.List;
public interface SurvivorService {
     void addSurvivor(Survivor survivor);

     boolean updateLocation(Survivor survivor, Long id);

     boolean flagAsInfected(Long id);

     void deleteById(Long id);

     List<Survivor> getAllSurvivors();

     int getInfectedCount();
}
