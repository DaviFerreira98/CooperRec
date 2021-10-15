package Projeto;

public class Funcionario extends Pessoa {	
	
	private int codigoT;
	//M�todo construtor
	public Funcionario(String nome, String cpf, int idade,String email, int telefone, double salario, int codigoT) {
		super(nome,cpf,idade, email, telefone, salario);
		this.codigoT = codigoT;
	
	}
	//Getters e Setters
	public int getCodigoT() {
		return codigoT;
	}

	public void setCodigoT(int codigoT) {
		this.codigoT = codigoT;
	}
	//M�todo imprimir informa��es
	public void ImprimirInfo() {
		System.out.println(getNome()+getCpf()+getIdade()+getEmail()+getSalario()+getCodigoT());
	}
}
