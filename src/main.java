
public class main {

	public static void main(String[] args) throws Exception{
		try {
			Lista ar = new Lista(100);			
			Alumnos a = new Alumnos("Juanma", 23, 2);
			ar.añadirAlumno(a);
			Alumnos b = new Alumnos("Juanma", 23, 5);
			ar.añadirAlumno(b);
//			System.out.println(a.getEdad());
//			Alumnos b = new Alumnos("Juanma", 21, 1);
//			System.out.println(b.getEdad());
		}catch(IllegalArgumentException e) {
			System.out.println("Error");
		}
		
	}

}
