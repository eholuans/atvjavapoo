package pooed;
import java.util.Scanner;

public class viagens {

	public static void main(String[] args) {
		//Variaveis 
		String nome;
		int op1, tipo, compA, op2, op3, classe, noites, ida, sovolta, idaevolta, multvalorp, acordo;
		double valor,valorp,valore, latam, gol, azul, ghd, trcer, abr, hrhny, tln;
		//Preço das passagens
		azul = 3500; gol= 4350.00; latam= 3700;
		//Hoteis 
		ghd = 1205; trcer = 2200; abr = 880;
		//Multiplicadores do valor total
		valor = 0;valorp = 0;valore = 0;noites = 0;multvalorp = 1;
		Scanner sc = new Scanner(System.in);
		// Cadastro inicio
		System.out.println("Insira seu nome:");
		nome = sc.nextLine();
		
		System.out.println("Bem vindo "+nome+" ao site 123 Viagens!\n\nEstamos prontos para transformar sua viagem em uma experiência única, cuidando de cada detalhe com dedicação. \nSeja qual for o destino, nossa missão é criar memórias inesquecíveis. Vamos juntos nessa aventura?");
		//Cadastro fim
		
		//Destino inicio
		System.out.println("Para qual destino você deseja viajar? \n(1) Dubai \n(2) Nova Iorque \n(3) Londres");
		op1 = sc.nextInt();
		if (op1 >3) {
			System.out.println("Destino Invalido!\nComece novamente");
			System.exit(0);
		}
		//Destino fim
		
		//Comp aerea inicio
		if (op1 == 1) {
			System.out.println("Seu destino é Dubai!\nEscolha a companhia aerea que você deseja voar:\n(1) Air France\n(2) Azul\n(3) Emirates");
				compA = sc.nextInt();
			if (compA == 1){
				System.out.println("Você escolheu a companhia Air France!\n Você deseja voar em qual classe?\n(1)Economica : R$"+azul+"\n(2)Executiva : R$"+(azul*1.25)+"\n(3)Primeira Classe : R$"+(azul*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += azul;}
				else if (classe == 2) {valorp += (azul*1.25);}
				else if (classe == 3) {valorp += (azul*1.5);}
				else {System.out.println("Classe invalida!");}
				}
			else if (compA == 2){
				System.out.println("Você escolheu a companhia Azul!\n Você deseja voar em qual classe?\n(1)Economica : R$"+gol+"\n(2)Executiva : R$"+(gol*1.25)+"\n(3)Primeira Classe : R$"+(gol*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += gol;}
				else if (classe == 2) {valorp += (gol*1.25);}
				else if (classe == 3) {valorp += (gol*1.5);}
				else {System.out.println("Classe invalida!");}
				}
			else if (compA == 3){
				System.out.println("Você escolheu a companhia Emirates!\n Você deseja voar em qual classe?\n(1)Economica : R$"+latam+"\n(2)Executiva : R$"+(latam*1.25)+"\n(3)Primeira Classe : R$"+(latam*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += latam;}
				else if (classe == 2) {valorp += (latam*1.25);}
				else if (classe == 3) {valorp += (latam*1.5);}
				else {System.out.println("Classe invalida!");}
				}
		}
		else if (op1 == 2) {
			System.out.println("Seu destino é Nova Iorque!\nEscolha a companhia aerea que você deseja voar:\n(1) Gol\n(2) Azul\n(3) American Airlines");
			compA = sc.nextInt();
			if (compA == 1){
				System.out.println("Você escolheu a companhia Gol!\n Você deseja voar em qual classe?\n(1)Economica : R$"+azul+"\n(2)Executiva : R$"+(azul*1.25)+"\n(3)Primeira Classe : R$"+(azul*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += azul;}
				else if (classe == 2) {valorp += (azul*1.25);}
				else if (classe == 3) {valorp += (azul*1.5);}
				else {System.out.println("Classe invalida!");}
			}
			else if (compA == 2){
				System.out.println("Você escolheu a companhia Azul!\n Você deseja voar em qual classe?\n(1)Economica : R$"+gol+"\n(2)Executiva : R$"+(gol*1.25)+"\n(3)Primeira Classe : R$"+(gol*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += gol;}
				else if (classe == 2) {valorp += (gol*1.25);}
				else if (classe == 3) {valorp += (gol*1.5);}
				else {System.out.println("Classe invalida!");}
			}
			else if (compA == 3){
				System.out.println("Você escolheu a companhia American Airlines!\n Você deseja voar em qual classe?\n(1)Economica : R$"+latam+"\n(2)Executiva : R$"+(latam*1.25)+"\n(3)Primeira Classe : R$"+(latam*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += latam;}
				else if (classe == 2) {valorp += (latam*1.25);}
				else if (classe == 3) {valorp += (latam*1.5);}
				else {System.out.println("Classe invalida!");}
			}
		}
		else if (op1 == 3) {
			System.out.println("Seu destino é Londres!\nEscolha a companhia aerea que você deseja voar:\n(1) Latam\n(2) British Airways\n(3) KLM");
			compA = sc.nextInt();
			if (compA == 1){
				System.out.println("Você escolheu a companhia Latam!\n Você deseja voar em qual classe?\n(1)Economica : R$"+azul+"\n(2)Executiva : R$"+(azul*1.25)+"\n(3)Primeira Classe : R$"+(azul*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += azul;}
				else if (classe == 2) {valorp += (azul*1.25);}
				else if (classe == 3) {valorp += (azul*1.5);}
				else {System.out.println("Classe invalida!");}
			}
			else if (compA == 2){
				System.out.println("Você escolheu a companhia British Airways!\n Você deseja voar em qual classe?\n(1) Economica : R$"+gol+"\n(2) Executiva : R$"+(gol*1.25)+"\n(3) Primeira Classe : R$"+(gol*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += gol;}
				else if (classe == 2) {valorp += (gol*1.25);}
				else if (classe == 3) {valorp += (gol*1.5);}
				else {System.out.println("Classe invalida!");}
			}
			else if (compA == 3){
				System.out.println("Você escolheu a companhia KLM!\n Você deseja voar em qual classe?\n(1) Economica : R$"+latam+"\n(2) Executiva : R$"+(latam*1.25)+"\n(3) Primeira Classe : R$"+(latam*1.5));
				classe = sc.nextInt();
				if (classe == 1) {valorp += latam;}
				else if (classe == 2) {valorp += (latam*1.25);}
				else if (classe == 3) {valorp += (latam*1.5);}
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
				System.out.println("Escolha seu hotel em Nova Iorque:\n(1) Hard Rock Hotel - Menor preço: R$ "+ghd+"\n(2) The Plaza - Menor preço: R$ "+abr+"\n(3) The Ritz-Carlton Central Park - Menor preço: R$ "+trcer);
				op2 = sc.nextInt();
				if (op2 == 1) {
					System.out.println("Você escolheu o hotel Hard Rock Hotel! Estas são nossas opções de quartos:\n(1) Quarto basico: R$ "+ghd+"\n(2) Suite Deluxe: R$ "+(ghd*1.5)+"\n(3) Cobertura: R$ "+(ghd*3));
					op3 = sc.nextInt();
					if (op3 == 1) {valore += ghd;}
					else if (op3 == 2) {valore += (ghd*1.5);}
					else if (op3 == 3) {valore += (ghd*3);}
					else {System.out.println("Tipo de quarto invalido!");}
				}
				else if (op2 == 2) {
					System.out.println("Você escolheu o hotel The Plaza! Estas são nossas opções de quartos:\n(1) Quarto basico: R$ "+abr+"\n(2) Suite Deluxe: R$ "+(abr*1.5)+"\n(3) Cobertura: R$ "+(abr*3));
					op3 = sc.nextInt();
					if (op3 == 1) {valore += abr;}
					else if (op3 == 2) {valore += (abr*1.5);}
					else if (op3 == 3) {valore += (abr*3);}
					else {System.out.println("Tipo de quarto invalido!");}
				}
				else if (op2 == 3) {
					System.out.println("Você escolheu o hotel The Ritz-Carlton Central Park! Estas são nossas opções de quartos:\n(1) Quarto basico: R$ "+trcer+"\n(2) Suite Deluxe: R$ "+(trcer*1.5)+"\n(3) Cobertura: R$ "+(trcer*3));
					op3 = sc.nextInt();
					if (op3 == 1) {valore += trcer;}
					else if (op3 == 2) {valore += (trcer*1.5);}
					else if (op3 == 3) {valore += (trcer*3);}
					else {System.out.println("Tipo de quarto invalido!");}
				}
		}
		else if (op1 == 3) {
			System.out.println("Escolha seu hotel em Londres:\n(1) The Lanesborough - Menor preço: R$ "+ghd+"\n(2) The Milestone Hotel - Menor preço: R$ "+abr+"\n(3) The Ritz-Carlton London - Menor preço: R$ "+trcer);
			op2 = sc.nextInt();
			if (op2 == 1) {
				System.out.println("Você escolheu o hotel The Lanesborough! Estas são nossas opções de quartos:\n(1) Quarto basico: R$ "+ghd+"\n(2) Suite Deluxe: R$ "+(ghd*1.5)+"\n(3) Cobertura: R$ "+(ghd*3));
				op3 = sc.nextInt();
				if (op3 == 1) {valore += ghd;}
				else if (op3 == 2) {valore += (ghd*1.5);}
				else if (op3 == 3) {valore += (ghd*3);}
				else {System.out.println("Tipo de quarto invalido!");}
			}
			else if (op2 == 2) {
				System.out.println("Você escolheu o hotel The Milestone Hotel! Estas são nossas opções de quartos:\n(1) Quarto basico: R$ "+abr+"\n(2) Suite Deluxe: R$ "+(abr*1.5)+"\n(3) Cobertura: R$ "+(abr*3));
				op3 = sc.nextInt();
				if (op3 == 1) {valore += abr;}
				else if (op3 == 2) {valore += (abr*1.5);}
				else if (op3 == 3) {valore += (abr*3);}
				else {System.out.println("Tipo de quarto invalido!");}
			}
			else if (op2 == 3) {
				System.out.println("Você escolheu o hotel The Ritz-Carlton London! Estas são nossas opções de quartos:\n(1) Quarto basico: R$ "+trcer+"\n(2) Suite Deluxe: R$ "+(trcer*1.5)+"\n(3) Cobertura: R$ "+(trcer*3));
				op3 = sc.nextInt();
				if (op3 == 1) {valore += trcer;}
				else if (op3 == 2) {valore += (trcer*1.5);}
				else if (op3 == 3) {valore += (trcer*3);}
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
			System.out.println("Problema seu, seu liso!\nFaça o pix para 123viagens@gmail.com");
		}
		else {
			System.out.println("Opção Invalida!");
		}
		
	}

}
