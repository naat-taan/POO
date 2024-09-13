import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            exibirMenuPrincipal();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    criarFilho(scanner);
                    break;
                case 2:
                    criarFilha(scanner);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\n+-----------------------------+");
        System.out.println("| 1. Cadastro Filho           |");
        System.out.println("| 2. Cadastro Filha           |");
        System.out.println("+-----------------------------+");
        System.out.print("\nEscolha uma opção: ");
    }

    private static void criarFilho(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataDeNascimento = scanner.nextLine();
        System.out.print("Cor do Cabelo: ");
        String corCabelo = scanner.nextLine();
        System.out.print("Cor dos Olhos: ");
        String corOlhos = scanner.nextLine();
        System.out.print("É alcoólatra? (s/n): ");
        String resposta = scanner.nextLine();
        Boolean alcoolismo = resposta.equalsIgnoreCase("s");
        Filho filho = new Filho(nome, dataDeNascimento, corCabelo, corOlhos, alcoolismo, "Masculino");
        System.out.println("Filho criado: " + filho);
    }

    private static void criarFilha(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataDeNascimento = scanner.nextLine();
        System.out.print("Cor do Cabelo: ");
        String corCabelo = scanner.nextLine();
        System.out.print("Cor dos Olhos: ");
        String corOlhos = scanner.nextLine();
        System.out.print("Alcoolismo (true/false): ");
        Boolean alcoolismo = scanner.nextBoolean();
        scanner.nextLine(); // Consumir a nova linha
        Filha filha = new Filha(nome, dataDeNascimento, corCabelo, corOlhos, alcoolismo, "Feminino");
        System.out.println("Filha criada: " + filha);
    }
}
