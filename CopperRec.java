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
		//Declarando funcion�rios e seus par�metros
		ArrayList<Lixos>funcionarioArray = new ArrayList();
		Lixos funcionario = new Lixos("Davi","559.211.640-38",34,"davicantanary@cooperrec.com",40028922,2000,36754,500,450,10,10);
		Lixos funcionario1 = new Lixos("Carlos","766.113.590-60",25,"carlosalcantara@cooperrec.com",38366266,2000,36782,500,40,3,100);
		Lixos funcionario2 = new Lixos("Ana","529.860.370-03",45,"anadiacampanari@cooperrec.com",35087518,2000,38798,300,400,350,220);
		Lixos funcionario3 = new Lixos("Wesley","209.149.730-45",22,"wesleypontes@cooperrec.com",39234571,2000,36722,40,25,400,300);
		Lixos funcionario4 = new Lixos("Amanda","493.862.380-39",30,"amandalima@cooperrec.com",25655545,2000,36715,37,78,250,600);
		Lixos funcionario5 = new Lixos("Luan","426.124.260-51",19,"luanfernandes@cooperrec.com",28886125,2000,36799,458,272,44,25);
		Lixos funcionario6 = new Lixos("","",0,"",0,0,0,0,0,0,0);
		
		funcionarioArray.add(funcionario);
		funcionarioArray.add(funcionario1);
		funcionarioArray.add(funcionario2);
		funcionarioArray.add(funcionario3);
		funcionarioArray.add(funcionario4);
		funcionarioArray.add(funcionario5);
		funcionarioArray.add(funcionario6);
		
		//Apresenta��o do programa
		System.out.println("______________________________________________________________________");
		System.out.println("   ___                                     __              \r\n"
				+ "  / __\\  ___    ___   _ __    ___  _ __   /__\\   ___   ___ \r\n"
				+ " / /    / _ \\  / _ \\ | '_ \\  / _ \\| '__| / \\//  / _ \\ / __|\r\n"
				+ "/ /___ | (_) || (_) || |_) ||  __/| |   / _  \\ |  __/| (__ \r\n"
				+ "\\____/  \\___/  \\___/ | .__/  \\___||_|   \\/ \\_/  \\___| \\___|\r\n"
				+ "                     |_|                                   ");
		System.out.println("______________________________________________________________________");
		System.out.println();
		
		System.out.println("Bem vinde a CooperRec, o seu sistema de reciclagem favorito!!!"
				+"Para continuarmos, precisamos da sua identifica��o: ");
		System.out.println("Voc� � (1)Colaborador ou (2)Operador, (0)Para sair.");
		op = read.nextInt();
		while(op<0 || op>2) {
			System.out.println("Voc� � (1)Colaborador ou (2)Operador, (0)Para sair.");
			op = read.nextInt();
		}
		switch(op){
		case 1: //Menu do Funcion�rio
			
			System.out.println("Caro colaborador, por gentileza, informe seu c�digo de entrada: ");
			codtrab = read.nextInt();
			
			for(Lixos f :funcionarioArray) { // Verificar o Codigo
				contErro=0;
				
				if(codtrab == f.getCodigoT()) {
					certo = true;
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				Calendar calendario = Calendar.getInstance();
				System.out.println(df.format(calendario.getTime()));
				f.ImprimirInfo();
				
				
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("**************************************************************************************");
				System.out.println("\t\tQual das op��o voc� Deseja:"
						+ "\n\t 1 - Adicionar o lixo a ser reciclado"
						+ "\n\t 2 - Ver sua comiss�o");
				System.out.println("**************************************************************************************");
				op2=read.nextInt();
				
				while(op2<1 || op2>2) {
					System.out.println("Aten��o, op��o invalida, por gentileza, digite novamente: ");
					System.out.println("***********************************************************************************");
					System.out.println("\t\tQual das op��o voc� Deseja:"
							+ "\n\t 1 - Adicionar o lixo a ser reciclado"
							+ "\n\t 2 - Ver sua comiss�o");
					System.out.println("***********************************************************************************");
					op2=read.nextInt();
				}
				do //In�cio do adicionar materiais 
			switch(op2) {
		
			
			case 1:
				System.out.println("\nQual dos materiais voc� deseja adicionar: "
						+ "\n1- Papel"
						+ "\n2- Metal"
						+ "\n3- Plastico"
						+ "\n4- Vidro"
						+"\n5- Para ver sua comiss�o"
						+ "\n0- Sair");
				op3=read.nextInt();
				while(op3<0 || op3>5) {
					System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
					System.out.println("\nQual voce deseja adicionar: "
							+ "\n1- Papel"
							+ "\n2- Metal"
							+ "\n3- Plastico"
							+ "\n4- Vidro"
							+"\n5- Para ver sua comiss�o"
							+ "\n0- Sair");
					op3=read.nextInt();
				}
				if(op3==1) { //Papel
					System.out.println("Por gentileza, digite a quantidade em quilos que deseja adicionar: ");
					papel=read.nextDouble();
					f.setPapel(papel+f.getPapel());
					f.imprimirLixos();
					
				}
				if(op3==2) { //Metal
					System.out.println("Por gentileza, digite a quantidade em quilos que deseja adicionar: ");
					metal=read.nextDouble();
					f.setMetal(metal+f.getMetal());
					f.imprimirLixos();
					
				}
				if(op3==3) { //Pl�stico
					System.out.println("Por gentileza, digite a quantidade em quilos que deseja adicionar: ");
					plastico=read.nextDouble();
					f.setPlastico(plastico+f.getPlastico());
					f.imprimirLixos();
					
				}
				if(op3==4) { //Vidro
					System.out.println("Por gentileza, digite a quantidade em quilos que deseja adicionar: ");
					vidro=read.nextDouble();
					f.setVidro(vidro+f.getVidro());
					f.imprimirLixos();
					
				}
				if(op3==5) {
					f.imprimirComissao();
				}
				if(op3==0) {
			    op2 = 0;
				break;
				}
				break;
				//Fim do adicionar materiais
			case 2:
				f.imprimirComissao();
				System.out.println("Quais das op��es abaixo voc� deseja? Digite:"
						+ "\n 1 - Adicionar lixos"
						+ "\n 0 - Para sair");
				op2 = read.nextInt();
				while (op2 > 1 || op2 < 0 ) {
					System.out.println("Quais das op��es abaixo voc� deseja? Digite:\"\r\n"
							+ "\n 1 - Adicionar lixos\"\r\n"
							+ "\n 0 - Para sair\n");
					op2 = read.nextInt();				}
				break;
			
			}
				while (op2 != 0);
	
		}
		
				
			
		}			
					
			//Caso digite o c�digo errado na primeira tentativa 
			while(certo!=true) { 
				System.out.println("Aten��o, c�digo invalido, por gentileza, digite novamente: ");
				System.out.println("Caro colaborador, por gentileza, informe seu c�digo de entrada: ");
				codtrab = read.nextInt();
				for(Lixos f :funcionarioArray) { 
					contErro=0;
					
					if(codtrab == f.getCodigoT()) {
						certo = true;
						DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
						Calendar calendario = Calendar.getInstance();
						System.out.println(df.format(calendario.getTime()));
						f.ImprimirInfo();
					
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println("********************************************************************************************");
						System.out.println("\t\tQual das op��o voc� Deseja:"
								+ "\n\t 1 - Adicionar o lixo a ser reciclado"
								+ "\n\t 2 - Ver sua comiss�o");
						System.out.println("********************************************************************************************");
					op2=read.nextInt();
					
					while(op2<1 || op2>2) {
						System.out.println("Aten��o, op��o invalida, por gentileza, digite novamente: ");
						System.out.println("********************************************************************************************");
						System.out.println("\t\tQual das op��o voc� Deseja:"
								+ "\n\t 1 - Adicionar o lixo a ser reciclado"
								+ "\n\t 2 - Ver sua comiss�o");
						System.out.println("********************************************************************************************");
						op2=read.nextInt();
					}
					do 
				switch(op2) {
			
				
				case 1:
					System.out.println("\nQual dos materiais voc� deseja adicionar: "
							+ "\n1- Papel"
							+ "\n2- Metal"
							+ "\n3- Plastico"
							+ "\n4- Vidro"
							+"\n5- Para ver sua comiss�o"
							+ "\n0- Sair");
					op3=read.nextInt();
					while(op3<0 || op3>5) {
						System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
						System.out.println("\nQual dos materiais voc� deseja adicionar: "
								+ "\n1- Papel"
								+ "\n2- Metal"
								+ "\n3- Plastico"
								+ "\n4- Vidro"
								+"\n5- Para ver sua comiss�o"
								+ "\n0- Sair");
						op3=read.nextInt();
					}
					if(op3==1) { //Papel
						System.out.println("Por gentileza, digite a quantidade em quilos que deseja adicionar: ");
						papel=read.nextDouble();
						f.setPapel(papel+f.getPapel());
						f.imprimirLixos();
						
					}
					if(op3==2) { //Metal
						System.out.println("Por gentileza, digite a quantidade em quilos que deseja adicionar: ");
						metal=read.nextDouble();
						f.setMetal(metal+f.getMetal());
						f.imprimirLixos();
						
					}
					if(op3==3) { //Pl�stico
						System.out.println("Por gentileza, digite a quantidade em quilos que deseja adicionar: ");
						plastico=read.nextDouble();
						f.setPlastico(plastico+f.getPlastico());
						f.imprimirLixos();
						
					}
					if(op3==4) { //Vidro
						System.out.println("Por gentileza, digite a quantidade em quilos que deseja adicionar: ");
						vidro=read.nextDouble();
						f.setVidro(vidro+f.getVidro());
						f.imprimirLixos();
						
					}
					if(op3==5) {
						f.imprimirComissao();
					}
					if(op3==0) {
				    op2 = 0;
					break;
					}
					break;
					
				case 2:
					f.imprimirComissao();
					System.out.println("Quais das op��es abaixo voc� deseja? Digite:"
							+ "\n 1 - Adicionar lixos"
							+ "\n 0 - Para sair");
					op2 = read.nextInt();
					while (op2 > 1 || op2 < 0 ) {
						System.out.println("Quais das op��es abaixo voc� deseja? Digite:"
								+ "\n 1 - Adicionar lixos"
								+ "\n 0 - Para sair");
						op2 = read.nextInt();				}
					break;
					
				}
					while (op2 != 0);
		
			}
			
				
		}
			
	}
			break;
			//Menu coordenador
		case 2:
			System.out.println("Caro coordenador, por gentileza, informe seu c�digo de login: ");
			loginAdm = read.nextInt();
			if(loginAdm == codAdm)
			{
			System.out.println("*******************************************************************************");
			System.out.println("\n\t\tQual das op��es abaixo voc� deseja? Digite:"
					+ "\n\t 1 - Excluir"
					+ "\n\t 2 - Visualizar Funcion�rios"
					+ "\n\t 3 - Adicionar Funcion�rios"
					+ "\n\t 0 - Sair");
			System.out.println("*******************************************************************************");
			op4 = read.nextInt();
			while(op4<0 || op4>3) {	
				System.out.println("Aten��o, op��o invalida, por gentileza, digite novamente: ");
				System.out.println("*******************************************************************************");
				System.out.println("\n\t\tQual das op��es abaixo voc� deseja? Digite:"
						+ "\n\t1 - Excluir"
						+ "\n\t2 - Visualizar Funcion�rios"
						+ "\n\t3 - Adicionar Funcion�rios"
						+ "\n\t0 - Sair");
				System.out.println("*******************************************************************************");
				op4 = read.nextInt();
				
			}if(op4 == 1) { //Caso de exclusao
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				Calendar calendario = Calendar.getInstance();
				System.out.println(df.format(calendario.getTime()));
				System.out.println("___________________________________________________________________________________________________________________________________________");
				System.out.println("Nome\t\tCPF\tIdade\t\tE-mail\t\t\tTelefone\tSal�rio\tC�digo\tPapel\tVidro\tPlast.\tMetal");
				for(Lixos f :funcionarioArray) {
					if(f.getCodigoT()!=0) {
						f.ImprimirInfoAdm();
					}
				}
				System.out.println("___________________________________________________________________________________________________________________________________________");
				System.out.println("\nPor gentileza, digite a posi��o de qual funcion�rio voc� deseja demitir: ");
				codExcluir = read.nextInt();
				funcionarioArray.remove(codExcluir-1);
				
				System.out.println("Nome\t\tCPF\tIdade\t\tE-mail\t\t\tTelefone\tSal�rio\tC�digo\tPapel\tVidro\tPlast.\tMetal");
				for(Lixos f :funcionarioArray) {
					if(f.getCodigoT()!=0) {
						f.ImprimirInfoAdm();
					}
				}
				System.out.println("___________________________________________________________________________________________________________________________________________");
			}
			
			if(op4 == 2) {
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				Calendar calendario = Calendar.getInstance();
				System.out.println(df.format(calendario.getTime()));
				System.out.println("___________________________________________________________________________________________________________________________________________");
				System.out.println("Nome\t\tCPF\tIdade\t\tE-mail\t\t\tTelefone\tSal�rio\tC�digo\tPapel\tVidro\tPlast.\tMetal");
				for(Lixos f :funcionarioArray) {
					if(f.getCodigoT()!=0) {
					f.ImprimirInfoAdm();
					}
				}
				System.out.println("___________________________________________________________________________________________________________________________________________");
				break;
			}
			//Adicionando novo funcion�rio
			if(op4 == 3)
					{
				read.nextLine();
				String nome;
				System.out.println("\nDigite o nome do novo funcion�rio: ");
				nome = read.next();
				System.out.println("\nDigite o CPF do novo funcion�rio: ");
				String cpf = read.next();
				System.out.println("\nDigite a idade do novo funcion�rio: ");
				int idade = read.nextInt();
				System.out.println("\nDigite o e-mail do novo funcion�rio: ");
				String email = read.next();
				System.out.println("\nDigite o telefone do novo funcion�rio: ");
				int telefone = read.nextInt();
				System.out.println("\nDigite o sal�rio do novo funcion�rio: ");
				double salario = read.nextDouble();
				System.out.println("\nDigite o c�digo do novo funcion�rio: ");
				int codigo = read.nextInt();
				
				funcionario6.setNome(nome);
				funcionario6.setCpf(cpf);
				funcionario6.setIdade(idade);
				funcionario6.setEmail(email);
				funcionario6.setTelefone(telefone);
				funcionario6.setSalario(salario);
				funcionario6.setCodigoT(codigo);
				
					for(Lixos f :funcionarioArray) {
					f.ImprimirInfoAdm();
				}
			}
			break;
			} else {
				System.out.println("Aten��o, c�digo invalido, por gentileza, digite novamente: ");
			}
			
		default:
			System.out.println("Programa encerrado com sucesso!");
			break;
		}
		System.out.println("Obrigado pela prefer�ncia.");

	}


}//Fim do programa

