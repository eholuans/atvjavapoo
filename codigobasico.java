package pooed;
import java.util.Scanner;

public class viagens {

	public static void main(String[] args) {
		//Variaveis 
		String nome, email, senha;
		int op1, tipo, compA, op2, op3, classe, noites, ida, sovolta, idaevolta, multvalorp, acordo;
		double valor,valorp,valore, airfdub,azuldub,emiratesdub, golny, azulny, ameraairny, latamlond, klmlond, ghd, trcer, abr, hrhny, tp, trcp, tln, tmh, trl;
		//Preço das passagens
		azuldub = 3500; airfdub= 4350.00; emiratesdub= 3700; golny = 4550; azulny = 5080; ameraairny = 7480; latamlond = 4835; klmlond = 5560;
		//Hoteis 
		ghd = 1205; trcer = 2200; abr = 880; hrhny = 2220; tp = 5230; trcp = 4250; tln = 4900; tmh = 2700; trl = 5800;
		//Multiplicadores do valor total
		valor = 0;valorp = 0;valore = 0;noites = 0;multvalorp = 0;
		Scanner sc = new Scanner(System.in);
		// Cadastro inicio
		System.out.println("Insira seu nome:");
		nome = sc.nextLine();
		System.out.println("Insira seu e-mail:");
		email = sc.nextLine();
		System.out.println("Insira sua senha:");
		senha = sc.nextLine();
		System.out.println("Bem vindo "+nome+" ao site 123 Viagens!");
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
				if (classe == 1) {valorp += airfdub;}
				else if (classe == 2) {valorp += (airfdub*1.25);}
				else if (classe == 3) {valorp += (airfdub*1.5);}
				else {System.out.println("Classe invalida!");}
				}
			else if (compA == 2){
				System.out.println("Você escolheu a companhia Azul!\n Você deseja voar em qual classe?\n(1)Economica : R$"+azuldub+"\n(2)Executiva : R$"+(azuldub*1.25)+"\n(3)Primeira Classe : R$"+(azuldub*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += azuldub;}
				else if (classe == 2) {valorp += (azuldub*1.25);}
				else if (classe == 3) {valorp += (azuldub*1.5);}
				else {System.out.println("Classe invalida!");}
				}
			else if (compA == 3){
				System.out.println("Você escolheu a companhia Emirates!\n Você deseja voar em qual classe?\n(1)Economica : R$"+emiratesdub+"\n(2)Executiva : R$"+(emiratesdub*1.25)+"\n(3)Primeira Classe : R$"+(emiratesdub*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += emiratesdub;}
				else if (classe == 2) {valorp += (emiratesdub*1.25);}
				else if (classe == 3) {valorp += (emiratesdub*1.5);}
				else {System.out.println("Classe invalida!");}
				}
		}
		else if (op1 == 2) {
			System.out.println("Seu destino é Nova Iorque!\nEscolha a companhia aerea que você deseja voar:\n(1) Gol\n(2) Azul\n(3) American Airlines");
			compA = sc.nextInt();
			if (compA == 1){
				System.out.println("Você escolheu a companhia Gol!\n Você deseja voar em qual classe?\n(1)Economica : R$"+golny+"\n(2)Executiva : R$"+(golny*1.25)+"\n(3)Primeira Classe : R$"+(golny*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += golny;}
				else if (classe == 2) {valorp += (golny*1.25);}
				else if (classe == 3) {valorp += (golny*1.5);}
				else {System.out.println("Classe invalida!");}
			}
			else if (compA == 2){
				System.out.println("Você escolheu a companhia Azul!\n Você deseja voar em qual classe?\n(1)Economica : R$"+azulny+"\n(2)Executiva : R$"+(azulny*1.25)+"\n(3)Primeira Classe : R$"+(azulny*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += azulny;}
				else if (classe == 2) {valorp += (azulny*1.25);}
				else if (classe == 3) {valorp += (azulny*1.5);}
				else {System.out.println("Classe invalida!");}
			}
			else if (compA == 3){
				System.out.println("Você escolheu a companhia American Airlines!\n Você deseja voar em qual classe?\n(1)Economica : R$"+ameraairny+"\n(2)Executiva : R$"+(ameraairny*1.25)+"\n(3)Primeira Classe : R$"+(ameraairny*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += ameraairny;}
				else if (classe == 2) {valorp += (ameraairny*1.25);}
				else if (classe == 3) {valorp += (ameraairny*1.5);}
				else {System.out.println("Classe invalida!");}
			}
		}
		else if (op1 == 3) {
			System.out.println("Seu destino é Londres!\nEscolha a companhia aerea que você deseja voar:\n(1) Latam\n(2) British Airways\n(3) KLM");
			compA = sc.nextInt();
			if (compA == 1){
				System.out.println("Você escolheu a companhia Latam!\n Você deseja voar em qual classe?\n(1)Economica : R$"+latamlond+"\n(2)Executiva : R$"+(latamlond*1.25)+"\n(3)Primeira Classe : R$"+(latamlond*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += latamlond;}
				else if (classe == 2) {valorp += (latamlond*1.25);}
				else if (classe == 3) {valorp += (latamlond*1.5);}
				else {System.out.println("Classe invalida!");}
			}
			else if (compA == 2){
				System.out.println("Você escolheu a companhia British Airways!\n Você deseja voar em qual classe?\n(1) Economica : R$"+latamlond+"\n(2) Executiva : R$"+(latamlond*1.25)+"\n(3) Primeira Classe : R$"+(latamlond*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += latamlond;}
				else if (classe == 2) {valorp += (latamlond*1.25);}
				else if (classe == 3) {valorp += (latamlond*1.5);}
				else {System.out.println("Classe invalida!");}
			}
			else if (compA == 3){
				System.out.println("Você escolheu a companhia KLM!\n Você deseja voar em qual classe?\n(1) Economica : R$"+klmlond+"\n(2) Executiva : R$"+(klmlond*1.25)+"\n(3) Primeira Classe : R$"+(klmlond*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += klmlond;}
				else if (classe == 2) {valorp += (klmlond*1.25);}
				else if (classe == 3) {valorp += (klmlond*1.5);}
				else {System.out.println("Classe invalida!");}
			}
		}
		else {
			System.out.println("Local invalido!");
		}
		//Comp aerea Fim
		
		//Estadia inicio
		if (op1 == 1) {
			System.out.println("Escolha seu hotel em Dubai:\n(1)Grand Hyatt Dubai - Menor preço: R$ "+ghd+"\n(2) Al Bandar Rotana - Menor preço: R$ "+abr+"\n(3) The Ritz-Carlton Executive Residences - Menor preço: R$ "+trcer);
			op2 = sc.nextInt();
			if (op2 == 1) {
				System.out.println("Você escolheu o hotel Grand Hyatt Dubai! Estas são nossas opções de quartos:\n(1) Quarto basico: R$ "+ghd+"\n(2) Suite Deluxe: R$ "+(ghd*1.5)+"\n(3) Cobertura: R$ "+(ghd*3));
				op3 = sc.nextInt();
				if (op3 == 1) {valore += ghd;}
				else if (op3 == 2) {valore += (ghd*1.5);}
				else if (op3 == 3) {valore += (ghd*3);}
				else {System.out.println("Tipo de quarto invalido!");}
			}
			else if (op2 == 2) {
				System.out.println("Você escolheu o hotel Al Bandar Rotana! Estas são nossas opções de quartos:\n(1) Quarto basico: R$ "+abr+"\n(2) Suite Deluxe: R$ "+(abr*1.5)+"\n(3) Cobertura: R$ "+(abr*3));
				op3 = sc.nextInt();
				if (op3 == 1) {valore += abr;}
				else if (op3 == 2) {valore += (abr*1.5);}
				else if (op3 == 3) {valore += (abr*3);}
				else {System.out.println("Tipo de quarto invalido!");}
			}
			else if (op2 == 3) {
				System.out.println("Você escolheu o hotel The Ritz-Carlton Executive Residences! Estas são nossas opções de quartos:\n(1) Quarto basico: R$ "+trcer+"\n(2) Suite Deluxe: R$ "+(trcer*1.5)+"\n(3) Cobertura: R$ "+(trcer*3));
				op3 = sc.nextInt();
				if (op3 == 1) {valore += trcer;}
				else if (op3 == 2) {valore += (trcer*1.5);}
				else if (op3 == 3) {valore += (trcer*3);}
				else {System.out.println("Tipo de quarto invalido!");}
			}
			else {System.out.println("Hotel invalido!");
				}
			}
			
		else if (op1 == 2) {
				System.out.println("Escolha seu hotel em Nova Iorque:\n(1) Hard Rock Hotel - Menor preço: R$ "+hrhny+"\n(2) The Plaza - Menor preço: R$ "+tp+"\n(3) The Ritz-Carlton Central Park - Menor preço: R$ "+trcp);
				op2 = sc.nextInt();
				if (op2 == 1) {
					System.out.println("Você escolheu o hotel Hard Rock Hotel! Estas são nossas opções de quartos:\n(1) Quarto basico: R$ "+hrhny+"\n(2) Suite Deluxe: R$ "+(hrhny*1.5)+"\n(3) Cobertura: R$ "+(hrhny*3));
					op3 = sc.nextInt();
					if (op3 == 1) {valore += hrhny;}
					else if (op3 == 2) {valore += (hrhny*1.5);}
					else if (op3 == 3) {valore += (hrhny*3);}
					else {System.out.println("Tipo de quarto invalido!");}
				}
				else if (op2 == 2) {
					System.out.println("Você escolheu o hotel The Plaza! Estas são nossas opções de quartos:\n(1) Quarto basico: R$ "+tp+"\n(2) Suite Deluxe: R$ "+(tp*1.5)+"\n(3) Cobertura: R$ "+(tp*3));
					op3 = sc.nextInt();
					if (op3 == 1) {valore += tp;}
					else if (op3 == 2) {valore += (tp*1.5);}
					else if (op3 == 3) {valore += (tp*3);}
					else {System.out.println("Tipo de quarto invalido!");}
				}
				else if (op2 == 3) {
					System.out.println("Você escolheu o hotel The Ritz-Carlton Central Park! Estas são nossas opções de quartos:\n(1) Quarto basico: R$ "+trcp+"\n(2) Suite Deluxe: R$ "+(trcp*1.5)+"\n(3) Cobertura: R$ "+(trcp*3));
					op3 = sc.nextInt();
					if (op3 == 1) {valore += trcp;}
					else if (op3 == 2) {valore += (trcp*1.5);}
					else if (op3 == 3) {valore += (trcp*3);}
					else {System.out.println("Tipo de quarto invalido!");}
				}
		}
		else if (op1 == 3) {
			System.out.println("Escolha seu hotel em Londres:\n(1) The Lanesborough - Menor preço: R$ "+tln+"\n(2) The Milestone Hotel - Menor preço: R$ "+tmh+"\n(3) The Ritz-Carlton London - Menor preço: R$ "+trl);
			op2 = sc.nextInt();
			if (op2 == 1) {
				System.out.println("Você escolheu o hotel The Lanesborough! Estas são nossas opções de quartos:\n(1) Quarto basico: R$ "+tln+"\n(2) Suite Deluxe: R$ "+(tln*1.5)+"\n(3) Cobertura: R$ "+(tln*3));
				op3 = sc.nextInt();
				if (op3 == 1) {valore += tln;}
				else if (op3 == 2) {valore += (tln*1.5);}
				else if (op3 == 3) {valore += (tln*3);}
				else {System.out.println("Tipo de quarto invalido!");}
			}
			else if (op2 == 2) {
				System.out.println("Você escolheu o hotel The Milestone Hotel! Estas são nossas opções de quartos:\n(1) Quarto basico: R$ "+tmh+"\n(2) Suite Deluxe: R$ "+(tmh*1.5)+"\n(3) Cobertura: R$ "+(tmh*3));
				op3 = sc.nextInt();
				if (op3 == 1) {valore += tmh;}
				else if (op3 == 2) {valore += (tmh*1.5);}
				else if (op3 == 3) {valore += (tmh*3);}
				else {System.out.println("Tipo de quarto invalido!");}
			}
			else if (op2 == 3) {
				System.out.println("Você escolheu o hotel The Ritz-Carlton London! Estas são nossas opções de quartos:\n(1) Quarto basico: R$ "+trl+"\n(2) Suite Deluxe: R$ "+(trl*1.5)+"\n(3) Cobertura: R$ "+(trl*3));
				op3 = sc.nextInt();
				if (op3 == 1) {valore += trl;}
				else if (op3 == 2) {valore += (trl*1.5);}
				else if (op3 == 3) {valore += (trl*3);}
				else {System.out.println("Tipo de quarto invalido!");}
			}
	}
		System.out.println("Quantas noites você deseja ficar?");
		noites = sc.nextInt();
		//Estadia Fim
		
		//Resultado final
		valor = (noites*valore) + (valorp*multvalorp); 
		System.out.println("Este é o valor total da sua viagem: R$"+valor+"\nVocê está de acordo?\n(1) Sim!\n(2) Não!");
		acordo = sc.nextInt();
		if (acordo == 1) {
			System.out.println("Show!\nFaça o pix para 123viagens@gmail.com");
		}
		else if (acordo == 2) {
			System.out.println("Problema seu!\nFaça o pix para 123viagens@gmail.com");
		}
		else {
			System.out.println("Opção Invalida!");
		}
		
	}

}
