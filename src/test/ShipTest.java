import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {
    Battleship ship;
    Cruiser Cship;
    @BeforeEach
    void setUp(){
        ship = new Battleship();
        Cship = new Cruiser();
    }
    @Test
    void isInitialization() {

    }

    @DisplayName("Battleship size")
    @Test
    void getLength() {
        assertEquals(4,ship.getLength(),"Wrong size");
    }
    @DisplayName("Cruiser size")
    @Test
    void getLength2() {
        assertEquals(4,Cship.getLength(),"Cruiser Wrong size");
    }

    @Test
    void testIsInitialization() {
    }

    @Test
    void testGetLength() {
    }

    @Test
    void getType() {
    }

    @Test
    void getCol() {
    }

    @Test
    void getRow() {
    }

    @Test
    void getPosition() {
    }

    @Test
    void getScore() {
    }

    @Test
    void setScore() {
    }

    @Test
    void setInitialization() {
    }

    @Test
    void setCol() {
    }

    @Test
    void setRow() {
    }

    @Test
    void setArea() {
    }

    @Test
    void setPosition() {
    }

    @Test
    void setType() {
    }

    @Test
    void setLength() {
    }
}