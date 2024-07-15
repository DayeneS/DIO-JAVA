// iPhone.java
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;

    public iPhone(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música no iPhone " + modelo);
        // Lógica para tocar música
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o iPhone " + modelo);
        // Lógica para ligar o iPhone
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o iPhone " + modelo);
        // Lógica para desligar o iPhone
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero + " com o iPhone " + modelo);
        // Lógica para fazer uma chamada telefônica
    }

    @Override
    public void navegar(String url) {
        System.out.println("Navegando para " + url + " com o iPhone " + modelo);
        // Lógica para navegar na internet
    }
}
