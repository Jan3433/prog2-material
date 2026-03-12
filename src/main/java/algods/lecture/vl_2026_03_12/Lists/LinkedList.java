package algods.lecture.vl_2026_03_12.Lists;

public class LinkedList {
    Element anchor;
    int size;

    public LinkedList() {
        this.anchor = new Element();
    }

    /// Hängt einen neuen Wert am Ende der Liste an.
    public void add(int data) {
        this.anchor.add(data);
        this.size++;
    }

    /// Fügt einen neuen Wert an der gegeben Position in die Liste ein.
    public void insert(int pos, int data) {
        // TODO
    }

    /// Entfernt das letzte Element aus der Liste.
    public void remove_last() {
        // TODO
    }

    /// Entfernt das Element an der gegebene Position aus der Liste.
    public void remove(int pos) {
        // TODO
    }

    public int size() {
        return this.size;
    }
}
