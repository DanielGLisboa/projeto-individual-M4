package pessoas.artistas;
public class Ator extends Artista {
    
    private String formacao;

    public Ator(String nome, String dataNascimento, String genero, String formacao) {
        super(nome, dataNascimento, genero);
        this.formacao = formacao;

    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
