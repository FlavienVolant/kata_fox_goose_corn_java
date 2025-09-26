package example.location;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoastTest {
    
    private Coast coast;

    @BeforeEach
    public void init() {
        this.coast = new Coast();
    }

    @Test
    public void atInitialisationCoastIsEmpty() {
        assertTrue(this.coast.isEmpty());
        assertEquals(0, this.coast.getItems().size());
    }
}
