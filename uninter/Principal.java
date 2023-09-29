package uninter;

import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("#,###.00"); 
		Cofrinho cofrinho = new Cofrinho();
		int opcao = -1;
		int id;
		double valor;
		Moeda moeda;
		
		
		while (opcao != 7)
		{
			opcao = Menu(teclado);
			
			switch(opcao)
			{
				case 1:
					System.out.println("Qual o Valor do deposito em dolares?");
					valor = teclado.nextDouble();
					moeda = new Dolar(valor);
					cofrinho.AdicionarMoedas(moeda);
					break;
				case 2:
					System.out.println("Qual o Valor do deposito em reais?");
					valor = teclado.nextDouble();
					moeda = new Real(valor);
					cofrinho.AdicionarMoedas(moeda);
					break;
				case 3:
					System.out.println("Qual o Valor do deposito em euros?");
					valor = teclado.nextDouble();
					moeda = new Euro(valor);
					cofrinho.AdicionarMoedas(moeda);
					break;
				case 4:
					System.out.println("Código da moeda a ser retirada?");
					id = teclado.nextInt();
					cofrinho.RemoverMoeda(id);
					break;
				case 5:
					cofrinho.ListarMoedas();
					break;
				case 6:
					System.out.println("No cofrinho temos R$" + (cofrinho.TotalConvertido()));
					break;
				case 7:
					System.out.println("Processo encerrado.");
			}			
			teclado.nextLine();
		}
			
		teclado.close();
	}
	
	
	private static int Menu(Scanner teclado) throws InterruptedException, IOException
	{
		int opcao;
		
		System.out.println("Trabalho de POO da Uninter");
		System.out.println("RU:3353662 Nome:Gabriel Mattes Lopes");
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Adicionar Dolar");
		System.out.println("2 - Adicionar Real");
		System.out.println("3 - Adicionar Euro");
		System.out.println("4 - Remover moeda pelo código");
		System.out.println("5 - Listar as moedas");
		System.out.println("6 - Total convertido");
		System.out.println("7 - Encerrar programa");
		
	
			opcao = teclado.nextInt();
		
		if(opcao < 1 || opcao > 7)
		{
			System.out.println("Opção inexistente, informe novamente a opção.");
			
			Menu(teclado);
		}

		return opcao;

	}
	
	
    private static void ClearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
