package example.location;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public You remove(You you) {
        if(this.you.equals(you)) {
            this.you = null;
        }

        return you;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        
        if (you != null)
            sb.append(" :").append(you.toString());

        if (items != null && !items.isEmpty()) {
            sb.append(items.stream()
                           .map(item -> " :" + item.toString())
                           .collect(Collectors.joining("")));
        }

        sb.append(" ]");
        return sb.toString();
    }
}
