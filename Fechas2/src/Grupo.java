import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;

public class Grupo {

	ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

	public Grupo() {
		super();
	}

	public ArrayList<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(ArrayList<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	@Override
	public String toString() {
		return "Grupo [listaPersonas=" + listaPersonas + "]";
	}

	public void cumplesPorMes() {
		ArrayList<String> Enero = new ArrayList<String>();
		ArrayList<String> Febrero = new ArrayList<String>();
		ArrayList<String> Marzo = new ArrayList<String>();
		ArrayList<String> Abril = new ArrayList<String>();
		ArrayList<String> Mayo = new ArrayList<String>();
		ArrayList<String> Junio = new ArrayList<String>();
		ArrayList<String> Julio = new ArrayList<String>();
		ArrayList<String> Agosto = new ArrayList<String>();
		ArrayList<String> Septiembre = new ArrayList<String>();
		ArrayList<String> Octubre = new ArrayList<String>();
		ArrayList<String> Noviembre = new ArrayList<String>();
		ArrayList<String> Diciembre = new ArrayList<String>();
		for (Persona item : listaPersonas) {
			switch (item.getFechaNacimiento().getMonthValue()) {
			case 1:
				Enero.add(item.getNombre());
				break;
			case 2:
				Febrero.add(item.getNombre());
				break;
			case 3:
				Marzo.add(item.getNombre());
				break;
			case 4:
				Abril.add(item.getNombre());
				break;
			case 5:
				Mayo.add(item.getNombre());
				break;
			case 6:
				Junio.add(item.getNombre());
				break;
			case 7:
				Julio.add(item.getNombre());
				break;
			case 8:
				Agosto.add(item.getNombre());
				break;
			case 9:
				Septiembre.add(item.getNombre());
				break;
			case 10:
				Octubre.add(item.getNombre());
				break;
			case 11:
				Noviembre.add(item.getNombre());
				break;
			case 12:
				Diciembre.add(item.getNombre());
				break;
			default:
				System.out.println("Error: mes no valido");
				break;
			}
		}
		System.out.print("Enero: ");
		for (String elemento : Enero) {
			System.out.print(elemento);

		}
		System.out.println("");
		System.out.print("Febrero: ");
		for (String elemento : Febrero) {
			System.out.print(elemento);

		}
		System.out.println("");
		System.out.print("Marzo: ");
		for (String elemento : Marzo) {
			System.out.print(elemento);
		}
		System.out.println("");
		System.out.print("Abril: ");
		for (String elemento : Abril) {
			System.out.print(elemento);
		}
		System.out.println("");
		System.out.print("Mayo: ");
		for (String elemento : Mayo) {
			System.out.print(elemento + " / ");
		}
		System.out.println("");
		System.out.print("Junio: ");
		for (String elemento : Junio) {
			System.out.print(elemento);
		}
		System.out.println("");
		System.out.print("Julio: ");
		for (String elemento : Julio) {
			System.out.print(elemento);
		}
		System.out.println("");
		System.out.print("Agosto: ");
		for (String elemento : Agosto) {
			System.out.print(elemento);
		}
		System.out.println("");
		System.out.print("Septiembre: ");
		for (String elemento : Septiembre) {
			System.out.print(elemento + " / ");
		}
		System.out.println("");
		System.out.print("Octubre: ");
		for (String elemento : Octubre) {
			System.out.print(elemento + " / ");
		}
		System.out.println("");
		System.out.print("Noviembre: ");
		for (String elemento : Noviembre) {
			System.out.print(elemento);
		}
		System.out.println("");
		System.out.print("Diciembre: ");
		for (String elemento : Diciembre) {
			System.out.print(elemento);
		}

		System.out.println("");
	}

	public void mayorYMenor() {
		Persona mayor = listaPersonas.get(0);
		Persona menor = listaPersonas.get(0);
		LocalDate ahora = LocalDate.now();
		for (Persona p : listaPersonas) {
			int edad = (int) ChronoUnit.YEARS.between(p.getFechaNacimiento(), ahora);
			if (edad > (int) ChronoUnit.YEARS.between(mayor.getFechaNacimiento(), ahora)) {
				mayor = p;
			} else if (edad < (int) ChronoUnit.YEARS.between(menor.getFechaNacimiento(), ahora)) {
				menor = p;
			}
		}
		System.out.println("La persona más mayor es : " + mayor.getNombre() + " con una edad de "
				+ (int) ChronoUnit.YEARS.between(mayor.getFechaNacimiento(), ahora));
		System.out.println("La persona más pequeña es : " + menor.getNombre() + " con una edad de "
				+ (int) ChronoUnit.YEARS.between(menor.getFechaNacimiento(), ahora));
	}

	public void rangoDeEdad() {
		int edadMin = 18;
		int edadMax = 25;
		LocalDate ahora = LocalDate.now();
		ArrayList<String> listaNombres = new ArrayList<String>();
		for (Persona p : listaPersonas) {
			int edad = (int) ChronoUnit.YEARS.between(p.getFechaNacimiento(), ahora);
			if (edad >= edadMin && edad <= edadMax) {
				listaNombres.add(p.getNombre() + " " + edad);
			}
		}
		if (listaNombres.isEmpty()) {
			System.out.println("No hay personas entre " + edadMin + " y " + edadMax + " años");
		} else {
			System.out.println("Las personas que tienen entre " + edadMin + " y " + edadMax + " años son:");
			for (String nombre : listaNombres) {
				System.out.println(nombre);
			}
		}
	}

	public void edadMedia() {
		LocalDate ahora = LocalDate.now();
		int suma = 0;
		int longitud = listaPersonas.size();
		for (int i = 0; i < longitud; i++) {
			suma += (int) ChronoUnit.YEARS.between(listaPersonas.get(i).getFechaNacimiento(), ahora);
		}
		System.out.println("La edad media es " + suma / longitud);
	}

	public void SignosDelZodiaco() {
		ArrayList<String> Acuario = new ArrayList<String>();
		ArrayList<String> Piscis = new ArrayList<String>();
		ArrayList<String> Aries = new ArrayList<String>();
		ArrayList<String> Tauro = new ArrayList<String>();
		ArrayList<String> Geminis = new ArrayList<String>();
		ArrayList<String> Cancer = new ArrayList<String>();
		ArrayList<String> Leo = new ArrayList<String>();
		ArrayList<String> Virgo = new ArrayList<String>();
		ArrayList<String> Libra = new ArrayList<String>();
		ArrayList<String> Escorpio = new ArrayList<String>();
		ArrayList<String> Sagitario = new ArrayList<String>();
		ArrayList<String> Capricornio = new ArrayList<String>();
		for (Persona p1 : listaPersonas) {
			switch (p1.getFechaNacimiento().getMonthValue()) {
			case 1:
				if (p1.getFechaNacimiento().getDayOfMonth() >= 1 && p1.getFechaNacimiento().getDayOfMonth() <= 19) {
					Capricornio.add(p1.getNombre());
				} else if (p1.getFechaNacimiento().getDayOfMonth() >= 20
						&& p1.getFechaNacimiento().getDayOfMonth() <= 31) {
					Acuario.add(p1.getNombre());
				}
				break;
			case 2:
				if (p1.getFechaNacimiento().getDayOfMonth() >= 1 && p1.getFechaNacimiento().getDayOfMonth() <= 18) {
					Acuario.add(p1.getNombre());
				} else if (p1.getFechaNacimiento().getDayOfMonth() >= 19
						&& p1.getFechaNacimiento().getDayOfMonth() <= 29) {
					Piscis.add(p1.getNombre());
				}
				break;
			case 3:
				if (p1.getFechaNacimiento().getDayOfMonth() >= 1 && p1.getFechaNacimiento().getDayOfMonth() <= 20) {
					Piscis.add(p1.getNombre());
				} else if (p1.getFechaNacimiento().getDayOfMonth() >= 21
						&& p1.getFechaNacimiento().getDayOfMonth() <= 31) {
					Aries.add(p1.getNombre());
				}
				break;
			case 4:
				if (p1.getFechaNacimiento().getDayOfMonth() >= 1 && p1.getFechaNacimiento().getDayOfMonth() <= 19) {
					Aries.add(p1.getNombre());
				} else if (p1.getFechaNacimiento().getDayOfMonth() >= 20
						&& p1.getFechaNacimiento().getDayOfMonth() <= 30) {
					Tauro.add(p1.getNombre());
				}
				break;
			case 5:
				if (p1.getFechaNacimiento().getDayOfMonth() >= 1 && p1.getFechaNacimiento().getDayOfMonth() <= 20) {
					Tauro.add(p1.getNombre());
				} else if (p1.getFechaNacimiento().getDayOfMonth() >= 21
						&& p1.getFechaNacimiento().getDayOfMonth() <= 31) {
					Geminis.add(p1.getNombre());
				}
				break;
			case 6:
				if (p1.getFechaNacimiento().getDayOfMonth() >= 1 && p1.getFechaNacimiento().getDayOfMonth() <= 20) {
					Geminis.add(p1.getNombre());
				} else if (p1.getFechaNacimiento().getDayOfMonth() >= 21
						&& p1.getFechaNacimiento().getDayOfMonth() <= 30) {
					Cancer.add(p1.getNombre());
				}
				break;
			case 7:
				if (p1.getFechaNacimiento().getDayOfMonth() >= 1 && p1.getFechaNacimiento().getDayOfMonth() <= 22) {
					Cancer.add(p1.getNombre());
				} else if (p1.getFechaNacimiento().getDayOfMonth() >= 23
						&& p1.getFechaNacimiento().getDayOfMonth() <= 31) {
					Leo.add(p1.getNombre());
				}
				break;
			case 8:
				if (p1.getFechaNacimiento().getDayOfMonth() >= 1 && p1.getFechaNacimiento().getDayOfMonth() <= 22) {
					Leo.add(p1.getNombre());
				} else if (p1.getFechaNacimiento().getDayOfMonth() >= 23
						&& p1.getFechaNacimiento().getDayOfMonth() <= 31) {
					Virgo.add(p1.getNombre());
				}
				break;
			case 9:
				if (p1.getFechaNacimiento().getDayOfMonth() >= 1 && p1.getFechaNacimiento().getDayOfMonth() <= 22) {
					Virgo.add(p1.getNombre());
				} else if (p1.getFechaNacimiento().getDayOfMonth() >= 23
						&& p1.getFechaNacimiento().getDayOfMonth() <= 30) {
					Libra.add(p1.getNombre());
				}
				break;
			case 10:
				if (p1.getFechaNacimiento().getDayOfMonth() >= 1 && p1.getFechaNacimiento().getDayOfMonth() <= 22) {
					Libra.add(p1.getNombre());
				} else if (p1.getFechaNacimiento().getDayOfMonth() >= 23
						&& p1.getFechaNacimiento().getDayOfMonth() <= 31) {
					Escorpio.add(p1.getNombre());
				}
				break;
			case 11:
				if (p1.getFechaNacimiento().getDayOfMonth() >= 1 && p1.getFechaNacimiento().getDayOfMonth() <= 21) {
					Escorpio.add(p1.getNombre());
				} else if (p1.getFechaNacimiento().getDayOfMonth() >= 22
						&& p1.getFechaNacimiento().getDayOfMonth() <= 30) {
					Sagitario.add(p1.getNombre());
				}
				break;
			case 12:
				if (p1.getFechaNacimiento().getDayOfMonth() >= 1 && p1.getFechaNacimiento().getDayOfMonth() <= 21) {
					Sagitario.add(p1.getNombre());
				} else if (p1.getFechaNacimiento().getDayOfMonth() >= 22
						&& p1.getFechaNacimiento().getDayOfMonth() <= 31) {
					Capricornio.add(p1.getNombre());
				}
				break;
			default:
				System.out.println("Error: mes no valido");
				break;
			}
		}
		System.out.print("Acuario: ");
		for (String elemento : Acuario) {
			System.out.print(elemento + " / ");
		}
		System.out.println("");
		System.out.print("Piscis: ");
		for (String elemento : Piscis) {
			System.out.print(elemento);
		}
		System.out.println("");
		System.out.print("Aries: ");
		for (String elemento : Aries) {
			System.out.print(elemento);

		}
		System.out.println("");
		System.out.print("Tauro: ");
		for (String elemento : Tauro) {
			System.out.print(elemento + " / ");

		}
		System.out.println("");
		System.out.print("Geminis: ");
		for (String elemento : Geminis) {
			System.out.print(elemento + " / ");
		}
		System.out.println("");
		System.out.print("Cancer: ");
		for (String elemento : Cancer) {
			System.out.print(elemento);
		}
		System.out.println("");
		System.out.print("Leo: ");
		for (String elemento : Leo) {
			System.out.print(elemento);
		}
		System.out.println("");
		System.out.print("Virgo: ");
		for (String elemento : Virgo) {
			System.out.print(elemento + " / ");
		}
		System.out.println("");
		System.out.print("Libra: ");
		for (String elemento : Libra) {
			System.out.print(elemento + " / ");
		}
		System.out.println("");
		System.out.print("Escorpio: ");
		for (String elemento : Escorpio) {
			System.out.print(elemento);
		}
		System.out.println("");
		System.out.print("Sagitario: ");
		for (String elemento : Sagitario) {
			System.out.print(elemento);
		}
		System.out.println("");
		System.out.print("Capricornio: ");
		for (String elemento : Capricornio) {
			System.out.print(elemento);
		}
	}

	public void ordenarPorEdad() {
		LocalDate ahora = LocalDate.now();
		int longitud = listaPersonas.size();
		int edad1 = 0;
		int edad2 = 0;

		for (int i = 0; i < longitud - 1; i++) {
			for (int j = 0; j < longitud - i - 1; j++) {
				edad1 = (int) ChronoUnit.YEARS.between(listaPersonas.get(j).getFechaNacimiento(), ahora);
				edad2 = (int) ChronoUnit.YEARS.between(listaPersonas.get(j + 1).getFechaNacimiento(), ahora);
				if (edad1 < edad2) {
					// intercambiar los elementos
					Persona temp = listaPersonas.get(j);
					listaPersonas.set(j, listaPersonas.get(j + 1));
					listaPersonas.set(j + 1, temp);
				}
			}
		}
		System.out.println("Lista ordenada de personas por su edad");
		for (Persona persona : listaPersonas) {
			int edad = (int) ChronoUnit.YEARS.between(persona.getFechaNacimiento(), ahora);
			System.out.println(persona.getNombre() + " " + edad);
		}
	}

}
