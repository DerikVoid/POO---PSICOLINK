package classes;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Seja bem-vindo ao Psicolink!! /n "
				+ "qual o seu formato de entrada no sistema: /n"
				+ "[1] Cliente /n"
				+ "[2] Psicologo /n"
				+ "[3] Empresa");
		int entrada = scan.nextInt();
		//Cliente
		if(entrada == 1) {
			
			//Entrada de dados do cliente
			System.out.println("Digite seu nome:");
			String nome_c = scan.nextLine();

			System.out.println("Digite sua idade:");
			int idade_c = scan.nextInt();
			scan.nextLine(); // consome o "enter" do nextInt()

			System.out.println("Digite sua senha:");
			String senha_c = scan.nextLine();

			System.out.println("Digite seu email:");
			String email_c = scan.nextLine();

			System.out.println("Digite seu CPF:");
			int cpf_c = scan.nextInt(); 

			System.out.println("Digite seu sexo:");
			String sexo_c = scan.nextLine();

			
			
			
		
			Cliente cliente1 = new Cliente(nome_c, idade_c, senha_c, email_c, cpf_c, sexo_c);
		}
		
		//Psicologo
		if(entrada == 2) {
			
			//Criar um empresa generica para que os dados possam rodar de forma normal
			
			//Caso uma empresa se cadastre vai funcionar do msm jeito, mas com os dados da empresa
		
			//Criação de email e senha por meio de um método da classe empresa
			System.out.println("Digite seu nome:");
			String nome_p = scan.nextLine();

			System.out.println("Digite sua idade:");
			int idade_p = scan.nextInt();
			scan.nextLine(); 
			
			System.out.println("Digite sua senha:");
			String senha_p = scan.nextLine();

			System.out.println("Digite seu email:");
			String email_p = scan.nextLine();

			System.out.println("Digite seu CPF:");
			int cpf_p = scan.nextInt(); 

			System.out.println("Digite seu sexo:");
			String sexo_p = scan.nextLine();

			Psicologo psicologo1 = new Psicologo(nome_p, idade_p, senha_p, email_p, cpf_p, sexo_p);
			
			//Necessario ter uma Empresa generica
			Empresa.CD(psicologo1, psicologo1);
		}
		//Empresa
		if(entrada == 3) {
			Empresa.CriacaoEmpresa();

		}
	}
}
