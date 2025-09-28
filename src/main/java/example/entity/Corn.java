package example.entity;

public class Corn extends Item {

    @Override
    public String getName() {
        return "Corn";
    }

    @Override
    public Boolean canEat(Item other) {
        return false;
    }
    
}
