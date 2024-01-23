package ar.edu.ort.tp1.ejs02;

public class Main {

	public static void main(String[] args) {
		/**
		 * "Ejercicio 2. Para los Juegos Olímpicos de la Juventud nos pidieron un
		 * programa con el cual podamos calcular quién fue el ganador de una carrera.
		 * Para eso ingresaremos un atleta y los segundos que ha empleado (con
		 * decimales) para recorrer la distancia de una especialidad determinada. Se
		 * debe tener en cuenta que puede haber más de un ganador (sus tiempos empleados
		 * fueron los mismos). "
		 */
		
		//Instanciaciones y completado de las variables a testear:
		JuegoOlimpico juegoOlimpicoDeLaJuventud = new JuegoOlimpico();
		completarJuegoOlimpico(juegoOlimpicoDeLaJuventud);
		
		//Testeo del calcularGanador():
		juegoOlimpicoDeLaJuventud.calcularGanador();
	}
	
	private static void completarJuegoOlimpico(JuegoOlimpico juegoOlimpico) {
		Carrera cienMetrosLlanos = new Carrera("100m. llanos");
		/* Por ahora no es necesario guardarse los atletas en variables.
		Atleta atleta1 = new Atleta(8.00f, "100m. llanos");
		Atleta atleta2 = new Atleta(8.15f, "100m. llanos");
		Atleta atleta3 = new Atleta(8.15f, "100m. llanos");
		Atleta atleta4 = new Atleta(8.55f, "100m. llanos");
		*/
		agregarAtletas(cienMetrosLlanos);
	}

	private static void agregarAtletas(Carrera cienMetrosLlanos) {
		cienMetrosLlanos.add(new Atleta(8.00f, "100m. llanos"));	
		cienMetrosLlanos.add(new Atleta(8.15f, "100m. llanos"));		
		cienMetrosLlanos.add(new Atleta(8.15f, "100m. llanos"));		
		cienMetrosLlanos.add(new Atleta(8.55f, "100m. llanos"));	
	}
}
