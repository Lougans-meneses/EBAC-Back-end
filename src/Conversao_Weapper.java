import java.util.Scanner;

public class Conversao_Weapper {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento ?");
        int anoNascimento = leitura.nextInt();
        Byte conversaoAnoNascimento = (byte) anoNascimento;
        System.out.println(conversaoAnoNascimento);
    }
}
