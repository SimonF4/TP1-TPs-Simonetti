package ar.edu.ort.tp1.ejs01;

import java.util.ArrayList;

public class Grupo {
	// la cual representa al grupo de Trabajos Prácticos y sus integrantes
	
	private static int NO_ENCONTRADO = -1;
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
	
	/*
	 * *****************************************************************************
	 * Del F al H son metodos similares. Hago 1ro el h xq lo uso en el metodo e.
	 * MAL! Hago 1ro el F y despues el H.
	 * *****************************************************************************
	 */
	
	// f- obtenerPosicionIntegrante(String nombreIntegrante)
		/**
		 * Devuelve la posición en el grupo del integrante cuyo nombre se ha recibido
		 * por parámetro. En caso de no encontrarlo devolverá -1.
		 * 
		 * @param nombreIntegrante
		 * @return int = posicion donde se encontro el integrante.
		 *         <p>
		 *         -1 = integrante no encontrado.
		 *         </p>
		 */
		private int obtenerPosicionIntegrante(String nombreIntegrante) {
			// como saco la posicion si ya busque el integrante? Tenes q si o si hacer otra
			// busqueda al pedo. => hago al reves
			// desarrollo en este metodo y despues en el buscar uso este
			int posicionIntegranteEncontrado = NO_ENCONTRADO;
			int i = 0;
			int cantIntegrantes = this.integrantes.size(); // o puedo usar el getCantidadIntegrantes();

			// CORRECCIONES > este if no lo tenia
			if (nombreIntegrante != null && cantIntegrantes > 0) {
				// Q lo q itero no llegue al limite de la lista a recorrer + q no lo halla
				// encontrado.
				while (i < cantIntegrantes && posicionIntegranteEncontrado == NO_ENCONTRADO) {
					// este es el integrante actual. -> this.integrantes.get(i)
					// en forma completa sin usar metodos locales seria BASICAMENTE asi ->
					// (this.integrantes.get(i).equalsIgnoreCase(nombre))

					// MAL! -> if (obtenerIntegrante(i).equalsIgnoreCase(nombre)) {
					// MAL2! -> decia solo nombre en el parentesis y no nombreIntegrante.
					if (this.integrantes.get(i).equalsIgnoreCase(nombreIntegrante)) {
						posicionIntegranteEncontrado = i; // el integrante en la lista es solo un int q se guarda, no un
															// objeto Integrante.
					}

					i++; // Lo ideal siempre es dejar el i++ para el final a menos q lo uses fuera de
							// este while.
				}
			}

			return posicionIntegranteEncontrado;
		}
		
		//La otra forma mas corta de hacer este mismo metodo.
		private int obtenerPosicionIntegranteVersion2(String nombreIntegrante) {
			return this.integrantes.indexOf(nombreIntegrante);
		}
		
	// g- obtenerIntegrante(int posicion)
	/**
	 * Recibe un valor entero que representa la posición del integrante en la lista
	 * (entero igual o mayor que 1) y devuelve el integrante guardado en (posicion -
	 * 1) dentro de la colección de integrantes. Si el integrante no existe se debe
	 * devolver null.
	 * 
	 * @param posicion
	 * @return String = el integrante q esta en esa posicion
	 *         <p>
	 *         null = no lo encontro
	 *         </p>
	 */
	public String obtenerIntegrante(int posicion) {
		// Como se si el integrante no existe? YO entiendo q es si se pasa del size.
		return (posicion > this.integrantes.size()) ? this.integrantes.get(posicion) : null;
	}
	
	// h- buscarIntegrante(String nombre)
	/**
	 * Busca al integrante del grupo cuyo nombre coincida con el parámetro de
	 * entrada. En caso de que haya coincidencia, lo devuelve; caso contrario, el
	 * método devolverá null.
	 * 
	 * @param nombre
	 * @return String = encontro al integrante q buscabas y te devuelve el nombre
	 *         del mismo.
	 *         <p>
	 *         null = no se encontro a este integrante en la lista.
	 *         </p>
	 */
	public String buscarIntegrante(String nombre) {
		// ESTA MAL!!! String integranteActual =
		// obtenerIntegrante(obtenerPosicionIntegrante(nombre)); //Desde adentro hacia
		// afuera-> saco el numerito de posicion de este chabon-> me pido ese chabon.
		return (obtenerPosicionIntegrante(nombre) != NO_ENCONTRADO) ? nombre : null;
	}

	/*
	 * Es ahora "public String obtenerIntegrante(int posicion) {" justo se me habia
	 * ocurrido CREAR este metodo para el metodo de arriba y ya el ejs te ponia un
	 * metodo igual a este(obtenerIntegrante).
	 * 
	 * private String dameIntegrante(int i) { return this.integrantes.get(i); }
	 */

	/*
	 * *****************************************************************************
	 * [FIN]Del F al H son metodos similares. Hago 1ro el h xq lo uso en el metodo
	 * e. MAL! Hago 1ro el F y despues el H.
	 * *****************************************************************************
	 */
	
	// i- removerIntegrante
	/**
	 * 
	 * Remueve de la colección de integrantes a aquel cuyo nombre coincide con el
	 * nombre recibido como parámetro. Si lo encontró, luego de removerlo debe
	 * devolverlo con return, y si no debe devolver null.
	 * 
	 * @param nombreIntegrante
	 * @return String = integrante removido de la lista.
	 *         <p>
	 *         null = integrante no encontrado.
	 *         </p>
	 */
	public String removerIntegrante(String nombreIntegrante) {
		/*
		 * [no puedo hacerlo en una linea pq puede q tenga posicion -1 => error] lo
		 * busco (necesito la posicion) + remuevo(tmb este metodo me devuelve el
		 * integranteRemovido asi q no necesito variable aux) return
		 * this.integrantes.remove(obtenerPosicionIntegrante(nombreIntegrante));
		 */
		String integranteRemovido = null;
		int posIntegrante = obtenerPosicionIntegrante(nombreIntegrante);

		if (posIntegrante != NO_ENCONTRADO) {
			integranteRemovido = this.integrantes.remove(posIntegrante);
		}

		return integranteRemovido;
	}
	
	// j- mostrarIntegrantes
	/**
	 * Muestra por consola la cantidad de integrantes y los nombres de cada uno de
	 * ellos.
	 */
	private void mostrarIntegrantes() {
		System.out.println("*".repeat(4));
		System.out.println("Mostrar Integrantes...");

		System.out.printf("Cantidad de integrantes: %d \n", getCantidadIntegrantes());
		mostrarNombresIntegrantes();

		System.out.println("*".repeat(4));
	}

	private void mostrarNombresIntegrantes() {
		System.out.println("Nombre de los integrantes: ");
		for (String integrante : integrantes) {
			System.out.printf("- %s \n", integrante);
		}
	}
	
	// k- mostrar
	/**
	 * Muestra por consola el nombre del grupo, la cantidad de integrantes y el
	 * nombre de cada uno de ellos.
	 */
	public void mostrar() {
		System.out.println("Mostrar...");
		System.out.println("*".repeat(40));
		
		System.out.printf("Nombre del Grupo: %s \n", this.nombre);
		mostrarIntegrantes();
		
		System.out.println("*".repeat(40));
	}

	// l- vaciar
	/**
	 * public void vaciar() Elimina todos los elementos de la lista de integrantes.
	 */
	public void vaciar() {
		this.integrantes.clear();
	}
	
	
}
