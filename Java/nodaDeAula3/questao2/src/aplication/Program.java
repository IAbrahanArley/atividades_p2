package aplication;

import java.util.Scanner;

import entities.Diretor;
import entities.Gerente;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("O que deseja cadastrar? \n1 - Diretor \n2 - Gerente");
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salario:");
			double sal = sc.nextDouble();
			System.out.println("Quantidade de Açoes:");
			int acoes = sc.nextInt();
		
			Diretor diretor = new Diretor(nome, sal, acoes);
			diretor.imprimirDetalhes();
			break;
		
		case 2:
			System.out.println("Marca:");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Modelo:");
			sal = sc.nextDouble();
			System.out.println("Ano de fabricação:");
			String departamento = sc.nextLine();
			
			Gerente gerente = new Gerente(nome, sal, departamento);
			System.out.println("Salario com bonus:" + gerente.calcularBonus(sal));
			gerente.imprimirDetalhes();
			break;

		default:
			break;
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
