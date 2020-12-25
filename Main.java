import exception.NotEnoughMoneyException;
import exception.WrongSkillException;
import expedition.AdvicedObject;
import expedition.ExperienceOfPast;
import expedition.Specialty;
import static expedition.ListMaterials.*;

public class Main {
    public static void main(String[] args){
        try {
            spons.Sponsor sponsor1 = new spons.Sponsor("Фонд Натаниэля Дерби Пикмена", 2000);
            spons.Sponsor sponsor2 = new spons.Sponsor("Еще несколько спонсоров", 1000);
            geographic.City geographicObj1 = new geographic.City("Бостон");
            geographic.Coast geographicObj2 = new geographic.Coast("Североамериканское");
            geographic.Island geographicObj3 = new geographic.Island("Самоа");
            geographic.City geographicObj4 = new geographic.City("Хобарт, административный центр Тасмании");
            geographic.Canal geographicObj5 = new geographic.Canal("Панамский");
            geographic.Polus geographicObj6 = new geographic.Polus("");
            expedition.Expedition EXP = new expedition.Expedition("Наша экспедиция", geographicObj1);
            expedition.Expedition EXP1 = new expedition.Expedition("Прошлые экспедиции", geographicObj1);
            ExperienceOfPast e1 = new ExperienceOfPast("Продовольствие");
            ExperienceOfPast e2 = new ExperienceOfPast("Еда");
            ExperienceOfPast e3 = new ExperienceOfPast("Деньги");
            ExperienceOfPast e4 = new ExperienceOfPast("Транспорт 1");
            ExperienceOfPast e5 = new ExperienceOfPast("Транспорт 2");
            ExperienceOfPast[] ex1 = {e1, e2, e3, e4, e5};
            ExperienceOfPast e6 = new ExperienceOfPast("Снаряжение");
            ExperienceOfPast e7 = new ExperienceOfPast("Веревки");
            ExperienceOfPast e8 = new ExperienceOfPast("Лагерь");
            ExperienceOfPast e9 = new ExperienceOfPast("Транспорт 3");
            ExperienceOfPast[] ex2 = {e6, e7, e8, e9};
            expedition.OldSeaWolf wolf1 = new expedition.OldSeaWolf("Дж. Б. Дуглас", "командует бригом \"Аркхем\" и осуществляет общее руководство кораблями", 5, ex1);
            expedition.OldSeaWolf wolf2 = new expedition.OldSeaWolf("Георг Торфинсен", "возглавляет экипаж барка \"Мискатоник\"", 4, ex2);
            expedition.OldSeaWolf.saySelfAbility();
            EXP.addResearcher("Пэбоди", new Specialty[]{Specialty.WRITER, Specialty.NAVIGATOR});
            EXP.addResearcher("Лейк", new Specialty[]{Specialty.BIOLOGIST});
            EXP.addResearcher("Этвуд", new Specialty[]{Specialty.PHYSICIST, Specialty.NAVIGATOR, Specialty.METEOROLOGIST});
            EXP.addResearcher("Я", new Specialty[]{Specialty.GEOLOGIST, Specialty.NAVIGATOR});
            for (int i = 0; i < 16; i++){
                if (i < 5){
                    EXP.addResearcher("researcher#" + i, new Specialty[]{Specialty.PILOT, Specialty.RADIO_OPERATOR});
                } else if (i < 9){
                    EXP.addResearcher("researcher#" + i, new Specialty[]{Specialty.PILOT, Specialty.RADIO_OPERATOR, Specialty.MECHANIC});
                } else if (i < 12){
                    EXP.addResearcher("researcher#" + i, new Specialty[]{Specialty.NAVIGATOR, Specialty.RADIO_OPERATOR, Specialty.MECHANIC});
                } else if (i < 14){
                    EXP.addResearcher("researcher#" + i, new Specialty[]{Specialty.PILOT, Specialty.MECHANIC});
                } else if (i < 15){
                    EXP.addResearcher("researcher#" + i, new Specialty[]{Specialty.PILOT, Specialty.RADIO_OPERATOR, Specialty.MECHANIC});
                } else {
                    EXP.addResearcher("researcher#" + i, new Specialty[]{Specialty.RADIO_OPERATOR, Specialty.MECHANIC});
                }
            }
            sponsor1.giveMoney(EXP,500);
            sponsor2.giveMoney(EXP,300);
            System.out.println("Баланс экспедиции " + EXP.getMoney() + " тугриков");
            wolf1.goToExpedition(EXP);
            wolf2.goToExpedition(EXP);
            EXP.takeAdvice(wolf1.addToAdvice(new AdvicedObject("Продовольствие", FOOD)));
            EXP.takeAdvice(wolf1.addToAdvice(new AdvicedObject("Транспорт 1", DOGS)));
            EXP.takeAdvice(wolf1.addToAdvice(new AdvicedObject("Транспорт 2", SLEIGH)));
            EXP.takeAdvice(wolf2.addToAdvice(new AdvicedObject("Транспорт 3", PARTS_OF_PLANE)));
            EXP.takeAdvice(wolf2.addToAdvice(new AdvicedObject("Лагерь", TENTS)));
            EXP.takeAdvice(wolf2.addToAdvice(new AdvicedObject("Снаряжение", EQUIPMENT)));
            EXP.useAllAdv();
            EXP.moveTo(geographicObj1);
            EXP.moveTo(geographicObj2);
            EXP.moveTo(geographicObj5);
            EXP.moveTo(geographicObj3);
            EXP.moveTo(geographicObj4);
            EXP.supplyFood();
            geographicObj6.makeIceberg(-20);
            wolf1.getExFromExpedition(EXP);
            wolf2.getExFromExpedition(EXP);
        }catch (WrongSkillException | NotEnoughMoneyException e){
            System.out.println(e.getMessage());
        }
    }
}
