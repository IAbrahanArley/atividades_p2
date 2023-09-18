package aplication;

import java.util.Scanner;

import entities.Carro;
import entities.Moto;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("O que deseja cadastrar? \n1 - Carro \n2 - Moto");
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Marca:");
			sc.nextLine();
			String marca = sc.nextLine();
			System.out.println("Modelo:");
			String model = sc.nextLine();
			System.out.println("Ano de fabricação:");
			int ano = sc.nextInt();
			System.out.println("Numero de Portas:");
			int portas = sc.nextInt();
			Carro carro = new Carro(marca, model, ano, portas);
			carro.imprimirDetalhes();
			break;
		
		case 2:
			System.out.println("Marca:");
			sc.nextLine();
			marca = sc.nextLine();
			System.out.println("Modelo:");
			model = sc.nextLine();
			System.out.println("Ano de fabricação:");
			ano = sc.nextInt();
			System.out.println("Cilindradas:");
			int cil = sc.nextInt();
			Moto moto = new Moto(marca, model, ano, cil);
			moto.imprimirDetalhes();
			break;

		default:
			break;
		}
		
		sc.close();
	}

}
