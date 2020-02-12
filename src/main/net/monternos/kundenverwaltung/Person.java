package net.monternos.kundenverwaltung;

public class Person {
  private String vorname;
  private String nachname;
  private String adresse;
  private byte alter;

  public Person(
      final String vorname, final String nachname, final String adresse, final byte alter) {
    this.vorname = vorname;
    this.nachname = nachname;
    this.adresse = adresse;
    this.alter = alter;
  }

  public String getVorname() {
    return vorname;
  }

  public void setVorname(final String vorname) {
    this.vorname = vorname;
  }

  public String getNachname() {
    return nachname;
  }

  public void setNachname(final String nachname) {
    this.nachname = nachname;
  }

  public String getAdresse() {
    return adresse;
  }

  public void setAdresse(final String adresse) {
    this.adresse = adresse;
  }

  public byte getAlter() {
    return alter;
  }

  public void setAlter(final byte alter) {
    this.alter = alter;
  }

  @Override
  public String toString() {
    return "Person{"
        + "vorname='"
        + vorname
        + '\''
        + ", nachname='"
        + nachname
        + '\''
        + ", adresse='"
        + adresse
        + '\''
        + ", alter="
        + alter
        + '}';
  }
}
