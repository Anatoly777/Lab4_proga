package exception;

public class WrongTemperatureRuntimeException extends RuntimeException{
    public WrongTemperatureRuntimeException(){
        super("Айсберг не образуется при положительной температуре");
    }
}
