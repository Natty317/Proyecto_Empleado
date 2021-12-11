package modelo.mundo;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	//Constructor
	public Fecha (int pdia, int pMes, int pAnio) {
		dia= pdia;
		mes=pMes;
		anio=pAnio;
	}
	//Contructor sin parametros
	public Fecha () {
		dia= 0;
		mes=0;
		anio=0;
	}

	//Metodos Analizadores Getters
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAnio() {
		return anio;
	}

	//Metodos funcionales
	//fecha1 23/04/2000    fecha2 15/08/2008
	public int darDiferenciaEnMeses(Fecha pFecha) {
		int diferencia = 0;
		int otroAnhio = pFecha.getAnio( );
		int otroMese = pFecha.getMes( );
		int otroDias = pFecha.getDia( );

		// Calcula la diferencia en meses
		diferencia = 12 * ( otroAnhio - anio ) + ( otroMese - mes );

		// Si el día no es mayor, resta un mes
		if( otroDias < dia )
		{
			diferencia--;
		}

		return diferencia;	
	}

	//dd-mm-aaaa
	public String toString() {
		return dia + "-" + mes +"-" +anio;
	}
}
