package src.br.com.lmoura;

public class PessoaFisica extends Pessoa{
    private String cpf;
    private String dataNascimento;

    public PessoaFisica(String nome, String endereco, String telefone, String email, String cpf, String dataNascimento ) {
        super(nome, endereco, telefone, email);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Pessoa Física: " + getNome() + ", CPF: " + cpf);
    }
}
