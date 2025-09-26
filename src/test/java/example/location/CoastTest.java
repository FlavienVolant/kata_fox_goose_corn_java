package example.location;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import example.entity.Item;

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

    // TODO
    // - add null 
    // - add same item two times
    // - remove null
    // - remove item not in
}
