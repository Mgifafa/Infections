package com.zombie.apocalyse.resource;

import java.util.List;

public interface ResourceService {
    Resource getResources(Long id);
    void addResources(Resource resource);
}
