import java.util.Scanner;

public class PassoAPasso {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Primeiro passo ao acordar ?");
        String primeiroPasso = leitor.nextLine();

        System.out.println("Segundo passo ?");
        String segundoPasso = leitor.nextLine();

        System.out.println("Terceiro passo ?");
        String terceiroPasso = leitor.nextLine();

        System.out.println("Quarto passo ?");
        String quartoPasso = leitor.nextLine();

        System.out.println("Quinto passo ?");
        String quintoPasso = leitor.nextLine();

        leitor.close();

        System.out.println("Esses são meus passos ao acordar de manhã");
        System.out.println("1- " + primeiroPasso);
        System.out.println("2- " + segundoPasso);
        System.out.println("3- " + terceiroPasso);
        System.out.println("4- " + quartoPasso);
        System.out.println("5- " + quintoPasso);
        System.out.println("Fim");
    }
}
