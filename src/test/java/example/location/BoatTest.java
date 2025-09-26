package example.location;

import static org.junit.jupiter.api.Assertions.assertFalse;
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

        assertTrue(this.boat.hasCaptain());
        assertTrue(this.boat.contains(you));
    }

    @Test
    public void atCreationBoatShouldNothabeACaptain() {
        assertFalse(this.boat.hasCaptain());
    }

    @Test
    public void whenANewYouEmbarkTheLastOneIsEjected() {
        You ejected = new You();
        You replace = new You();
        
        this.boat.embark(ejected);
        this.boat.embark(replace);

        assertTrue(this.boat.hasCaptain());
        assertTrue(this.boat.contains(replace));
        assertFalse(this.boat.contains(ejected));
    }
}
