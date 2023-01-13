package exceptions;

public class UserNotFoundException extends RuntimeException {
    public String getMessage(){
        return "Usuario nao encontrado. Tente novamente.";
    };
}


