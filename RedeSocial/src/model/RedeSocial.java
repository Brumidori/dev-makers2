package model;

import java.util.ArrayList;
import java.util.List;

public class RedeSocial {

    private List<Perfil> perfis = new ArrayList<>();

    Perfil teste = new Perfil("teste", "teste@email.com", "test123");

    public List<Perfil> getPerfis() {
        return this.perfis;
    }

    public void addPerfil(Perfil perfil) {
        this.perfis.add(perfil);
    }

}
