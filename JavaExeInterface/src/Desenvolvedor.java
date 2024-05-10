public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome2, int matricula2, String[] tecnologias2) {
        super(nome2, matricula2, tecnologias2);
    }

    @Override
    public double calcularSalario() {
        return 3000;
    }

    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor " + nome + " está trabalhando.");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Desenvolvedor " + nome + " está relatando progresso.");
    }
}
