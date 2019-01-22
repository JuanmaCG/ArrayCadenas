
public class Lista {
	
	private int nAlumnos;
	private Alumnos[] lista;
	
	public Lista(int nAlumnos) {
		this.nAlumnos = nAlumnos;
		this.lista = new Alumnos[nAlumnos];
	}

	/**
	 * @return the nAlumnos
	 */
	public int getnAlumnos() {
		return nAlumnos;
	}

	/**
	 * @param nAlumnos the nAlumnos to set
	 */
	public void setnAlumnos(int nAlumnos) {
		this.nAlumnos = nAlumnos;
	}

	/**
	 * @return the comprueba
	 */
	public Alumnos[] getComprueba() {
		return lista;
	}

	/**
	 * @param comprueba the comprueba to set
	 */
	public void setComprueba(Alumnos[] comprueba) {
		this.lista = comprueba;
	}
	
	public void añadirAlumno(Alumnos a) {
		boolean encontrado = false;
		boolean añadido = false;
		for(int i = 0; i < lista.length && encontrado == false; i++) {
			if(lista[i] !=null && a.getNombre() == lista[i].getNombre()) {
				encontrado = true;
				System.out.println("Alumno con el nombre \"" + a.getNombre() + "\" encontrado");
			}
		}
		for(int i = 0; i < lista.length && encontrado == false; i++) {
			if(lista[i] == null && añadido == false) {
				lista[i] = a;
				añadido = true;
			}
		}
		if(añadido) {
			System.out.println("Alumno \"" + a.getNombre() + "\" añadido");
		}
	}
	
	

}