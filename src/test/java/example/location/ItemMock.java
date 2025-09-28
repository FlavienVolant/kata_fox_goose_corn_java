package example.location;

import example.entity.Item;

public class ItemMock extends Item{

    @Override
    public String getName() {
        return "Mock";
    }

    @Override
    public Boolean canEat(Item other) {
        return false;
    }
}
