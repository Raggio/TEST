package InformacionEstudiante;

import org.junit.Test;

public class InfoEstudianteTest {

	int nota1;
	
	@Test
	public static double promediarEs() {
		Asignatura espanol = new Asignatura(2.5, 3.5);
		double promedioEs = (espanol.nota1+espanol.nota1)/2;
		return promedioEs;
	}
	@Test
	public static double promediarIn() {
		Asignatura ingles = new Asignatura(4.5, 3.4);
		double promedioIn = (ingles.nota1+ingles.nota1)/2;
		return promedioIn;
	}
	@Test
	public static double promediarSemestre() {
		double fin = (promediarEs()+promediarIn())/2;
		return fin;
	}
	
	
	
	
	
	
	
	
	
	
	
}
