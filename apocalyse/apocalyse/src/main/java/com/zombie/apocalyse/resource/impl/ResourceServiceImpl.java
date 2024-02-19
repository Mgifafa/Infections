package com.zombie.apocalyse.resource.impl;

import com.zombie.apocalyse.resource.Resource;
import com.zombie.apocalyse.resource.ResourceRepository;
import com.zombie.apocalyse.resource.ResourceService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ResourceServiceImpl implements ResourceService {
    ResourceRepository resourceRepository;

    public ResourceServiceImpl(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    @Override
    public Resource getResources(Long id) {
         resourceRepository.findById(id);
                 return null;
    }

    @Override
    public void addResources(Resource resource) {
        resourceRepository.save(resource);
    }
}
