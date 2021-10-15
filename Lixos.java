package Projeto;

public class Lixos extends Funcionario{
	
	
	
	private double papel;
	private double vidro;
	private double plastico;
	private double metal;
	
	//Criando o construtor do funcion�rio com todos os lixos que ele produziu.
	public Lixos(String nome, String cpf, int idade, String email, int telefone, double salario, int codigoT,
			double papel, double vidro, float plastico, float metal) {
		super(nome, cpf, idade, email, telefone, salario, codigoT);
		this.papel = papel;
		this.vidro = vidro;
		this.plastico = plastico;
		this.metal =metal;
	}

	//M�todo para imprimir informa��es
	public void ImprimirInfo() {
		System.out.println(getNome()+"\nCPF: "+getCpf()+"\nIdade: "+getIdade()+"\nE-mail: "+getEmail()+"\nTelefone: "+getTelefone()+"\nSal�rio: R$"+getSalario()+"\nC�digo do Funcion�rio: "+getCodigoT()
		+"\n_________________________________________________________________________________"
		+"\nLista de reciclagem em KG: "
		+"\nPapel "+papel+" KG\nVidro "+vidro+" KG\nPlastico "+plastico+" KG\nMetal "+metal+" KG");
	}
	//M�todo para imprimir comiss�o
	public void imprimirComissao() {
		double calculo;
		double calComissao;
		calculo = (papel / 100) + (plastico / 100) + (metal / 100) + (vidro / 100);
		calComissao = 2000 + (2000*(calculo/100));
		System.out.printf("O valor da sua comiss�o atual � de: %.2f porcento \nSal�rio com a comiss�o � R$ %4.2f\n",calculo,calComissao);
		
		
	}
	//Getters e Setters
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
	//M�todo para imprimir os materias 
	public void imprimirLixos() {
		System.out.printf("\nSua lista de reciclagem em KG atual �: "
				+"\nPapel "+papel+" KG\nVidro "+vidro+" KG\nPlastico "+plastico+" KG\nMetal "+metal+" KG\n");
	}
	//M�todo para imprimir informa��es adm
	public void ImprimirInfoAdm() {
        System.out.println(getNome()+"\t"+getCpf()+"\t"+getIdade()+"\t"+getEmail()+"\t"+getTelefone()+"\t"+getSalario()+"\t"+getCodigoT()+"\t"+papel+"\t"+vidro+"\t"+plastico+"\t"+metal);
    }
	
}