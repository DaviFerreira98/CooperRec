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
		System.out.println(getNome()+"\nCPF: "+getCpf()+"\nIdade: "+getIdade()+"\nE-mail: "+getEmail()+"\nTelefone: "+getTelefone()+"\nSalário: R$"+getSalario()+"\nCódigo do Funcionário: "+getCodigoT()
		+"\n_________________________________________________________________________________"
		+"\nLista de reciclagem em KG: "
		+"\nPapel "+papel+" KG\nVidro "+vidro+" KG\nPlastico "+plastico+" KG\nMetal "+metal+" KG");
	}
	
	public void imprimirComissao() {
		double calculo;
		calculo = (papel / 100) + (plastico / 100) + (metal / 100) + (vidro / 100);
		System.out.println("O valor da sua comissão atual é de: "+calculo+"%");
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
		System.out.printf("\nSua lista de reciclagem em KG atual é: "
				+"\nPapel "+papel+" KG\nVidro "+vidro+" KG\nPlastico "+plastico+" KG\nMetal "+metal+" KG\n");
	}
	public void ImprimirInfoAdm() {
        System.out.println(getNome()+"\t"+getCpf()+"\t"+getIdade()+"\t"+getEmail()+"\t"+getTelefone()+"\t"+getSalario()+"\t"+getCodigoT()+"\t"+papel+"\t"+vidro+"\t"+plastico+"\t"+metal);
    }
	
}