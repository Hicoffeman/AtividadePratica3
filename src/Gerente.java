public class Gerente extends Funcionario {

    public Gerente(String nome, int matricula, double bonusAnual) {
        super(nome, matricula, bonusAnual);

    }

    @Override
    public double calcularSalario() {

        return 5000 + bonusAnual;
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerente " + nome + " está trabalhando.");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Gerente " + nome + " está relatando progresso.");
    }
}
