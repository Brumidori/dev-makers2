package view;

import controller.CadastroController;

import java.util.Scanner;

public class MenuInicialView {
    static final Scanner input = new Scanner(System.in);
    CadastroView cadastroView = new CadastroView();

    public void mostrarMenuInicial() {
        System.out.println("-------------------------- MENU INICIAL ---------------------------");
        System.out.println("Digite a opcao desejada: " +
                "\n1 - CADASTRAR " +
                "\n2 - LOGAR" +
                "\n3 - SAIR");
        try {
            int escolha = Integer.parseInt(input.nextLine());
            if (escolha == 1 || escolha == 2 || escolha == 3) {
                int opcao = escolha;
                switch (opcao) {
                    case 1:
                        System.out.println("-------------------------- CADASTRO ---------------------------");
                        //cadastrarPerfil();
                        cadastroView.cadastroNome();
                        cadastroView.cadastroEmail();
                        cadastroView.cadastroSenha();
                        mostrarMenuInicial();
                        break;

                    case 2:
                        System.out.println("-------------------------- LOGIN ---------------------------");
                        //login();
                        break;

                    case 3:
                        System.out.println("Rede fechada. Volte Sempre!");
                        break;

                    default:
                        System.out.println("Opcao invalida. Tente novamente.");
                        mostrarMenuInicial();
                }
            } else {
                System.out.println("Opcao invalida. Tente novamente.");
                mostrarMenuInicial();
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um numero.");
            mostrarMenuInicial();
        }

    }
}
