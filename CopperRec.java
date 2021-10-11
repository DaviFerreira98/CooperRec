package Projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class CopperRec {
	int x;

	public static void main(String[] args) {
		
		int codtrab;
		int op;
		int contErro = 0;
		Scanner read = new Scanner(System.in);

		ArrayList<Funcionario>funcionarioArray = new ArrayList();
		Funcionario funcionario1 = new Funcionario("Davi","",0,"",0,0,32);
		Funcionario funcionario2 = new Funcionario("Carlos","",0,"",0,0,15);
		
		funcionarioArray.add(funcionario1);
		funcionarioArray.add(funcionario2);
		
		
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
			for(Funcionario f :funcionarioArray) { // Verificar o Codigo
				contErro=0;
				if(codtrab == f.getCodigoT()) {
				f.ImprimirInfo();
				
			
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

