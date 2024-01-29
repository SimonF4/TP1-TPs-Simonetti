package ar.edu.ort.tp1.ejs02;

import java.util.ArrayList;

public class JuegoOlimpico {

	private Carrera carrera;
	

	public void setCarrera(Carrera carrera) throws IllegalArgumentException { 
		if (carrera != null) {
			throw new IllegalArgumentException("Error: Se ingreso una carrera nula.");
		}else if (! carrera.tieneAtletas()) {
			throw new IllegalArgumentException("Error: Se ingreso una carrera sin atletas.");			
		}
		
		this.carrera = carrera;			
	}

	public void mostrarGanador() {
		this.carrera.mostrarGanador();
	}
}
