import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest63 {

    @Test
    void arrayCrIter() {
        int size = 25;
        int min = -20; int max = 20;
        Array<Integer> a = new Array<>(size);
        Main.arrayCrIter(a);
        for (int i = 0; i < a.getSize(); i++) {
            assertTrue(a.get(i) >= min && a.get(i) <= max);
        }
    }
}