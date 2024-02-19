package com.zombie.apocalyse.survivor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/survivors")
public class SurvivorController {
    public SurvivorController(SurvivorService survivorService) {
        this.survivorService = survivorService;
    }

    public SurvivorService survivorService;


    @PostMapping
    public ResponseEntity<String> addSurvivor(@RequestBody Survivor survivor) {
        survivorService.addSurvivor(survivor);
        return new ResponseEntity<>("Survivor added", HttpStatus.CREATED);
    }

    ;

    @PutMapping("/{id}")
    public ResponseEntity<String> updateLocation(@PathVariable Long id, @RequestBody Location updatedLocation) {

        boolean updated = survivorService.updateLocation((Survivor) updatedLocation, id);
        if (updated) {
            return new ResponseEntity<>("Location updated successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Survivor not found", HttpStatus.NOT_FOUND);
        }
    }

    ;

    @PutMapping("/{id}")
    public ResponseEntity<Boolean> flagAsInfected(@PathVariable Long id) {
        boolean infected = survivorService.flagAsInfected(id);
        if (infected) {
            survivorService.deleteById(id);
            return ResponseEntity.ok(true);
        }
        else {
            return ResponseEntity.ok(false);
        }


    }
}