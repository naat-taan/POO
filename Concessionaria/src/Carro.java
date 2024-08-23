public class Carro {
    public String modelo;
    public String marca;
    public String cor;
    public int ano;
    public boolean turbo;

    public boolean ligado = false;


    public void ligar() {
        if (ligado) {
            System.out.println("Seu "+modelo+" já está ligado.");
            return;
        }
        ligado = true;
        System.out.println("Seu "+modelo+" está ligado.");
    }
    public void desligar() {
        if (!ligado) {
            System.out.println("Seu carro já está desligado.");
            return;
        }
        ligado = false;
        System.out.println("Desligando carro...");
    }
    public void acelerar() {
        if (ligado) {
            System.out.println("Acelerando o carro...");
        } else {
            System.out.println("O carro está desligado. Não é possível acelerar.");
        }
        if (turbo) {
            System.out.println("VRUUUUUMMMM!!!!");
        }
    }
    public void ativarTurbo() {
        if (ligado) {
            turbo = true;
            System.out.println("Turbo ativado!");
        } else {
            System.out.println("O carro estava desligado. Seu carro explodiu.");
        }
    }
}