package controller;

import exceptions.InvalidPasswordException;
import exceptions.UserNotFoundException;
import model.Perfil;
import model.RedeSocial;

public class LoginController {
    private RedeSocial rede = new RedeSocial();
    public boolean validaLogin(String loginUser) throws UserNotFoundException {
        boolean emailEncontrado = false;

        for (Perfil perfils : rede.getPerfils()){
            if (perfils.getEmail().equals(loginUser)) {
                emailEncontrado = true;
                rede.setUserLogado(perfils);
            }
        }
        if (emailEncontrado == false) {
            throw new UserNotFoundException();
        }
        return emailEncontrado;
    }

    public boolean validaPassword(String password) throws InvalidPasswordException {
        boolean senhaEcontradado = false;

        for (Perfil perfils : rede.getPerfils()){
            if (perfils.senha.equals(password)) {
                senhaEcontradado = true;
            }
        }
        if (senhaEcontradado == false) {
            throw new InvalidPasswordException();
        }
        return senhaEcontradado;
    }
}
