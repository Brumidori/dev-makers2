package view;

import controller.PostController;
import model.Perfil;

import java.util.Scanner;

public class PostView {

    private PostController postController = new PostController();
    private MenuHomeView menuHomeView = new MenuHomeView();
    private Scanner input = new Scanner(System.in);
    private String conteudo;

    public void postar(Perfil userLogado){
        System.out.println("Texto post: ");
        conteudo = input.nextLine();
        if(conteudo.isBlank()){
            System.out.println("Por favor digite um texto.");
            postar(userLogado);
        } else {
            postController.postar(conteudo, userLogado);
            System.out.println("Post Cadastrado. Redirecionando....");
            menuHomeView.mostrarMenuHome(userLogado);
        }
    }
}
