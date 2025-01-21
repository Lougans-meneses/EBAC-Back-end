package src.br.com.lmoura;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ColecoesParte2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFemininno = new ArrayList<>();

        String continuar;

        do {
            System.out.println("Digite seu nome ?");
            String nome = leitura.nextLine();

            System.out.println("Digite seu sexo (M/F) ?");
            String sexo = leitura.nextLine().toUpperCase();

            if (sexo.equals("M")) {
                grupoMasculino.add(nome);
            } else if (sexo.equals("F")) {
                grupoFemininno.add(nome);
            } else {
                System.out.println("Informações incompletas!");
            }
            System.out.println("Deseja adicionar outra pessoa ? (S/N): ");
            continuar = leitura.nextLine().toUpperCase();
        } while ("S".equals(continuar));

        System.out.println("Grupo masculino: " + grupoMasculino);
        System.out.println("Grupo Feminino: " + grupoFemininno);
    }
}
