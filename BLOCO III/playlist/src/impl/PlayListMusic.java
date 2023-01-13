package impl;

import interfaces.IPlayList;
import midias.Musica;

import java.util.ArrayList;
import java.util.List;

public class PlayListMusic implements IPlayList<Musica> {
    private String nome;
    private String genero;
    private List<Musica> musicas = new ArrayList<>();

    @Override
    public void add(Musica musica) {
        musicas.add(musica);
    }

    @Override
    public Musica get() {
        return musicas.get(0);
    }

    @Override
    public void delete(Musica musica) {
        musicas.remove(musica);

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
}
