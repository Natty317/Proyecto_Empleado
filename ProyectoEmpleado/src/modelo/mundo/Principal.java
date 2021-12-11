package modelo.mundo;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {

	public static void main(String[] args) {
		Empleado empleado1 = null;
		//Declarar variables para los datos del empleado
		String nombreEmple=" ";
		String apellidoEmple=" ";
		int genero = 0;
		String imagen;
		double salario = 0;
		int dia = 0;
		int  mes= 0;
		int anio= 0;
		int dia1 = 0;
		int  mes1= 0;
		int anio1= 0;
		int opcion = 0;

		Fecha fechaNac;
		Fecha fechaIngreso;

		//OPCIONES DEL EMPLEADO

		//1.Ingresar datos del empleado
		//2.Calcular la edad del empleado
		//3.Calcular la antifuedad del empleado en la empresa
		//4.Calcular las prestaciones del empleado
		//5.Visualizar la informacion del empleado
		Scanner ingreso=new Scanner(System.in);

		do {
			boolean j=false; 
			while(j==false) {

				System.out.println("                         _________________________________________________________________________________________________");
				System.out.println("\t\t\t\t\t\t\t\t MENU PRINCIPAL");
				System.out.println("                         _________________________________________________________________________________________________");
				System.out.println("\n\t\t\t\t\t\t\t     OPCIONES DEL EMPLEADO");
				System.out.println("\n\t\t\t\t\t\t 1.Ingresar datos del empleado");
				System.out.println("\n\t\t\t\t\t\t 2.Calcular la edad del empleado");
				System.out.println("\n\t\t\t\t\t\t 3.Calcular la antiguedad del empleado en la empresa");
				System.out.println("\n\t\t\t\t\t\t 4.Calcular las prestaciones del empleado");
				System.out.println("\n\t\t\t\t\t\t 5.Visualizar la informacion del empleado");
				System.out.println("\n\t\t\t\t\t\t 6.Salir");
				System.out.println("                         _________________________________________________________________________________________________");


				try {
					System.out.print("\n\n\t\t\t\t Seleccion:");
					opcion=ingreso.nextInt();
				}catch(java.util.InputMismatchException e) {
					System.out.println("\n\t\t\t\t Solo se admiten números");

					ingreso.nextLine();
				} 

				//java.util.InputMismatchException

				switch(opcion) {
				case 1:
					System.out.println("\n\t\t\t\t SELECCIONÓ LA OPCION 1:Deberá ingresar los datos del empleado");

					//Letras
					//Nombre
					System.out.println("\n\t\t\t\t\t\t\t     INGRESO DE DATOS");
					boolean salida=false;
					while(salida == false) {
						try {
							System.out.print("\n\t\t\t\t Ingrese su nombre:");
							nombreEmple=ingreso.next();
							Pattern pattern=Pattern.compile("^[A-Z|a-z]{1,20}$");
							Matcher mather=pattern.matcher(nombreEmple);
							if(mather.find()) {
								salida=true;
							}
							else {
								System.out.print("\n\t\t\t\t Solo se admiten letras");
							}
						}catch(java.util.regex.PatternSyntaxException e) {
						}
					}
					ingreso.nextLine();

					//Apellido
					boolean salida1=false;
					while(salida1 == false) {
						try {
							System.out.print("\n\t\t\t\t Ingrese su apellido:");
							apellidoEmple=ingreso.next();
							Pattern pattern=Pattern.compile("^[A-Z|a-z]{1,20}$");
							Matcher mather=pattern.matcher(apellidoEmple);

							if(mather.find()) {
								salida1=true;
							}
							else {
								System.out.print("\n\t\t\t\t Solo se admiten letras");
							}
						}catch(java.util.regex.PatternSyntaxException e) {

						}
					}
					ingreso.nextLine();

					//Numeros
					//Genero
					do {
						try {
							System.out.print("\n\t\t\t\t Ingrese su genero (1 - Femenino || 2 - Masculino):");
							genero=ingreso.nextInt();
							if (genero>2) {
								System.out.print("\n\t\t\t\t Solo se admiten numeros entre 1 y 2");
							}
						}catch(java.util.InputMismatchException e) {
							System.out.print("\n\t\t\t\t Solo se admiten números");
							ingreso.nextLine();
						}
					}while(genero<1 || genero>2);

					//Salario

					boolean salarioS=false;

					while(salarioS == false) {
						try {
							System.out.print("\n\t\t\t\t Ingrese el salario:");
							salario=ingreso.nextDouble();
							salarioS=true;
						}catch(Exception e) {
							System.out.print("\n\t\t\t\t Solo se admiten números");
							ingreso.nextLine();
						}
					}

					//Fecha de nacimiento
					//dia
					System.out.println("\n\t\t\t\t\t\t\t   FECHA DE NACIMIENTO");
					do {
						try {
							System.out.print("\n\t\t\t\t Ingrese su dia de nacimiento:");
							dia=ingreso.nextInt();
							if (dia <1 || dia>30) {
								System.out.print("\n\t\t\t\t Dato fuera de rango");
							}
						}catch(java.util.InputMismatchException e) {
							System.out.println("\n\t\t\t\t Solo se admiten números");
							ingreso.nextLine();
						}
					}while(dia <1 || dia>30);
					//mes
					do {
						try {
							System.out.print("\n\t\t\t\t Ingrese su mes de nacimiento:");
							mes=ingreso.nextInt();
							if (mes <1 || mes>12) {
								System.out.print("\n\t\t\t\t Dato fuera de rango");
							}
						}catch(java.util.InputMismatchException e) {
							System.out.print("\n\t\t\t\t Solo se admiten números");
							ingreso.nextLine();
						}
					}while(mes <1 || mes>12);
					//anio
					do {
						try {
							System.out.print("\n\t\t\t\t Ingrese su anio de nacimiento:");
							anio=ingreso.nextInt();
							if (anio <1 || anio>2021) {
								System.out.print("\n\t\t\t\t Dato fuera de rango");
							}
						}catch(java.util.InputMismatchException e) {
							System.out.print("\n\t\t\t\t Solo se admiten números");
							ingreso.nextLine();
						}
					}while(anio <1 || anio>2021);

					fechaNac=new Fecha(dia,mes,anio);

					//Fecha de Ingreso
					System.out.println("\n\n\t\t\t\t\t\t\t     FECHA DE INGRESO");

					//dia
					do {
						try {
							System.out.print("\n\t\t\t\t Ingrese su dia de ingreso:");
							dia1=ingreso.nextInt();
							if (dia1 <1 || dia1>30) {
								System.out.print("\n\t\t\t\t Dato fuera de rango");
							}
						}catch(java.util.InputMismatchException e) {
							System.out.print("\n\t\t\t\t Solo se admiten números");
							ingreso.nextLine();
						}
					}while(dia1 <1 || dia1>30);

					//mes
					do {
						try {
							System.out.print("\n\t\t\t\t Ingrese su mes de ingreso:");
							mes1=ingreso.nextInt();
							if (mes1 <1 || mes1>12) {
								System.out.print("\n\t\t\t\t Dato fuera de rango");
							}
						}catch(java.util.InputMismatchException e) {
							System.out.print("\n\t\t\t\t Solo se admiten números");
							ingreso.nextLine();
						}
					}while(mes1 <1 || mes1>12);

					//anio
					do {
						try {
							System.out.print("\n\t\t\t\t Ingrese su anio de ingreso:");
							anio1=ingreso.nextInt();
							if (anio1 <1 || anio1>2021) {
								System.out.print("\n\t\t\t\t Dato fuera de rango");
							}
						}catch(java.util.InputMismatchException e) {
							System.out.print("\n\t\t\t\t Solo se admiten números");
							ingreso.nextLine();
						}
					}while(anio1 <1 || anio1>2021);
					fechaIngreso=new Fecha(dia1,mes1,anio1);

					empleado1=new Empleado(nombreEmple,apellidoEmple,genero," ",salario,fechaNac,fechaIngreso);
					break;

				case 2:
					System.out.println("\n\t\t\t\t SELECCIONÓ LA OPCION 2:Calculo de la edad del empleado");
					System.out.println("\n\t\t\t\t La edad del empleado es:"+empleado1.calcularEdad());
					break;

				case 3:
					System.out.println("\n\t\t\t\t SELECCIONÓ LA OPCION 3:Calculo de la antiguedad del empleado en la empresa");
					System.out.println("\n\t\t\t\t La antiguedad del empleado es:"+empleado1.calcularLaAntiguedad());
					break;

				case 4:
					System.out.println("\n\t\t\t\t SELECCIONÓ LA OPCION 4:Calculo de las prestaciones del empleado");
					System.out.println("\n\t\t\t\t Las prestaciones del empleado son:"+empleado1.calcularPrestaciones());
					break;

				case 5:
					System.out.println("\n\t\t\t\t SELECCIONÓ LA OPCION 5: Visualizacion de la informacion del empleado");
					empleado1.mostrarDatos();
					break;

				case 6:
					System.out.println("\n\t\t\t\t USTED SALIO DEL MENU, GRACIAS POR TU VISITA :)");
					System.exit(6);
					break;

				default:
					System.out.println("\n\t\t\t\t La opción ingresada no es válida solo se admiten números entre 1 y 6");
				}

				j=true;
			}
		}while(opcion !=6);


	}
}		





