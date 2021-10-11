package Projeto;

public class Lixos extends Funcionario{
	
	
	
	private float papel;
	private float vidro;
	private float plastico;
	private float metal;
	
	//Criando a classe do funcionário com todos os lixos que ele produziu.
	public Lixos(String nome, String cpf, int idade, String email, int telefone, double salario, int codigoT,
			float papel, float vidro, float plastico, float metal) {
		super(nome, cpf, idade, email, telefone, salario, codigoT);
		this.papel = papel;
		this.vidro = vidro;
		this.plastico = plastico;
		this.metal =metal;
	}
	
	public void ImprimirInfo() {
		System.out.println(getNome()+getCpf()+getIdade()+getEmail()+getTelefone()+getSalario()+getCodigoT()+papel+vidro+plastico+metal);
	}

	public float getPapel() {
		return papel;
	}

	public void setPapel(float papel) {
		this.papel = papel;
	}

	public float getVidro() {
		return vidro;
	}

	public void setVidro(float vidro) {
		this.vidro = vidro;
	}

	public float getPlastico() {
		return plastico;
	}

	public void setPlastico(float plastico) {
		this.plastico = plastico;
	}

	public float getMetal() {
		return metal;
	}

	public void setMetal(float metal) {
		this.metal = metal;
	}
	
	
}