package example.entity;

public class Fox extends Item{

    @Override
    public String getName() {
        return "Fox";
    }

    @Override
    public Boolean canEat(Item other) {
        return other instanceof Goose;
    }
}
