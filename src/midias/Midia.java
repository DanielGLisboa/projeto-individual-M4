package midias;
public class Midia {
    private final String titulo, genero;
    private final int ano;

    private final double duracao;

    Midia(String titulo, String genero, int ano, double duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }


    public String getGenero() {
        return genero;
    }


    public int getAno() {
        return ano;
    }

    public double getDuracao() {
        return duracao;
    }

    public String imprime_midia() {
        return "Título : " + getTitulo() + " | Gênero: " + getGenero() + " | Ano: " + getAno();
    }
}

