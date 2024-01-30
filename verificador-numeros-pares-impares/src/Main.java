import java.util.Scanner;

//**
// Verificador de Números Pares ou Ímpares:
// Implemente um programa que solicita ao usuário um número e verifica se é par ou ímpar.
// **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0){
            System.out.println(numero+" Par");
        }else {
            System.out.println(numero+" Ímpar");
        }
    }
}
