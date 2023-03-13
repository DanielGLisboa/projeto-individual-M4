package pessoas.artistas;
public class Premiacao {
    
    private String titulo;
    private final String categoria;

    private final int ano;

    Premiacao (String titulo, int ano, String categoria){
        this.titulo = titulo;
        this.ano = ano;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }


    public int getAno() {
        return ano;
    }
}
