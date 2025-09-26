package example.location;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import example.entity.You;

public class BoatTest {

    private Boat boat;

    @BeforeEach
    public void init() {
        this.boat = new Boat();
    }

    @Test
    public void youAreOnTheBoatIsTrueTest() {
        You you = new You();

        this.boat.embark(you); // you should be on the boat

        assertTrue(this.boat.contains(you));
    }
}
