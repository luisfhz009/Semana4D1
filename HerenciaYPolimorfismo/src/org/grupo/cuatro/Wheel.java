package org.grupo.cuatro;

public class Wheel {
	
	int radius= 15;
	
	String weather= "raining";
	
	public Wheel(int num, String clima)
	{
		setRadius(num);
		setWeather(clima);
	}
	
	public void rotate()
	{
		
	}
	
	////////////////////////////////////////
	public int getRadius() 
	{
		return radius;
	}

	public void setRadius(int radius) 
	{
		this.radius = radius;
	}

	public String getWeather() 
	{
		return weather;
	}

	public void setWeather(String weather) 
	{
		this.weather = weather;
	}
	
	

}
