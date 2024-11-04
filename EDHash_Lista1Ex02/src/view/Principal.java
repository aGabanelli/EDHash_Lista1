package view;

import java.util.Scanner;

import controller.Controller;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		Controller c = new Controller();
		Scanner scanner = new Scanner(System.in);
		int opcao = 0 ;
		int apto = 0;
		
		while (opcao != 9 ) {
			System.out.println("Escolha uma opção:"
					+ "\n1- Cadastrar morador"
					+ "\n2- Consultar moradores"
					+ "\n3- Listar moradores do andar"
					+ "\n4- Excluir morador"
					+ "\n9- Sair");
			opcao = scanner.nextInt();
			switch (opcao) {
				case 1: 
					System.out.println("Nome do morador");
					String nome = scanner.next();
					System.out.println("Número do apartamento");
					apto = scanner.nextInt();
					System.out.println("Modelo do carro");
					String modcarro = scanner.next();
					System.out.println("Placa do carro");
					String placa = scanner.next();
					System.out.println("Cor do carro");
					String cor = scanner.next();
					c.cadastrar(nome, apto, modcarro, placa, cor); 
					break;
				case 2: 
					c.consultar();
					break;
				case 3: 
					System.out.println("Número do andar");
					apto = scanner.nextInt();
					c.listarMoradoresDoAndar(apto);
					break;
				case 4: 
					System.out.println("Número do apartamento");
					apto = scanner.nextInt();
					c.excluir(apto);
					break;
				case 9: System.out.println("Saindo...");
					break;
				default: System.out.println("Opção inválida");
					break;
			}
		
		}
	}
	
}
