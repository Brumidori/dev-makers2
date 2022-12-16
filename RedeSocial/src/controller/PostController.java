package controller;

import model.Perfil;
import model.Post;
import model.RedeSocial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PostController {

    private RedeSocial rede = new RedeSocial();
    private static String LocalDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    private static String LocalHour = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));

    public void postar(String conteudo, Perfil userLogado){
        Post post = new Post(LocalDate, LocalHour, conteudo, userLogado);
        rede.addPost(post);
    }
}
