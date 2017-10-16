
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#####");
		
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
		String cadenaCesar = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		int espacio = 3;
		System.out.println(cadena);
		//Moverse por el arreglo de la cadena
		for(int x = 0; x < cadena.length(); x++)
		{
			System.out.println(cadena.charAt(x));
			//HAcer substitución
			cadena = cadena.replace(cadena.charAt(x), cadenaCesar.charAt(x + espacio)); 
		}
		System.out.println(cadena);
		//Subcadenas
		System.out.println(cadena.substring(3, 6));
		//Convertir a minúsculas
		System.out.println(cadena.toLowerCase());
		
		//Arrays
		String [] meses = {"Jan", "Feb", "Mar", "Apr", "May", 
				"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		String [] sem = {"Mon", "Tue", "Wed","Thu", "Fri","Sat","Sun"};
		//Obejtivo: mostrar enero , julio, noviembre, dicembre y marzo en la misma línea
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
			System.out.println("Melón!!!");
		}
		else if(!x == !az)
		{
			System.out.println("Sandía!!!");
		}
		else if(!(x == !az))
		{
			System.out.println("La vieja del otro día!!!");
		}
		else
		{
			System.out.println("Ni modo!!!");
		}
		
		
		System.out.println("\n\n");
		
		
		
		
		
		
		
		
		
		
		
		//Float flotante = 0.0f;
		
		
		
		
		
		
		
	}

}
