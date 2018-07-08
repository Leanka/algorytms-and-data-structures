package dataStructures.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    @Test
    void classExistanceTest(){
        new CustomLinkedList<>();
    }

    @Test
    void appendTest() {
        LinkedList<Integer> customLinkedList = createLinkedList(10);
        String expectedListContent = " 0 1 2 3 4 5 6 7 8 9";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    
    private LinkedList<Integer> createLinkedList(int numOfElements) {
        LinkedList<Integer> customLinkedList = new CustomLinkedList<>();
        for (int i = 0; i < numOfElements; ++i)
        {
            customLinkedList.append(i);
        }
        return customLinkedList;
    }

}