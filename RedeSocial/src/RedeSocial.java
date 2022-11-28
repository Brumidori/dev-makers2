import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RedeSocial {

    static final int TAM = 10;
    static Perfil[] perfis = new Perfil[TAM];
    static int quantPerfis = 0;
    static int opcao = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Perfil teste = new Perfil("teste", "teste@email.com", "test123");
        perfis[quantPerfis++] = teste;

        do {
            System.out.println("\n===================================================================");
            System.out.println("=                       ADAS SOCIAL                   /)-/)       =");
            System.out.println("=       Faça novas conexões e acompanhe seus amigos  (>^.^<)      =");
            System.out.println("===================================================================");

            menuInicial();
        } while (opcao != 3);
        input.close();
    }

    public static int menuInicial() {
        System.out.println("-------------------------- MENU INICIAL ---------------------------");
        System.out.println("Digite '1' para fazer Cadastro ou '2' para Login.\nPara fechar digite '3'.");
        try {
            int escolha = Integer.parseInt(input.nextLine());
            if (escolha == 1 || escolha == 2 || escolha == 3) {
                opcao = escolha;
                switch (opcao) {
                    case 1:
                        System.out.println("-------------------------- CADASTRO ---------------------------");
                        cadastrarPerfil();
                        menuInicial();
                        break;

                    case 2:
                        System.out.println("-------------------------- LOGIN ---------------------------");
                        login();
                        break;

                    case 3:
                        System.out.println("Rede fechada. Volte Sempre!");
                        break;

                    default:
                        System.out.println("Opcao invalida. Tente novamente.");
                        menuInicial();
                }
            } else {
                System.out.println("Opcao invalida. Tente novamente.");
                menuInicial();
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um numero.");
            menuInicial();
        }
        return opcao;
    }

    public static void cadastrarPerfil() {
        Perfil p = new Perfil();
        p.nome = cadastroNome();
        p.email = cadastroEmail();
        p.senha = cadastroSenha();
        System.out.println(p.nome.toUpperCase() + " seu perfil foi cadastrado com SUCESSO!\nVoce sera redirecionado para o Menu Inicial.");
        perfis[quantPerfis++] = p;
    }

    public static String cadastroNome = null;

    public static String cadastroNome() {
        System.out.println("Por favor, digite seu NOME: ");
        cadastroNome = input.nextLine();
        if (cadastroNome != null && cadastroNome.length() > 1) {
            System.out.println("Nome cadastrado.");
        } else {
            System.out.println("O nome ó obrigatório.");
            cadastroNome();
        }
        return cadastroNome;
    }

    public static String cadastroEmail = null;

    public static String cadastroEmail() {
        System.out.println("Insira seu login (e-mail):");
        cadastroEmail = input.nextLine();
        if (validaEmail(cadastroEmail) == true && buscaEmail(cadastroEmail) == false) {
            System.out.println("Email cadastrado.");
        } else {
            System.out.println("E-mail invalido. Tente novamente");
            cadastroEmail();
        }
        return cadastroEmail;
    }

    public static boolean validaEmail(String email) {
        boolean validacaoEmail = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                validacaoEmail = true;
            }
        }
        return validacaoEmail;
    }

    public static boolean buscaEmail(String email) {
        boolean emailExiste = false;
        for (int i = 0; i < quantPerfis; i++) {
            if (perfis[i].email.equals(email)) {
                emailExiste = true;
                System.out.println("Email já cadastrado.");
            }
        }
        return emailExiste;
    }

    public static String cadastroSenha = null;

    public static String cadastroSenha() {
        System.out.println("Insira sua SENHA (min 6 caracteres): ");
        cadastroSenha = input.nextLine();
        if (validaSenha(cadastroSenha) == true) {
            System.out.println("Senha cadastrada.");
        } else {
            System.out.println("Senha invalida. Tente novamente");
            cadastroSenha();
        }
        return cadastroSenha;
    }

    public static boolean validaSenha(String senha) {
        boolean validacaoSenha = false;
        if (senha != null && senha.length() >= 6) {
            validacaoSenha = true;
        }
        return validacaoSenha;
    }

    static Perfil userLogado = perfis[0];

    public static void login() {
        boolean login = true;
        boolean user = false;
        boolean password = false;

        while (login) {
            try {
                user = validaLogin();
            } catch (UserNotFoundException e) {
                System.out.println(e.getMessage());
                login();
            }
            try {
                password = validaPassword();
            } catch (InvalidPasswordException e) {
                System.out.println(e.getMessage());
                login();
            }

            if (user == true && password == true) {
                login = false;
                System.out.println("Ola, " + userLogado.nome + ". Seja bem-vinde!");
                menuHome();
            }
        }
    }

    public static boolean validaLogin() throws UserNotFoundException {
        boolean emailEncontrado = false;
        System.out.println("Login (email): ");
        String loginUser = input.nextLine();

        for (int i = 0; i < quantPerfis; i++) {
            if (perfis[i].email.equals(loginUser)) {
                emailEncontrado = true;
                userLogado = perfis[i];
            }
        }
        if (emailEncontrado == false) {
            throw new UserNotFoundException();
        }
        return emailEncontrado;
    }

    public static boolean validaPassword() throws InvalidPasswordException {
        boolean senhaEcontradado = false;
        System.out.println("Senha: ");
        String password = input.nextLine();

        for (int i = 0; i < quantPerfis; i++) {
            if (perfis[i].senha.equals(password)) {
                senhaEcontradado = true;
            }
        }
        if (senhaEcontradado == false) {
            throw new UserNotFoundException();
        }
        return senhaEcontradado;
    }

    public static void menuHome() {
        try {
            System.out.println("-------------------------- HOME ---------------------------");
            System.out.println("Digite '1' para POSTAR ou '2' para ir a TIMELINE.\nPara deslogar e voltar ao menu incial digite '3'.");
            int escolha = Integer.parseInt(input.nextLine());
            if (escolha == 1 || escolha == 2 || escolha == 3) {
                opcao = escolha;
                switch (opcao) {
                    case 1:
                        System.out.println("----- POSTAR -----");
                        postar(userLogado);
                        menuHome();
                        break;
                    case 2:
                        timeline(userLogado);
                        menuHome();
                        break;
                    case 3:
                        menuInicial();
                        break;
                    default:
                        System.out.println("Opcao invalida. Tente novamente!");
                        menuHome();
                }
            } else {
                System.out.println("Opcao invalida. Tente novamente.");
                menuInicial();
            }
        } catch (NumberFormatException e) {
            System.out.println("Opcao invalida. Insira um numero.");
        }
    }


    public static void postar(Perfil p) {
        p.postar();
    }

    public static void timeline(Perfil p) {
        p.imprimir();
    }
}

