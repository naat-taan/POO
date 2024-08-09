import java.util.Scanner;

public class LanHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.println("Digite o modelo do carro:");
        carro.modelo = scanner.nextLine();

        System.out.println("Digite a marca do carro:");
        carro.marca = scanner.nextLine();

        System.out.println("Digite a cor do carro:");
        carro.cor = scanner.nextLine();

        System.out.println("Digite o ano do carro:");
        carro.ano = scanner.nextInt();

        System.out.println("Seu carro é um "+carro.modelo+" "+carro.marca+" "+carro.cor+" "+carro.ano);

        if (!carro.ligado) {
            System.out.println("voce quer ligar o carro? (s/n)");
            char resposta = scanner.next().charAt(0);
            if (resposta == 's') {
                carro.ligar();
        }
        if (carro.ligado) {
            System.out.println("Você quer ativar o turbo? (s/n)");
            char resposta1 = scanner.next().charAt(0);
            if (resposta1 == 's') {
                carro.ativarTurbo();
            } else {
                System.out.println("Turbo não ativado.");
            }
        }
        if (carro.ligado) {
            System.out.println("Você quer acelerar o carro? (s/n)");
            char resposta2 = scanner.next().charAt(0);
            if (resposta2 == 's') {
                carro.acelerar();
            }
        }

        carro.desligar();
    }
}
}