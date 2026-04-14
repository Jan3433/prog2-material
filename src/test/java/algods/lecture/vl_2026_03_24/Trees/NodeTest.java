package algods.lecture.vl_2026_03_24.Trees;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NodeTest {
    @Test
    void Node_new() {
        Node n = new Node();

        assertEquals(true, n.isEmpty());
    }

    @Test
    void Node_add() {
        Node n = new Node();
        n.add(42);

        assertEquals(false, n.isEmpty());
        assertEquals(42, n.data);
        assertEquals(true, n.left.isEmpty());
        assertEquals(true, n.right.isEmpty());

        n.add(23);
        assertEquals(23, n.left.data);
        assertEquals(false, n.left.isEmpty());
        assertEquals(true, n.left.left.isEmpty());
        assertEquals(true, n.left.right.isEmpty());
    }

    @Test
    void Node_get() {
        Node n = new Node();
        assertEquals(null, n.get(0));

        n.add(42);
        assertEquals(n, n.get(42));

        n.add(23);
        n.add(75);
        n.add(15);
        n.add(38);
        n.add(99);
        assertEquals(n.left.left, n.get(15));
    }

    @Test
    void Node_height() {
        Node n = new Node();
        n.add(42);
        n.add(23);
        n.add(75);
        n.add(15);
        n.add(38);
        n.add(99);
        n.add(5);
        n.add(25);
        n.add(23);
        n.add(103);

        assertEquals(5, n.height());
    }

    @Test
    void Node_printTree() {
        Node n = new Node();
        n.add(42);
        n.add(23);
        n.add(77);
        n.add(35);

        n.printTree();

        // Output:
        // 23 42 35 77
    }
}
