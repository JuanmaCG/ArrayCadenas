
public class Alumnos {
	
	private String nombre;
	private int edad;
	private int notas;
	private int modulos;
	
	public Alumnos(String nombre, int edad, int notas) {
		this.nombre = "";
		this.edad = 0;
		this.notas = 0;
		setNombre(nombre);
		setEdad(edad);
		setNotas(notas);
	}
	
	public Alumnos() {
		super();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre){
		this.nombre = nombre;	
	}
	
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		if(edad < 0) {
			throw new IllegalArgumentException("Edad inferior a 0");
		}else {
			this.edad = edad;
		}
	}

	/**
	 * @return the notas
	 */
	public int getNotas() {
		return notas;
	}

	/**
	 * @param notas the notas to set
	 */
	public void setNotas(int notas) {
		if(notas < 0 || notas > 10) {
			throw new IllegalArgumentException("Notas invalidas. Entre 0 y 10");
		}else {
			this.notas = notas;
		}
	}

	/**
	 * @return the modulos
	 */
	public int getModulos() {
		return modulos;
	}

	/**
	 * @param modulos the modulos to set
	 */
	public void setModulos(int modulos) {
		this.modulos = modulos;
	}
	
	
}
