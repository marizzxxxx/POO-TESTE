package aulapoo;

public class principal {

	public static void main(String[] args) {
		funcionario f1 = new funcionario();
		departamento d1 = new departamento ();
		d1.cadastrardepartamento(121, "informatica");
		f1.cadastrarfuncionario("Fran jose", 3500, "15/08/2023", "20010702" , d1);
		
		
		f1.imprimirfuncionario();
		f1.bonifica(1500);
		f1.imprimirfuncionario();
		f1.demitir();
		f1.imprimirfuncionario();
		f1.situacaofuncionario();
	}

}
