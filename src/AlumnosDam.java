
public class AlumnosDam {

	public static void main(String[] args) {
		System.out.println("Alumnos Dam");
		
		imprimirTablas();
	
	}//fin main

	public static void imprimirTablas() {
		
		for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
        
        System.out.println(); // Línea en blanco para separar las tablas

		}
	
	}//fin imprimirTablas
	
}//fin clase
