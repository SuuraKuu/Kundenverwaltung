package net.monternos.kundenverwaltung;

public class Kundeneintrag extends Datenelement {

  private String vorname;
  private String nachname;

  public Kundeneintrag(final String vorname, final String nachname) {
    this.vorname = vorname;
    this.nachname = nachname;
  }

  public String getVorname() {
    return vorname;
  }

  public void setVorname(String vorname) {
    this.vorname = vorname;
  }

  public String getNachname() {
    return nachname;
  }

  public void setNachname(String nachname) {
    this.nachname = nachname;
  }

  public void informationAusgeben() {
    if (vorname == null || nachname == null) {
      System.out.println("Dieser Teil ist leer.");
    } else {
      System.out.println("Knoteninhalt ist " + vorname + ": " + nachname);
    }
  }

  public boolean schluesselIstGroesserAls(String searchKey) {
    int e = this.vorname.compareTo(searchKey);
    return e >= 0;
  }

  public boolean schluesselIstGleich(String searchKey) {
    int ergebnis = this.vorname.compareTo(searchKey);
    return ergebnis == 0;
  }

  public boolean istGroesserAls(Datenelement datenelement) {
    int ergebnis = this.vorname.compareTo(((Kundeneintrag) datenelement).vorname);

    return ergebnis > 0;
  }

  public boolean istGleich(Datenelement datenelement) {
    int ergebnis = this.vorname.compareTo(((Kundeneintrag) datenelement).vorname);

    return ergebnis == 0;
  }
}
