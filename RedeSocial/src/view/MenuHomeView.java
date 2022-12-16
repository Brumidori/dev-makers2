package view;

import model.Perfil;
import service.RedeSocial;

import java.util.Scanner;

public class MenuHomeView {
    static final Scanner input = new Scanner(System.in);
    private MenuInicialView menuInicialView = new MenuInicialView();
    private RedeSocial redeSocial = new RedeSocial();

    public void mostrarMenuHome(Perfil userLogado) {
        try {
            System.out.println("-------------------------- HOME ---------------------------");
            System.out.println("Digite '1' para POSTAR ou '2' para ir a TIMELINE.\nPara deslogar e voltar ao menu incial digite '3'.");
            int escolha = Integer.parseInt(input.nextLine());
            if (escolha == 1 || escolha == 2 || escolha == 3) {
                int opcao = escolha;
                switch (opcao) {
                    case 1:
                        System.out.println("-------------------------- POSTAR --------------------------");
                        redeSocial.postar(userLogado);
                        mostrarMenuHome(userLogado);
                        break;

                    case 2:
                       redeSocial.mostrarTimeLine();
                        mostrarMenuHome(userLogado);
                        break;

                    case 3:
                        menuInicialView.mostrarMenuInicial();
                        break;

                    default:
                        System.out.println("Opcao invalida. Tente novamente!");
                        mostrarMenuHome(userLogado);
                }
            } else {
                System.out.println("Opcao invalida. Tente novamente.");
                menuInicialView.mostrarMenuInicial();
            }
        } catch (NumberFormatException e) {
            System.out.println("Opcao invalida. Insira um numero.");
        }
    }
}
