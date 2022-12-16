package model;

public class Perfil {
    private String nome;
    private String email;
    private String senha;
    //ArrayList<model.Perfil> seguintes = new ArrayList();
    //ArrayList<model.Perfil> seguidores = new ArrayList();

    public Perfil(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
