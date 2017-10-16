
public class CuentaPalabras
{
	String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", 
			"Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

	int numeroDeLetras;
	public CuentaPalabras()
	{
		
	}
	
	public CuentaPalabras(int numero)
	{
		this.numeroDeLetras = numero;
	}
	
	public void cuentaLetras()
	{
		for(int f=0; f<meses.length;f++)
	    {
	    	if(meses[f].length() == numeroDeLetras)
	    	{
	    		System.out.println(meses[f]+" : "+numeroDeLetras);
	    		break;
	    	}
	    }
		
		System.out.println("////////////////////");		
		
	    for(int f=0; f<meses.length;f++)
	    {
	    	if(meses[f].length() == numeroDeLetras)
	    	{
	    		System.out.println(meses[f]+" : "+numeroDeLetras);
	    	}
	    }
	}
	
	//Crear otro metodo
	
}

