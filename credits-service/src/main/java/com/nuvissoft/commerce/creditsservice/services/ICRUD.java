package com.nuvissoft.commerce.creditsservice.services;

import java.util.List;

public interface ICRUD<Entity, Id> {

    public List<Entity> readAll();

    public Entity readById(Id id);

    public Entity save(Entity entity);

    public Entity update(Entity entity);

}
