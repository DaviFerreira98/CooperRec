package Projeto;

public class Funcionario extends Pessoa {	
	
	private String codigoT;
	
	public Funcionario(String nome, String cpf, int idade) {
		super(nome,cpf,idade);
		this.codigoT = codigoT;
	}

	public String getCodigoT() {
		return codigoT;
	}

	public void setCodigoT(String codigoT) {
		this.codigoT = codigoT;
	}
	
	
}
