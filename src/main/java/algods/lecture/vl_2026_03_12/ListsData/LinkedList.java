package algods.lecture.vl_2026_03_12.ListsData;

public class LinkedList implements List {
    Element anchor;
    int size;

    public LinkedList() {
        this.anchor = new Element();
    }

    /// Liefert das Element an Stelle pos.
    public Element get(int pos) {
        if (pos > this.size() || pos < 0) {
            return null;
        }

        Element current = this.anchor.next;

        while (pos > 0) {
            current = current.next;
            pos--;
        }

        return current;
    }

    /// Hängt einen neuen Wert am Ende der Liste an.
    public void add(Data data) {
        this.anchor.insertBefore(data);
        this.size++;
    }

    /// Fügt ein neues Element mit dem gegebenen Wert an der gegeben Position in die
    /// Liste ein.
    public void insert(int pos, Data data) {
        this.get(pos).insertBefore(data);
        this.size++;
    }

    /// Entfernt das letzte Element aus der Liste.
    public void remove_last() {
        this.remove(this.size() - 1);
    }

    /// Entfernt das Element an der gegebene Position aus der Liste.
    public void remove(int pos) {
        this.get(pos + 1).removeBefore();
        this.size--;
    }

    /// Liefert die Länge der Liste.
    public int size() {
        return this.size;
    }

    /// Liefert die Uhrzeit, zu der die Temperatur am höchsten ist.
    public int getMaxTempTime() {
        // TODO
        return 0;
    }
}
