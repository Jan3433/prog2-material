package algods.lecture.vl_2026_03_12.Lists;

public class Element {
    int data;
    Element next;
    Element prev;

    /// Standardkonstruktor. Erzeugt ein neues leeres Element.
    /// 
    /// Anmerkung:
    /// - Die Aufgabe des Konstruktors ist, ein neues Element zu erzeugen und dabei
    ///   die Rahmenbedingen herzustellen, unter denen das Element funktioniert.
    /// - In diesem Fall muss die Listenstruktur (also Verknüpfung zu Vorgänger und
    ///   Nachfolger) hergestellt werden.
    public Element() {
        // 1. Schritt: Die Umgebung erzeug eine Variable
        // `this`, die auf den Speicher zeigt, der gerade
        // für das neue `Element` reserviert wurde.

        // Wir initialisieren die `next` und `prev`-Felder
        // von this.
        this.next = this;
        this.prev = this;

        // Folgendes wird am Ende der Funktion implizit passieren:
        // return this;
    }

    /// Hängt ein Element ans Ende der Liste an.
    public void add(int d) {
        Element e = new Element();
        e.data = d;

        Element last = this.prev;
        last.next = e;
        e.next = this;
        this.prev = e;
        e.prev = last;
    }

    /// Liefert die Länge der Liste.
    public int size() {
        int counter = 0;
        Element current = this;

        while (current.next != this) {
            current = current.next;
            counter++;
        }

        return counter;
    }
}
