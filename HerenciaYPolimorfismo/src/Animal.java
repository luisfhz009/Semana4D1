
public class Animal {
	
	String nombre;
	
	public Animal()
	{
		this.nombre = "";
	}
	
	public Animal(String nombre)
	{
		setNombre(nombre);
	}
	
	public void setNombre(String n)
	{
		this.nombre = n;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	
	public void comer()
	{
		System.out.println("Chump, chump...");
	}
	
	public void dormir()
	{
		System.out.println("Zzz, zzz...");
	}

}
