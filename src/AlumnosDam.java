
public class AlumnosDam {

	public static void main(String[] args) {
		System.out.println("Alumnos Dam");
		imprimirTablasMultiplicar();
	}
	public static void imprimirTablasMultiplicar() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabla del " + i + ":");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println(); // Línea en blanco para separar cada tabla
		}
	}

}
