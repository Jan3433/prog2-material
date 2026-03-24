package algods.lecture.vl_2026_03_17.Lists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ElementTest {
    @Test
    void Element_string_new() {
        Element<String> e1 = new Element<>();

        assertEquals(null, e1.data);
        assertEquals(e1, e1.next);
        assertEquals(e1, e1.prev);
    }

    @Test
    void Element_int_new() {
        Element<Integer> e1 = new Element<>();

        assertEquals(null, e1.data);
        assertEquals(e1, e1.next);
        assertEquals(e1, e1.prev);
    }

    @Test
    void Element_person_new() {
        Element<Person> e1 = new Element<>();

        assertEquals(null, e1.data);
        assertEquals(e1, e1.next);
        assertEquals(e1, e1.prev);
    }

    @Test
    void Element_string_insertBefore() {
        Element<String> e1 = new Element<>();
        e1.insertBefore("42");

        assertEquals(null, e1.data);
        assertEquals("42", e1.next.data);
        assertEquals("42", e1.prev.data);
        assertEquals(e1, e1.next.next);
        assertEquals(e1, e1.prev.prev);

        e1.insertBefore("Foo");
        assertEquals(null, e1.data);
        assertEquals("42", e1.next.data);
        assertEquals("Foo", e1.prev.data);
    }
}
