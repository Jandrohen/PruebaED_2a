package modelo;

/**
 * @author dam02
 *@version 1.0
 */
public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	/**
	 * Crea un constructor de persona<br>
	 * @param dni String de 9 digitos en el que insertas el dni
	 * @param nombre El nombre de la persona
	 * @param apellido1 El apellido de la persona
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/**
	 * 
	 * @return Devuelve un String con el DNI de una Persona
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * Recoge un String para asignarle un DNI al objeto Persona
	 * @param dni String de numeros y una letra al Final
	 * @throws Exception Retorna un mensaje indicando que el ultimo caracter no es una letra
	 */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()-1))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/**
	 * @return Devuelve un String con el Nombre de una Persona
	 */	
	public String getNombre() {
		return nombre;
	}

	/**
	 * Recoge un String para asignarle un Nombre al objeto Persona	  
	 * @param nombre String de nombre de una persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return Devuelve un String con el Apellido de una Persona
	 */	
	public String getApellido1() {
		return apellido1;
	}
	
	/**
	 * Recoge un String para asignarle un Apellido al objeto Persona	  
	 * @param apellido1 String apellido de una persona
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
