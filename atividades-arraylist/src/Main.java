import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> compras = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.println("Voce deseja (V)isualizar, (A)dicionar, (R)emover ou (S)air?");
            String opcao = scanner.next();
            switch (opcao){
                case "v":
                    visualizar();
                    break;
                case "a":
                    System.out.println("Qual o nome da mercadoria que deseja adicionar?");
                    String mercadoria = scanner.next();
                    compras.add(mercadoria);
                    visualizar();
                    break;
                case "r":
                    System.out.println("remover");
                    System.out.println("Digite o número do índice do produto a ser removido: ");
                    byte removerItem = scanner.nextByte();

                    if (removerItem>=0 && removerItem < compras.size()){
                        compras.remove(removerItem);
                        System.out.println("Produto "+removerItem+ " Removido com sucesso ");
                        visualizar();
                    }else {
                        System.out.println("Índice inválido. Nenhum produto removido.");
                    }
                    break;
                case "s":
                    System.out.println("sair do programa");
                    return;
                default:
                    System.out.println("Opcao invalida, tente novamente!");
            }
        }while (loop);
    }
    public static void visualizar(){
        for (int i = 0; i < compras.size(); i++) {
            System.out.println(i+": "+ compras.get(i));
        }
    }
}
