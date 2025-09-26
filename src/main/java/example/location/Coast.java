package example.location;

import java.util.ArrayList;
import java.util.List;

import example.entity.Item;

public class Coast {
    private List<Item> items;

    public Coast() {
        this.items = new ArrayList<>();
    }

    public Boolean isEmpty() {
        return items.isEmpty();
    }

    public List<Item> getItems() {
        return items;
    }
}
