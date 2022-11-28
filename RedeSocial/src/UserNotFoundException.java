public class UserNotFoundException extends RuntimeException {
    public String getMessage(){
        return "Usuario nao encontrado. Tente novamente.";
    };
}

class InvalidPasswordException extends RuntimeException {
    public String getMessage(){
        return "Senha incorreta. Insira novamente.";
    };
}
