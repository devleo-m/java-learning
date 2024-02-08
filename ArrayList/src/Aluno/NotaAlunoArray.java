package Aluno;

public class NotaAlunoArray {
    public static void main(String[] args) {
        double[] notaAluno = {10,5,8,6,9};
        double total = 0;
        for (int i = 0; i < notaAluno.length; i++) {
            total = total + notaAluno[i];
        }
        total = total/notaAluno.length;
        System.out.printf("Nota total do aluno: %.2f",total);
    }
}
