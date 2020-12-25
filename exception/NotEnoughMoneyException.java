package exception;

public class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException(){
        super("Денег нет, но вы держитесь!!!");
    }
}
