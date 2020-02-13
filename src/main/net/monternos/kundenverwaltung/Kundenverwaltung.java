package net.monternos.kundenverwaltung;

public class Kundenverwaltung {
  private Knoten wurzel;

  public Kundenverwaltung() {
    wurzel = null;
  }

  public Datenelement suchen(final byte searchKey) {
    Datenelement data = null;
    if (wurzel != null) {
      data = wurzel.suchen(searchKey);
    }

    if (data == null) {
      throw new ElementNotFoundException("The requested element was not found in the binary tree.");
    } else {
      return data;
    }
  }

  public void eintragen(final Datenelement datenelement) {
    if (wurzel != null) {
      wurzel.einfuegen(datenelement);
    } else {
      wurzel = new Knoten(datenelement);
    }
  }

  public Knoten getWurzel() {
    return wurzel;
  }

  public void setWurzel(final Knoten wurzel) {
    this.wurzel = wurzel;
  }
}
