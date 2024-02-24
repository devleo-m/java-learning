import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Curso> cursos = new ArrayList<>();
    public static ArrayList<Professor> professores = new ArrayList<>();

    public static void main(String[] args) {
        //Professores cadastrados por padrao
        professores.add(new Professor("Fulano", "Java"));
        professores.add(new Professor("Ciclano", "Python"));
        professores.add(new Professor("Beltrano", "C++"));
        //cursos cadastrados por padrao
        cursos.add(new Curso("Java","Curso de java", (byte) 90));
        cursos.add(new Curso("Python","Curso de Python", (byte) 70));
        cursos.add(new Curso("C++","Curso de C++", (byte) 40));
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Voce deseja administrar (c)urso ou (p)rofessor?");
            System.out.println("Digite `c` ou `p` ");
            System.out.println("Caso deseje (S)air digite `s`");
            String opcao = scanner.next();
            switch (opcao){
                case "c":
                    boolean loopC = true;
                    while (loopC) {
                        System.out.println("|--------------------------|");
                        System.out.println("|1 - Listar Cursos         |");
                        System.out.println("|2 - Adicionar Curso       |");
                        System.out.println("|3 - Remover Curso         |");
                        System.out.println("|4 - Adc professor ao Curso|");
                        System.out.println("|--------------------------|");
                        System.out.println("|0 - Sair                  |");
                        System.out.println("|--------------------------|");
                        System.out.println("    Escolha uma opção:      ");
                        int opcaoC = scanner.nextInt();
                        switch (opcaoC) {
                            case 1:
                                listarCurso();
                                break;
                            case 2:
                                adicionarCurso();
                                break;
                            case 3:
                                removerCurso();
                                break;
                            case 4:
                                addProfessorCurso();
                                break;
                            case 0:
                                System.out.println("Sair do adm cursos");
                                loopC = false;
                                break;
                            default:
                                System.out.println("Valor invalido!");
                        }
                    }
                    break;
                case "p":
                    boolean loopP = true;
                    while (loopP){
                        System.out.println("|------------------------|");
                        System.out.println("|1 - Listar professor    |");
                        System.out.println("|2 - Adicionar professor |");
                        System.out.println("|3 - Remover professor   |");
                        System.out.println("|------------------------|");
                        System.out.println("|0 - Sair                |");
                        System.out.println("|------------------------|");
                        System.out.println("    Escolha uma opção:    ");
                        int opcaoP = scanner.nextInt();
                        switch (opcaoP){
                            case 1:
                                System.out.println("listar os professores");
                                listarProfessor();
                                break;
                            case 2:
                                System.out.println("Digite o nome do professor para adicionar: ");
                                String nome = scanner.next();
                                nome += scanner.nextLine();
                                System.out.println("Digite a especialidade do professor: ");
                                String espec = scanner.next();
                                Professor prof = new Professor(nome, espec);
                                adicionarProfessor(prof);
                                break;
                            case 3:
                                listarProfessor();
                                System.out.println("Remover professor. Escolha o índice do professor:");
                                int indiceRemover = scanner.nextInt();
                                removerProfessor(indiceRemover);
                                break;
                            case 0:
                                System.out.println("Sair do adm professor");
                                loopP = false;
                                break;
                            default:
                                System.out.println("Valor invalido!");
                        }
                    }
                    break;
                case "s":
                    return;
                default:
                    System.out.println("Valor invalido, tente novamente!");
            }
        }while(true);
    }
    //--------------------------------------------------------------------//
    //METODO LISTAR CURSOS!
    public static void listarCurso(){
        if (cursos.isEmpty()){
            System.out.println("Nenhum curso cadastrado no momento!");
        }else {
            for (int i = 0; i < cursos.size(); i++) {
                System.out.println(i+": "+cursos.get(i));
            }
        }
    }
    //METODO ADICIONAR CURSOS!
    public static void adicionarCurso(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do curso para cadastrar: ");
        String nomeCurso = scanner.next();
        nomeCurso += scanner.nextLine();
        System.out.print("Descreva sobre o curso: ");
        String descCurso = scanner.next();
        descCurso += scanner.nextLine();
        System.out.println("Digite a carga horaria do curso: ");
        System.out.println("ATENCAO: A carga horaria deve ter no maximo 100hrs");
        byte cargaHoraria = scanner.nextByte();
        if (cargaHoraria<=100 && cargaHoraria>=1){
            Curso newCurso = new Curso(nomeCurso,descCurso,cargaHoraria);
            cursos.add(newCurso);
        }
        else {
            System.out.println("A carga horaria tem que ser no maximo 100hrs");
            System.out.println("tente novamente :)");
        }
    }
    // METODO REMOVER CURSO!!!
    public static void removerCurso(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o indice do curso para remover");
        int indiceCursos = scanner.nextInt();
        if (indiceCursos >= 0 && indiceCursos < cursos.size() ){
            cursos.remove(indiceCursos);
        }else {
            System.out.println("Indice invalido!");
        }
    }

    public static void addProfessorCurso() {
        Scanner scanner = new Scanner(System.in);
        listarProfessor();
        System.out.println("Digite o índice do professor para adicioná-lo ao curso");
        int indiceProfessorAdd = scanner.nextInt();
        if (indiceProfessorAdd >= 0 && indiceProfessorAdd < professores.size()) {
            listarCurso();
            System.out.println("Digite o índice do curso que deseja adicionar o professor");
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

    //--------------------------------------------------------------------//
    // METODO LISTAR PROFESSOR!!!
    public static void listarProfessor() {
        if (professores.isEmpty()){
            System.out.println("Nao tem professor cadastrado");
        }else {
            for (int i = 0; i < professores.size(); i++) {
                System.out.println(i+": "+professores.get(i));
            }
        }
    }

    //METODO ADICIONAR PROFESSOR
    public static void adicionarProfessor(Professor nome){
        professores.add(nome);
    }

    //METODO REMOVER PROFESSOR
    public static void removerProfessor(int indice) {
        if (indice >= 0 && indice < professores.size()) {
            Professor professorRemovido = professores.remove(indice);
            System.out.println("Professor removido: " + professorRemovido);
        } else {
            System.out.println("Índice inválido. Nenhum professor removido.");
        }
    }
}