
public class CajaFrutas 
{
	public Papaya[] papayas;
	public Sandia[] sandias;
	public Banana[] bananas;
	
	public CajaFrutas()
	{
		
	}
	
	public void mostrarFrutas()
	{
		for(int i = 0; i<papayas.length;i++) 
		{	
		System.out.println("Papaya expira en: "+papayas[i].getExpiracion());
		}
		
		System.out.println("\n");
		
		for(int y = 0; y<sandias.length;y++) 
		{		
		System.out.println("Sandia expira en: "+sandias[y].getExpiracion());	
		}
		
        System.out.println("\n");
		
		for(int z = 0; z<bananas.length;z++) 
		{		
		System.out.println("Banana expira en: "+bananas[z].getExpiracion());	
		}
	}
}
