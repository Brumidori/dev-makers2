import java.util.ArrayList;

public class Perfil {

    public String nome;
    public String login;
    public String senha;

    public Perfil(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public Perfil(){
        //vazio
    }

    //ArrayList<Perfil> seguintes = new ArrayList();
    //ArrayList<Perfil> seguidores = new ArrayList();

    Post[] posts = new Post[100];
    int quantPosts = 0;

    void postar (String data, String hora, String texto){
        Post p = new Post();
        p.data = data;
        p.hora = hora;
        p.conteudo = texto;

        posts[quantPosts++] = p;
    }

    void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Login: " + login);

        for (Post p : posts){
            p.imprimir();
        }
    }
}
