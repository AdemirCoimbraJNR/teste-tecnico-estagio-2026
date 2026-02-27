package Testes;
import java.util.Scanner;

public class MainTeste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 int opcao;

		 do {
		 System.out.println("\nSelecione um teste para executar (1 a 3) ou 0 para sair:");
		 opcao = scanner.nextInt();
		 scanner.nextLine();
		 switch (opcao) {
		 case 1:
		 new Teste01().executar();
		 break;
		 case 2:
		 new Teste02().executar();
		 break;
		 case 3:
		 new Teste03().executar();
		 break;
		 case 0:
		 System.out.println("Saindo...");
		 break;
		 default:
		 System.out.println("Opção inválida! Tente novamente.");
		 }
		 } while (opcao != 0);

		 scanner.close();

	}

}