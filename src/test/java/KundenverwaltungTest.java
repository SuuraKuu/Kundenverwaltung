import net.monternos.kundenverwaltung.Knoten;
import net.monternos.kundenverwaltung.Kundeneintrag;
import net.monternos.kundenverwaltung.Kundenverwaltung;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KundenverwaltungTest {
  private Kundenverwaltung kundenverwaltung;

  @Before
  public void setUp() {
    kundenverwaltung = new Kundenverwaltung();
    kundenverwaltung.setWurzel(new Knoten(new Kundeneintrag("John", "Smith")));
  }

  @Test
  public void assumeVornameOfWurzelIsCorrect() {
    assertEquals(((Kundeneintrag) kundenverwaltung.getWurzel().getDaten()).getVorname(), "John");
  }

  @Test
  public void assumeNachnameOfWurzelIsCorrect() {
    assertEquals(((Kundeneintrag) kundenverwaltung.getWurzel().getDaten()).getNachname(), "Smith");
  }
}
