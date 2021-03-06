package dynamicArray.raw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DynamicIntArrayTest {

    @Test
    void DynamicIntArrayTest_WithInitialSize() {
        new DynamicIntArray(15);
    }

    @Test
    void addTest() {
        DynamicArray array = createArray(11);
        array.add(32);
        array.add(42);
        String result = " 0 1 2 3 4 5 6 7 8 9 10 32 42";
        assertEquals(result, array.toString());
    }

    @Test
    void removeTest() {
        DynamicArray array = createArray(11);
        array.remove(5);
        array.remove(0);
        String result = " 1 2 3 4 6 7 8 9 10";
        assertEquals(result, array.toString());
    }

    @Test
    void addAndRemoveMultipleItemsTest() {
        DynamicArray array = createArray(4);
        array.remove(2);
        array.remove(1);
        array.add(5);
        array.add(6);

        String result = " 0 3 5 6";
        int expectedLength = 4;

        assertEquals(result, array.toString());
        assertEquals(expectedLength, array.length());
    }

    @Test
    void removeTest_LastItem() {
        DynamicArray array = createArray(10);
        array.remove(9);
        String result = " 0 1 2 3 4 5 6 7 8";
        assertEquals(result, array.toString());
    }

    @Test
    void removeTest_InvalidItem() {
        DynamicArray array = createArray(10);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.remove(10));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.remove(-1));
    }

    @Test
    void insertTest() {
        DynamicArray array = createArray(11);
        array.insert(8, 223);
        array.insert(100, 654);

        String result = " 0 1 2 3 4 5 6 7 223 8 9 10 654";
        assertEquals(result, array.toString());
    }

    private DynamicArray createArray(int numOfElements) {
        DynamicArray array = new DynamicIntArray();
        for (int i = 0; i < numOfElements; ++i) {
            array.add(i);
        }
        return array;
    }
}