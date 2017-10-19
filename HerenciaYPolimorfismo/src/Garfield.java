
public class Garfield extends Animal
{
	
	
	public Garfield()
	{
		super ("");
	}
	
	public Garfield(String nombre)
	{
		super (nombre);
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
