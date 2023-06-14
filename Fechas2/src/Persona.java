import java.time.LocalDate;

public class Persona {

	private String nombre;
	private LocalDate fechaNacimiento;
	private String curso;

	public Persona(String nombre, LocalDate fechaNacimiento, String curso) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", curso=" + curso + "]";
	}

}
