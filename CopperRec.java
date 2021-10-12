package Projeto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class CopperRec {
	int x;

	public static void main(String[] args) {
		
		int codtrab,codExcluir,codAdm = 12345, loginAdm;
		int op,op2,op3,op4;
		boolean certo = false;
		int contErro = 0;
		double papel=0,metal=0,vidro=0,plastico=0;
		Scanner read = new Scanner(System.in);

		ArrayList<Lixos>funcionarioArray = new ArrayList();
		Lixos funcionario = new Lixos("Davi","",0,"",0,0,32,5,0,0,0);
		Lixos funcionario1 = new Lixos("Carlos","",0,"",0,0,15,500,0,0,0);
		Lixos funcionario2 = new Lixos("Ana","",0,"",0,0,28,11,0,0,0);
		
		funcionarioArray.add(funcionario);
		funcionarioArray.add(funcionario1);
		funcionarioArray.add(funcionario2);
		
		
		System.out.println("Você é (1)funcionário ou (2)operador, (0)Para sair.");
		op = read.nextInt();
		while(op<0 || op>2) {
			System.out.println("Você é (1)funcionário ou (2)operador, (0)Para sair.");
			op = read.nextInt();
		}
		switch(op){
		case 1: //Menu do Funcionário
			
			System.out.println("Digite seu código de entrada: ");
			codtrab = read.nextInt();
			//INICIO
			for(Lixos f :funcionarioArray) { // Verificar o Codigo
				contErro=0;
				
				if(codtrab == f.getCodigoT()) {
					certo = true;
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				Calendar calendario = Calendar.getInstance();
				System.out.println(df.format(calendario.getTime()));
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
				do 
			switch(op2) {
		
			
			case 1:
				System.out.println("Qual voce deseja adicionar: "
						+ "\n1- Papel"
						+ "\n2- metal"
						+ "\n3- plastico"
						+ "\n4- vidro"
						+ "\n0 - sair");
				op3=read.nextInt();
				while(op3<0 || op3>4) {
					System.out.println("Erro");
					System.out.println("Qual voce deseja adicionar: "
							+ "\n1- Papel"
							+ "\n2- metal"
							+ "\n3- plastico"
							+ "\n4- vidro"
							+ "\n0 - sair");
					op3=read.nextInt();
				}
				if(op3==1) { //Papel
					System.out.println("Digite a quantidade em quilos");
					papel=read.nextDouble();
					f.setPapel(papel+f.getPapel());
					f.imprimirLixos();
					
				}
				if(op3==2) { //Metal
					System.out.println("Digite a quantidade em quilos");
					metal=read.nextDouble();
					f.setMetal(metal+f.getMetal());
					f.imprimirLixos();
					
				}
				if(op3==3) { //Plástico
					System.out.println("Digite a quantidade em quilos");
					plastico=read.nextDouble();
					f.setPlastico(plastico+f.getPlastico());
					f.imprimirLixos();
					
				}
				if(op3==4) { //Vidro
					System.out.println("Digite a quantidade em quilos");
					vidro=read.nextDouble();
					f.setVidro(vidro+f.getVidro());
					f.imprimirLixos();
					
				}
				if(op3==0) {
			    op2 = 0;
				break;
				}
				break;
				
			case 2:
				f.imprimirComissao();
				System.out.println("Digite 1 para adicionar lixos ou digite 0 para sair");
				op2 = read.nextInt();
				while (op2 > 1 || op2 < 0 ) {
					System.out.println("Digite 1 para adicionar lixos ou digite 0 para sair");
					op2 = read.nextInt();				}
				break;
				
			}
				while (op2 != 0);
	
		}
		
				else {
					
					//contErro++;
				}
			
		}			
					//FIM

			while(certo!=true) { //Caso do codigo errado
				System.out.println("Errado");
				System.out.println("Digite seu código de entrada: ");
				codtrab = read.nextInt();//COLE A PARTIR DAQUI
				for(Lixos f :funcionarioArray) { // Verificar o Codigo
					contErro=0;
					
					if(codtrab == f.getCodigoT()) {
						certo = true;
						DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
						Calendar calendario = Calendar.getInstance();
						System.out.println(df.format(calendario.getTime()));
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
					do 
				switch(op2) {
			
				
				case 1:
					System.out.println("Qual voce deseja adicionar: "
							+ "\n1- Papel"
							+ "\n2- metal"
							+ "\n3- plastico"
							+ "\n4- vidro"
							+ "\n0 - sair");
					op3=read.nextInt();
					while(op3<0 || op3>4) {
						System.out.println("Erro");
						System.out.println("Qual voce deseja adicionar: "
								+ "\n1- Papel"
								+ "\n2- metal"
								+ "\n3- plastico"
								+ "\n4- vidro"
								+ "\n0 - sair");
						op3=read.nextInt();
					}
					if(op3==1) { //Papel
						System.out.println("Digite a quantidade em quilos");
						papel=read.nextDouble();
						f.setPapel(papel+f.getPapel());
						f.imprimirLixos();
						
					}
					if(op3==2) { //Metal
						System.out.println("Digite a quantidade em quilos");
						metal=read.nextDouble();
						f.setMetal(metal+f.getMetal());
						f.imprimirLixos();
						
					}
					if(op3==3) { //Plástico
						System.out.println("Digite a quantidade em quilos");
						plastico=read.nextDouble();
						f.setPlastico(plastico+f.getPlastico());
						f.imprimirLixos();
						
					}
					if(op3==4) { //Vidro
						System.out.println("Digite a quantidade em quilos");
						vidro=read.nextDouble();
						f.setVidro(vidro+f.getVidro());
						f.imprimirLixos();
						
					}
					if(op3==0) {
				    op2 = 0;
					break;
					}
					break;
					
				case 2:
					f.imprimirComissao();
					System.out.println("Digite 1 para adicionar lixos ou digite 0 para sair");
					op2 = read.nextInt();
					while (op2 > 1 || op2 < 0 ) {
						System.out.println("Digite 1 para adicionar lixos ou digite 0 para sair");
						op2 = read.nextInt();				}
					break;
					
				}
					while (op2 != 0);
		
			}
			
					else {
						
						//contErro++;
					}
				
			}
			//COLE ATÉ AQUI	
			}
			
			break;
		case 2:
			System.out.println("\nDigite seu código de login: ");
			loginAdm = read.nextInt();
			if(loginAdm == codAdm)
			{
			System.out.println("\nO que você deseja fazer?\n1-Excluir\n2- Visualizar Funcionários\n0- Sair");
			op4 = read.nextInt();
			while(op4<0 || op4>2) {	
				System.out.println("Código inválido!!");
				System.out.println("\nO que você deseja fazer?\n1-Excluir\n2- Visualizar Funcionários\n0- Sair");
				op4 = read.nextInt();
				
			}if(op4 == 1) { //Caso de exclusao
				for(Lixos f :funcionarioArray) {
					DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					Calendar calendario = Calendar.getInstance();
					System.out.println(df.format(calendario.getTime()));
					f.ImprimirInfo();
				}
				System.out.println("\nDigite a posição de qual funcionário você deseja demitir: ");
				codExcluir = read.nextInt();
				funcionarioArray.remove(codExcluir-1);
				
				for(Lixos f :funcionarioArray) {
					DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					Calendar calendario = Calendar.getInstance();
					System.out.println(df.format(calendario.getTime()));
					f.ImprimirInfo();
				}
			}
			
			if(op4 == 2) {
				for(Lixos f :funcionarioArray) {
					DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					Calendar calendario = Calendar.getInstance();
					System.out.println(df.format(calendario.getTime()));
					f.ImprimirInfo();
				}
				break;
			}	
			break;
			} else {
				System.out.println("Código Inválido!!");
			}
			
		default:
			System.out.println("Programa encerrado com sucesso!");
			break;
		}
		System.out.println("Obrigado pela preferência.");

	}


}

