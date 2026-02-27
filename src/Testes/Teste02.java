package Testes;

import java.util.Scanner;

	//1. Dois números que somam alvo (array)

public class Teste02 {
	public void executar() {
		Scanner Ler = new Scanner (System.in);
		
		
		int[] nums;
		int target;
		
		System.out.println("Quantos números deseja digitar? ");
		int tamanho = Ler.nextInt();
		nums = new int[tamanho];
		for (int i = 0; i < nums.length; i++) {
		    System.out.println("Digite o número " + (i+1) + ": ");
		    nums[i] = Ler.nextInt();
		    while (nums[i] < 0) {
		        System.out.println("Número inválido! Digite um número positivo: ");
		        nums[i] = Ler.nextInt();
		    }
		} 
		System.out.println("Digite um valor inteiro como target: ");
		target = Ler.nextInt();
		while (target < 0) {
		    System.out.println("Número inválido! Digite um número positivo: ");
		    target = Ler.nextInt();
	    }
		boolean encontrou = false;

		for (int i = 0; i < nums.length && !encontrou; i++) {
		    for (int j = i+1; j < nums.length; j++) {
		        if (nums[i] + nums[j] == target) {
		            System.out.println("Índices: (" + i + ", " + j + ")");
		            encontrou = true;
		            break;
		        }
		    }
		}
	}
}
	