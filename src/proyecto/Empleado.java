package proyecto;

import java.util.Scanner;

public class Empleado {
	int ultimo=0;
	String espacio10="          ";
	String espacio9="         ";
	String spacio10="          ";
	String spacio11="          ";
	String empleado[][];
	Scanner teclado=new Scanner(System.in);
	Empleado(){		
	empleado=new String[4][15]; 	
	menu();
	}
	
	
	public void mostrar() {
	for (int i = 0; i < ultimo; i++) {
		System.out.print(spacio10+"#"+espacio9+espacio9+" [");
		for (int j = 0; j < empleado.length; j++) {
		System.out.print(" "+empleado[i][j]);	
			}
		System.out.println("]");	
	}	
	}	
	
	
	public void aumentar() {
		String dato="";
		double aumento=0,salario=0, total;
		boolean ban=false;
		System.out.println("Escribe el ID del emplado a despedir");
		dato=teclado.next();
		System.out.println("Escribe el % de aunmento");
		aumento=teclado.nextDouble();
		
		for (int i = 0; i < ultimo; i++) {
			
			if(empleado[i][0].equalsIgnoreCase(dato)) {
				salario=Double.parseDouble(empleado[i][3]);				
				total=salario*(aumento/100);
				total=total+salario;
				total=(float)total;
				empleado[i][3]=String.valueOf(total);
				ban=true;}
		}
			if(ban==true) {
				
				System.out.println("Se realizo el aumento");
			}
			
			else
				System.out.println("El empleado no se encontro");
			}
				
	
	public void Buscar() {
		String dato="";
		boolean ban=false;
		System.out.println("Escribe el ID del emplado a despedir");
		dato=teclado.next();
		
		for (int i = 0; i < ultimo; i++) {
			
			if(empleado[i][0].equalsIgnoreCase(dato)) {
				//empleado[i][0]="eliminado";
				empleado[i][1]="Despedido";
				empleado[i][2]="Despedido";
				empleado[i][3]="Despedido";
				ban=true;}
		}
			if(ban==true) {
				
				System.out.println("El empleado fue despedido");
			}
			
			else
				System.out.println("El empleado no se encontro");
			}
				
				
			
			
		
	
	
	
	public void PedriDatos() {
		//for(int i=0; i<4; i++) {
		if (ultimo<15) {
			System.out.println("Escribe el ID del empleado");
			empleado[ultimo][0]=teclado.next();
			System.out.println("Escribe el nombre del empleado");
			empleado[ultimo][1]=teclado.next();
			System.out.println("Escribe el Edad del empleado");
			empleado[ultimo][2]=teclado.next();
			System.out.println("Escribe el Salario del empleado");
			empleado[ultimo][3]=teclado.next();	
			
			ultimo++;}else
		System.out.println("Alconzo el limite de registros aceptados");
		//}
	}
	
	
	public void menu() {
		
		int op=0;
		do {
			System.out.print(spacio11);
			for(int i=0; i<=60; i++) {
				
			System.out.print("#");
			}
			System.out.println("");
			System.out.println(spacio10+"#"+espacio10+"          Systema de emplados"+spacio11+espacio10+"#");
			System.out.println(spacio10+"#"+spacio10+spacio10+spacio10+spacio10+spacio10+espacio9+"#");
			System.out.println(spacio10+"#"+spacio10+spacio10+spacio10+spacio10+spacio10+espacio9+"#");
			System.out.println(spacio10+"#"+spacio10+spacio10+spacio10+spacio10+spacio10+espacio9+"#");
			System.out.println(spacio10+"#"+espacio9+"Ingresar los datos de los empleados_____1"+espacio9+"#");
			System.out.println(spacio10+"#"+espacio9+"Mostar empleados________________________2"+espacio9+"#");
			System.out.println(spacio10+"#"+espacio9+"Despedir a un empleado__________________3"+espacio9+"#");
			System.out.println(spacio10+"#"+espacio9+"Aumetar el salario a un empleado________4"+espacio9+"#");
			System.out.println(spacio10+"#"+espacio9+"Salir___________________________________5"+espacio9+"#");
			System.out.println(spacio10+"#"+spacio10+spacio10+spacio10+spacio10+spacio10+espacio9+"#");
			System.out.println(spacio10+"#"+spacio10+spacio10+spacio10+spacio10+spacio10+espacio9+"#");
			System.out.println(spacio10+"#"+spacio10+spacio10+spacio10+spacio10+spacio10+espacio9+"#");
			System.out.println(spacio10+"#"+spacio10+spacio10+spacio10+spacio10+spacio10+espacio9+"#");
			System.out.print(spacio11);
			for(int i=0; i<=60; i++) {
				
				System.out.print("#");
				}
			op=teclado.nextInt();
			
			switch (op) {
			case 1:
				PedriDatos();
				break;
			case 2:
				mostrar();
				break;
			case 3:
				Buscar();
				break;
			case 4:
				aumentar();
				break;
			case 5:
				System.out.println("Saliendo de la aplicación");
				break;
				
			default:
				
				System.out.println("La opción es incorrecta");
				break;
			}
			
			
		}while(op!=5);
		
		
		
		
	}
	

}
