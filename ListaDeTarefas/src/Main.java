import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("|----------------------------|");
            System.out.println("|---Gerenciador de Tarefas---|");
            System.out.println("|----------------------------|");
            System.out.println("|---1 Adicionar Tarefa-------|");
            System.out.println("|---2 Exibir Tarefa----------|");
            System.out.println("|---3 Remover Tarefa---------|");
            System.out.println("|----------------------------|");
            System.out.println("|---0 Sair do programa-------|");
            System.out.println("|----------------------------|");
            System.out.println("Escolha qual opcao: ");
            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    GerenciadorTarefas.adicionarTarefa();
                    break;
                case 2 :
                    GerenciadorTarefas.exibirTarefa();
                    break;
                case 3:
                    GerenciadorTarefas.removerTarefa();
                    break;
                case 0:
                    System.out.println("Sair do programa");
                    return;
                default:
                    System.out.println("Opcao invalida! tente novamente");
            }
        }while (true);
    }
}