package modelo;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



public class CursoTest {

	
	Curso cu =new Curso();
	private Persona p1 = new Persona("54499111p","pedro","garcia");
	private Persona p2 = new Persona("754499111o","alex","merino");
	/*
	 * Documentar y crear test unitario
	 * */
	@Test
	public void testeliminarAlumno()  {
	
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
	public void testaniadirAlumno() {
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
	public void testestaRegistrado() {
		//clase valida		
		this.cu.aniadirAlumno(p1);
		boolean prueba1 = this.cu.estaRegistrado(p1.getDni());
		assertTrue(prueba1);
		
	}
	/*
	 * Documentar y crear test unitario
	 * */
	@Test
	public void testCurso() {
		Curso cu2 =new Curso();
		assertNotNull(cu2);
		
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	@Test
	public void numeroAlumnos() {

	}
	
	

}
