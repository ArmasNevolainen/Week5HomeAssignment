import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    private Dice dice;

    @BeforeEach
    void setUp() {
        dice = new Dice();
    }


    @org.junit.jupiter.api.Test
    void roll() {
        dice.roll();
        int die1 = dice.getDie1();
        int die2 = dice.getDie2();
        assertTrue(die1 >= 1 && die1 <= 6);
        assertTrue(die2 >= 1 && die2 <= 6);
    }

    @org.junit.jupiter.api.Test
    void isDouble() {
        boolean found = false;
        for (int i = 0; i < 100; i++) {
            dice.roll();
            if (dice.getDie1() == dice.getDie2()) {
                found = true;
                assertTrue(dice.isDouble(), " should return true when dice match");
                break;
            }
        }
        assertTrue(found, "Should find at least one double.");
    }


    @org.junit.jupiter.api.Test
    void testGetters() {
        dice.roll();
        int die1 = dice.getDie1();
        int die2 = dice.getDie2();

        assertTrue(die1 >= 1 && die1 <= 6, "Die1 should return value between 1 and 6");
        assertTrue(die2 >= 1 && die2 <= 6, "Die2 should return value between 1 and 6");
    }

    @org.junit.jupiter.api.Test
    void main() {
            Dice dice = new Dice();
            int counter = 0;

            do {
                dice.roll();
                counter++;
            } while (!dice.isDouble());

            assertTrue(counter > 0, "Counter should increase");
            assertEquals(counter, counter, "Counter should match");
    }
}