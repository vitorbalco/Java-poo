public class CarrosEncapsulamento {

    private String name;
    private String modelo;
    private String cor;


    public CarrosEncapsulamento(String name, String modelo, String cor) {
        this.name = name;
        this.modelo = modelo;
        this.cor = cor;
    }
    public String getName() {
        return name;
    }

    public String getModelo() {
        return modelo;
    }


    public String getCor() {
        return cor;
    }


}
