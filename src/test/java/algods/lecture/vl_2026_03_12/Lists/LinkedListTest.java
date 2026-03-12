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

    @Test
    void TestLinkedList_insert() {
        LinkedList list = new LinkedList();

        list.add(42); // 0
        list.add(23); // 1
        list.add(38); // 2

        list.insert(2, 999);

        assertEquals(4, list.size());
        assertEquals(0, list.anchor.data);
        assertEquals(42, list.anchor.next.data);
        assertEquals(23, list.anchor.next.next.data);
        assertEquals(999, list.anchor.next.next.next.data);
        assertEquals(38, list.anchor.next.next.next.next.data);
    }

    @Test
    void TestLinkedList_remove() {
        LinkedList list = new LinkedList();

        list.add(42); // 0
        list.add(23); // 1
        list.add(38); // 2

        list.remove(1);

        assertEquals(2, list.size());
        assertEquals(0, list.anchor.data);
        assertEquals(42, list.anchor.next.data);
        assertEquals(38, list.anchor.next.next.data);
        assertEquals(list.anchor, list.anchor.next.next.next);
    }
}
