package modelo;
import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.assertTrue;



import org.junit.Test;



public class CursoTest {

	
	Curso cu =new Curso();
	private Persona p1 = new Persona("54499111p","pedro","garcia");
	private Persona p2 = new Persona("754499111o","alex","merino");
	/*
	 * Documentar y crear test unitario
	 * */
	@Test
	public void testEliminarAlumno()  {
	
				//clase valida
				this.cu.aniadirAlumno(p1);
				int sizeAntes = this.cu.numeroAlumnos();
				try {
					this.cu.eliminarAlumno(p1.getDni());
				} catch (Exception e) {
//					e.printStackTrace();
				}
				int sizeDespues = this.cu.numeroAlumnos();
				assertEquals(sizeAntes, sizeDespues+1);
				
					
				//clase invalida
				sizeAntes = this.cu.numeroAlumnos();
				try {
					this.cu.eliminarAlumno(p1.getDni());
				} catch (Exception e) {
				
				} 
				sizeDespues = this.cu.numeroAlumnos();
				assertEquals(sizeAntes, sizeDespues);
					
				
				Boolean excepcionLanzada=false;
				//clase invalida
				try {
					this.cu.eliminarAlumno(p2.getDni());
				} catch (Exception e) {
					excepcionLanzada = true;
				} 
				assertTrue(excepcionLanzada);
	}
	
	
	/*
	 * Documentar y crear test unitario
	 * */
	@Test
	public void testAniadirAlumno() {
		//clase valida	
		int sizeAntes = this.cu.numeroAlumnos();
		this.cu.aniadirAlumno(p1);
		int sizeDespues = this.cu.numeroAlumnos();
		assertEquals(sizeAntes+1, sizeDespues);
	
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	@Test
	public void testEstaRegistrado() {
		//clase valida		
		this.cu.aniadirAlumno(p1);
		boolean prueba1 = this.cu.estaRegistrado(p1.getDni());
		assertTrue(prueba1);
		
		//clase invalida
		boolean prueba2 = this.cu.estaRegistrado(p2.getDni());
		assertFalse(prueba2);
		
		
	}
	/*
	 * Documentar y crear test unitario
	 * */
	@Test
	public void testCurso() {
		//clase valida
		Curso cu2 =new Curso();
		assertNotNull(cu2);
		
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	@Test
	public void testNumeroAlumnos() {
		//clase valida	
		int sizeAntes = this.cu.numeroAlumnos();
		this.cu.aniadirAlumno(p1);
		int sizeDespues = this.cu.numeroAlumnos();
		assertEquals(sizeAntes+1, sizeDespues);

	}
	
	

}
