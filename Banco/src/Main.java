import java.util.Scanner;

public class Main {
    private static Banco banco = new Banco();
    private static Cliente cliente;
    private static ContaBancaria conta;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            exibirMenuPrincipal();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastro(scanner);
                    break;
                case 2:
                    if (autenticar(scanner)) {
                        sacar(scanner);
                    }
                    break;
                case 3:
                    if (autenticar(scanner)) {
                        depositar(scanner);
                    }
                    break;
                case 4:
                    if (autenticar(scanner)) {
                        verificarSaldo();
                    }
                    break;
                case 5:
                    if (autenticar(scanner)) {
                        alterarInformacoesPessoais(scanner);
                    }
                    break;
                case 6:
                    System.out.println("Obrigado por utilizar o TomateBank. Até a próxima!");
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
        System.out.println("| Bem vindo/a ao TomateBank!  |");
        System.out.println("| O que deseja fazer?         |");
        System.out.println("+-----------------------------+");
        System.out.println("| 1. Cadastro                 |");
        System.out.println("| 2. Sacar                    |");
        System.out.println("| 3. Depositar                |");
        System.out.println("| 4. Verificar saldo          |");
        System.out.println("| 5. Alterar informações      |");
        System.out.println("| 6. Sair                     |");
        System.out.println("+-----------------------------+");
        System.out.print("\nEscolha uma opção: ");
    }

    private static void cadastro(Scanner scanner) {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        cliente = new Cliente(nome, cpf, senha);
        conta = new ContaBancaria(cliente, banco);
        System.out.println("Cadastro realizado com sucesso.");
    }

    private static boolean autenticar(Scanner scanner) {
        if (conta == null) {
            System.out.println("Nenhuma conta encontrada. Por favor, cadastre-se primeiro.");
            return false;
        }
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        if (cliente.getSenha().equals(senha)) {
            return true;
        } else {
            System.out.println("Senha incorreta.");
            return false;
        }
    }

    private static void sacar(Scanner scanner) {
        System.out.print("Digite o valor para sacar: ");
        double valor = scanner.nextDouble();
        conta.sacar(valor);
    }

    private static void depositar(Scanner scanner) {
        System.out.print("Digite o valor para depositar: ");
        double valor = scanner.nextDouble();
        conta.depositar(valor);
    }

    private static void verificarSaldo() {
        System.out.println("Seu saldo atual é de T$:" + conta.getSaldo());
    }

    private static void alterarInformacoesPessoais(Scanner scanner) {
        System.out.println("\n+-----------------------------+");
        System.out.println("| Alterar Informações Pessoais|");
        System.out.println("+-----------------------------+");
        System.out.println("| 1. Alterar Nome             |");
        System.out.println("| 2. Alterar CPF              |");
        System.out.println("| 3. Alterar Senha            |");
        System.out.println("+-----------------------------+");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                alterarNome(scanner);
                break;
            case 2:
                alterarCpf(scanner);
                break;
            case 3:
                alterarSenha(scanner);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void alterarNome(Scanner scanner) {
        System.out.print("Digite o novo nome: ");
        String nome = scanner.nextLine();
        cliente.setNome(nome);
        System.out.println("Nome atualizado com sucesso.");
    }

    private static void alterarCpf(Scanner scanner) {
        System.out.print("Digite o novo CPF: ");
        String cpf = scanner.nextLine();
        cliente.setCpf(cpf);
        System.out.println("CPF atualizado com sucesso.");
    }

    private static void alterarSenha(Scanner scanner) {
        System.out.print("Digite a nova senha: ");
        String senha = scanner.nextLine();
        cliente.setSenha(senha);
        System.out.println("Senha atualizada com sucesso.");
    }
}