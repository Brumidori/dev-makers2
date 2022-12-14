package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Perfil {
    Scanner scanner = new Scanner(System.in);
    static String LocalDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    static String LocalHour = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
    public String nome;
    public String email;
    public String senha;
    //ArrayList<model.Perfil> seguintes = new ArrayList();
    //ArrayList<model.Perfil> seguidores = new ArrayList();

    public Perfil(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Perfil() {
        //vazio
    }

    Post[] posts = new Post[10];
    int quantPosts = 0;

    public void postar() {
        Post p = new Post();
        p.data = LocalDate;
        p.hora = LocalHour;
        System.out.println("Texto post: ");
        p.conteudo = scanner.nextLine();
        posts[quantPosts++] = p;
        System.out.println("model.Post Cadastrado. Redirecionando....");
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        try {
            for (Post p : posts) {
                p.imprimir();
            }
        } catch (NullPointerException e) {
            System.out.println("----Sem novos posts ----");
        }
    }
}
