import pessoas.*;
import pessoas.artistas.*;
import midias.*;
public class Main {
    public static void main(String[] args) {

//      Ciando Usuários e atribuindo uma conta para cada
        Usuario usuario1 = new Usuario("Daniel", "15/02/2003", "Masculino", "daniel@email.com" );
        Conta conta1 = new Conta(usuario1, "Daniel@12345");
//      Criando uma biblioteca para um usuário
        BibliotecaDeMidias biblioteca1 = new BibliotecaDeMidias(usuario1);

        Usuario usuario2 = new Usuario("Julia", "14/05/1998", "Feminino", "julia@email.com" );
        Conta conta2 = new Conta(usuario2, "Julia@12345");

        Usuario usuario3 = new Usuario("Daniele", "16/04/1995", "Feminino",  "daniele@email.com" );
        Conta conta3 = new Conta(usuario3, "Daniele@12345");



//      criando músicas e adicionando-as à uma biblioteca de mídias
        Musica musica1 = new Musica(4.44, "Jorge Aragão", 3, "Lucidez", "Samba", 1991);

        biblioteca1.setMidias(musica1);
        biblioteca1.setTipoMidia("Musica");



        Musica musica2 = new Musica(3.34, "Gretchen", 2, "Conga, conga conga", "Pop", 1981);

        biblioteca1.setMidias(musica2);
        biblioteca1.setTipoMidia("Musica");



        Musica musica3 = new Musica(3.53, "Ed Sheeran", 3, "Shape of You", "Pop", 2017);

        biblioteca1.setMidias(musica3);
        biblioteca1.setTipoMidia("Musica");



        Musica musica4 = new Musica(5.0, "Ed Sheeran", 4, "thinking out loud", "Pop", 2014);

        biblioteca1.setMidias(musica4);
        biblioteca1.setTipoMidia("Musica");


  
        Musica musica5 = new Musica(3.21, "Mamonas assassinas", 4, "Pelados em Santos", "Pop", 1995);


        biblioteca1.setMidias(musica5);
        biblioteca1.setTipoMidia("Musica");


//      Criando Musicos
        Musico musico1 = new Musico("Anderson", "02/06/1986", "Não binário", "Vocal");

        Musico musico2 = new Musico("Katarina", "07/02/1990", "Feminino", "Baterista");


//      Criando Atores
        Ator ator1 = new Ator("Daniel Borges", "08/05/2002", "Masculino", "Cinema");

        Ator ator2 = new Ator("Fernanda Lima", "08/06/2003", "Feminino", "Teatro");

        Ator ator3 = new Ator("Roberto Santiago", "05/07/1990", "Não binário", "Cinema");

//      Criando um produtor e um diretor
        Produtor produtor1 = new Produtor("Gulherme Borges", "12/04/1972", "Masculino");
        Diretor diretor1 = new Diretor("Sandro Gomez", "15/03/1980", "Masculino");

//      Criando um filme e atribuindo um trabalho à um diretor e à um produtor 
        Filme filme1 = new Filme(2.3, "Longa", "A volta dos que não foram", "Ação", 2005, produtor1, diretor1);
        produtor1.setFilmesProduzidos(filme1);
        diretor1.setFilmesDirigidos(filme1);
        
//      Adicionando atores à um elenco de filme 
        filme1.setElenco(ator1);
        filme1.setElenco(ator2);

//      adicionado um filme à uma biblioteca de mídias 
        biblioteca1.setMidias(filme1);
        biblioteca1.setTipoMidia("Filme");


//      Exibindo mídias de uma biblioteca de mídias
        biblioteca1.imprime_midias();

//      Exibindo as informações de um filme
        filme1.imprime_filme();

//      Exibindo trabalhos de um diretor e de um produtor  
        diretor1.imprime_direcoes();
        produtor1.imprime_producoes();

//      Criando uma playlist e inserindo mídias
        PlayList playlistMusica1 = new PlayList("PlayList de Música ","Normal");
        playlistMusica1.setMidias(musica1);
        playlistMusica1.setMidias(musica2);
        playlistMusica1.setMidias(musica3);
        playlistMusica1.setMidias(musica4);
        playlistMusica1.setMidias(musica5);
        
//       Adicionando uma playlist à uma biblioteca de mídias
        biblioteca1.setPlaylists(playlistMusica1);
        
//       Reproduzindo uma playlist seguindo sua ordem de execução
        biblioteca1.reproduzir_playlist(playlistMusica1);

//      Embaralhando a ordem de mídias de uma playlist
        playlistMusica1.misturar_midias();

//      Reproduzindo a playlist após embaralhar a ordem de suas mídias
        biblioteca1.reproduzir_playlist(playlistMusica1);


//      Utilizando metodos de navegação entre as mídias de forma individual;
        playlistMusica1.reproduzir_midia_atual();

        playlistMusica1.reproduzir_proxima_midia();
        playlistMusica1.reproduzir_proxima_midia();
        playlistMusica1.reproduzir_proxima_midia();
        playlistMusica1.reproduzir_proxima_midia();

        playlistMusica1.reproduzir_midia_anterior();

        playlistMusica1.reproduzir_proxima_midia();
        playlistMusica1.reproduzir_proxima_midia();

        playlistMusica1.reproduzir_midia_anterior();
        playlistMusica1.reproduzir_midia_anterior();
        playlistMusica1.reproduzir_midia_anterior();
        playlistMusica1.reproduzir_midia_anterior();


//      Criando um filme
        PlayList playlistFilme1 = new PlayList("PlayList de Filme ","Normal");
        playlistFilme1.setMidias(filme1);
        biblioteca1.setPlaylists(playlistFilme1);
        biblioteca1.reproduzir_playlist(playlistFilme1);

//      Atribuindo uma premiação à um ator
        Premiacao melhorAtorAcao2022 = new Premiacao("Melhor ator/atriz do Ano", 2022, "Filmes de Ação");
        ator2.setPremiacoes(melhorAtorAcao2022);

//       Exibindo premiações de um ator
        ator2.imprime_premiacoes();



    }


}