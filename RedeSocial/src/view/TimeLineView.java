package view;

import model.Post;

import static model.ListaPost.posts;

public class TimeLineView {

    public void mostrarTimeLine() {
        try {
            if(posts.size() > 0){
                System.out.println("**************** TIMELINE ****************");
                for (Post p : posts) {
                    System.out.println("-------------------------------------");
                    System.out.println((p.getUsuario().getNome()).toUpperCase() +
                            "\nPostou: " + p.getConteudo() +
                            "\n" + p.getData() +
                            " as " + p.getHora());
                    System.out.println("-------------------------------------");
                }
            }
            else {
                System.out.println("Nao ha posts cadastrados.");
            }
        } catch (NullPointerException e) {
            System.out.println("----Sem novos posts ----");
        }
    }
}
