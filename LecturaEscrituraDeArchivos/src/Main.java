import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.google.gson.Gson;

public class Main 
{
	public static void main(String[]args) 
	{
		serializarObjeto("C:\\Users\\ol\\git\\Semana4D1\\LecturaEscrituraDeArchivos\\src\\Texto3.txt");
		//escribirArchivo("C:\Users\ol\git\Semana4D1\LecturaEscrituraDeArchivos\src\\otroTexto.txt");
		//leerArchivoManual("src\\textoRandom.txt");
		//leerArchivo("C:\Users\ol\git\Semana4D1\LecturaEscrituraDeArchivos\src\\textoRandom.txt");
		
	}
	
	public static void serializarObjeto(String archivo)
	{
		try {
			FileOutputStream salida = new FileOutputStream(archivo);
			ObjectOutputStream oSt = new ObjectOutputStream(salida);
			oSt.writeObject("Today");
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			Gson gson = new Gson();
			
			oSt.writeObject(dateFormat.format(date).toString());
			oSt.writeObject(gson.toJson(date.getTime()));
			System.out.println(date);
			oSt.close();
			System.out.println("Hecho...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static void escribirArchivo(String archivo)
	{
		String[] datos = {"Qué ","Pedro ","Juan."};
		
	try {
		PrintWriter miPrintWriter= new PrintWriter ( 
				new BufferedWriter(new FileWriter(archivo)));
		     
		 for(int i=0; i< datos.length; i++)
			{
				miPrintWriter.println(datos[i]);
			}
			miPrintWriter.close();
			System.out.println("Hecho...");
		
	    }catch (IOException e) {
		   e.printStackTrace();
	     }
    }
	
	public static void leerArchivoManual(String archivo) 
	{
		int nLinea=0;
		try{
			BufferedReader bfrd = new BufferedReader( 
			   new FileReader(archivo));
			
			String s= new String();
			Scanner lector=new Scanner(System.in);// crear la entrada al sistema
			
			 System.out.println("Ingresa una linea: ");
			 
			int nLinea2=lector.nextInt();
			lector.close();
			while( (s=bfrd.readLine()) != null)
			{
				nLinea++;
				if (nLinea2 == nLinea)
				{
				  System.out.println((nLinea)+" : "+s);
				}
			}

			bfrd.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void leerArchivo(String archivo) 
	{
		int nLine=0;
		try{
			BufferedReader bfrd = new BufferedReader( 
			new FileReader(archivo));
			String s= new String();
			//String s2= new String();
			
			while( (s=bfrd.readLine()) != null)
			{
				System.out.println((nLine+1)+" : "+s);
				nLine++;
			}
			bfrd.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
		
		

}
