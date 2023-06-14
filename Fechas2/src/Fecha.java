import java.time.LocalDate;

public class Fecha {
	public static LocalDate StringToLocaldate(String item) {
		LocalDate fecha;
		fecha = LocalDate.parse(item);
		return fecha;
	}
}