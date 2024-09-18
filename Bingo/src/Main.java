import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bingo bingo = new Bingo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos jogadores?");
        int numJogadores = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= numJogadores; i++) {
            System.out.println("Nome do jogador " + i + ":");
            String nome = scanner.nextLine();
            Cartela cartela = new Cartela(nome);
            bingo.adicionarJogador(cartela);
            cartela.imprimirCartela();
        }

        bingo.jogar(scanner);
    }
}