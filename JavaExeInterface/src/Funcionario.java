public abstract class Funcionario {
    protected String nome;
    protected int matricula;
    protected int horasTrabalhadas;
    protected String supervisor;
    protected double bonusAnual;
    protected String[] tecnologias;

    public Funcionario(String nome, int matricula, double bonusAnual) {
        this.nome = nome;
        this.matricula = matricula;
        this.bonusAnual = bonusAnual;
    }

    public Funcionario(String nome2, int matricula2, String[] tecnologias2) {
        this.nome = nome2;
        this.matricula = matricula2;
        this.tecnologias = tecnologias2;
    }

    public Funcionario(String nome3, int matricula3, int horasTrabalhadas3, String supervisor3) {
        this.nome = nome3;
        this.matricula = matricula3;
        this.horasTrabalhadas = horasTrabalhadas3;
        this.supervisor = supervisor3;
    }

    public abstract double calcularSalario();

    public abstract void trabalhar();

    public abstract void relatarProgresso();
}
