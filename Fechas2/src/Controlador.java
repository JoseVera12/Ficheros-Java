import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {

		Fichero ficherito = new Fichero("datos/Fecha.txt");
		Grupo grupito = new Grupo();

		FileReader fichero = null;
		BufferedReader Buff = null;
		String cadena;
		ArrayList<String> lista = new ArrayList<String>();
		Scanner lector = new Scanner(System.in);
		int opcion = 0;
		String nombre;
		LocalDate fechNacimiento;
		String curso;
		String[] datos;
		int longitud = lista.size();

		try {
			fichero = new FileReader(ficherito.getRuta());
			Buff = new BufferedReader(fichero);

			while ((cadena = Buff.readLine()) != null) {
				lista.add(cadena);
			}
			longitud = lista.size();
			for (int i = 0; i < longitud; i++) {
				datos = lista.get(i).split(";");
				nombre = datos[0];
				fechNacimiento = Fecha.StringToLocaldate(datos[1]);
				curso = datos[2];

				grupito.getListaPersonas().add(new Persona(nombre, fechNacimiento, curso));
			}

			ficherito.leerFichero();
			System.out.println("");
			System.out.println("Elige que quieres hacer: ");
			System.out.println("EJERCICIO 1: CUMPLES POR MES");
			System.out.println("EJERCICIO 2: MAYOR Y MENOR PERSONA");
			System.out.println("EJERCICIO 3: RANGO EDAD");
			System.out.println("EJERCICIO 4: EDAD MEDIA");
			System.out.println("EJERCICIO 5: SIGNOS DEL ZODIACO");
			System.out.println("EJERCICIO 6: ORDENAR POR EDAD");
			opcion = lector.nextInt();
			lector.nextLine();

			switch (opcion) {
			case 1:

				System.out.println("EJERCICIO 1: CUMPLES POR MES");
				grupito.cumplesPorMes();
				break;
			case 2:
				System.out.println("EJERCICIO 2: MAYOR Y MENOR PERSONA");
				grupito.mayorYMenor();
				break;
			case 3:
				System.out.println("EJERCICIO 3: RANGO EDAD");
				grupito.rangoDeEdad();
				break;
			case 4:
				System.out.println("EJERCICIO 4: EDAD MEDIA");
				grupito.edadMedia();
				break;
			case 5:
				System.out.println("EJERCICIO 5: SIGNOS DEL ZODIACO");
				grupito.SignosDelZodiaco();
				break;
			case 6:
				System.out.println("EJERCICIO 6: ORDENAR POR EDAD");
				grupito.ordenarPorEdad();
				break;

			}
		} catch (Exception e) {
			System.out.println("Error inesperado");
		} finally {
			try {
				if (lector != null) {
					lector.close();
				}
				if (fichero != null) {
					fichero.close();
				}

			} catch (IOException e) {
				System.out.println("Error al cerrar el fichero");
				e.printStackTrace();
			}

		}

	}

}
