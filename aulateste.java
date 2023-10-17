package teste;
 
public class aulateste {

	public static void main(String[] args) {
//		Cliente c1 = new Cliente();
//		c1.nome = "Laura Maria";
//		c1.idade = 17;
//		c1.cpf = "09030553332";
//		c1.datadenascimento = "15-10-2006";
//		
//		Cliente c2 = new Cliente();
//		c2.nome = "Marlom Dias";
//		c2.idade = 17;
//		c2.cpf = "09030553333";
//		c2.datadenascimento = "15-09-2006";
//		
//		System.out.println("Clientes Cadastrados\n");
//		System.out.println(c1.nome);
//		System.out.println(c1.idade);
//		System.out.println(c1.cpf);
//		System.out.println(c1.datadenascimento);
//		
//		System.out.println("---------------------------");
//		System.out.println(c2.nome);
//		System.out.println(c2.idade);
//		System.out.println(c2.cpf);
//		System.out.println(c2.datadenascimento);
		
		conta conta1 = new conta();
		conta1.titular = "José Afonso";
		conta1.saldo = 1500;
		conta1.limite = 150;
		conta1.numero = 12879;
		conta1.dataCriacao = "10-10-2010";
		
		
		conta1.sacar(950);
		conta1.visualizarsaldo();
		conta1.depositar(125);
		conta1.visualizarsaldo();
		
	}

}
