package expedition;

import exception.WrongSkillException;

import java.util.Objects;

public final class OldSeaWolf {
    private String nameOfWolf;
    private String actions;
    private int skill;
    private ExperienceOfPast[] experience;

    public OldSeaWolf(String name, String action, int skills, ExperienceOfPast[] exps) throws WrongSkillException {
        this.experience = new ExperienceOfPast[skills];
        System.arraycopy(exps, 0, this.experience, 0, skills);
        this.experience = exps;
        this.actions = action;
        this.nameOfWolf = name;
        if (skills != exps.length){
            throw new WrongSkillException();
        }
        this.skill = skills;
        System.out.println("Добавлен Старый Морской Волк " + nameOfWolf + " который " + actions);
        System.out.println("Уровень профессионализма: " + skill);
    }

    static public void saySelfAbility(){
        System.out.println("Они не один год ловили китов в Южных морях");
    }

    public Advice[] addToAdvice(AdvicedObject obj){
        Advice[] result = new Advice[skill];
        int i = 0;
        for (ExperienceOfPast exp : experience){
            if (exp.matches(obj)){
                result[i] = exp.makeAdviceAbout(obj);
                i ++;
                System.out.println("Советую взять с собой " + obj.getName());
            }
        }
        Advice[] result1 = new Advice[i];
        for (int j = 0; j < i; i++){
            result1[j] = result[j];
        }
        return result1;
    }

    public void goToExpedition(Expedition exped) {
        addExperienceTo(exped);
    }
    public void getExFromExpedition(Expedition exped){
        this.skill ++;
        ExperienceOfPast[] exp1 = new ExperienceOfPast[skill];
        int i = 0;
        for (ExperienceOfPast exp : experience){
            exp1[i] = exp;
            i++;
        }
        experience = exp1;
        experience[i] = addExperienceFrom(exped);
    }

    public ExperienceOfPast addExperienceFrom(Expedition exp){
        return exp.getExperience()[(int)(Math.random() * experience.length)];
    }

    public void addExperienceTo(Expedition exp){
        ExperienceOfPast[] exp1 = new ExperienceOfPast[exp.getExperience().length + experience.length];
        int i = 0;
        for (ExperienceOfPast ex : experience){
            exp1[i] = ex;
            i++;
        }
        for (ExperienceOfPast ex : exp.getExperience()){
            exp1[i] = ex;
            i++;
        }
        exp.setExperience(exp1);
        if (exp.getExperience().length > 5){
            System.out.println("Экспедиция не привлекла особого внимания общественности");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldSeaWolf wolf = (OldSeaWolf) o;
        return Objects.equals(nameOfWolf, wolf.nameOfWolf) &&
                Objects.equals(actions, wolf.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfWolf, actions);
    }

    @Override
    public String toString() {
        return "OldSeaWolf{" +
                "NameOfWolf='" + nameOfWolf + '\'' +
                ", Actions='" + actions + '\'' +
                '}';
    }
}
