package controller;

import model.Perfil;
import model.RedeSocial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CadastroPerfilController {
   private RedeSocial rede = new RedeSocial();

    public boolean validaEmail(String email) {
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

    public boolean buscaEmail(String email) {
        boolean emailExiste = false;
        for (int i = 0; i < rede.getPerfils().size(); i++) {
            if (rede.getPerfils().get(i).getEmail().equals(email)) {
                emailExiste = true;
                System.out.println("Email já cadastrado.");
            }
        }
        return emailExiste;
    }

    public boolean validaSenha(String senha) {
        boolean validacaoSenha = false;
        if (senha != null && senha.length() >= 6) {
            validacaoSenha = true;
        }
        return validacaoSenha;
    }

    public Perfil cadastroPerfil(String nome, String email, String senha){
        Perfil perfil = new Perfil(nome, email, senha);
        rede.addPerfil(perfil);
        return perfil;
    }
}
