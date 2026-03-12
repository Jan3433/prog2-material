package algods.lecture.vl_2026_03_12.ListsData;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ElementTest {
    @Test
    public void testElement_new() {
        Element anchor = new Element();

        assertEquals(null, anchor.data);
        assertEquals(anchor, anchor.next);
        assertEquals(anchor, anchor.prev);

        Data d = new Data(15, 25);

        anchor.insertBefore(d);

        assertEquals(anchor.next.data, d);
    }

}
