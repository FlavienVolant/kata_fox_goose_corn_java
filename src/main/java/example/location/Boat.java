package example.location;

import example.entity.You;

public class Boat{

    private You you;

    public void embark(You you) {
        this.you = you;
    }

    public Boolean contains(You you2) {
        return hasCaptain();   
    }

    public Boolean hasCaptain() {
        return this.you != null;
    }

}
