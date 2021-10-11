package Projeto;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private int idade;
	private String email;
	private int telefone;
	private double salario;

	public Pessoa(String nome,String cpf, int idade, String email, int telefone, double salario) {
		this.nome=nome;
		this.cpf=cpf;
		this.idade=idade;
		this.email=email;
		this.telefone=telefone;
		this.salario=salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
