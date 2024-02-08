package Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class NotaAlunoArrayList {
    public static void main(String[] args) {
        ArrayList<Double> notaAluno = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá, qual eh seu nome? ");
        String aluno = scanner.next();

        System.out.print("Bem vindo(a) "+aluno+"! Digite sua nota do primeiro Bimestre: ");

        Double p_bimestre = scanner.nextDouble();
        notaAluno.add(p_bimestre);
        System.out.print("Digite sua nota do segundo Bimestre: ");
        Double s_bimestre = scanner.nextDouble();
        notaAluno.add(s_bimestre);
        System.out.print("Digite sua nota do terceiro Bimestre: ");
        Double t_bimestre = scanner.nextDouble();
        notaAluno.add(t_bimestre);
        System.out.print("Digite sua nota do quarto Bimestre: ");
        Double q_bimestre = scanner.nextDouble();
        notaAluno.add(q_bimestre);

        double total = 0;
        for (int i = 0; i < notaAluno.size(); i++) {
            total += notaAluno.get(i);
        }
        total = total/notaAluno.size();

        if (total>=6) {
            System.out.println("Parabens, "+aluno+". Passou de ano!!!! uhuuuuu  NOTA: "+total);
        } else {
            System.out.println("Lamento, "+aluno+", Você não passou de ano! :(  NOTA: "+total);
        }
    }
}
