import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        boolean running = true;

        while (running) {
            System.out.println("\nMenu do TomateBank:");
            System.out.println("1. Cadastro");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Verificar saldo");
            System.out.println("5. Alterar informações pessoais");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastro(scanner, banco);
                    break;
                case 2:
                    sacar(scanner);
                    break;
                case 3:
                    depositar(scanner, );
                    break;
                case 4:
                    verificarSaldo();
                    break;
                case 5:
                    alterarInformacoesPessoais(scanner);
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    public static void cadastro(Scanner scanner, Banco banco) {
        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (usuario.isEmpty() || senha.isEmpty()) {
            System.out.println("Usuário e senha não podem estar vazios.");
        }
        else {
            ContaBancaria cb = new ContaBancaria();
            Cliente cliente = new Cliente(usuario, senha);
            System.out.println("Cadastro realizado com sucesso.");
        }
    }

    public static void sacar(Scanner scanner){


        System.out.println("Saque realizado.");
    }

    public void depositar(Scanner scanner, ContaBancaria saldo) {
        System.out.println("Quantos Tomatecoins deseja depositar? ");
        ContaBancaria.saldo = scanner.nextFloat();

        System.out.println("Depósito realizado.");
    }

    public static void verificarSaldo() {
        System.out.println("Saldo verificado.");
    }

    public static void alterarInformacoesPessoais(Scanner scanner) {
        System.out.print("Digite o novo usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Digite a nova senha: ");
        String senha = scanner.nextLine();

        if (usuario.isEmpty() || senha.isEmpty()) {
            System.out.println("Usuário e senha não podem estar vazios.");
        }
        else {
            Cliente cliente = set Cliente(usuario, senha);
            System.out.println("Dados alterados com sucesso.");
        }
    }
}