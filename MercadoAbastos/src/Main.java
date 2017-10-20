import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		/*for(int x = 0; x < listaPapaya.size();x++)
		{
			System.err.println(listaPapaya.get(x).getExpiracion());
		}*/
				
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
		/*Iterator<Papaya> itr = listaPapaya.iterator();
		
		while(itr.hasNext())
		{
			System.err.println(itr.next().getExpiracion());
		}*/
		
		//////////////////////////////////   VECTOR
		Vector <Frutas>miVector = new Vector<Frutas>(100);
		miVector.add(sandiaM);
		miVector.add(bananaM);
		
		Enumeration<Frutas> en = miVector.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println("Fruta : "+en.nextElement().getExpiracion());
		}
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
	

	}

}
