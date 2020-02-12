import net.monternos.kundenverwaltung.Knoten;
import net.monternos.kundenverwaltung.Kundeneintrag;
import net.monternos.kundenverwaltung.Kundenverwaltung;
import net.monternos.kundenverwaltung.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KundenverwaltungTest {
  private Kundenverwaltung kundenverwaltung;
  private Person person;

  @Before
  public void setUp() {
    person = new Person("John", "Smith", "Austria", (byte) 20);
    kundenverwaltung = new Kundenverwaltung();
    kundenverwaltung.setWurzel(new Knoten(new Kundeneintrag((short) 200, person)));
  }

  @Test
  public void assumeWurzelStoresCorrectPerson() {
    assertEquals(((Kundeneintrag) kundenverwaltung.getWurzel().getDaten()).getPerson(), person);
  }

  @Test
  public void assumeWurzelStoresCorrectKundennummer() {
    assertEquals(
        ((Kundeneintrag) kundenverwaltung.getWurzel().getDaten()).getKundennummer(), (short) 200);
  }
}
