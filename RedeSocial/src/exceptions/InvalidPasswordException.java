package exceptions;

public class InvalidPasswordException extends RuntimeException {
    public String getMessage(){
        return "Senha incorreta. Insira novamente.";
    };
}
