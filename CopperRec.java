package Projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class CopperRec {
	int x;

	public static void main(String[] args) {
		
		int codtrab;
		int op,op2,op3;
		int contErro = 0;
		double papel=0,metal=0,vidro=0,plastico=0;
		Scanner read = new Scanner(System.in);

		ArrayList<Lixos>funcionarioArray = new ArrayList();
		Lixos funcionario = new Lixos("Davi","",0,"",0,0,32,0,0,0,0);
		Lixos funcionario1 = new Lixos("Carlos","",0,"",0,0,15,0,0,0,0);
		
		funcionarioArray.add(funcionario);
		funcionarioArray.add(funcionario1);
		
		
		System.out.println("Você é (1)funcionário ou (2)operador, (0)Para sair.");
		op = read.nextInt();
		while(op<0 || op>2) {
			System.out.println("Você é (1)funcionário ou (2)operador, (0)Para sair.");
			op = read.nextInt();
		}
		switch(op){
		case 1: //Funcionario
			System.out.println("Digite seu código de entrada: ");
			codtrab = read.nextInt();
			for(Lixos f :funcionarioArray) { // Verificar o Codigo
				contErro=0;
				
				if(codtrab == f.getCodigoT()) {
				f.ImprimirInfo();
				System.out.println("\t\tVoce Deseja:"
						+ "\n1\t Adicionar o lixo a ser reciclado"
						+ "\n2\t ver a comissão");
				op2=read.nextInt();
				
				while(op2<1 || op2>2) {
					System.out.println("Errado");
					System.out.println("\t\tVoce Deseja:"
							+ "\n1\t Adicionar o lixo a ser reciclado"
							+ "\n2\t ver a comissão");
					op2=read.nextInt();
				}
			switch(op2) {
			case 1:
				System.out.println("Qual voce deseja adicionar: "
						+ "\n1- Papel"
						+ "\n2- metal"
						+ "\n3- plastico"
						+ "\n4- vidro");
				op3=read.nextInt();
				while(op3<1 || op3>3) {
					System.out.println("Erro");
					System.out.println("Qual voce deseja adicionar: "
							+ "\n1- Papel"
							+ "\n2- metal"
							+ "\n3- plastico"
							+ "\n4- vidro");
					op3=read.nextInt();
				}
				if(op3==1) { //Papel
					System.out.println("Digite a quantidade em quilos");
					papel=read.nextDouble();
					f.setPapel(papel+f.getPapel());
					f.imprimirLixos();
					
				}
				if(op3==2) {
					System.out.println("Digite a quantidade em quilos");
					metal=read.nextDouble();
					
				}
				break;
			}
		}
			
			
				else {
					contErro++;
				}
			
		}
			while(contErro>0) { //Caso do codigo errado
				System.out.println("Errado");
				System.out.println("Digite seu código de entrada: ");
				codtrab = read.nextInt();
				for(Funcionario f :funcionarioArray) {
					contErro=0;
					if(codtrab == f.getCodigoT()) {
					f.ImprimirInfo();
					
				
				}
					else {
						contErro++;
					}
				
			}
				
			}
			
			break;
			
		case 2:
			
			break;
		
		default:
			System.out.println("Obrigado pela preferência.");
			break;
		}
		
	}


	}

