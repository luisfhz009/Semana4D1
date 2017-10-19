
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
		
		
		
		
		
		

	}

}
