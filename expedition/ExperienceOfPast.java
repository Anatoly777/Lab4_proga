package expedition;

import java.util.Objects;

public final class ExperienceOfPast {
    private final String expAbout;

    public ExperienceOfPast(String about) {
        this.expAbout = about;

    }

    public Advice makeAdviceAbout(AdvicedObject obj){
        return new Advice(this, obj.getBaseMat());
    }

    public boolean matches(AdvicedObject obj){
        String pattern = "(.*)" + obj.getName() + "(.*)";
        return getExpAbout().matches(pattern);
    }

    public String getExpAbout(){
        return this.expAbout;
    }

    @Override
    public String toString() {
        return "ExperienceOfPast{" +
                "expAbout='" + expAbout + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExperienceOfPast that = (ExperienceOfPast) o;
        return Objects.equals(expAbout, that.expAbout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expAbout);
    }
}
