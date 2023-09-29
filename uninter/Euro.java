package uninter;

import java.text.DecimalFormat;

public class Euro extends Moeda{

	public Euro(double valor) {
		super(valor);
	}

	
	public void Info() 
	{
		DecimalFormat dc = new DecimalFormat("#,###.00");
		System.out.println( "$" + dc.format(valor) );
	}
	
	
	public double Converter(Moeda moeda)
	{
		return moeda.valor * 7;
	}
	
}
