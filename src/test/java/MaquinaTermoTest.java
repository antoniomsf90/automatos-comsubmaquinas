
import maquina.Fita;
import maquina.Initializer;

import org.junit.Assert;
import org.junit.Test;

public class MaquinaTermoTest extends Init {


	@Test
	public void testeTermo1() {
		Fita fita = new Fita("a");
		boolean aceito = Initializer.init(Termo, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeTermo2() {
		Fita fita = new Fita("a(");
		boolean aceito = Initializer.init(Termo, fita);
		Assert.assertFalse(aceito);
	}
	
	@Test
	public void testeTermo3() {
		Fita fita = new Fita("a(abcde)");
		boolean aceito = Initializer.init(Termo, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeTermo4() {
		Fita fita = new Fita("a(b,c)");
		boolean aceito = Initializer.init(Termo, fita);
		Assert.assertTrue(aceito);
	}
}
