import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("    Escolha uma opção:    ");
            System.out.println("-------------------------|");
            System.out.println("|1 - Listar professor    |");
            System.out.println("|2 - Adicionar professor |");
            System.out.println("|3 - Remover professor   |");
            System.out.println("|------------------------|");
            System.out.println("|0 - Sair                |");
            System.out.println("|------------------------|");
            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("listar o professor");
                    break;
                case 2:
                    System.out.println("Adicionar professor");
                    break;
                case 3:
                    System.out.println("Remover professor");
                    break;
                case 0:
                    System.out.println("Sair do programa");
                    return;
            }
        }while (true);
    }

    public void listarProfessor(){
        for (int i = 0; i < Curso.getProfessores; i++) {

        }
    }
}