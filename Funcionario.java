package Projeto;

public class Funcionario extends Pessoa {	
	
	private int codigoT;
	
	public Funcionario(String nome, String cpf, int idade,String email, int telefone, double salario, int codigoT) {
		super(nome,cpf,idade, email, telefone, salario);
		this.codigoT = codigoT;
	}

	public int getCodigoT() {
		return codigoT;
	}

	public void setCodigoT(int codigoT) {
		this.codigoT = codigoT;
	}
	
	
}
