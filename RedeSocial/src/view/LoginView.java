package view;

import controller.LoginController;
import exceptions.InvalidPasswordException;
import exceptions.UserNotFoundException;
import model.Perfil;
import model.RedeSocial;

import java.util.Scanner;

import static repository.ListaUsuarios.perfils;

public class LoginView {
    static final Scanner input = new Scanner(System.in);
    private LoginController loginController = new LoginController();
    private MenuHomeView menuHomeView = new MenuHomeView();
    private RedeSocial rede = new RedeSocial();
    boolean user = false;
    boolean password = false;
    boolean login = true;
    public void logar() {

        Perfil teste = new Perfil("teste","teste@email.com", "123456");
        perfils.add(teste);

        while (login) {
            inserirLogin();
            inserirSenha();

            if (user == true && password == true) {
                login = false;
                System.out.println("Ola, " + rede.getUserLogado().nome + ". Seja bem-vinde!");
                menuHomeView.mostrarMenuHome();
            }
        }
    }

    private void inserirLogin(){
        try {
            System.out.println("Login (email): ");
            String loginUser = input.nextLine();
            user = loginController.validaLogin(loginUser);
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
            inserirLogin();
        }
    }
    private void inserirSenha(){
        try {
            System.out.println("Senha: ");
            String senha = input.nextLine();
            password = loginController.validaPassword(senha);
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
            inserirSenha();
        }
    }
}
