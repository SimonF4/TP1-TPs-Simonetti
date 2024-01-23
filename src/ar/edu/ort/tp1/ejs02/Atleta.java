package ar.edu.ort.tp1.ejs02;

public class Atleta {
	
	private float tiempoLlegada;
	private String nombreEspecialidad;

	public Atleta(float tiempoLlegada, String nombreEspecialidad) {
		this.tiempoLlegada = tiempoLlegada;
		this.nombreEspecialidad = nombreEspecialidad;
	}
	
	/**
	 * Para comparar simplemente si es el mismo nombre de especialidad.
	 * @param nombreEspecialidad
	 * @return
	 */
	public boolean mismaEspecialidad(String nombreEspecialidad) {
		return this.nombreEspecialidad.equalsIgnoreCase(nombreEspecialidad);
	}
}
