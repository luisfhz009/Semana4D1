package com.prueba;

public class Estudiante 
{
	//Atributos de la clase, n�tese que son privados
   private int codigo;
   private String nombre;
   
    //Constructor de la clase //se conoce como: constructor por defecto
    public Estudiante()
    {
	  
    }
    //Constructor sobrecargado
    public Estudiante(int codigo, String nombre)
    {
    	//llamada a m�todos
       //Se establecen valores de forma segura
	  setCodigo(codigo);
	  setNombre(nombre);
    }
    
    
	/**
	 * como los atributos de la clase son privados,
	 * necesito una manera de acceder a sus valores.
	 * Por eso creo m�todos para poder acceder de
	 * forma segura
	 */
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	void probar()
	{
		System.out.println("Hola, soy un m�todo sin modificador de acceso");
	}
	
	
	
	
	
	
}
