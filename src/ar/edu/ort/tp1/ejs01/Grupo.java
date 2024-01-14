package ar.edu.ort.tp1.ejs01;

import java.util.ArrayList;

public class Grupo {
	// la cual representa al grupo de Trabajos Pr�cticos y sus integrantes
	private String nombre; // para guardar el nombre del grupo
	private ArrayList<String> integrantes; // otro atributo llamado integrantes (colecci�n de Strings) donde cada
											// elemento ser� el nombre de un integrante de tu grupo de trabajos
											// pr�cticos
	
	// **************(explotar/implementar los m�todos que se mencionan a continuaci�n):***************
	// a- Grupo(String nombre)
	public Grupo(String nombre) {
		setNombre(nombre);
		integrantes = new ArrayList<>();
	}
}
