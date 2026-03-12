package algods.lecture.vl_2026_03_12.ListsData;

public class Element {
    Data data;
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

    /// Fügt ein neues Element mit dem gegeben Wert vor this ein.
    public void insertBefore(Data d) {
        Element e = new Element();
        e.data = d;

        Element last = this.prev;
        last.next = e;
        e.next = this;
        this.prev = e;
        e.prev = last;
    }

    /// Entfernt das Element vor this aus der Liste.
    public void removeBefore() {
        if (this.prev == this) {
            return;
        }

        Element e = this.prev.prev;
        e.next = this;
        this.prev = e;
    }
}
