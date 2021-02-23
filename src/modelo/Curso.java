package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dam02
 *@version 1.0
 */
public class Curso {
	
	private List<Persona> listaAlumnos;
	
	/**
	 * Elimina un alumno de la listaAlumnos <br>
	 * @param dni es el numero de dni que queremos eliminar
	 * @throws Exception se lanza esta excepcion si el dni ingresado no tiene una longitud de 9 caracteres
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/**
	 * Añade un alumno a la listaAlumnos <br>
	 * @param p es la persona que queremos ingresar en la lista
	 */
	public  void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	
	/**
	 * Comprueba que el dni ingresado está en la listaAlumnos <br>	
	 * @param dni es el numero de dni que queremos comprobar
	 * @return Retorna TRUE si el alumno está dentro de la listaAlumnos o FALSE si no lo está
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
		
	
	/**
	 * Crea un Objeto curso con un ArrayList de objetos Persona<br>
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
		
	/**
	 * Devuelve el numero de alumnos que tiene la listaAlumnos <br>
	 * @return Retorna el tamaño del ArrayList
	 */
	public Integer numeroAlumnos() {
		return listaAlumnos.size();
		}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
