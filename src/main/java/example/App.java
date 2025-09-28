package example;

import example.entity.Corn;
import example.entity.Fox;
import example.entity.Goose;
import example.entity.You;
import example.location.Boat;
import example.location.Coast;

public class App {

    private Coast left = new Coast();
    private Coast right = new Coast();
    private Boat boat = new Boat();
    private Boolean boatIsLeftCoast = true;
    private You you = new You();
    private Corn corn = new Corn();
    private Fox fox = new Fox();
    private Goose goose = new Goose();

    public App() {
        left.add(you);
        left.add(corn);
        left.add(fox);
        left.add(goose);
    }

    public String toString() {
        return left.toString() + " " + boat.toString() + " " + right.toString();
    }


    public static void main(String[] args) {
        App app = new App();

        System.out.println(app);
    }
}
