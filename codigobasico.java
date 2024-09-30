package pooed;
import java.util.Scanner;

public class askjdhasj {

	public static void main(String[] args) {
		//Variaveis 
		String nome, email, senha;
		int op1, tipo, compA, op2, op3, classe, noites, ida, sovolta, idaevolta, multvalorp;
		double valor, airfdub,azuldub,emiratesdub, golny, azulny, ameraairny, latamlond, klmlond;
		//Preço das passagens
		azuldub = 3500; airfdub= 4350.00; emiratesdub= 3700; golny = 4550; azulny = 5080; ameraairny = 7480; latamlond = 4835; klmlond = 5560;
		//Multiplicadores do valor total
		valor = 0;
		noites = 0;
		multvalorp = 0;
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
		System.out.println("Para qual destino você deseja viajar? \n(1) Dubai \n(2) Nova Iorque \n(3) Londres");
		op1 = sc.nextInt();
		System.out.println("Seu voo será de:\n(1)Ida\n(2)Ida e Volta\n(3)Só volta");
		tipo = sc.nextInt();
		if (tipo == 1 || tipo == 3)
			{multvalorp +=1 ;}
		else if (tipo == 2)
			{multvalorp +=2;}
		else {System.out.println("Opção Invalida");}
		//Destino fim
		
		//Comp aerea inicio
		if (op1 == 1) {
			System.out.println("Seu destino é Dubai!\nEscolha a companhia aerea que você deseja voar:\n(1) Air France\n(2) Azul\n(3) Emirates");
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
		}
		else if (op1 == 2) {
			System.out.println("Seu destino é Nova Iorque!\nEscolha a companhia aerea que você deseja voar:\n(1) Gol\n(2) Azul\n(3) American Airlines");
			compA = sc.nextInt();
			if (compA == 1){
				System.out.println("Você escolheu a companhia Gol!\n Você deseja voar em qual classe?\n(1)Economica : R$"+golny+"\n(2)Executiva : R$"+(golny*1.25)+"\n(3)Primeira Classe : R$"+(golny*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valor += golny;}
				else if (classe == 2) {valor += (golny*1.25);}
				else if (classe == 3) {valor += (golny*1.5);}
				else {System.out.println("Classe invalida!");}
			}
			else if (compA == 2){
				System.out.println("Você escolheu a companhia Azul!\n Você deseja voar em qual classe?\n(1)Economica : R$"+azulny+"\n(2)Executiva : R$"+(azulny*1.25)+"\n(3)Primeira Classe : R$"+(azulny*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valor += azulny;}
				else if (classe == 2) {valor += (azulny*1.25);}
				else if (classe == 3) {valor += (azulny*1.5);}
				else {System.out.println("Classe invalida!");}
			}
			else if (compA == 3){
				System.out.println("Você escolheu a companhia American Airlines!\n Você deseja voar em qual classe?\n(1)Economica : R$"+ameraairny+"\n(2)Executiva : R$"+(ameraairny*1.25)+"\n(3)Primeira Classe : R$"+(ameraairny*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valor += ameraairny;}
				else if (classe == 2) {valor += (ameraairny*1.25);}
				else if (classe == 3) {valor += (ameraairny*1.5);}
				else {System.out.println("Classe invalida!");}
			}
		}
		else if (op1 == 3) {
			System.out.println("Seu destino é Londres!\nEscolha a companhia aerea que você deseja voar:\n(1) Latam\n(2) Britsh Airways\n(3) KLM");
			compA = sc.nextInt();
			if (compA == 1){
				System.out.println("Você escolheu a companhia Latam!\n Você deseja voar em qual classe?\n(1)Economica : R$"+latamlond+"\n(2)Executiva : R$"+(latamlond*1.25)+"\n(3)Primeira Classe : R$"+(latamlond*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valor += latamlond;}
				else if (classe == 2) {valor += (latamlond*1.25);}
				else if (classe == 3) {valor += (latamlond*1.5);}
				else {System.out.println("Classe invalida!");}
			}
			else if (compA == 2){
				System.out.println("Você escolheu a companhia Britsh Airways!\n Você deseja voar em qual classe?\n(1)Economica : R$"+latamlond+"\n(2)Executiva : R$"+(latamlond*1.25)+"\n(3)Primeira Classe : R$"+(latamlond*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valor += latamlond;}
				else if (classe == 2) {valor += (latamlond*1.25);}
				else if (classe == 3) {valor += (latamlond*1.5);}
				else {System.out.println("Classe invalida!");}
			}
			else if (compA == 3){
				System.out.println("Você escolheu a companhia KLM!\n Você deseja voar em qual classe?\n(1)Economica : R$"+klmlond+"\n(2)Executiva : R$"+(klmlond*1.25)+"\n(3)Primeira Classe : R$"+(klmlond*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valor += klmlond;}
				else if (classe == 2) {valor += (klmlond*1.25);}
				else if (classe == 3) {valor += (klmlond*1.5);}
				else {System.out.println("Classe invalida!");}
			}
		}
		else {
			System.out.println("Local invalido!");
		}
		//Comp aerea Fim
		
		//Estadia inicio
		System.out.println("Quantas noites você deseja ficar?");
		noites = sc.nextInt();
		//Estadia Fim

		
	}

}
