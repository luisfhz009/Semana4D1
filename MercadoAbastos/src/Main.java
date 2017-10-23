import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

@SuppressWarnings("unused")
@Deprecated
public class Main {

	public static void main(String[] args) {
		/*
		
		Refrigerador refri = new Refrigerador();		
		refri.setTemperatura(4);
///////////////////////////////////////////////          FRUTAS        ///////////////////////////////////////////////////////	
		CajaFrutas cajaFruts = new CajaFrutas();
		
		Papaya papayaM = new Papaya();		
		papayaM.setExpiracion(5);
		papayaM.setColor("Naranja");
				
		Sandia sandiaM= new Sandia();		
		sandiaM.setExpiracion(7);
		sandiaM.setExpiracion(7);
		
		Banana bananaM = new Banana();		
		bananaM.setExpiracion(3);
		
		ArrayList <Papaya> listaPapaya = new ArrayList<Papaya>();
		listaPapaya.add(papayaM);
		
		for(int x = 0; x < 1000;x++)
		{
			listaPapaya.add(papayaM);
		}
		
		listaPapaya.remove(999);
		listaPapaya.get(999).getSemillas();
		
		for(int x = 0; x < listaPapaya.size();x++)
		{
			System.err.println(listaPapaya.get(x).getExpiracion());
		}
				
		//lista de Frutas		
		ArrayList <Frutas> listaFrutas = new ArrayList<Frutas>();
		listaFrutas.add(bananaM);
		listaFrutas.add(papayaM);
		listaFrutas.add(sandiaM);
		
		
		
		Papaya[] lasPapayas = new Papaya[4];
		Sandia[] lasSandias = new Sandia[5];
		Banana[] lasBananas = new Banana[3];
		
		for(int x=0; x<lasPapayas.length;x++)
		{
			lasPapayas[x]= papayaM;
		}		
		for(int y=0; y<lasSandias.length; y++)
		{
			lasSandias[y]=sandiaM;
		}
		for(int z=0; z<lasBananas.length; z++)
		{
			lasBananas[z]=bananaM;	
		}
			
		//Usamos el objeto de CajaFrutas que ya declaramos arriba		
		cajaFruts.bananas=lasBananas;
		cajaFruts.papayas=lasPapayas;
		cajaFruts.sandias=lasSandias;
		
		refri.setCajaFruta(cajaFruts);
		
		refri.getCajaFruta().mostrarFrutas();
		
////////////////////////////////////////////////////         VERDURAS     /////////////////////////////////////////////////////		
		CajaVerduras cajaVerds =new CajaVerduras();		
		
		Zanahoria zanahoriaM = new Zanahoria();
		zanahoriaM.setColor("Rojo");
		
		Calabaza calabazaM = new Calabaza();
		calabazaM.setSabor("Fuchi");
		
		Papa papaM = new Papa();
		papaM.setRedondez(5);
		
		Zanahoria[] lasZanahorias= new Zanahoria[2];
		Calabaza[] lasCalabazas= new Calabaza[5];
		Papa[] lasPapas= new Papa[3];
		
		for(int x=0; x<lasZanahorias.length;x++)
		{
			lasZanahorias[x]= zanahoriaM;
		}		
		for(int y=0; y<lasCalabazas.length; y++)
		{
			lasCalabazas[y]=calabazaM;
		}		
		for(int z=0; z<lasPapas.length; z++)
		{
			lasPapas[z]=papaM;			
		}
		
		cajaVerds.zanahorias=lasZanahorias;
		cajaVerds.calabazas=lasCalabazas;
		cajaVerds.papas=lasPapas;
		
		refri.setCajaVerdura(cajaVerds);
		
		refri.getCajaVerdura().mostrarVerduras();
		
		
		System.out.println("Tamaño de listaPapaya: "+listaPapaya.size());
		
		System.out.println("\n");
		
//////////////////////////////////    ITERATOR
		Iterator<Papaya> itr = listaPapaya.iterator();
		
		while(itr.hasNext())
		{
			System.err.println(itr.next().getExpiracion());
		}
		
//////////////////////////////////   VECTOR
		Vector <Frutas>miVector = new Vector<Frutas>(100);
		miVector.add(sandiaM);
		miVector.add(bananaM);
		
		Enumeration<Frutas> en = miVector.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println("Fruta : "+en.nextElement().getExpiracion());
		}
		System.out.println("\n");
		///////////////////////
		
		Vector <Banana> vectorB = new Vector<Banana>(35);
				
		for(int x = 0; x < 35;x++)
		{
			vectorB.add(bananaM);
		}
		
		Enumeration<Banana> ne = vectorB.elements();
		
		while(ne.hasMoreElements())
		{
			System.out.println("Banana : "+ne.nextElement().getExpiracion());
		}
		///////////////////////
		Vector <Sandia> vectorS = new Vector<Sandia>(26);
			
		for(int x = 0; x < 26;x++)
		{
		vectorS.add(sandiaM);
		}
		
		Enumeration<Sandia> el = vectorS.elements();
		
		while(el.hasMoreElements())
		{
		System.out.println("Sandia : "+el.nextElement().getExpiracion());
		}
		///////////////////////
		Vector <Papaya> vectorP = new Vector<Papaya>(18);
		
		for(int x = 0; x < 18;x++)
		{
		vectorP.add(papayaM);
		}
		
		Enumeration<Papaya> la = vectorP.elements();
		
		while(la.hasMoreElements())
		{
		System.out.println("Papaya : "+la.nextElement().getExpiracion());
		}
		
//////////////////////   Hashmap //////////
		HashMap<Integer, String> miTabla = new HashMap<Integer, String>();
		miTabla.put(100, "Chana");
		miTabla.put(101, "Juana");
		miTabla.put(102, "Chona");
		miTabla.put(103, "Primitivo");
		
	    for(Map.Entry entry: miTabla.entrySet())
	    {
	    	System.out.println("Entrada "+entry.getKey()+" : "+entry.getValue());
	    }
		
		Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
		hashTable.put(100, "Chana");
		hashTable.put(101, "Juana");
		hashTable.put(102, "Chona");
		hashTable.put(103, "Primitivo");
		
		for(Map.Entry miEntry: hashTable.entrySet())
	    {
	    	System.out.println("Llave:  "+miEntry.getKey()+", Valor : "+miEntry.getValue());
	    }
			*/	
        
	   /* Scanner scan = new Scanner (System.in);
	    System.out.println("Ingrese un numero mayor a 60: ");
	    int algo=scan.nextInt();
	    
	    assert algo >= 60:"Estas chavo";
	    System.out.println("Valor de algo: "+algo);
	    
	    	    
	    for(MiEnum miEnum: MiEnum.values())
	    {
	    	System.out.println("Mi Enum:"+miEnum);
	    }
	    */
		
		
		//   Sin Lambda
	    Clavija miClavija = new Clavija()
	    {
	    	@Override
	    	public void conectarse()
	    	  {
	    		System.out.println("Clavija 1!!!!!!");
	    	  }	    	
	    };
	    
	    miClavija.conectarse();
	    
	    //  Con Lamba
	    Clavija miClavija2 = ()->
	    {
	    	System.out.println("Clavija 2!!!!!!");	    	
	    };
	    
	    miClavija2.conectarse();
	    
	    //  Otra LAMDA
	    
	    OtraClase otraClase = (algo) ->
	    {
	    	return algo;
	    };
	    
	    System.out.println("\nOtra Clase: "+otraClase.loQueSea("Mi cadena Chavo"));
	    
        Papaya papaya = new Papaya();
        ArrayList <Papaya> listaPapaya = new ArrayList<Papaya>();
        listaPapaya.add(papaya);
        for(int x=0; x <10; x++)
        {
        	listaPapaya.add(papaya);
        }
	    
        listaPapaya.forEach(n->{
        	System.out.println(n.getExpiracion());
        	System.out.println(n.getColor());
        }
        );
        
        listaPapaya.forEach
              (
        		(Papaya n)->
        		{
		          System.out.println(n.getExpiracion());
		          System.out.println(n.getColor());
                }
        	  );
        // lamda comprobador
        List<Producto> listaProducto = new ArrayList<Producto>();
        listaProducto.add(new Producto(1, "Banana", 12));
        listaProducto.add(new Producto(2, "Papaya", 10));
        listaProducto.add(new Producto(3, "Berenjena", 15));
        
        Collections.sort(listaProducto,(p1, p2)->{
        	//return p1.nombre.compareTo(p2.nombre);
        	return String.valueOf(p1.precio).compareTo(String.valueOf(p2.precio));
        });
        
        for(Producto p:listaProducto)
        {
        	System.out.println("Producto"+p.id+" : "+p.nombre+" : "+p.precio);
        }
        
	    
	}//fin del Main
	
				public enum MiEnum
				{
					LUNES,
					MARTES,
					MIERCOLES,
					JUEVES,
					VIERNES,
					SABADO,
					DOMINGO		
				}
	
}
