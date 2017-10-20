
public class Refrigerador implements Clavija
{
	private int temperatura;
	
	private CajaFrutas cajaFruta;
	
	private CajaVerduras cajaVerdura;	
	
	int voltaje;
	
	public Refrigerador()
	{
		
	}
	

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	public void setCajaFruta(CajaFrutas cajaFruta)
	{
		this.cajaFruta=cajaFruta;
	}
	
	public CajaFrutas getCajaFruta()
	{
		return cajaFruta;
	}


	public CajaVerduras getCajaVerdura() 
	{
		return cajaVerdura;
	}


	public void setCajaVerdura(CajaVerduras cajaVerdura)
	{
		this.cajaVerdura = cajaVerdura;
	}
	
	@Override
	public void conectarse()
	{
		voltaje= 220;
	}


	
}
