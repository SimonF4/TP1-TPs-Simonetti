package ar.edu.ort.tp1.ejs02;

public class Main {

	public static void main(String[] args) {
		/**
		 * "Ejercicio 2. Para los Juegos Ol�mpicos de la Juventud nos pidieron un
		 * programa con el cual podamos calcular qui�n fue el ganador de una carrera.
		 * Para eso ingresaremos un atleta y los segundos que ha empleado (con
		 * decimales) para recorrer la distancia de una especialidad determinada. Se
		 * debe tener en cuenta que puede haber m�s de un ganador (sus tiempos empleados
		 * fueron los mismos). "
		 */
		
		//Instanciaciones y completado de las variables a testear:
		JuegoOlimpico juegoOlimpicoDeLaJuventud = new JuegoOlimpico();
		completarJuegoOlimpico(juegoOlimpicoDeLaJuventud);
		
		//Testeo del calcularGanador():
		juegoOlimpicoDeLaJuventud.calcularGanador();
	}
}
