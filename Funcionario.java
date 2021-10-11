package Projeto;

public class Funcionario extends Pessoa {	
	
	private String codigoT;
	
	public Funcionario(String nome, String cpf, int idade,String email, int telefone, double salario, String codigoT) {
		super(nome,cpf,idade, email, telefone, salario);
		this.codigoT = codigoT;
	}

	public String getCodigoT() {
		return codigoT;
	}

	public void setCodigoT(String codigoT) {
		this.codigoT = codigoT;
	}
	
	
}
