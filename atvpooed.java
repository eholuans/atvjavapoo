package atvpooed;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
public class atv1 {
	public static void main(String[] args) {
		String nome, email, senha;
		int op1, op2, op3;
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter dia = DateTimeFormatter.ofPattern("dd"); String formattedDia = myDateObj.format(dia);
		DateTimeFormatter mes = DateTimeFormatter.ofPattern("MM"); String formattedMes = myDateObj.format(mes);
		int dianovo = Integer.parseInt(formattedDia);
		int mesnovo = Integer.parseInt(formattedMes);
		Scanner sc = new Scanner(System.in);
	    StringBuilder mensagem = new StringBuilder();

	    nome = JOptionPane.showInputDialog("Bem vindo a Nada Viagens!\n Digite seu nome para o cadastro:");
	    email = JOptionPane.showInputDialog("Agora digite seu e-mail para o cadastro:");
	    senha = JOptionPane.showInputDialog("Agora digite sua senha para o cadastro:");
//	    ifs e elses pra caso de erro ou aprovação
	    if (nome.length() == 0) {
	    	mensagem.append("Cadastro invalido!\n Você deixou um ou mais campos em branco.");
	    	}
	    else if (email.length() == 0) {
	    	mensagem.append("Cadastro invalido!\n Você deixou um ou mais campos em branco.");
	    	}
	    else if (senha.length() == 0) {
	    	mensagem.append("Cadastro invalido!\n Você deixou um ou mais campos em branco.");
	    	}
	    else {
	    	mensagem.append("Bem-vindo ").append(nome).append(", seu cadastro foi realizado com sucesso!");
	    	}
	    JOptionPane.showMessageDialog(null, mensagem);
	    System.out.println("Para qual destino você deseja viajar? \n(1) Dubai \n(2) Denver\n(3) Houston \n(4) Nova Iorque \n(5) Londres\n(6) Los Angeles\n(7) Miami \n(8) Pheonix \n(9) San Francisco \n(10) Washington DC");
	    op1 = sc.nextInt();
	    System.out.println("Para qual data?\n" + formattedDia+"/"+formattedMes+"/2024");
	    System.out.println((dianovo + 1)+"/"+formattedMes+"/2024");
	    System.out.println((dianovo + 2)+"/"+formattedMes+"/2024");
	    System.out.println((dianovo + 3)+"/"+formattedMes+"/2024");
	    System.out.println((dianovo + 4)+"/"+formattedMes+"/2024");
	    System.out.println((dianovo + 5)+"/"+formattedMes+"/2024");
	    System.out.println((dianovo + 6)+"/"+formattedMes+"/2024");
	    
	}

}
