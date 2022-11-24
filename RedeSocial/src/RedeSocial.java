import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RedeSocial {

    static ArrayList<Perfil> perfis = new ArrayList<>();
    static int quantPerfis = 0;
    static int opcao = 0 ;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Perfil teste = new Perfil("teste", "teste@email.com", "test123");
        int t = 1, d = 0;

        do {
            System.out.println("\n===================================================================");
            System.out.println("=                       REDE SOCIAL                   /)-/)       =");
            System.out.println("=       Faça novas conexões e acompanhe seus amigos  (>^.^<)      =");
            System.out.println("===================================================================");

            System.out.println("\nOla, bem vindo a Rede Social! ");
            menuInicial();

            switch (opcao) {
                case 1:
                    System.out.println("cadastro");
                    cadastrarPerfil();
                    menuInicial();
                    break;

                case 2:

                    break;

                default:
                   // t =0;
            }

        } while (opcao != 0);
        System.out.println("Rede fechada.");
        input.close();
    }

    static int menuInicial(){
        System.out.println("Digite '1' para fazer Cadastro ou '2'para Login.\nPara fechar digite '0'." );
            while(! input.hasNextInt()) {
                input.nextLine();
                System.out.println("Digite um numero.");
            }
            if(input.nextInt() != 1 && input.nextInt() != 2 && input.nextInt() != 0){
                System.out.println("Opcao invalida.");
                menuInicial();
            } else {
                opcao = input.nextInt();
            }
        return opcao;
    }

    static Perfil cadastrarPerfil(){
        Perfil p = new Perfil();

        System.out.println("Por favor, digite seu nome completo: ");
        p.nome = input.nextLine();
        System.out.println("Nome cadastrado.");
        p.login = cadastroEmail();
        System.out.println("Insira sua senha (min 6 caracteres): ");
        if (validaSenha(input.next()) == true) {
            p.senha = input.next();
            System.out.println("Senha cadastrada.");
        } else {
        System.out.println("Senha invalida. Tente novamente");
        cadastrarPerfil();
        }
        System.out.println("Perfil cadastrado.");
        quantPerfis++;
        System.out.println("Bem vindo " + p.nome + p.login + p.senha + ". Voce retornou ao menu inicial.");
        return p;
    }

    static String cadastroEmail(){
        System.out.println("Insira seu login (e-mail):");
        if (validaEmail(input.next()) == true) {
            System.out.println("Email cadastrado.");
        } else {
            System.out.println("e-mail invalido. Tente novamente");
            cadastroEmail();
        }
        String email = input.next();
        return email;
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

//    static boolean buscaEmail(String email) {
//        boolean emailExiste = false;
//        Perfil[] encontrados = new Perfil[100];
//        for (int i = 0; i < encontrados.length; i++) {
//            if(perfis[i].login.equals(email)) {
//                emailExiste = true;
//            }
//        }
//        return emailExiste;
//    }

    public static boolean validaSenha (String senha){
        boolean validacaoSenha = false;
        if(senha.length() >= 6){
            validacaoSenha = true;
        }
        return validacaoSenha;
    }


    void fazerPostagem(Perfil p){
        //pedir dados
        //p.postar();
    }

    void imprimirPerfil(Perfil p){
       // p.imprimir();
    }


}

