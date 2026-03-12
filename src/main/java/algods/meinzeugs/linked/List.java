package algods.meinzeugs.linked;

public class List {
    private final Element anchor;
    private int size;

    public List() {
        this.anchor = new Element();
    }

    public void add(int data) {
        this.anchor.insertBefore(data);
        this.size++;
    }

    public void insert(int pos, int data) {
        if (pos < 0 || pos > this.size) {
            throw new IndexOutOfBoundsException("pos: " + pos);
        }

        Element current = this.anchor.next;
        while (pos > 0) {
            current = current.next;
            pos--;
        }

        current.insertBefore(data);
        this.size++;
    }

    public void remove_last() {
        if (this.size == 0) {
            return;
        }

        this.anchor.removeBefore();
        this.size--;
    }

    public void remove(int pos) {
        if (pos < 0 || pos >= this.size) {
            throw new IndexOutOfBoundsException("pos: " + pos);
        }

        Element current = this.anchor.next;
        while (pos > 0) {
            current = current.next;
            pos--;
        }

        current.next.removeBefore();
        this.size--;
    }

    public int size() {
        return this.size;
    }

    private static final class Element {
        private int data;
        private Element next;
        private Element prev;

        private Element() {
            this.next = this;
            this.prev = this;
        }

        private void insertBefore(int data) {
            Element element = new Element();
            element.data = data;

            Element last = this.prev;
            last.next = element;
            element.prev = last;
            element.next = this;
            this.prev = element;
        }

        private void removeBefore() {
            if (this.prev == this) {
                return;
            }

            Element newLast = this.prev.prev;
            newLast.next = this;
            this.prev = newLast;
        }
    }
}
