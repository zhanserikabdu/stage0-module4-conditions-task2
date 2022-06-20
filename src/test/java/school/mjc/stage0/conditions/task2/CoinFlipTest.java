package school.mjc.stage0.conditions.task2;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinFlipTest extends BaseIOTest {

    @Test
    void throwCoinPrintsEagleIfLessThan501() {
        CoinFlip flip = new CoinFlip();

        flip.throwCoin(499);

        assertEquals("Eagle\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void throwCoinPrintsEagleIfMiddle() {
        CoinFlip flip = new CoinFlip();

        flip.throwCoin(500);

        assertEquals("Tail\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void throwCoinPrintsEagleIfGreaterThan500() {
        CoinFlip flip = new CoinFlip();

        flip.throwCoin(501);

        assertEquals("Tail\n", updateLineSpliterators(outContent.toString()));
    }
}
