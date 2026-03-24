package algods.lecture.vl_2026_03_24.Trees;

public class Node {
    int data;
    Node left;
    Node right;

    /// Erzeugt einen leeren Baum.
    ///
    /// D.h. einen Dummy ohne Kinder.
    public Node() {
        this.left = null;
        this.right = null;
    }

    /// Liefert true, falls der Baum leer ist.
    public boolean isEmpty() {
        return this.left == null && this.right == null;
    }

    /// Fügt ein Element in den Baum ein.
    public void add(int data) {
        if (this.isEmpty()) {
            this.data = data;
            this.left = new Node();
            this.right = new Node();
            return;
        }

        if (data < this.data) {
            this.left.add(data);
        } else {
            this.right.add(data);
        }
    }

    /// Liefert den Knoten mit dem gegebenen `key`.
    public Node get(int key) {
        // TODO
        return null;
    }

    /// Liefert die Höhe des Baumes ab `this`.
    int height() {
        // TODO
        return 0;
    }

    public void printTree() {
        if (this.isEmpty()) {
            return;
        }

        this.left.printTree();
        System.out.println(this.data);
        this.right.printTree();
    }
}
