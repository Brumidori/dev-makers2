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

//    public static void cadastrarPerfil() {
//        Perfil p = new Perfil();
//        p.nome = cadastroNome();
//        p.email = cadastroEmail();
//        p.senha = cadastroSenha();
//        System.out.println(p.nome.toUpperCase() + " seu perfil foi cadastrado com SUCESSO!\nVoce sera redirecionado para o Menu Inicial.");
//        perfis[quantPerfis++] = p;
//    }

//
//    static Perfil userLogado = perfis[0];
//
//    public static void login() {
//        boolean login = true;
//        boolean user = false;
//        boolean password = false;
//
//        while (login) {
//            try {
//                user = validaLogin();
//            } catch (UserNotFoundException e) {
//                System.out.println(e.getMessage());
//                login();
//            }
//            try {
//                password = validaPassword();
//            } catch (InvalidPasswordException e) {
//                System.out.println(e.getMessage());
//                login();
//            }
//
//            if (user == true && password == true) {
//                login = false;
//                System.out.println("Ola, " + userLogado.nome + ". Seja bem-vinde!");
//                menuHome();
//            }
//        }
//    }
//
//    public static boolean validaLogin() throws UserNotFoundException {
//        boolean emailEncontrado = false;
//        System.out.println("Login (email): ");
//        String loginUser = input.nextLine();
//
//        for (int i = 0; i < quantPerfis; i++) {
//            if (perfis[i].email.equals(loginUser)) {
//                emailEncontrado = true;
//                userLogado = perfis[i];
//            }
//        }
//        if (emailEncontrado == false) {
//            throw new UserNotFoundException();
//        }
//        return emailEncontrado;
//    }
//
//    public static boolean validaPassword() throws InvalidPasswordException {
//        boolean senhaEcontradado = false;
//        System.out.println("Senha: ");
//        String password = input.nextLine();
//
//        for (int i = 0; i < quantPerfis; i++) {
//            if (perfis[i].senha.equals(password)) {
//                senhaEcontradado = true;
//            }
//        }
//        if (senhaEcontradado == false) {
//            throw new UserNotFoundException();
//        }
//        return senhaEcontradado;
//    }
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

