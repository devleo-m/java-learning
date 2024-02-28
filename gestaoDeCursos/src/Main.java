import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Curso> cursos = new ArrayList<>();
    public static ArrayList<Professor> professores = new ArrayList<>();

    public static void main(String[] args) {
        // Professores cadastrados por padrão
        cadastrarProfessoresPadrao();

        // Cursos cadastrados por padrão
        cadastrarCursosPadrao();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Escolha o que deseja administrar: (C)urso, (P)rofessor ou (S)air");
            String opcao = scanner.next().toLowerCase();

            switch (opcao) {
                case "c":
                    gerenciarCursos(scanner);
                    break;
                case "p":
                    gerenciarProfessores(scanner);
                    break;
                case "s":
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }

        } while (true);
    }

    private static void cadastrarProfessoresPadrao() {
        professores.add(new Professor("Fulano", "Java"));
        professores.add(new Professor("Ciclano", "Python"));
        professores.add(new Professor("Beltrano", "C++"));
    }

    private static void cadastrarCursosPadrao() {
        cursos.add(new Curso("Java", "Curso de Java", (byte) 90));
        cursos.add(new Curso("Python", "Curso de Python", (byte) 70));
        cursos.add(new Curso("C++", "Curso de C++", (byte) 40));
    }

    private static void gerenciarCursos(Scanner scanner) {
        boolean loopCursos = true;

        while (loopCursos) {
            exibirMenuCursos();

            int opcaoC = scanner.nextInt();

            switch (opcaoC) {
                case 1:
                    listarCursos();
                    break;
                case 2:
                    adicionarCurso(scanner);
                    break;
                case 3:
                    removerCurso(scanner);
                    break;
                case 4:
                    adicionarProfessorCurso(scanner);
                    break;
                case 5:
                    removerProfessorCurso(scanner);
                    break;
                case 0:
                    System.out.println("Sair do menu de administração de cursos");
                    loopCursos = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void exibirMenuCursos() {
        System.out.println("|------------------------------|");
        System.out.println("|1 - Listar Cursos             |");
        System.out.println("|2 - Adicionar Curso           |");
        System.out.println("|3 - Remover Curso             |");
        System.out.println("|4 - Adc professor ao Curso    |");
        System.out.println("|5 - Remover professor do Curso|");
        System.out.println("|------------------------------|");
        System.out.println("|0 - Sair                      |");
        System.out.println("|------------------------------|");
        System.out.println("Escolha uma opção: ");
    }

    private static void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado no momento!");
        } else {
            for (int i = 0; i < cursos.size(); i++) {
                System.out.println(i + ": " + cursos.get(i));
            }
        }
    }

    private static void adicionarCurso(Scanner scanner) {
        System.out.print("Digite o nome do curso para cadastrar: ");
        String nomeCurso = scanner.next() + scanner.nextLine();

        System.out.print("Descreva sobre o curso: ");
        String descCurso = scanner.next() + scanner.nextLine();

        System.out.println("Digite a carga horária do curso (1 a 100 horas): ");
        byte cargaHoraria = scanner.nextByte();

        if (cargaHoraria <= 100 && cargaHoraria >= 1) {
            Curso newCurso = new Curso(nomeCurso, descCurso, cargaHoraria);
            cursos.add(newCurso);
        } else {
            System.out.println("A carga horária deve ser no máximo 100 horas. Tente novamente.");
        }
    }

    private static void removerCurso(Scanner scanner) {
        System.out.println("Digite o índice do curso para remover: ");
        int indiceCursos = scanner.nextInt();

        if (indiceCursos >= 0 && indiceCursos < cursos.size()) {
            cursos.remove(indiceCursos);
        } else {
            System.out.println("Índice inválido!");
        }
    }

    private static void adicionarProfessorCurso(Scanner scanner) {
        listarProfessor();
        System.out.println("Digite o índice do professor para adicioná-lo ao curso: ");
        int indiceProfessorAdd = scanner.nextInt();

        if (indiceProfessorAdd >= 0 && indiceProfessorAdd < professores.size()) {
            listarCursos();
            System.out.println("Digite o índice do curso que deseja adicionar o professor: ");
            int indiceCurso = scanner.nextInt();

            if (indiceCurso >= 0 && indiceCurso < cursos.size()) {
                Professor professorParaAdicionar = professores.get(indiceProfessorAdd);
                cursos.get(indiceCurso).setProfessores(professorParaAdicionar);
                System.out.println("Professor adicionado com sucesso!");
            } else {
                System.out.println("Índice de curso inválido!");
            }
        } else {
            System.out.println("Índice de professor inválido!");
        }
    }

    private static void removerProfessorCurso(Scanner scanner) {
        // Criar remover professor do curso
    }

    private static void gerenciarProfessores(Scanner scanner) {
        boolean loopProfessores = true;

        while (loopProfessores) {
            exibirMenuProfessores();

            int opcaoP = scanner.nextInt();

            switch (opcaoP) {
                case 1:
                    listarProfessor();
                    break;
                case 2:
                    adicionarProfessor(scanner);
                    break;
                case 3:
                    removerProfessor(scanner);
                    break;
                case 0:
                    System.out.println("Sair do menu de administração de professores");
                    loopProfessores = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void exibirMenuProfessores() {
        System.out.println("|------------------------|");
        System.out.println("|1 - Listar professores  |");
        System.out.println("|2 - Adicionar professor |");
        System.out.println("|3 - Remover professor   |");
        System.out.println("|------------------------|");
        System.out.println("|0 - Sair                |");
        System.out.println("|------------------------|");
        System.out.println("Escolha uma opção: ");
    }

    private static void adicionarProfessor(Scanner scanner) {
        System.out.println("Digite o nome do professor para adicionar: ");
        String nome = scanner.next() + scanner.nextLine();

        System.out.println("Digite a especialidade do professor: ");
        String especialidade = scanner.next();

        Professor novoProfessor = new Professor(nome, especialidade);
        adicionarProfessor(novoProfessor);
    }

    private static void removerProfessor(Scanner scanner) {
        listarProfessor();
        System.out.println("Remover professor. Escolha o índice do professor: ");
        int indiceRemover = scanner.nextInt();
        removerProfessor(indiceRemover);
    }

    private static void listarProfessor() {
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado no momento!");
        } else {
            for (int i = 0; i < professores.size(); i++) {
                System.out.println(i + ": " + professores.get(i));
            }
        }
    }

    private static void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    private static void removerProfessor(int indice) {
        if (indice >= 0 && indice < professores.size()) {
            Professor professorRemovido = professores.remove(indice);
            System.out.println("Professor removido: " + professorRemovido);
        } else {
            System.out.println("Índice inválido. Nenhum professor removido.");
        }
    }
}
