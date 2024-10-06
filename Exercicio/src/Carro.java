/**
 * @author Lougans
 * 
 * Classe que representa um Carro
 * Carro e automovel que tem como retorno o nome da fabricante, modelo, ano de favricação e cor
 */

public class Carro {
    private String modelo;
    private String nomeMontadora;
    private int anoDeFabricacao;
    private String cor;

    
    public Carro(String modelo, String nomeMontadora, int anoDeFabricacao, String cor) {
        this.modelo = modelo;
        this.nomeMontadora = nomeMontadora;
        this.anoDeFabricacao = anoDeFabricacao;
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getNomeMontadora() {
        return nomeMontadora;
    }
    public void setNomeMontadora(String nomeMontadora) {
        this.nomeMontadora = nomeMontadora;
    }
    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }
    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
}
