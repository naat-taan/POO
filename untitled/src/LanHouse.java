import java.util.Scanner;

public class LanHouse {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro);

        carro.modelo = "Mustang";
        carro.marca = "Ford";
        carro.cor = "Vermelho";
        carro.ano = 2022;

        carro.ligar();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Você quer ativar o turbo? (s/n)");
        char resposta = scanner.next().charAt(0);
        if (resposta == 's') {
            carro.ativarTurbo();
        } else {
            System.out.println("Turbo não ativado.");
        }

        carro.acelerar();
        carro.desligar();
    }
}