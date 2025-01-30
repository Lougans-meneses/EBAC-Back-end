package src.br.com.lmoura;

import java.util.*;

public class TarefaColecoes {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        ordenarNomes(leitura);
        separarPorSexo(leitura);

    }

    public static void ordenarNomes(Scanner leitura) {
        System.out.println("Digite alguns nomes separados por vírgula:");
        String nomes = leitura.nextLine();

        String[] linhaDeNomes = nomes.split(",");
        List<String> colecaoDeNomes = new ArrayList<>();

        for (String nome : linhaDeNomes) {
            colecaoDeNomes.add(nome.trim());
        }

        Collections.sort(colecaoDeNomes);

        System.out.println("\nNomes ordenados:");
        for (String nome : colecaoDeNomes) {
            System.out.println(nome);
        }
    }

    public static void separarPorSexo(Scanner leitura) {
        System.out.println("\nDigite nomes e sexos no formato Nome-Sexo, separados por vírgula:");
        System.out.println("Exemplo: João-M, Maria-F, Pedro-M, Ana-F");
        String entrada = leitura.nextLine();

        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        String[] pares = entrada.split(",");

        for (String par : pares) {
            String[] partes = par.trim().split("-");

            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase();

                if (sexo.equals("M")) {
                    masculinos.add(nome);
                } else if (sexo.equals("F")) {
                    femininos.add(nome);
                }
            }
        }

        System.out.println("\nMasculinos: " + String.join(", ", masculinos));
        System.out.println("Femininos: " + String.join(", ", femininos));
    }
}
