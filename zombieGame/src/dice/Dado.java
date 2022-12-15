package dice;

import java.util.Random;

public abstract class Dado {

    private Face[] faces;
    private Face faceSorteada;
    private String cor;

    protected Dado(Face[] faces) {
        this.faces = faces;
    }

    public void jogar() {
        int sorteada = new Random().nextInt(0, faces.length-1);
        this.faceSorteada = faces[sorteada];
    }

    public Face getFaceSorteada(){
        if(faceSorteada == null){
            jogar();
        }
        return faceSorteada;
    };

    public void setFaceSorteada (Face faceSorteada){
        this.faceSorteada = faceSorteada;
    }

    public String getCor() {
        return cor;
    }

    public void resetFaceSorteada() {
        this.faceSorteada = null;
    }

    public abstract TipoDado getTipoDado();

}
