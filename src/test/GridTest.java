import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GridTest {
    Grid grid;
    Areas[][] layer;
    Cruiser Cship;

    @BeforeEach
    void setUp() {
        layer = new Areas[9][9];
        grid = new Grid();
        Cship = new Cruiser();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void printMap() {
    }

    @Test
    void shipListSize() {
        assertEquals(6,grid.shipListSize(),"incorrect ship list");
    }

    @Test
    void hit() {
        // not testable assertTrue(false,grid.hit(3,3),"You found an invisible target??");
    }

    @Test
    void clearance() {
        //if i change the U to V or H then will return true
        assertTrue(grid.clearance(Cship, 3, 3, "U"), "Not clear for placement");
    }

    @Test
    void getGrid() {
    }

    @Test
    void placement() {
    }
}