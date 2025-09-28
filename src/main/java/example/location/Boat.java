package example.location;

import example.entity.Item;
import example.entity.You;
import example.location.exception.BoatAsNoCaptainException;

public class Boat{

    private You you;
    private Item item;

    public void embark(You you) {
        this.you = you;
    }
    
    public void embark(Item item) {
        this.item = item;
    }

    public Boolean contains(You you) {
        return this.you.equals(you);
    }
    
    public Boolean contains(Item item) {
        return this.item.equals(item);
    }

    public Boolean hasCaptain() {
        return this.you != null;
    }

    public You popCaptain() {
        You you = this.you;
        this.you = null;
        return you;
    }

    public Item popItem() {
        Item item = this.item;
        this.item = null;
        return item;
    }

    public void cross() throws BoatAsNoCaptainException{
        if(!this.hasCaptain())
            throw new BoatAsNoCaptainException();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        if (you != null)
            sb.append(":").append(you.toString());
        else 
            sb.append(":_");
        
        sb.append(" ");

        if (item != null) 
            sb.append(":").append(item.toString());
        else
            sb.append(":_");

        sb.append(">");
        return sb.toString();
    }
}
