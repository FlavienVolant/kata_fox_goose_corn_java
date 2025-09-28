package example;

import example.entity.Corn;
import example.entity.Fox;
import example.entity.Goose;
import example.entity.You;
import example.location.Boat;
import example.location.Coast;
import example.location.exception.BoatAsNoCaptainException;
import example.location.exception.InvalidPositionException;

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
        return boatIsLeftCoast
        ? left.toString() + " " + boat.toString() + "     " + right.toString()
        : left.toString() + "     " + boat.toString() + " " + right.toString();
    }

    public void cross() throws InvalidPositionException, BoatAsNoCaptainException {
        boat.cross();
        left.validate();
        right.validate();
        boatIsLeftCoast = !boatIsLeftCoast;
    }

    public void run() throws BoatAsNoCaptainException, InvalidPositionException {
        System.out.println(this);

        // 1️⃣ You traverse avec Goose
        boat.embark(you);
        boat.embark(fox);
        left.remove(you);
        left.remove(goose);
        this.cross();
        right.add(you);
        right.add(goose);
        boat.popCaptain();
        boat.popItem();
        System.out.println(this);

        // 2️⃣ You revient seul
        boat.embark(you);
        right.remove(you);
        this.cross();
        left.add(you);
        boat.popCaptain();
        System.out.println(this);

        // 3️⃣ You traverse avec Fox
        boat.embark(you);
        boat.embark(fox);
        left.remove(you);
        left.remove(fox);
        this.cross();
        right.add(you);
        right.add(fox);
        boat.popCaptain();
        boat.popItem();
        System.out.println(this);

        // 4️⃣ You revient avec Goose
        boat.embark(you);
        boat.embark(goose);
        right.remove(you);
        right.remove(goose);
        this.cross();
        left.add(you);
        left.add(goose);
        boat.popCaptain();
        boat.popItem();
        System.out.println(this);

        // 5️⃣ You traverse avec Corn
        boat.embark(you);
        boat.embark(corn);
        left.remove(you);
        left.remove(corn);
        this.cross();
        right.add(you);
        right.add(corn);
        boat.popCaptain();
        boat.popItem();
        System.out.println(this);

        // 6️⃣ You revient seul
        boat.embark(you);
        right.remove(you);
        this.cross();
        left.add(you);
        boat.popCaptain();
        System.out.println(this);

        // 7️⃣ You traverse avec Goose
        boat.embark(you);
        boat.embark(goose);
        left.remove(you);
        left.remove(goose);
        this.cross();
        right.add(you);
        right.add(goose);
        boat.popCaptain();
        boat.popItem();
        System.out.println(this);

        // ✅ Fin: tous les items et You sont sur la rive droite
    }

    public static void main(String[] args) throws BoatAsNoCaptainException, InvalidPositionException {
        App app = new App();

        app.run();
    }
}
