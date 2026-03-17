package algods.lecture.vl_2026_03_17.Lists;

public class LinkedList<D> {
    Element<D> anchor;

    public LinkedList() {
        this.anchor = new Element<>();
    }

    /// Fügt ein neues Element am Ende der Liste hinzu.
    public void add(D data) {
        this.anchor.insertBefore(data);
    }

    /// Fügt ein neues Element an der angegebenen Stelle hinzu.
    public void add(D data, int pos) {
        Element<D> el = this.get(pos);
        if (el == null) {
            if (get(pos - 1) != null) {
                this.anchor.insertBefore(data);
            } else {
                return;
            }
        }
        el.insertBefore(data);
    }

    /// Liefert das Element an Stelle pos, falls es existiert. Falls es nicht
    /// existiert, wird null geliefert.
    public Element<D> get(int pos) {
        if (pos < 0) {
            return null;
        }
        Element<D> current = anchor.next;
        while (pos > 0) {
            if (current == anchor) {
                return null;
            }
            current = current.next;
            pos--;
        }
        return current;
    }
}
