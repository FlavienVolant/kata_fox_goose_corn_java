package example.location;

import java.util.ArrayList;
import java.util.List;

import example.entity.Item;
import example.entity.You;
import example.location.exception.InvalidPositionException;

public class Coast {
    private List<Item> items;
    private You you;

    public Coast() {
        this.items = new ArrayList<>();
    }

    public Boolean isEmpty() {
        return items.isEmpty();
    }

    public List<Item> getItems() {
        return items;
    }

    public void add(You you) {
        this.you = you;
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

    public void validate() throws InvalidPositionException{
        if(this.you == null) {
            for(Item a : this.items) {
                for(Item b : this.items){
                    if(a.canEat(b)) {
                        throw new InvalidPositionException();
                    }
                }
            }
        }
    }
}
