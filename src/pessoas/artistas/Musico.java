package pessoas.artistas;
public class Musico extends Artista {
    
    private String  atuacao;

    public Musico(String nome, String dataNascimento, String genero, String atuacao){
        super(nome, dataNascimento, genero);
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
    this.atuacao = atuacao;
    }
}
