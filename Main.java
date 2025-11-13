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
		if(entrada == 1) {
			
			//Entrada de dados do cliente
			System.out.println("Digite em sequencia os dados: ");
			String nome_c = scan.nextLine();
			System.out.println("Digite seu nome");
			int idade_c = scan.nextInt();
			System.out.println("Digite sua idade");
			String senha_c = scan.nextLine();
			System.out.println("Digite sua senha");
			String email_c = scan.nextLine();
			System.out.println("Digite seu email");
			String sexo_c = scan.nextLine();
			System.out.println("Digite seu sexo");
			//Tentar fazer com que sempre que tiver um novo ascesso o número aumentar
			int id_c = 1;
		
			Cliente cliente1 = new Cliente(nome_c, idade_c, senha_c, email_c, id_c, sexo_c);
		}
		
	}
}
