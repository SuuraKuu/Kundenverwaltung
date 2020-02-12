package net.monternos.kundenverwaltung;

public class Knoten {

  private Datenelement daten;
  private Knoten rechterNachfolger;
  private Knoten linkerNachfolger;

  public Knoten(final Datenelement daten) {
    this.daten = daten;
    this.linkerNachfolger = null;
    this.rechterNachfolger = null;
  }

  public Datenelement suchen(final byte searchKey) {
    if (this.daten.schluesselIstGleich(searchKey)) {
      return this.daten;

    } else if (this.daten.schluesselIstGroesserAls(searchKey)) {

      if (linkerNachfolger != null) {
        return linkerNachfolger.suchen(searchKey);
      } else {
        return null;
      }

    } else if (rechterNachfolger != null) {
      return rechterNachfolger.suchen(searchKey);
    }
    return null;
  }

  public void einfuegen(final Datenelement datenelement) {

    if (this.daten.istGleich(datenelement)) {
      System.out.println("Dieser Eintrag ist bereits vorhanden.");

    } else if (this.daten.istGroesserAls(datenelement)) {
      if (linkerNachfolger != null) {
        linkerNachfolger.einfuegen(datenelement);
      } else {
        linkerNachfolger = new Knoten(datenelement);
      }

    } else if (rechterNachfolger != null) {
      rechterNachfolger.einfuegen(datenelement);
    } else {
      rechterNachfolger = new Knoten(datenelement);
    }
  }

  public Datenelement getDaten() {
    return daten;
  }

  public void setDaten(final Datenelement daten) {
    this.daten = daten;
  }

  public Knoten getLinkerNachfolger() {
    return linkerNachfolger;
  }

  public void setLinkerNachfolger(final Knoten linkerNachfolger) {
    this.linkerNachfolger = linkerNachfolger;
  }

  public Knoten getRechterNachfolger() {
    return rechterNachfolger;
  }

  public void setRechterNachfolger(final Knoten rechterNachfolger) {
    this.rechterNachfolger = rechterNachfolger;
  }
}
