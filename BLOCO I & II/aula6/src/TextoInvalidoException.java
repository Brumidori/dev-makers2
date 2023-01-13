public class TextoInvalidoException extends RuntimeException {

}

class JogoDaVelhaException extends RuntimeException {
    public String getMessage(){
        return "Jogo da velha invalido";
    };
}

class ZeroException extends RuntimeException {
    public String getMessage(){
        return "Zero nao pode";
    };
}
