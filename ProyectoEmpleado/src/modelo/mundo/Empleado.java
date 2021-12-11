package modelo.mundo;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado {
	//Atributos
	private String nombreEmpleado;
	private String apellidoEmpleado;
	private int genero;//1 Femenino, 2 Masculino
	private String imagen;
	private double salario;

	private Fecha fechaNacimiento;
	private Fecha fechaIngreso;

	//Metodo Constructor sin parametros
	public Empleado() {
		nombreEmpleado=" ";
		apellidoEmpleado=" ";
		genero=0;
		imagen=" "; 
		salario=0.0;
		fechaNacimiento=new Fecha();
		fechaIngreso=new Fecha();
	}

	//Metodo Constructor con Parametros
	public Empleado(String pNombreEmpleado,String pApellidoEmpleado,int pGenero, String pImagen,double pSalario,Fecha pFechaN,Fecha pFechaI) {
		nombreEmpleado= pNombreEmpleado;
		apellidoEmpleado = pApellidoEmpleado;
		genero=pGenero;
		imagen=pImagen;
		salario=pSalario;
		fechaNacimiento=pFechaN;
		fechaIngreso=pFechaI;
	}
	//Metodos analizadores (Permiten obtener o modificar la informacion de los atributos)
	//Getters (Obtener) //Setters(Cambiar o modificar)

	public String getNombre() {
		return nombreEmpleado;
	}

	public String getApellido() {
		return apellidoEmpleado;
	}

	public int getGenero() {
		return genero;
	}

	public String getFechaNacimiento() {
		String strFecha=fechaNacimiento.toString();
		return strFecha;
	}

	public String getFechaIngreso() {
		String strFecha=fechaIngreso.toString();
		return strFecha;
	}

	public String getImagen() {
		return imagen;
	}

	public double getSalario() {
		return salario;
	}

	public Fecha getFechaActual() {
		GregorianCalendar gc =new GregorianCalendar();
		int dia = gc.get(Calendar.DAY_OF_MONTH);
		int mes= gc.get(Calendar.MONTH)+1;
		int anioS = gc.get(Calendar.YEAR);
		Fecha fechaActual = new Fecha(dia, mes, anioS);
		return fechaActual;
	}

	//Metodos Setters
	public void setEmpleado(String pNombreEmpleado,String pApellidoEmpleado,int pGenero, String pImagen,double pSalario) {
		nombreEmpleado= pNombreEmpleado;
		apellidoEmpleado = pApellidoEmpleado;
		genero=pGenero;
		imagen=pImagen;
		salario=pSalario;
	}

	public void setSalario(double pSalario) {
		salario=pSalario;
	}

	//Metodos funcionales
	public int calcularLaAntiguedad() {
		int antiguedad =0;
		Fecha fechaActual=getFechaActual();
		antiguedad=fechaIngreso.darDiferenciaEnMeses(getFechaActual())/12;
		return antiguedad;
	}

	// Metodo funcional calculo la edad del emplead en años
	public int calcularEdad() {
		int edad=0;
		Fecha fechaActual= getFechaActual();
		edad = fechaNacimiento.darDiferenciaEnMeses(getFechaActual()) / 12;

		return edad;
	}

	//Metodo que calcula las prestaciones
	public double calcularPrestaciones() {
		int antiguedad=calcularLaAntiguedad();
		double prestaciones = (calcularLaAntiguedad()*getSalario())/12;
		return prestaciones;
	}

	//Metodo que permite visualizar la informacion del empleado

	public void mostrarDatos() {
		System.out.println("\n\t\t\t\t Nombre:"+nombreEmpleado);
		System.out.println("\n\t\t\t\t Apellido:"+apellidoEmpleado);
		System.out.println("\n\t\t\t\t Edad:"+calcularEdad());
		System.out.println("\n\t\t\t\t Salario:"+salario);
		System.out.println("\n\t\t\t\t Genero:"+genero);
		System.out.println("\n\t\t\t\t Prestaciones:"+calcularPrestaciones());
		System.out.println("\n\t\t\t\t Antiguedad:"+calcularLaAntiguedad());
	}
}
















