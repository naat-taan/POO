public class Filho extends Pai {
    private String sexo;

    public Filho(String nome, String dataDeNascimento, String corCabelo, String corOlhos, Boolean alcoolismo, String sexo) {
        super(nome, dataDeNascimento, corCabelo, corOlhos, alcoolismo);
        this.sexo = "Masculino";
    }

    @Override
    public String toString() {
        return "Filho:\n" +
                "Nome: " + nome + '\n' +
                "Data de Nascimento: " + dataDeNascimento + '\n' +
                "Cor do Cabelo: " + corCabelo + '\n' +
                "Cor dos Olhos: " + corOlhos + '\n' +
                (alcoolismo ? "É alcoólatra" : "Não é alcoólatra") + '\n' +
                "Sexo: " + sexo;
    }
}