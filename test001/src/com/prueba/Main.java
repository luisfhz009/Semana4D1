package com.prueba;
import java.util.Scanner;
import com.salon4.llorar.*;

public class Main {
	
	public static int id= 0;
	public static long id2= 0;
	
	public static final int valorFinal = 9;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		id=25;
		
		System.out.println("Hola Mundo!!");
		
		int a  = 1;
		int b = 81;
		int resultado = 0;
		
		resultado = a + b ;
		
		//Suma
		System.out.println("Suma: "+resultado);
		
		float d = 3.14592678f;
		float c = 10.34434343434f;
		float resf = 0.0f;
		
		resf = d + c;
		
		System.out.println("Suma de flotantes: "+resf);
		System.out.println(d + b);
		
		//Chicharronera
		double x1 = ((-b)+ Math.sqrt(Math.pow(b, 2) -(4*a*c )))/(2*a);
		double x2 = ((-b)- Math.sqrt(Math.pow(b, 2) -(4*a*c )))/(2*a);
		System.out.println("Chicharronera: X1 = "+x1+" , X2 = "+x2);
		
		String cadena = "Parangaricutirimicuaro";
		
		System.out.println("////////////////// Cadenas  /////////////");
		System.out.println("");
		System.out.println("\n");
		String cadenaCesar = "ABCDEFGHIJKLMNÃ‘OPQRSTUVWXYZ";
		int espacio = 3;
		System.out.println(cadena);
		//Moverse por el arreglo de la cadena
		for(int x = 0; x < cadena.length(); x++)
		{
			System.out.println(cadena.charAt(x));
			//HAcer substituciÃ³n
			cadena = cadena.replace(cadena.charAt(x), cadenaCesar.charAt(x + espacio)); 
		}
		System.out.println(cadena);
		//Subcadenas
		System.out.println(cadena.substring(3, 6));
		//Convertir a minÃºsculas
		System.out.println(cadena.toLowerCase());
		
		//Arrays
		String [] meses = {"Jan", "Feb", "Mar", "Apr", "May", 
				"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		String [] sem = {"Mon", "Tue", "Wed","Thu", "Fri","Sat","Sun"};
		//Obejtivo: mostrar enero , julio, noviembre, dicembre y marzo en la misma lÃ­nea
		System.out.print(meses[0]+" "+meses[6]+" "+meses[10]
				+" "+meses[11]+" "+meses[2]+" "+sem[0]+" "+sem[4]+" "+sem[1]);
		
		//Fallo provocado
		//System.out.println(sem[8]);
		
		boolean x = true;
		boolean az = false;
		System.out.println("\n\n");
		//System.out.println(x != az);

		//System.out.println(x || az);
		//System.out.println(x && az);
		/*
		if(x != az)
		{
			System.out.println("Chana!!!");
		}
		else
		{
			System.out.println("Juana!!!");
		}*/
		/*
		//Bloque de palacio de fierro
		if(x == az)
		{
			System.out.println("Chana!!!");
		}
		else if(x == az)
		{
			System.out.println("Juana!!!");
		}
		else if(x == az)
		{
			System.out.println("MelÃ³n!!!");
		}
		else if(!x == !az)
		{
			System.out.println("SandÃ­a!!!");
		}
		else if(!(x == !az))
		{
			System.out.println("La vieja del otro dÃ­a!!!");
		}
		else
		{
			System.out.println("Ni modo!!!");
		}*/
		
		System.out.println("\n");
		
		/*System.out.println("Escribe un nombre : ");		
		String opcion ="Chana";
		Scanner lector = new Scanner(System.in); //Crea un objeto para escribir en el y que la maquina lo lea		
		opcion = lector.nextLine();//le dice a opcion el valor que se escriba 
		
		switch(opcion)
		{
		case "Chana":
		System.out.println("Chana!!");
		break;
		case "Juana":
			System.out.println("Juana!!");
			break;
		case "Chona":
			System.out.println("Chona!!");
			break;
			default:
				System.out.println("Ninguno!!");
				break;
		}*/
		
		// loops //////////////  equals  // for each // While  //////////////////////////
		
		/*String cadena5 = "Hola";
		
		if(cadena5.equals("Hola "))//compara variables para ver si son iguales
		{
			System.out.println("Son iguales!!");
		}
		else
		{
			System.out.println("No son iguales!!");
		}*/
		
		//For each
		/*
		for(String i:meses)
		{		
		System.out.print(i);
		}
		*/
		/*
		int contador = 0;
		while (contador < meses.length)
		{
			System.out.println((contador+1)+" : "+meses[contador]);
			contador++;
		}
		*/
		
		CuentaPalabras cP1b = new CuentaPalabras(7);
		cP1b.cuentaLetras();
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		/*CuentaPalabras vocales = new CuentaPalabras();
		vocales.cuentaVocales();*/
		
		cP1b.setNumLetras('e');
		cP1b.cuentaVocales();
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
          //Bloque Try and Cath ///////sirve para encapsular errores y continuar con el programa sin detenerlo
		 //controlar excepciones
		//NullPointer, NumberFormat OutOfBounds, IO,
/*		try {
			int contador = 0;
			while (contador < 14)
			{
				System.out.println((contador+1)+" : "+meses[contador]);
				contador++;
			}
		}
		catch (ArrayIndexOutOfBoundsException ex){
			System.out.println("Exception: "+ex);
		}
		catch (NullPointerException ex){
			System.out.println("Exception: "+ex);
		}
	    catch (ClassCastException ex){
		System.out.println("Exception: "+ex);
	    }
	    catch (NumberFormatException ex){
		System.out.println("Exception: "+ex);
	    }
		catch (Exception ex){
			System.out.println("Exception: "+ex);
		}finally {
			//Bloque finally, se ejecuta sin importar si se llegó a la excepción
			System.out.println("Bloque finally");
		}
		 System.out.println("Saliendo del estado de Excepción....");
		 */
		System.out.println("////////////////nueva clase Estudiante//////////////");
		
		//instanciación de la clase, uso del constructor sobrecargado
		Estudiante estudiHambre = new Estudiante(2, "Juancho");
		//Obtener los datos
		System.out.println(estudiHambre.getCodigo()+ " : "+estudiHambre.getNombre());
		
		estudiHambre.setCodigo(4);
		estudiHambre.setNombre("Gloria");
		System.out.println("\n"+estudiHambre.getCodigo()+ " : "+estudiHambre.getNombre());
		
		//llamar al método sin modificador de acceso
		
		estudiHambre.probar();
		
		//Sacapuntas sacapuntas = new Sacapuntas(436, "filo");
		
		
		id2++;
		System.out.println("\n id del desorden: "+id2);
		probarEstatico();
		
		
		//valorFinal = 0;// las variables con final no se pueden modificar
		
		
		
	} // fin del main
	
	
	//método estatico
	public static void probarEstatico()
	{
		id = 99999;
		System.out.println("\n"+id);
		
	}

	
	
}
