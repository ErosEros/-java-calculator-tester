package Pack.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCalc {

static Calculator c;
	
	@BeforeAll
	static void setup() {
		c = new Calculator();
	}
	
	@Test
	@DisplayName("Metodo Addizione")
	public void addizione(){
		float result = c.add(3,3);
		assertEquals(result,6);
		
	}
	
	@Test
	@DisplayName("Metodo sottrazione")
	public void sottrazione(){
		float result = c.substract(4,3);
		assertEquals(result,1);
		
	}
	
	
	@Test
	@DisplayName("Metodo Moltiplicazione")
	public void moltiplicazione() throws Exception {
		assertThrows(Exception.class, () -> c.multiply(0, 0));
	}

	@Test
	@DisplayName("Metodo Divisione")
	public void divsione() throws Exception {
		assertThrows(Exception.class, () -> c.divide(-1, -1));
	}
}
