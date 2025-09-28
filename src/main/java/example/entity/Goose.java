package example.entity;

public class Goose extends Item {

    @Override
    public String getName() {
        return "Goose";
    }

    @Override
    public Boolean canEat(Item other) {
        return other instanceof Corn;
    }  
}
