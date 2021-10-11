package Projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class CopperRec {

	public static void main(String[] args) {
		
		int codtrab;
		int op;
		Scanner read = new Scanner(System.in);
		
		ArrayList<Lixos>funcionarioArray = new ArrayList();
		Lixos funcionario = new Lixos("","",0,"",0,0,0,0,0,0,0);
		Lixos funcionario1 = new Lixos("","",0,"",0,0,0,0,0,0,0);
		
		System.out.println("Você é (1)funcionário ou (2)operador, (0)Para sair.");
		op = read.nextInt();
		while(op<0 || op>2) {
			System.out.println("Você é (1)funcionário ou (2)operador, (0)Para sair.");
			op = read.nextInt();		
		}
		switch(op){
		case 1:
			System.out.println("Digite seu código de entrada: ");
			codtrab = read.nextInt();
			
			
			
			
			break;
			
		case 2:
			
			break;
		
		default:
			System.out.println("Obrigado pela preferência.");
			break;
		}
		
	}


	}

}
