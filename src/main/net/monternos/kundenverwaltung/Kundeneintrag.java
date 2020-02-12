package net.monternos.kundenverwaltung;

public class Kundeneintrag extends Datenelement {

  private short kundennummer;
  private Person person;

  public Kundeneintrag(final short kundennummer, final Person person) {
    this.kundennummer = kundennummer;
    this.person = person;
  }

  public short getKundennummer() {
    return kundennummer;
  }

  public void setKundennummer(final short kundennummer) {
    this.kundennummer = kundennummer;
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(final Person person) {
    this.person = person;
  }

  public void informationAusgeben() {
    if (kundennummer == -1 || person == null) {
      System.out.println("Dieser Teil ist leer.");
    } else {
      System.out.println("Knoteninhalt ist " + person + ": " + kundennummer);
    }
  }

  public boolean schluesselIstGroesserAls(final short searchKey) {
    return searchKey > kundennummer;
  }

  public boolean schluesselIstGleich(final short searchKey) {
    return searchKey == kundennummer;
  }

  public boolean istGroesserAls(final Datenelement datenelement) {
    return ((Kundeneintrag) datenelement).getKundennummer() > kundennummer;
  }

  public boolean istGleich(final Datenelement datenelement) {
    return ((Kundeneintrag) datenelement).getKundennummer() == kundennummer;
  }
}
