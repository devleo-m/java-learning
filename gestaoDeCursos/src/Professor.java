public class Professor {
    private int id;
    private static int contadorID = 0;
    private String nome;
    private String especialidade;

    public Professor(String nome, String especialidade) {
        this.id = ++contadorID;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public static int getContadorID() {
        return contadorID;
    }

    public static void setContadorID(int contadorID) {
        Professor.contadorID = contadorID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
