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
	
	// b- getNombre()
	public String getNombre() {
		return nombre;
	}
	
	// c- setNombre(String nombre)
	public void setNombre(String nombre) {
		if (nombre != null || nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	
	// d- getCantidadIntegrantes()
	/**
	 * Devuelve la cantidad actual de integrantes del grupo. (en int => no tengo q
	 * pasar la copia de la lista sino contar cuantos elementos tiene)
	 * 
	 * @return int = cantidad total de integrantes.
	 */
	public int getCantidadIntegrantes() {
		return this.integrantes.size();
	}
	
	// e- agregarIntegrante(String nombreIntegrante)
	/**
	 * Agrega al grupo el nombre de un nuevo integrante, siempre y cuando éste no
	 * haya sido cargado con anterioridad. Cuando ya exista, no debe volver a
	 * agregarlo.
	 * 
	 * @param nombreIntegrante
	 */
	public void agregarIntegrante(String nombreIntegrante) {
		String resultado = "No se pudo agregar al integrante";

		if (buscarIntegrante(nombreIntegrante) == null) {
			this.integrantes.add(nombreIntegrante);
			resultado = nombreIntegrante + " fue asignado al grupo " + this.nombre;
		}
		/*
		 * Cada vez que agregues un integrante el programa debe // mostrar el mensaje
		 * “[nombreIntegrante] fue asignado al grupo [nombreGrupo]”, // donde
		 * [nombreIntegrante] y [nombreGrupo] son, respectivamente, los nombres // del
		 * nuevo integrante y del grupo.
		 */
		System.out.println(resultado);
	}
}
