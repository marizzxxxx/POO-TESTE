package teste;

public class conta {
	int numero;
	String titular;
	double saldo;
	double limite;
	String dataCriacao;
	
	public void imprimirDadosConta () {
		System.out.println("Dados da conta:\n");
		System.out.println("Cliente: " + this.titular);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Limite: " + this.limite);
	}

	public void sacar (double valor) {
		if(valor<=this.saldo) {
		this.saldo = this.saldo = valor;
		System.out.println("Saque realizado com sucesso");
		}else {
			System.out.println("Saldo indisponivel!");
		}
	}

	public void visualizarsaldo() {
		System.out.println("Seu saldo atual é: "+this.saldo);
	}
	
	public void depositar (double valor) {
		this.saldo = this.saldo + valor;
	}
}
