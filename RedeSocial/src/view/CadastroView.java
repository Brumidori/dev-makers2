package view;

import controller.CadastroPerfilController;
import model.Perfil;

import java.util.Scanner;

public class CadastroView {
    static final Scanner input = new Scanner(System.in);
    private CadastroPerfilController controller = new CadastroPerfilController();
    private String cadastroNome;
    private String cadastroEmail;
    private String cadastroSenha;

    private String cadastroNome() {
        System.out.println("Por favor, digite seu NOME: ");
        cadastroNome = input.nextLine();
        if (cadastroNome != null && cadastroNome.length() > 1) {
            System.out.println("Nome cadastrado.");
        } else {
            System.out.println("O nome e obrigatorio.");
            cadastroNome();
        }
        return cadastroNome;
    }

    private String cadastroEmail() {
        System.out.println("Insira seu login (e-mail):");
        cadastroEmail = input.nextLine();
        if (controller.validaEmail(cadastroEmail) == true && controller.buscaEmail(cadastroEmail) == false) {
            System.out.println("Email cadastrado.");
        } else {
            System.out.println("E-mail invalido. Tente novamente");
            cadastroEmail();
        }
        return cadastroEmail;
    }

    private String cadastroSenha() {
        System.out.println("Insira sua SENHA (min 6 caracteres): ");
        cadastroSenha = input.nextLine();
        if (controller.validaSenha(cadastroSenha) == true) {
            System.out.println("Senha cadastrada.");
        } else {
            System.out.println("Senha invalida. Tente novamente");
            cadastroSenha();
        }
        return cadastroSenha;
    }

    public void cadastroPerfil(){
        Perfil p = controller.cadastroPerfil(cadastroNome(), cadastroEmail(), cadastroSenha());
        System.out.println(p.getNome().toUpperCase() + " seu perfil foi cadastrado com SUCESSO!\nVoce sera redirecionado para o Menu Inicial.");
    }
}
