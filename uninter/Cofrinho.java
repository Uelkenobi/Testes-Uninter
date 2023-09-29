package uninter;

import java.util.ArrayList;

public class Cofrinho {

		int id = 1;
		
		
		public ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();
		
		
		public void AdicionarMoedas(Moeda moeda)
		{
			moeda.id = id++;
			
			listaMoeda.add(moeda);
			moeda.ShowAddInfo();
		}
		
		
		public void RemoverMoeda(int id)
		{
			Moeda moedaEncontrada = null;
			
			for(Moeda moeda : listaMoeda)
			{
				if(moeda.id == id)
				{
					moedaEncontrada = moeda;
					break;
				}
			}
			
			if(moedaEncontrada != null)
			{
				listaMoeda.remove(moedaEncontrada);
			}
			else
			{
				System.out.println("Nenhuma moeda corresponde a esse ID.");
			}
			
		}
		
		
		public void ListarMoedas()
		{
			for(Moeda moeda : listaMoeda)
			{
				System.out.print(moeda.id + " - ");
				moeda.Info();
			}
		}
		
		
		public double TotalConvertido()
		{
			double total = 0;
			
			for(Moeda moeda : listaMoeda)
			{
				total += moeda.Converter(moeda);
			}
			
			return total;
		}
}
