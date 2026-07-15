public class MainEncapsulamento {
    public static void main(String[] args) {
        var carro = new CarrosEncapsulamento("Civic do Vitao", "Honda Civic", "Preto Fosco");

        System.out.printf("O nome, modelo e cor do carro é: %s / %s / %s", carro.getName(), carro.getModelo(), carro.getCor());
    }
}
