import java.util.Scanner;

public class Cliente {
    private static String usuario;
    private static String senha;

    public Cliente(String usuario, String senha) {
        Cliente.usuario = usuario;
        Cliente.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
    
    public void setUsuario() {
        System.out.println("Digite seu novo usuario:");
        Scanner scanner = new Scanner(System.in);
        Cliente.usuario = scanner.nextLine();
    }
}