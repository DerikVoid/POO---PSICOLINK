package classes;
import java.util.Scanner;
import java.util.ArrayList;

public class Psicologo extends Pessoa{
	
	
	//Atributos
		private ArrayList<String> registro = new ArrayList<>();  
		String avaliacao;
		
	//Construtor

	public Psicologo(String nome, int idade, String senha, String email, int id, String sexo, String anotacao, ArrayList<String> registro, String avaliacao) {
		super(nome, idade, senha, email, id, sexo, anotacao);
		this.registro = registro;
		this.avaliacao = avaliacao;
	}
	
	public ArrayList<String> getRegistro() {
		return registro;
	}
	public void setRegistro(ArrayList<String> registro) {
		this.registro = registro;
	}
	public String getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	//Métodos anotacao
	public void Anotacao_p() {
		super.Anotacao();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Registrar anotação do seu paciente?");
		//Mesmo tipo de relação do cliente com psicologo porem agora sera com a classe empresa
		
	}

	
	
	}


