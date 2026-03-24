package algods.lecture.vl_2026_03_12.ListsData;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LinkedListTest {
    @Test
    void TestLinkedList_getMaxTempTime() {
        Data d1 = new Data(15, 25);
        Data d2 = new Data(10, 55);

        LinkedList list = new LinkedList();
        list.insert(0, d1);
        list.insert(1, d2);

        assertEquals(d1, list.get(0).data);
        assertEquals(d2, list.get(1).data);

        int m = list.getMaxTempTime();
        assertEquals(10, m);
    }
}
