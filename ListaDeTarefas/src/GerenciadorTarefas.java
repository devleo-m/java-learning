import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {
    ArrayList<String> tarefas = new ArrayList<>();
    public void adicionarTarefa(){
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        tarefas.add(value);
    }
    public void exibirTarefa(){
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(i+": "+tarefas.get(i));
        }
    }
    public void removerTarefa() {

    }

    public ArrayList<String> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<String> tarefas) {
        this.tarefas = tarefas;
    }
}
