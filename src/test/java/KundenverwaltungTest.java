import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import net.monternos.kundenverwaltung.Kundenverwaltung;

public class KundenverwaltungTest {
	private Kundenverwaltung kundenverwaltung;
	
	@Before
	public void setUp() {
		this.kundenverwaltung = new Kundenverwaltung("Hello world!");
	}
	
	@Test
	public void assumeHelloFromKundenverwaltungEqualsHello() {
		assertEquals(kundenverwaltung.getHello(), "Hello world!");
	}
}
