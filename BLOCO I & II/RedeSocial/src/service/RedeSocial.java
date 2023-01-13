package service;

import model.ListaPost;
import model.ListaUsuarios;
import model.Perfil;
import model.Post;
import view.CadastroView;
import view.LoginView;
import view.PostView;
import view.TimeLineView;

import java.util.List;

public class RedeSocial {

    private static Perfil userLogado;

    public Perfil getUserLogado() {
        return userLogado;
    }

    public void setUserLogado(Perfil userLogado) {
        this.userLogado = userLogado;
    }

    public List<Perfil> getPerfils(){
        return ListaUsuarios.perfils;
    }

    public void addPerfil(Perfil perfil) {
        ListaUsuarios.perfils.add(perfil);
    }

    public void cadastroPerfil(){
        CadastroView cadastroView = new CadastroView();
        cadastroView.cadastroPerfil();
    }

    public void logar(){
        LoginView loginView = new LoginView();
        loginView.logar();
    }

    public void postar(Perfil userLogado){
        PostView postView = new PostView();
        postView.postar(userLogado);
    }

    public void addPost(Post post) {
        ListaPost.posts.add(post);
    }

    public void mostrarTimeLine() {
        TimeLineView timeLineView = new TimeLineView();
        timeLineView.mostrarTimeLine();
    }

}
