package teste;

public class Cliente {
	String nome;
	String cpf;
	String datadenascimento;
	int idade;
	
	public void imprimircliente() {
		System.out.println("Dados do cliente:\n");
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.cpf);
		System.out.println(this.datadenascimento);
	}
}
