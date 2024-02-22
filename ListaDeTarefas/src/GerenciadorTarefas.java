import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {
    static ArrayList<String> tarefas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void adicionarTarefa(){
        String value = scanner.next();
        tarefas.add(value);
    }
    public static void exibirTarefa(){
        if (tarefas.isEmpty()){
            System.out.println("A lista esta vazia");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println(i+": "+tarefas.get(i));
            }
        }
    }
    public static void removerTarefa() {
        exibirTarefa();

        if (!tarefas.isEmpty()){
            System.out.print("Digite o numero da tarefa p/ ser removida: ");
            int numTarefa = scanner.nextInt();

            if (numTarefa > 0 && numTarefa <= tarefas.size()){
                String tarefaRemovida = tarefas.remove(numTarefa - 1);
                System.out.println("Tarefa \"" + tarefaRemovida + "\" removida com sucesso!");
            } else {
                System.out.println("Número de tarefa inválido.");
            }
        }
    }
}
