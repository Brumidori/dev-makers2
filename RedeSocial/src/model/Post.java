package model;

public class Post {

    public String data;
    public String hora;
    public String conteudo;

    public void imprimir(){
        System.out.println(data + " as " + hora + " - Postou: " + conteudo);
    }
}
