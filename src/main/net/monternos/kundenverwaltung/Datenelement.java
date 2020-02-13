package net.monternos.kundenverwaltung;

public interface Datenelement {

  /** logs information of the current Datenelement */
  void informationAusgeben();

  /**
   * checks if the datenelement is equal to the current datenelement
   *
   * @param datenelement
   * @return
   */
  boolean istGleich(final Datenelement datenelement);

  /**
   * checks if the datenelement is bigger or smaller than the current datenelement
   *
   * @param datenelement
   * @return
   */
  boolean istGroesserAls(final Datenelement datenelement);

  /**
   * checks if the key is bigger than the current key
   *
   * @param searchKey
   * @return
   */
  boolean schluesselIstGroesserAls(final short searchKey);

  /**
   * checks if the key is the same as the current key
   *
   * @param searchKey
   * @return
   */
  boolean schluesselIstGleich(final short searchKey);
}
