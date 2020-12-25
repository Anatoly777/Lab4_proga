package expedition;

import exception.NotEnoughMoneyException;

import java.util.Arrays;
import java.util.Objects;

public final class Expedition implements AbilityOfExpedition, ResourceOfExpedition {
    private geographic.GeoObject location;
    private final String name_expedition;
    private ExperienceOfPast[] experience;
    private int money;
    private int food;
    private Advice[] advices;
    private Researcher[] researchers;

    public Expedition(String name, geographic.GeoObject loc) {
        this.experience = new ExperienceOfPast[0];
        this.advices = new Advice[0];
        this.money = 0;
        this.food = 50;
        this.name_expedition = name;
        this.location = loc;
        this.researchers = new Researcher[0];
        System.out.println("Создана экспедиция с именем " + name + " и отправной точкой " + location.getName());
    }

    public class Researcher {
        private Specialty[] specialties;
        private String name;

        public Researcher(String name, Specialty[] specialties) {
            this.name = name;
            this.specialties = specialties;
            this.goToExpedition(Expedition.this);
        }

        public void goToExpedition(Expedition expedition) {
            Researcher[] researchers1 = new Researcher[Expedition.this.researchers.length + 1];
            int i = 0;
            for (Researcher res : Expedition.this.researchers) {
                researchers1[i] = res;
                i++;
            }
            researchers1[i] = this;
            Expedition.this.researchers = researchers1;
        }
    }

    public void addResearcher(String name, Specialty[] specialties) {
        Researcher res = new Researcher(name, specialties);
        System.out.println("Член экспедиции " + name + " успешно добавлен");
    }

    public ExperienceOfPast[] getExperience() {
        return this.experience;
    }

    public void takeAdvice(Advice[] adv) {
        Advice[] adv1 = new Advice[advices.length + adv.length];
        int i = 0;
        for (Advice ad : advices) {
            adv1[i] = ad;
            i++;
        }
        for (Advice ad : adv) {
            adv1[i] = ad;
            i++;
        }
        advices = adv1;
    }

    public void setExperience(ExperienceOfPast[] experience) {
        this.experience = experience;
    }

    public String getName() {
        return name_expedition;
    }

    public void changeLocation(geographic.GeoObject GObj) {
        this.location = GObj;
    }

    public void supplyFood() throws NotEnoughMoneyException {
        setFood(getFood() + 100);
        setMoney(getMoney() - 300);
        if (getMoney() < 0){
            throw new NotEnoughMoneyException();
        }
        System.out.println(getName() + " пополнила запасы продовольствия");
    }

    public void moveTo(geographic.GeoObject GObj) throws NotEnoughMoneyException{
        setMoney(getMoney() - 100);
        if (getMoney() < 0){
            throw new NotEnoughMoneyException();
        }
        changeLocation(GObj);
        System.out.println("Изменили геопозицию на " + GObj.getName());
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int cash) {
        this.money = cash;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int f) {
        this.food = f;
    }

    public geographic.GeoObject getLocation() {
        return location;
    }

    public void useAllAdv() {
        for (Advice ad : advices) {
            Material material = new MaterialsForExpedition(ad.getPointM());
            material.moveTo(getLocation());
            if (material.getName().equals("Продовольствие")) {
                setFood(getFood() + 400);
            }
        }
    }
}

