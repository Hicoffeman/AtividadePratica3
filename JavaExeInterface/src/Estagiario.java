public class Estagiario extends Funcionario {
    public Estagiario(String nome3, int matricula3, int horasTrabalhadas3, String supervisor3) {
        super(nome3, matricula3, horasTrabalhadas3, supervisor3);
    }

    @Override
    public double calcularSalario() {

        return 1000;
    }

    @Override
    public void trabalhar() {
        System.out.println("Estagiário " + nome + " está trabalhando.");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Estagiário " + nome + " está relatando progresso.");
    }
}
