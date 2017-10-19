package org.grupo.cuatro;

import java.util.Scanner;

public class CarMovil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car mustang= new Car();
		
		Scanner scan=new Scanner(System.in);
		
		int speed = scan.nextInt();
		
		scan.close();
		
		int x;
		System.out.println("Hola, vamos a comenzar.\n");
		
		do
		{
		
		System.out.println("Escribe la velocidad que buscas: ");
		
		x= speed;

		}
		while(mustang.setVelocity(x)==false);
		
		if(x<200) 
		{
			
		}
		
	}

}
