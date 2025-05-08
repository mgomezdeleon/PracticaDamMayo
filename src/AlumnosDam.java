public class AlumnosDam {
	public static void main(String[] args) {
		System.out.println("Alumnos Dam");
        // Imprime las 10 tablas de multiplicar directamente en el main
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Salto de línea entre tablas
        }
    }
}