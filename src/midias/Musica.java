package midias;
public class Musica extends Midia {

    private final String artista;

   private int nota;

    Musica(double duracao, String artista, int nota,String titulo, String genero, int ano) {
        super(titulo, genero, ano, duracao);
        if (nota >= 1 && nota <= 5) {
               this.nota = nota;
        }
        else {
               throw new IllegalArgumentException("A nota precisa estar entre 1 e 5");
        }
        this.artista = artista;
    }


    public String getArtista() {
        return artista;
    }


    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if(nota >= 1 && nota <= 5) {
            this.nota = nota;
        }
        else {
            throw new IllegalArgumentException("A nota precisa estar entre 1 e 5");
        }
    }
}
