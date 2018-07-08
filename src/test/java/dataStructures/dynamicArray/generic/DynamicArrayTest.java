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


    private DynamicArray<Integer> createArray(int numOfElements) {
        DynamicArray<Integer> array = new CustomDynamicArray<>(numOfElements);

        for (int i = 0; i < numOfElements; ++i) {
            array.add(i);
        }
        return array;
    }

}