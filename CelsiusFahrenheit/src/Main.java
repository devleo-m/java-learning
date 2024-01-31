import java.util.Scanner;
public class Main {
    public static void celsius(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da temperatura em Fahrenheit para converter em Celsius: ");
        double value = scanner.nextInt();
        value = (5.0/9.0) * (value - 32);
        System.out.printf("%.2f °C",value);
        scanner.close();
    }
    public static void fahrenhit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da temperatura em Celsius para converter em Fahrenheit: ");
        double value = scanner.nextInt();
        value = (9.0/5.0) * (value + 32);
        System.out.printf("%.2f °F",value);
        scanner.close();
    }
    public static void main(String[] args) {
        boolean loop = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Deseja converter Celsius para Fahrenheit ou vice-versa?");
            System.out.println("(S)im, (N)ao.");
            String opcao = scanner.next();
            if (opcao.equals("s")){
                loop = false;
            }else if (opcao.equals("n")){
                System.out.println("Muito obrigado, qualquer coisa eh so chamar! :P");
                return;
            }else {
                System.out.println("Valor invalido");
                System.out.println("Voce deve digitar sim ou nao para continuar");
                loop = true;
            }
        }while (loop);

        do {
            System.out.println("Voce deseja converter para (C)elsius ou para (F)ahrenheit?");
            String opcao = scanner.next();
            if (opcao.equals("c")){
                celsius();
                loop = false;
            } else if (opcao.equals("f")){
                fahrenhit();
                loop = false;
            } else {
                System.out.println("Valor invalido");
                System.out.println("Voce deve digitar (C) ou (F) para continuar");
                loop = true;
            }
        }while (loop);
        scanner.close();
    }
}
