package com.zombie.apocalyse.survivor.impl;

import com.zombie.apocalyse.survivor.Location;
import com.zombie.apocalyse.survivor.Survivor;
import com.zombie.apocalyse.survivor.SurvivorRepository;
import com.zombie.apocalyse.survivor.SurvivorService;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurvivorServiceImpl implements SurvivorService {

    private SurvivorRepository survivorRepository;



    public SurvivorServiceImpl(SurvivorRepository survivorRepository) {
        this.survivorRepository = survivorRepository;
    }

    @Override
    public void addSurvivor(Survivor survivor) {
        survivorRepository.save(survivor);
    }

    @Override
    public boolean updateLocation(Survivor survivor, Long id) {
        Optional<Survivor> survivorOptional = survivorRepository.findById(id);
        if (survivorOptional.isPresent()) {
            Survivor survivorToUpdate = survivorOptional.get();
            survivorToUpdate.setLocation(survivor.getLocation());
            survivorRepository.save(survivorToUpdate);
            return true;
        } else {
            return false;
        }


}

    @Override
    public boolean flagAsInfected(Long id) {
        Survivor survivor = survivorRepository.findById(id) .orElse(null);

        if (survivor.getInfectionReportCount()>=3){
            survivor.setInfected(true);
            survivor.setInfectedCount(1);
            survivorRepository.deleteById(id);
            return true;
        }
         else{
      return false;
         }

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Survivor> getAllSurvivors() {
        survivorRepository.findAll();
        return null;
    }

    @Override
    public int getInfectedCount() {
        return getInfectedCount();
    };
}
