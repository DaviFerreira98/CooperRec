package Projeto;

public class Lixos extends Funcionario{
	
	
	
	private double papel;
	private double vidro;
	private double plastico;
	private double metal;
	
	//Criando a classe do funcionário com todos os lixos que ele produziu.
	public Lixos(String nome, String cpf, int idade, String email, int telefone, double salario, int codigoT,
			double papel, double vidro, float plastico, float metal) {
		super(nome, cpf, idade, email, telefone, salario, codigoT);
		this.papel = papel;
		this.vidro = vidro;
		this.plastico = plastico;
		this.metal =metal;
	}

	
	public void ImprimirInfo() {
		System.out.println(getNome()+getCpf()+getIdade()+getEmail()+getTelefone()+getSalario()+getCodigoT()+papel+vidro+plastico+metal);
	}

	public double getPapel() {
		return papel;
	}

	public void setPapel(double papel) {
		this.papel = papel;
	}

	public double getVidro() {
		return vidro;
	}

	public void setVidro(double vidro) {
		this.vidro = vidro;
	}

	public double getPlastico() {
		return plastico;
	}

	public void setPlastico(double plastico) {
		this.plastico = plastico;
	}

	public double getMetal() {
		return metal;
	}

	public void setMetal(double metal) {
		this.metal = metal;
	}
	public void imprimirLixos() {
		System.out.println(papel);
	}
	
}