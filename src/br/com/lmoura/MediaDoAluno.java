package src.br.com.lmoura;

import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a primeira nota ?");
        double n1 = s.nextDouble();
        System.out.println("Digite a segunda nota ?");
        double n2 = s.nextDouble();
        System.out.println("Digite a terceira nota ?");
        double n3 = s.nextDouble();
        System.out.println("Digite a quarta nota ?");
        double n4 = s.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7) {
            System.out.println("Média = " + media + " Aluno Aprovado!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Média = " + media + " Aluno de Recuperação!");
        }else {
            System.out.println("Média = " + media + " Aluno Reprovado!");
        }
    }
}
