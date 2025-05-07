
public class AlumnosDam {

	public static void main(String[] args) {
		System.out.println("Alumnos Dam");
	
	    imprimirTablas();
	}
	
	public static void imprimirTablas() {
		//1 a 10 para imprimir las tablas
	    for (int i = 1; i <= 10; i++) {
	        System.out.println("Tabla del " + i + ":");
	        // Imprimimos
	        for (int j = 1; j <= 10; j++) {
	            System.out.println(i + " x " + j + " = " + (i * j));
	        }
	        // Línea en blanco
	        System.out.println();
	    }
	}
}
