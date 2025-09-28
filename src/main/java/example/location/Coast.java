package example.location;

import java.util.ArrayList;
import java.util.List;

import example.entity.Entity;

public class Coast {
    private List<Entity> entities;

    public Coast() {
        this.entities = new ArrayList<>();
    }

    public Boolean isEmpty() {
        return entities.isEmpty();
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void add(Entity entity) {
        this.entities.add(entity);
    }

    public boolean contains(Entity entity) {
        return this.entities.contains(entity);
    }

    public void remove(Entity entity) {
        this.entities.remove(entity);
    }
}
