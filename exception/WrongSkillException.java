package exception;

public class WrongSkillException extends Exception{
    public WrongSkillException(){
        super("Неверно указаны способности персонажа");
    }
}
