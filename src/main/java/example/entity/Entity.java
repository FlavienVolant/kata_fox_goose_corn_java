package example.entity;

public abstract class Entity {
    
    public abstract String getName();

    public String toString(){
        return this.getName();
    }
}
