package pessoas;
public class Usuario extends Pessoa{
    
   private String email;

   Usuario(String nome, String dataNascimento, String genero, String email){
       super(nome, genero,dataNascimento);
       this.email = email;
   }

   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {
       this.email = email;
   }
}
