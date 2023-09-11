package aplication;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cadastro \nDigite o codigo do produto: ");
		int cod = sc.nextInt();
		System.out.print("Digite o nome do produto: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Digite a quantidade do produto: ");
		int quant = sc.nextInt();
		Product product = new Product(cod, nome, quant);
		System.out.println("Cadastro realizado com sucesso! \nDeseja fazer uma venda? \n1 - Realizar venda \n0 - Encerrar Programa");
		int opt = sc.nextInt();
		
		switch (opt) {
		case 1:
			System.out.println("Quantos produtos deseja vender?");
			int quantVenda = sc.nextInt();
			if (quantVenda > product.getQuantidade()) {
				System.out.println("Quantidade de venda exede o valor do estoque");
				
			} else {
				product.venda(quantVenda);
				System.out.println("Venda realizada com sucesso! \nEstoque atualizado." + product.getQuantidade());
			}
			break;
		case 0 :
			System.out.println("Encerrado o programa!");
			break;
		default:
			break;
		}
		
		
		sc.close();
	}

}
