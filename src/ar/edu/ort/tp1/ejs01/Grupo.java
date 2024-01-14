package ar.edu.ort.tp1.ejs01;

import java.util.ArrayList;

public class Grupo {
	// la cual representa al grupo de Trabajos Prácticos y sus integrantes
	private String nombre; // para guardar el nombre del grupo
	private ArrayList<String> integrantes; // otro atributo llamado integrantes (colección de Strings) donde cada
											// elemento será el nombre de un integrante de tu grupo de trabajos
											// prácticos
	
	// **************(explotar/implementar los métodos que se mencionan a continuación):***************
	// a- Grupo(String nombre)
	public Grupo(String nombre) {
		setNombre(nombre);
		integrantes = new ArrayList<>();
	}
}
