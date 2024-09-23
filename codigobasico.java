package pooed;
import java.util.Scanner;

public class askjdhasj {

	public static void main(String[] args) {
		String nome, email, senha;
		int op1, compA, op2, op3, classe, noites, ida, sovolta, idaevolta;
		double valor, airfdub,azuldub,emiratesdub,goldub;
		azuldub = 3500;
		airfdub= 4350.00;
		emiratesdub= 3700;
		goldub=4200;
		valor = 0;
		Scanner sc = new Scanner(System.in);
		
		// Cadastro inicio
		System.out.println("Insira seu nome:");
		nome = sc.nextLine();
//		System.out.println("Insira seu e-mail:");
//		email = sc.nextLine();
//		System.out.println("Insira sua senha:");
//		senha = sc.nextLine();
		System.out.println("Bem vindo "+nome+" ao site Nada Viagens!");
		//Cadastro fim
		
		//Destino inicio
		System.out.println("Para qual destino você deseja viajar? \n(1) Dubai \n(2) Denver\n(3) Houston \n(4) Nova Iorque \n(5) Londres\n(6) Los Angeles\n(7) Miami \n(8) Pheonix \n(9) San Francisco \n(10) Washington DC");
		op1 = sc.nextInt();
		//Destino fim
		
		//Comp aerea inicio
		if (op1 == 1) {
			//Estadia inicio
			System.out.println("Quantas noites você deseja ficar?");
			noites = sc.nextInt();
			 //Estadia Fim
			System.out.println("Seu destino é Dubai!\nEscolha a companhia aerea que você deseja voar:\n(1) Air France\n(2) Azul\n(3) Emirates\n(4) Gol\n(5) Latam");
				compA = sc.nextInt();
			if (compA == 1){
				System.out.println("Você escolheu a companhia Air France!\n Você deseja voar em qual classe?\n(1)Economica : R$"+airfdub+"\n(2)Executiva : R$"+(airfdub*1.25)+"\n(3)Primeira Classe : R$"+(airfdub*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valor += airfdub;}
				else if (classe == 2) {valor += (airfdub*1.25);}
				else if (classe == 3) {valor += (airfdub*1.5);}
				else {System.out.println("Classe invalida!");}
				}
			else if (compA == 2){
				System.out.println("Você escolheu a companhia Azul!\n Você deseja voar em qual classe?\n(1)Economica : R$"+azuldub+"\n(2)Executiva : R$"+(azuldub*1.25)+"\n(3)Primeira Classe : R$"+(azuldub*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valor += azuldub;}
				else if (classe == 2) {valor += (azuldub*1.25);}
				else if (classe == 3) {valor += (azuldub*1.5);}
				else {System.out.println("Classe invalida!");}
				}
			else if (compA == 3){
				System.out.println("Você escolheu a companhia Emirates!\n Você deseja voar em qual classe?\n(1)Economica : R$"+emiratesdub+"\n(2)Executiva : R$"+(emiratesdub*1.25)+"\n(3)Primeira Classe : R$"+(emiratesdub*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valor += emiratesdub;}
				else if (classe == 2) {valor += (emiratesdub*1.25);}
				else if (classe == 3) {valor += (emiratesdub*1.5);}
				else {System.out.println("Classe invalida!");}
				}
			else if (compA == 4){
				System.out.println("Você escolheu a companhia Gol!\n Você deseja voar em qual classe?\n(1)Economica : R$"+goldub+"\n(2)Executiva : R$"+(goldub*1.25)+"\n(3)Primeira Classe : R$"+(goldub*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valor += goldub;}
				else if (classe == 2) { valor += (goldub*1.25);}
				else if (classe == 3) {valor += (goldub*1.5);}
				else { System.out.println("Classe invalida!");}
				}
			else if (compA == 5){
				System.out.println("Você escolheu a companhia Latam!\n Você deseja voar em qual classe?\n(1)Economica : R$"+goldub+"\n(2)Executiva : R$"+(goldub*1.25)+"\n(3)Primeira Classe : R$"+(goldub*1.5));
				classe = sc.nextInt();
				if (classe == 1) { valor += goldub; }
				else if (classe == 2) { valor += (goldub*1.25); }
				else if (classe == 3) { valor += (goldub*1.5);}
				else { System.out.println("Classe invalida!"); }
				}
		}
		else {
			System.out.println("Local invalido!");
		}
		System.out.println(valor);
		
	}

}
