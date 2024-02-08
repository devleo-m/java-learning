package Aluno.Escola;

public class Aluno {
    private String nome;
    private Double notas;
    private String materiasCadastrado;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Double getNotas() {
        return notas;
    }

    public void setNotas(Double notas) {
        this.notas = notas;
    }
}
