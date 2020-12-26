package spons;

import exception.InvalidParameterRuntimeException;
import expedition.Expedition;

import java.util.Objects;

public final class Sponsor {
    private final String nameFond;
    private int money;

    public Sponsor(String name, int cash){
        if (name == null | cash <= 0){
            throw new InvalidParameterRuntimeException();
        }
        this.money = cash;
        this.nameFond = name;
        System.out.println("Создан спонсор с именем " + getName() + " и балансом " + money + " тугриков");
    }
    public void giveMoney(Expedition exp, int cash){
        setMoney(getMoney() - cash);
        exp.setMoney(exp.getMoney() + cash);
        System.out.println(getName() + " выделяет деньги " + exp.getName() + " в количестве " + cash + " тугриков");
    }

    public String getName(){
        return nameFond;
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int cash){
        this.money = cash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsors = (Sponsor) o;
        return Objects.equals(nameFond, sponsors.nameFond);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFond);
    }

    @Override
    public String toString() {
        return "Sponsors{" +
                "nameFond='" + nameFond + '\'' +
                '}';
    }


}

