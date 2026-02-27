package Testes;

import java.util.Scanner;

	//1. Agrupar e contar (string)

public class Teste01 {
	public void executar() {
		Scanner Ler = new Scanner (System.in);
		
		
		String s;
		char letraAtual,melhorLetra;
		int contadorAtual=1 , maiorContador=1;
		
		System.out.println ("Digite uma sequência qualquer de caracteres: ");
		s = Ler.nextLine();
		
		melhorLetra=s.charAt(0);
		
		for (int i = 1; i < s.length(); i++) {
		    letraAtual = s.charAt(i);
		    if (letraAtual == s.charAt(i-1)) {
		        contadorAtual++;
		        if (contadorAtual > maiorContador) {
		            maiorContador = contadorAtual;
		            melhorLetra = letraAtual;
		        }
		    } else {
		        contadorAtual = 1;
		    }
		}
			System.out.println ("A letra \"" +melhorLetra+ "\" teve a maior sequência. Sequência: " +maiorContador);
		}
	}