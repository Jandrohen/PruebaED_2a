package modelo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {
	private Persona persona = new Persona("17896589S", 
			"Pablo", 
			"Iglesias");
	@Test
	void testPersonaConstructor() {
		assertEquals("17896589S", persona.getDni());
		assertEquals("Pablo", persona.getNombre());
		assertEquals("Iglesias", persona.getApellido1());
	
	}

	@Test
	void testGetDni() {
		assertEquals("17896589S", persona.getDni());
	}

	@Test
	void testSetDni() {
		//clase valida --> modifica
				try {
					persona.setDni("17456789L");
				} catch (Exception e) {
					
				}
				assertEquals("17456789L", persona.getDni());
				
				String dniAntesDeSet = persona.getDni();
				
				//clase invalida --> no modifica
				try {
					persona.setDni("17456789Z");
				} catch (Exception e) {
					
				}
				assertEquals(dniAntesDeSet, persona.getDni());
				
				//clase invalida --> Lanza Exception
				Boolean excepcionLanzada=false;
				
				try {
					persona.setDni("174567897");
				} catch (Exception e) {
					excepcionLanzada = true;
				} 
				assertTrue(excepcionLanzada);
	}

	@Test
	void testGetNombre() {
		assertEquals("Pablo", persona.getNombre());
	}

	@Test
	void testSetNombre() {
		persona.setNombre("Pedro");
		assertEquals("Pedro", persona.getNombre());
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

}
