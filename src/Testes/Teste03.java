package Testes;

import java.util.Scanner;

//3. Ordenação (array)

public class Teste03 {
    public void executar() {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Quantos nomes deseja digitar? ");
        int tamanho = Ler.nextInt();
        Ler.nextLine();
        String[] nomes = new String[tamanho];

        // leitura dos nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome " + (i+1) + ": ");
            nomes[i] = Ler.nextLine();
        }

        // ordenação bubble sort
        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = 0; j < nomes.length - 1; j++) {
                String[] partesJ = nomes[j].split(" ");
                String sobrenomeJ = partesJ[partesJ.length - 1];

                String[] partesJ1 = nomes[j+1].split(" ");
                String sobrenomeJ1 = partesJ1[partesJ1.length - 1];

                if (sobrenomeJ.compareTo(sobrenomeJ1) > 0) {
                    String temp = nomes[j];
                    nomes[j] = nomes[j+1];
                    nomes[j+1] = temp;
                } else if (sobrenomeJ.equals(sobrenomeJ1)) {
                    String primeiroNomeJ = partesJ[0];
                    String primeiroNomeJ1 = partesJ1[0];
                    if (primeiroNomeJ.compareTo(primeiroNomeJ1) > 0) {
                        String temp = nomes[j];
                        nomes[j] = nomes[j+1];
                        nomes[j+1] = temp;
                    }
                }
            }
        }

        // impressão dos nomes ordenados
        System.out.println("\nNomes ordenados:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}

/*Ana Lima
João Pereira
João Silva
Maria Silva
Ana Souza*/