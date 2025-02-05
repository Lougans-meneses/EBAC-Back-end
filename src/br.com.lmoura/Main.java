package src.br.com.lmoura;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Carlos Silva", "Rua A, 123", "11987654321", "carlos@email.com", "123.456.789-00", "01/01/1980");
        PessoaJuridica pj = new PessoaJuridica("Empresa X", "Avenida B, 456", "1133344555", "contato@empresa.com", "12.345.678/0001-99", "Empresa X LTDA");

        pf.exibirInformacoes();
        pj.exibirInformacoes();
    }
}
