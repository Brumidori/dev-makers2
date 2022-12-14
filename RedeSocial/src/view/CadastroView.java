package view;

import controller.CadastroController;
import model.Perfil;

import java.util.Scanner;

public class CadastroView {
    static final Scanner input = new Scanner(System.in);
    public static String cadastroNome() {
        System.out.println("Por favor, digite seu NOME: ");
        String cadastroNome = input.nextLine();
        if (cadastroNome != null && cadastroNome.length() > 1) {
            System.out.println("Nome cadastrado.");
        } else {
            System.out.println("O nome ó obrigatório.");
            cadastroNome();
        }
        return cadastroNome;
    }

    public static String cadastroEmail() {
        System.out.println("Insira seu login (e-mail):");
        String cadastroEmail = input.nextLine();
        if (CadastroController.validaEmail(cadastroEmail) == true && CadastroController.buscaEmail(cadastroEmail) == false) {
            System.out.println("Email cadastrado.");
        } else {
            System.out.println("E-mail invalido. Tente novamente");
            cadastroEmail();
        }
        return cadastroEmail;
    }

    public static String cadastroSenha() {
        System.out.println("Insira sua SENHA (min 6 caracteres): ");
        String cadastroSenha = input.nextLine();
        if (CadastroController.validaSenha(cadastroSenha) == true) {
            System.out.println("Senha cadastrada.");
        } else {
            System.out.println("Senha invalida. Tente novamente");
            cadastroSenha();
        }
        return cadastroSenha;
    }
}
