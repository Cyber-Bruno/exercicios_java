import java.util.Scanner;

public class BoasVindas {
	
	public static void main(String[] args) {
		
		String nome, cidade;
		int idade;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leitor.next(); 
		//leitor.next(); -> Para String
		
			System.out.println("Boas Vindas, "+nome);
		
		System.out.println("Digite seu idade: ");
		idade = leitor.nextInt(); 
		//leitor.nextInt(); -> Para int
		 
		System.out.println("Digite o nome da cidade aonde mora: ");
		cidade = leitor.next();
		
			System.out.println(nome+" tem "+idade+" anos e mora na cidade "+cidade);
}

	
	}
