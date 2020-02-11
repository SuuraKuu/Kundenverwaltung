package net.monternos.kundenverwaltung;

abstract class Datenelement {

  /** gibt die informationen des Datenelemented aus */
  public abstract void informationAusgeben();

  /**
   * checks if the datenelement is equal to the current datenelement
   *
   * @param datenelement
   * @return
   */
  public abstract boolean istGleich(final Datenelement datenelement);

  /**
   * checks if the datenelement is bigger or smaller than the current datenelement
   *
   * @param datenelement
   * @return
   */
  public abstract boolean istGroesserAls(final Datenelement datenelement);

  /**
   * checks if the key is bigger than the current key
   *
   * @param searchKey
   * @return
   */
  public abstract boolean schluesselIstGroesserAls(final String searchKey);

  /**
   * checks if the key is the same as the current key
   *
   * @param searchKey
   * @return
   */
  public abstract boolean schluesselIstGleich(final String searchKey);
}
