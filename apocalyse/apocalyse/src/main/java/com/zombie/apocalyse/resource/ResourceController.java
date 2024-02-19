package com.zombie.apocalyse.resource;
import com.zombie.apocalyse.survivor.Survivor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resources")
public class ResourceController {
ResourceService resourceService;

    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }
    @PostMapping

    public ResponseEntity<String> addResource(@RequestBody Resource resource) {
        resourceService.addResources(resource);
        return new ResponseEntity<>("Resource added", HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Resource> getResourceById(@PathVariable Long id){
        Resource resource = resourceService.getResources(id);
        if(resource != null){
            return new ResponseEntity<>(resource, HttpStatus.OK);}
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
    }




}
