package model;

import repository.ListaUsuarios;
import view.CadastroView;
import view.LoginView;

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

}
