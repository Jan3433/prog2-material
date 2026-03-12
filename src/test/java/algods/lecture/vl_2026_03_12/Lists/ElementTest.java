package algods.lecture.vl_2026_03_12.Lists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class ElementTest {
    @Test
    public void testElement_new() {
        Element anchor = new Element();

        assertEquals(0, anchor.data);
        assertEquals(anchor, anchor.next);
        assertEquals(anchor, anchor.prev);
    }

    @Test
    public void testElement_add_single() {
        Element anchor = new Element();

        anchor.insertBefore(42);

        assertNotEquals(anchor, anchor.next);
        assertNotEquals(anchor, anchor.prev);
        assertEquals(0, anchor.data);
        assertEquals(42, anchor.next.data);
        assertEquals(anchor, anchor.next.next);
        assertEquals(anchor, anchor.prev.prev);
    }

    @Test
    public void testElement_add_multiple() {
        Element anchor = new Element();

        anchor.insertBefore(42);
        anchor.insertBefore(23);
        anchor.insertBefore(38);

        assertEquals(0, anchor.data);
        assertEquals(42, anchor.next.data);
        assertEquals(23, anchor.next.next.data);
        assertEquals(38, anchor.next.next.next.data);
        assertEquals(anchor, anchor.next.next.next.next);

        assertEquals(0, anchor.data);
        assertEquals(38, anchor.prev.data);
        assertEquals(23, anchor.prev.prev.data);
        assertEquals(42, anchor.prev.prev.prev.data);
        assertEquals(anchor, anchor.prev.prev.prev.prev);
    }

    @Test
    void testElement_removeBefore() {
        Element anchor = new Element();

        anchor.insertBefore(42);
        anchor.insertBefore(23);
        anchor.insertBefore(38);

        anchor.removeBefore();

        assertEquals(0, anchor.data);
        assertEquals(42, anchor.next.data);
        assertEquals(23, anchor.next.next.data);
        assertEquals(anchor, anchor.next.next.next);
    }

    @Test
    void testElement_size() {
        Element anchor = new Element();
        assertEquals(0, anchor.size());

        anchor.insertBefore(42);
        anchor.insertBefore(23);
        anchor.insertBefore(38);
        assertEquals(3, anchor.size());
    }
}
