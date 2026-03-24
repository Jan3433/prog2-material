package algods.lecture.vl_2026_03_17.Lists;

public class Element<D> {
    D data;
    Element<D> next;
    Element<D> prev;

    public Element() {
        this.data = null;
        this.next = this;
        this.prev = this;
    }

    public void insertBefore(D data) {
        // Erzeuge ein neues Element mit den neuen Daten.
        Element<D> n = new Element<>();
        n.data = data;

        // Den bisherigen Vorgänger von this merken.
        Element<D> prev = this.prev;

        // n in die next-Kette zwischen prev und this hängen.
        prev.next = n;
        n.next = this;

        // n in die prev-Kette hängen.
        this.prev = n;
        n.prev = prev;
    }
}
