import java.util.ArrayList;
import java.util.Scanner;

public class SistemaFuncionarios {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar funcionário");
            System.out.println("2. Remover funcionário");
            System.out.println("3. Exibir todos os funcionários");
            System.out.println("4. Buscar funcionário por nome ou matrícula");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarFuncionario(funcionarios, scanner);
                    break;
                case 2:
                    removerFuncionario(funcionarios, scanner);
                    break;
                case 3:
                    exibirFuncionarios(funcionarios);
                    break;
                case 4:
                    buscarFuncionario(funcionarios, scanner);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void adicionarFuncionario(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.println("Digite o tipo de funcionário (1-Gerente, 2-Desenvolvedor, 3-Estagiário):");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();
        System.out.println("Digite a matrícula do funcionário:");
        int matricula = scanner.nextInt();

        switch (tipo) {
            case 1:
                System.out.println("Digite o bônus anual do gerente:");
                double bonusAnual = scanner.nextDouble();
                funcionarios.add(new Gerente(nome, matricula, bonusAnual));
                break;
            case 2:
                System.out.println("Digite as tecnologias dominadas pelo desenvolvedor (separadas por vírgula):");
                scanner.nextLine();
                String tecnologias = scanner.nextLine();
                String[] tecnologiasArray = tecnologias.split(",");
                funcionarios.add(new Desenvolvedor(nome, matricula, tecnologiasArray));
                break;
            case 3:
                System.out.println("Digite o número de horas trabalhadas pelo estagiário:");
                int horasTrabalhadas = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o nome do supervisor do estagiário:");
                String supervisor = scanner.nextLine();
                funcionarios.add(new Estagiario(nome, matricula, horasTrabalhadas, supervisor));
                break;
            default:
                System.out.println("Tipo de funcionário inválido!");
        }

        System.out.println("Funcionário adicionado com sucesso!");
    }

    public static void removerFuncionario(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.println("Digite o nome ou a matrícula do funcionário que deseja remover:");
        String termoBusca = scanner.nextLine();

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.nome.equalsIgnoreCase(termoBusca)
                    || funcionario.matricula == Integer.parseInt(termoBusca)) {
                funcionarios.remove(funcionario);
                System.out.println("Funcionário removido com sucesso!");
                return;
            }
        }

        System.out.println("Funcionário não encontrado!");
    }

    public static void exibirFuncionarios(ArrayList<Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        System.out.println("Lista de funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.nome + " - Matrícula: " + funcionario.matricula + " - Salário: R$"
                    + funcionario.calcularSalario());
        }
    }

    public static void buscarFuncionario(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.println("Digite o nome ou a matrícula do funcionário que deseja buscar:");
        String termoBusca = scanner.nextLine();

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.nome.equalsIgnoreCase(termoBusca)
                    || funcionario.matricula == Integer.parseInt(termoBusca)) {
                System.out.println("Funcionário encontrado:");
                System.out.println(funcionario.nome + " - Matrícula: " + funcionario.matricula + " - Salário: R$"
                        + funcionario.calcularSalario());
                return;
            }
        }
        System.out.println("Funcionário não encontrado!");
    }
}
