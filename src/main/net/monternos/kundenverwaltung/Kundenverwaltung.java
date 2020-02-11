package net.monternos.kundenverwaltung;

public class Kundenverwaltung {
  private Knoten wurzel;

  public Kundenverwaltung() {
    wurzel = null;
  }

  public Datenelement suchen(final String searchKey) {
    if (wurzel != null) {
      return wurzel.suchen(searchKey);
    }
    return null;
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
