package com.prueba;

public class CuentaPalabras
{
	private String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", 
			"Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

	private int numeroDeLetras;
	//private String numVocales= "Abril";
	private char numVocales;
	
	public CuentaPalabras()
	{
		
	}
	
	public CuentaPalabras(int numero)
	{
		this.numeroDeLetras = numero;
	}
	
	public void setNumLetras(char letras)
	{
		this.numVocales= letras;
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
	    System.out.println("\n");
	}
	
	//Crear otro metodo/////////////////////////////////////////////////////////////////////////////////////////////
	
	public void cuentaVocales()
	{
		int c=0;
		for(int i = 0; i < meses.length;i++)
		{
			for( int j = 0; j < meses[i].length();j++)
			{
				if(meses[i].toLowerCase().charAt(j) == numVocales ) {
					c++; c=0;
				}
			} 
			
			System.out.println(meses[i]+"_Contiene: "+c+"-"+numVocales);
		}
	}
		
	/*public void cuentaVocales()
	{
		for( String v : meses) 
		{
			if( v != numVocales) {
				System.out.print(v+" ");
			}
			
		}
	}*/
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
}

