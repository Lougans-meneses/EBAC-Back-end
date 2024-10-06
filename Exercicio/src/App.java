public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro("Gol", "Volkiswagen", 2015, "preto");

        System.out.println("Informações sobre o carro");
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Marca: " + carro1.getNomeMontadora());
        System.out.println("Ano de Fabricação: " + carro1.getAnoDeFabricacao());
        System.out.println("Cor: " + carro1.getCor());

        System.out.println("******************************");

        Carro carro2 = new Carro("New Tucson", "Hyundai", 2020, "Cinza");

        System.out.println("Informações sobre o carro");
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Marca: " + carro2.getNomeMontadora());
        System.out.println("Ano de Fabricação: " + carro2.getAnoDeFabricacao());
        System.out.println("Cor: " + carro2.getCor());
    }
}
