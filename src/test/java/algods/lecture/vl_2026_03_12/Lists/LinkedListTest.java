package algods.lecture.vl_2026_03_12.Lists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class LinkedListTest {
    @Test
    void TestLinkedList_new() {
        LinkedList list = new LinkedList();

        assertNotEquals(null, list.anchor);
        assertEquals(0, list.size());
        assertEquals(0, list.anchor.size());

        list.add(42);
        list.add(23);
        list.add(38);

        assertEquals(3, list.size());
    }
}
