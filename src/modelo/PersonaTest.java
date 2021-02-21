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
		fail("Not yet implemented");
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
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
