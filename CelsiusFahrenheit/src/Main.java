import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Conversor de Temperatura!");

        do {
            System.out.println("Deseja converter Celsius para Fahrenheit ou vice-versa?");
            System.out.println("(S)im, (N)ao.");
            String opcaoInicial = scanner.next().toLowerCase();

            if (opcaoInicial.equals("n")) {
                System.out.println("Muito obrigado, qualquer coisa é só chamar! :P");
                scanner.close();
                return;
            } else if (opcaoInicial.equals("s")) {
                converterTemperatura(scanner);
            } else {
                System.out.println("Opção inválida. Digite 's' para Sim ou 'n' para Não.");
            }
        } while (true);
    }

    public static void converterTemperatura(Scanner scanner) {
        do {
            System.out.println("Você deseja converter para (C)elsius ou para (F)ahrenheit?");
            String opcao = scanner.next().toLowerCase();

            if (opcao.equals("c")) {
                converterParaCelsius(scanner);
                break;
            } else if (opcao.equals("f")) {
                converterParaFahrenheit(scanner);
                break;
            } else {
                System.out.println("Opção inválida. Digite 'C' para Celsius ou 'F' para Fahrenheit.");
            }
        } while (true);
    }

    public static void converterParaCelsius(Scanner scanner) {
        System.out.print("Digite o valor da temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();
        double temperaturaCelsius = (5.0 / 9.0) * (temperaturaFahrenheit - 32);
        System.out.printf("%.2f °C\n", temperaturaCelsius);
    }

    public static void converterParaFahrenheit(Scanner scanner) {
        System.out.print("Digite o valor da temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();
        double temperaturaFahrenheit = (9.0 / 5.0) * temperaturaCelsius + 32;
        System.out.printf("%.2f °F\n", temperaturaFahrenheit);
    }
}
