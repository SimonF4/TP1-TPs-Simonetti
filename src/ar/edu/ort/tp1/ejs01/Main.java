package ar.edu.ort.tp1.ejs01;

public class Main {

	public static void main(String[] args) {
		// Desde el main():

		// 1- Cre� una instancia de Grupo asign�ndole el n�mero, la letra o el nombre
		// que le hayan puesto.
		Grupo miGrupo = new Grupo("Mi Grupo");
		
		
		// 2- Agregale los miembros reales de tu grupo de trabajos pr�cticos. Agregale
		// uno m�s, ficticio. Cada vez que agregues un integrante el programa debe
		// mostrar el mensaje �[nombreIntegrante] fue asignado al grupo [nombreGrupo]�,
		// donde [nombreIntegrante] y [nombreGrupo] son, respectivamente, los nombres
		// del nuevo integrante y del grupo.
		miGrupo.agregarIntegrante("integrante1");
		miGrupo.agregarIntegrante("integrante2");
		miGrupo.agregarIntegrante("integrante3");
		miGrupo.agregarIntegrante("integrante4");
		miGrupo.agregarIntegrante("integranteFicticio");
		
		System.out.println("-".repeat(40));
		
		
	}

}
