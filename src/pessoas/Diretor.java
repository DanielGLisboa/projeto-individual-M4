package pessoas;
import midias.Filme;
import java.util.ArrayList;

public class Diretor extends Pessoa {

    private final ArrayList<Filme> filmesDirigidos = new ArrayList<>();

    public Diretor(String nome, String dataNascimento, String genero) {
        super(nome, dataNascimento, genero);
    }


    public ArrayList<Filme> getFilmesDirigidos() {
        return filmesDirigidos;
    }

    public void setFilmesDirigidos(Filme filme) {
        this.filmesDirigidos.add(filme);
    }

    public void imprime_direcoes(){
        System.out.println("=============== Direções de: " + getNome() + " ===================");
        for(Filme item: filmesDirigidos){
            System.out.println(item.getTitulo());
        }
        System.out.println("======================== FIM =========================");
    }

}
