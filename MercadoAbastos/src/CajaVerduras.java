
public class CajaVerduras 
{
	public Zanahoria[] zanahorias;
	public Calabaza[] calabazas;
	public Papa[] papas;
	
	public CajaVerduras()
	{
				
	}
	
	public void mostrarVerduras()
	{
		for(int i = 0; i < zanahorias.length;i++) 
		{	
		System.out.println(zanahorias[i].getColor());
		}
		
		System.out.println("\n");
		
		for(int y = 0; y < calabazas.length;y++) 
		{		
		System.out.println(calabazas[y].getSabor());	
		}
		
        System.out.println("\n");
		
		for(int z = 0; z < papas.length;z++) 
		{		
		System.out.println(papas[z].getRedondez());	
		}
	}

}
