package aulapoo;

public class funcionario {
	String nome;
	double salario;
	String data_entrada;
	String rg;
	boolean situacao;
	departamento departamento;

public void cadastrarfuncionario (String nome, double salario, String data, String rg, departamento dep) {
	this.nome = nome;
	this.salario = salario;
	this.data_entrada = data;
	this.rg = rg;
	this.departamento = dep;
	this.situacao = true;
}
public void bonifica(double bonus) {
	this.salario = this.salario+bonus;
	System.out.println("Voce recebeu um bonus");
}
public void imprimirfuncionario () {
	System.out.println("Dados do funcionario");
	System.out.println("Nome: " + this.nome);
	System.out.println("Salário: " + this.salario);
	System.out.println("RG: " + this.rg);
	System.out.println("Departamento: " + this.departamento.descricao);
}
public void demitir () {
	this.situacao = false;
	System.out.println("Funcionario demitido");
}
public void situacaofuncionario () {
	if(this.situacao == true) {
		System.out.println("Situação do funcionario: ATIVO");
	}else {
		System.out.println("Situação do funcionario: INATIVO");
	}
}
}