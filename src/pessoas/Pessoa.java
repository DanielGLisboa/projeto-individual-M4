package pessoas;
public class Pessoa {
    private final String nome;
    private String genero;
    private final String dataNascimento;


    Pessoa(String nome, String dataNascimento, String genero){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
