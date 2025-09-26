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

    public void add(Item item) {
        this.items.add(item);
    }

    public boolean contains(Item item) {
        return this.items.contains(item);
    }

    public void remove(Item item) {
        this.items.remove(item);
    }
}
