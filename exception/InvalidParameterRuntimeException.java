package exception;

public class InvalidParameterRuntimeException extends RuntimeException{
    public InvalidParameterRuntimeException(){
        super("Неверный формат ввода");
    }
}
