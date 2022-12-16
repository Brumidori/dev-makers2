package model;

public class Post {

    private String data;
    private String hora;
    private String conteudo;
    private Perfil usuario;

    public Post(String data, String hora, String conteudo, Perfil usuario) {
        this.data = data;
        this.hora = hora;
        this.conteudo = conteudo;
        this.usuario = usuario;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Perfil getUsuario() {
        return usuario;
    }

}
