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
