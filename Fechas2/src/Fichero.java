import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Locale;

import javax.sound.sampled.Line;

public class Fichero {

	private String ruta;
	private ArrayList<Persona> listaPersonas = new ArrayList<>();

	public Fichero(String ruta) {
		super();
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	@Override
	public String toString() {
		return "Fichero [ruta=" + ruta + "]";
	}

	public void leerFichero() {

		FileReader fichero = null;
		BufferedReader lector = null;
		String cadena;

		try {
			fichero = new FileReader(ruta);
			lector = new BufferedReader(fichero);

			while ((cadena = lector.readLine()) != null) {
				System.out.println(cadena);
			}

		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de entrada/salida");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error inesperado");
			e.printStackTrace();
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

	@SuppressWarnings("finally")
	public ArrayList<String> devolverFichero() {

		FileReader fichero = null;
		BufferedReader lector = null;
		String cadena;
		ArrayList<String> contenido = new ArrayList<String>();
		String[] datos;
		String nombre = "";
		String curso = "";
		Month mes;
		int mayor = 0;
		int menor = Integer.MAX_VALUE;

		try {
			fichero = new FileReader(ruta);
			lector = new BufferedReader(fichero);
			while ((cadena = lector.readLine()) != null) {
				contenido.add(cadena);

			}
			for (int i = 0; i < contenido.size(); i++) {
				datos = contenido.get(i).split(";");
				LocalDate fechaNacimiento = LocalDate.parse(datos[1]);
				listaPersonas.add(new Persona(datos[0], fechaNacimiento, datos[2]));
				/* CUMPLES POR MES */
				mes = fechaNacimiento.getMonth();
				System.out.println("The birthday of " + datos[0].toLowerCase() + " is " + mes);
				/* Mayor menor por edad */
				if (ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now()) > mayor) {
					mayor = (int) ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
				}
				if (ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now()) < menor) {
					menor = (int) ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
				}
				/* Rango de edad */
				if (fechaNacimiento.getYear() >= 1998 || fechaNacimiento.getYear() <= 2005) {
					System.out.println(datos[0]);
				}
			}
			System.out.println(mayor);
			System.out.println(menor);

		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de entrada/salida");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error inesperado");
			e.printStackTrace();
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
			} finally {
				return contenido;
			}

		}

	}

	public void escribirFichero(ArrayList<String> datos) {
		FileWriter guardar = null;

		try {
			guardar = new FileWriter(ruta, true);// true = append

			for (String dato : datos) {
				guardar.write(dato + (char) 13);
			}
			// for(int i=0;i<datos.length;i++) {}

		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {

			System.out.println("Un error incontrolado");
		} finally {
			try {
				if (guardar != null) {
					guardar.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	public void escribirFichero(Fichero datos) {
		FileWriter guardar = null;
		FileReader fichero = null;
		BufferedReader lector = null;
		String cadena;

		try {
			guardar = new FileWriter("Datos/Fecha.txt", true);// true = append
			fichero = new FileReader(datos.getRuta());
			lector = new BufferedReader(fichero);
			String line;
			while ((line = lector.readLine()) != null) {

			}

		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de entrada/salida");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error inesperado");
			e.printStackTrace();
		} finally {
			try {
				if (guardar != null) {
					guardar.close();
				}
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

	public void escribirFichero(String dato) {
		FileWriter guardar = null;

		try {
			guardar = new FileWriter(ruta, true);// true = append
			guardar.write(dato + (char) 13);

		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {

			System.out.println("Un error incontrolado");
		} finally {
			try {
				if (guardar != null) {
					guardar.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
