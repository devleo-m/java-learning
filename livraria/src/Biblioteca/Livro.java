package Biblioteca;

public class Livro {
    public String titulo;
    public String autor;
    public String descricao;
    public String genero;
    public String idioma;
    public String editora;
    public String localizacao;
    public int volume = 0;
    public int pcConservacao = 100;
    public int anoPublicacao;

    public  LivroStatus statusAtual ;
    public int numeroExemplar;
    public String isbn;

    public void danificado() {
        if (pcConservacao > 0) {
            pcConservacao -= 25;

        }
        if (pcConservacao <= 0){
            statusAtual = LivroStatus.ESTRAGADO;
        }
    }
    public void restaurar(){
        if(statusAtual.equals(LivroStatus.ESTRAGADO)){
            System.out.println("Impossivel de arrumar, ja era.");
        } else {
            pcConservacao = 90;
        }
    }

    public void statusConservacao(){
        System.out.println("o estado de conservacao do livro"+titulo+" eh : "+pcConservacao);
    }

    public void emprestarLivro(){
        if (podeEmprestar()) {
            statusAtual = LivroStatus.EMPRESTADO;
            System.out.println("Livron EMPRESTADO com sucesso!");
        } else {
            System.out.println("Nao eh possivel emprestar o livro, ele esta: "+statusAtual);
        }

    }

    public void devolverLivro(){
        if (statusAtual.equals(LivroStatus.EMPRESTADO)){
            statusAtual = LivroStatus.DISPONIVEL;
            System.out.println("Livro devolvido!");
        } else {
            System.out.println("O livro atualmente esta: "+statusAtual+" Nao pode ser devolvido no momento");
        }
    }

    public boolean podeEmprestar(){
        return statusAtual.equals(LivroStatus.DISPONIVEL) ||
                statusAtual.equals(LivroStatus.RESERVADO);
    }

    public void enderecar(String endereco){
        localizacao = endereco;
    }
}
