
public class Licuadora implements Clavija
{
	int otroVoltaje;	

	@Override
	public void conectarse() 
	{
		otroVoltaje = voltaje;
		System.out.println();
	}


	

}
