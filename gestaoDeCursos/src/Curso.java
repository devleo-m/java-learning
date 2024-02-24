public class Curso {
    private int id;
    private static int contadorID = 1;
    private String nome;
    private String descricao;
    private Professor professores;
    private byte cargaHoraria;

    public Curso(String nome, String descricao, Professor professores, byte cargaHoraria) {
        this.id = ++contadorID;
        this.nome = nome;
        this.descricao = descricao;
        this.professores = professores;
        this.cargaHoraria = cargaHoraria;
    }

    public Curso(String nome, String descricao, byte cargaHoraria) {
        this.id = ++contadorID;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Id='" + id + '\'' +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", professores=" + professores +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    public int getID() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setProfessores(Professor professores) {
        this.professores = professores;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(byte cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
