public class Main {
    public static void main(String[] args) {
        var carro = new Carros();
        carro.name = "Civic";

        var modelo = new Carros();
        modelo.marca = "Honda - Ano 2026";

        System.out.printf("O nome e modelo do carro é: %s / %s", carro.name, modelo.marca);
    }
}
