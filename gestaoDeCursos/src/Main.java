import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Curso> cursos = new ArrayList<>();
    public static ArrayList<Professor> professores = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("|------------------------|");
            System.out.println("|1 - Listar professor    |");
            System.out.println("|2 - Adicionar professor |");
            System.out.println("|3 - Remover professor   |");
            System.out.println("|------------------------|");
            System.out.println("|0 - Sair                |");
            System.out.println("|------------------------|");
            System.out.println("    Escolha uma opção:    ");
            int opcao = scanner.nextInt();
            switch (opcao){
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
                    System.out.println("Sair do programa");
                    return;
            }
        }while (true);
    }

    public static void listarProfessor() {
        if (professores.isEmpty()){
            System.out.println("Nao tem professor cadastrado");
        }else {
            for (int i = 0; i < professores.size(); i++) {
                System.out.println(i+": "+professores.get(i));
            }
        }
    }
    public static void adicionarProfessor(Professor nome){
        professores.add(nome);
    }

    public static void removerProfessor(int indice) {
        if (indice >= 0 && indice < professores.size()) {
            Professor professorRemovido = professores.remove(indice);
            System.out.println("Professor removido: " + professorRemovido);
            // Decrementar o contador de ID
            Professor.decrementarContadorID();
        } else {
            System.out.println("Índice inválido. Nenhum professor removido.");
        }
    }
}