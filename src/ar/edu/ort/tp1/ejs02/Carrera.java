package ar.edu.ort.tp1.ejs02;

import java.util.ArrayList;

public class Carrera {

	private String nombreEspecialidad;
	private ArrayList<Atleta> atletas;
	
	public Carrera(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
		this.atletas = new ArrayList<Atleta>();
	}

	public boolean add(Atleta atleta) {
		return atletas.add(atleta);
	}
}
