package org.grupo.cuatro;

public class Car {
	
	Wheel[] llantas= new Wheel[4];
	int velocity;
	
	
	public Car()
	{
		
	}
	
	public boolean setVelocity(int km)
	{
		if(km>0 && km<200)
		{
			velocity=km;
			return true;
		}
		else 
		{
			System.out.println("La velocidad esta mal mi chavo...\n");
			return false;
		}
			
			
		
	}
	
	public int getVelocity()
	{
		return velocity;
	}
	
	public boolean setWheels (Wheel[] otroValor )
	{
		this.llantas= otroValor;
		
		return true;
	}
	
	public Wheel[] getWheels()
	{
		return llantas;
	}

}
