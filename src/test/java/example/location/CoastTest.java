package example.location;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import example.entity.Fox;
import example.entity.Goose;
import example.entity.Item;
import example.entity.You;
import example.location.exception.InvalidPositionException;

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

    @Test
    public void addItemSucced() {
        Item item = new ItemMock();
        this.coast.add(item);
        assertTrue(this.coast.contains(item));
        assertEquals(1, this.coast.getItems().size());
    }

    @Test
    public void addThreeItemsSucced() {
        Item item1 = new ItemMock();
        Item item2 = new ItemMock();
        Item item3 = new ItemMock();

        this.coast.add(item1);
        this.coast.add(item2);
        this.coast.add(item3);

        assertTrue(this.coast.contains(item1));
        assertTrue(this.coast.contains(item2));
        assertTrue(this.coast.contains(item3));

        assertEquals(3, this.coast.getItems().size());
    }

    @Test
    public void removeItemSucced(){
        Item item = new ItemMock();
        this.coast.add(item);
        this.coast.remove(item);
        assertTrue(this.coast.isEmpty());
        assertEquals(0, this.coast.getItems().size());
    }

    @Test
    public void removeThreeItemsSucced() {
        Item item1 = new ItemMock();
        Item item2 = new ItemMock();
        Item item3 = new ItemMock();

        this.coast.add(item1);
        this.coast.add(item2);
        this.coast.add(item3);

        this.coast.remove(item1);
        this.coast.remove(item2);
        this.coast.remove(item3);

        assertTrue(this.coast.isEmpty());
        assertEquals(0, this.coast.getItems().size());
    }

    @Test
    public void whenValidateHavingAFoxWithAGooseWithoutYouIsAnInvalidPosition() {
        Item fox = new Fox();
        Item goose = new Goose();

        this.coast.add(fox);
        this.coast.add(goose);

        assertThrows(InvalidPositionException.class,
            () -> this.coast.validate());
    }

    @Test
    public void whenValidateHavingAFoxWithAGooseWithYouIsAnValidPosition() {
        Item fox = new Fox();
        Item goose = new Goose();
        You you = new You();

        this.coast.add(fox);
        this.coast.add(goose);
        this.coast.add(you);

        assertDoesNotThrow(() -> this.coast.validate());

    }

    // TODO
    // - add null 
    // - add same item two times
    // - remove null
    // - remove item not in
}
