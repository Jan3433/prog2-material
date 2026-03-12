package algods.lecture.vl_2026_03_12.Lists;

public interface List {
    /// Liefert das Element an Stelle pos.
    public Element get(int pos);

    /// Fügt ein neues Element mit dem gegebenen Wert an der gegeben Position in die
    /// Liste ein.
    public void insert(int pos, int data);

    /// Entfernt das Element an der gegebenen Position aus der Liste.
    public void remove(int pos);

}
