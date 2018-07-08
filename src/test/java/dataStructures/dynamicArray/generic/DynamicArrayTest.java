package dataStructures.dynamicArray.generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DynamicArrayTest {
    @Test
    void DynamicIntArrayTest_WithInitialSize() {
        new CustomDynamicArray<Integer>(15);
    }

    @Test
    void DynamicIntArrayTest_WithoutInitialSize() {
        new CustomDynamicArray<Integer>();
    }


    @Test
    void addTest() {
        DynamicArray<Integer> array = createArray(11);
        array.add(32);
        array.add(42);
        String result = " 0 1 2 3 4 5 6 7 8 9 10 32 42";
        assertEquals(result, array.toString());
    }

    @Test
    void removeTest() {
        DynamicArray<Integer> array = createArray(11);
        array.remove(5);
        array.remove(0);
        String result = " 1 2 3 4 6 7 8 9 10";
        assertEquals(result, array.toString());
    }

    @Test
    void addAndRemoveMultipleItemsTest() {
        DynamicArray<String> array = new CustomDynamicArray <String>();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.remove("c");
        array.remove("d");
        array.add("e");
        array.add("f");

        String result = " a b e f";
        int expectedLength = 4;

        assertEquals(result, array.toString());
        assertEquals(expectedLength, array.length());
    }

    @Test
    void removeTest_LastItem() {
        DynamicArray<Integer> array = createArray(10);
        array.remove(9);
        String result = " 0 1 2 3 4 5 6 7 8";
        assertEquals(result, array.toString());
    }

    @Test
    void removeTest_InvalidItem() {
        DynamicArray<Integer> array = createArray(10);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.remove(10));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.remove(-1));
    }
    

    private DynamicArray<Integer> createArray(int numOfElements) {
        DynamicArray<Integer> array = new CustomDynamicArray<>(numOfElements);

        for (int i = 0; i < numOfElements; ++i) {
            array.add(i);
        }
        return array;
    }

}