import model.Perfil;
import view.MenuInicialView;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n===================================================================");
        System.out.println("=                       ADAS SOCIAL                   /)-/)       =");
        System.out.println("=       Faça novas conexões e acompanhe seus amigos  (>^.^<)      =");
        System.out.println("===================================================================");

        MenuInicialView miv = new MenuInicialView();
        miv.mostrarMenuInicial();


//
//
//
//
//
//
//
//    public static void menuHome() {
//        try {
//            System.out.println("-------------------------- HOME ---------------------------");
//            System.out.println("Digite '1' para POSTAR ou '2' para ir a TIMELINE.\nPara deslogar e voltar ao menu incial digite '3'.");
//            int escolha = Integer.parseInt(input.nextLine());
//            if (escolha == 1 || escolha == 2 || escolha == 3) {
//                opcao = escolha;
//                switch (opcao) {
//                    case 1:
//                        System.out.println("----- POSTAR -----");
//                        postar(userLogado);
//                        menuHome();
//                        break;
//
//                    case 2:
//                        timeline(userLogado);
//                        menuHome();
//                        break;
//
//                    case 3:
//                        menuInicial();
//                        break;
//
//                    default:
//                        System.out.println("Opcao invalida. Tente novamente!");
//                        menuHome();
//                }
//            } else {
//                System.out.println("Opcao invalida. Tente novamente.");
//                menuInicial();
//            }
//        } catch (NumberFormatException e) {
//            System.out.println("Opcao invalida. Insira um numero.");
//        }
//    }
//
//    public static void postar(Perfil p) {
//        p.postar();
//    }
//
//    public static void timeline(Perfil p) {
//        p.imprimir();
//    }
    }
}

