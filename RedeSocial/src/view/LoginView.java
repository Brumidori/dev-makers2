package view;

import controller.LoginController;
import exceptions.InvalidPasswordException;
import exceptions.UserNotFoundException;
import model.Perfil;
import service.RedeSocial;

import java.util.Scanner;

import static model.ListaUsuarios.perfils;

public class LoginView {
    static final Scanner input = new Scanner(System.in);
    private LoginController loginController = new LoginController();
    private MenuHomeView menuHomeView = new MenuHomeView();
    private RedeSocial rede = new RedeSocial();
    private String loginUser;
    private String senha;
    private boolean user = false;
    private boolean password = false;
    private boolean login = true;

    public void logar() {

        Perfil teste = new Perfil("teste","teste@email.com", "123456");
        perfils.add(teste);

        while (login) {
            inserirLogin();
            inserirSenha();

            if (user == true && password == true) {
                login = false;
                System.out.println("Ola, " + rede.getUserLogado().getNome() + ". Seja bem-vinde!");
                menuHomeView.mostrarMenuHome(rede.getUserLogado());
            }
        }
    }

    private void inserirLogin(){
        try {
            System.out.println("Login (email): ");
            loginUser = input.nextLine();
            user = loginController.validaLogin(loginUser);
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
            inserirLogin();
        }
    }

    private void inserirSenha(){
        try {
            System.out.println("Senha: ");
            senha = input.nextLine();
            password = loginController.validaPassword(senha);
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
            inserirSenha();
        }
    }
}
