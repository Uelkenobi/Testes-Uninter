package uninter;


public abstract class Moeda {

	double valor;
	int id;
	
	public Moeda( double valor) 
	{
		this.valor = valor;
	}
	
	public abstract void Info();
	public abstract double Converter(Moeda moeda); 
	
	
	public void ShowAddInfo()
	{
		System.out.print("Moeda com id " + id + " e valor ");
		this.Info();
	}
	
}
