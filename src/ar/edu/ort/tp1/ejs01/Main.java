package ar.edu.ort.tp1.ejs01;

public class Main {

	public static void main(String[] args) {
		// Desde el main():

		// 1- Creá una instancia de Grupo asignándole el número, la letra o el nombre
		// que le hayan puesto.
		Grupo miGrupo = new Grupo("Mi Grupo");
		
		
		// 2- Agregale los miembros reales de tu grupo de trabajos prácticos. Agregale
		// uno más, ficticio. Cada vez que agregues un integrante el programa debe
		// mostrar el mensaje “[nombreIntegrante] fue asignado al grupo [nombreGrupo]”,
		// donde [nombreIntegrante] y [nombreGrupo] son, respectivamente, los nombres
		// del nuevo integrante y del grupo.
		miGrupo.agregarIntegrante("integrante1");
		miGrupo.agregarIntegrante("integrante2");
		miGrupo.agregarIntegrante("integrante3");
		miGrupo.agregarIntegrante("integrante4");
		miGrupo.agregarIntegrante("integranteFicticio");
		
		System.out.println("-".repeat(40));
		
		// 3- Escribí un método del programa principal que compruebe si un integrante
		// determinado fue o no agregado al grupo. Probalo tanto con uno que exista como
		// con uno que no.
		System.out.println(fueAgregado(miGrupo, "inTegrante4"));
		System.out.println(fueAgregado(miGrupo, "integrante5"));
		
		System.out.println("-".repeat(40));
		
		// 4- Mostrá todos los datos del grupo
		// NO SE PUEDE CON TO STRING PQ NECESITO RECORRER EL ARRAYLIST
		miGrupo.mostrar();
		
		System.out.println("-".repeat(40));
		
		// 5- Remové al integrante ficticio para que el grupo quede con los integrantes
		// reales. Luego de removerlo de la lista, mostrá los datos del integrante
		// removido.
		System.out.println("> Integrante removido: " + miGrupo.removerIntegrante("integranteFicticio"));
		
		System.out.println("-".repeat(40));
		
		// 6- Volvé a remover el mismo integrante ficticio.
		System.out.println("> Integrante removido: " + miGrupo.removerIntegrante("integranteFicticio"));

		System.out.println("-".repeat(40));
		
		
		
	}
	
	/**
	 * (2.) compruebe si un integrante determinado fue o no agregado al grupo.
	 * 
	 * @param nombreIntegrante
	 * @return boolean(true=agregado, false=no agregado)
	 */
	private static boolean fueAgregado(Grupo grupo, String nombreIntegrante) {
		// lo busco en este grupo y si NO devuelve null => lo agregue(true)
		return (grupo.buscarIntegrante(nombreIntegrante) != null);
	}
}
