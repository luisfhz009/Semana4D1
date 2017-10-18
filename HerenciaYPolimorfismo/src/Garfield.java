
public class Garfield extends Animal
{
	String nombre;
	
	public Garfield()
	{
		nombre="Garfield";
	}
	
	public void comer (String comida)
	{
		if (comida.equalsIgnoreCase("lasagna"))
		{
			System.out.println("YAY!");
		}
		else
		{
			System.out.println("N'AY!");
		}
	}

}
