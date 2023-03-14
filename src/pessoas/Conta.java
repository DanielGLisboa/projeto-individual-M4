package pessoas;
public class Conta {
    
    private String  senha;

    private final Usuario usuario;

    public Conta(Usuario usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

}
