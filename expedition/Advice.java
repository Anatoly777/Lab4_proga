package expedition;

import exception.InvalidParameterRuntimeException;

import java.util.Objects;
import java.util.prefs.InvalidPreferencesFormatException;

public final class Advice {
    private final ExperienceOfPast point;
    private final ListMaterials material;

    public Advice(ExperienceOfPast about, ListMaterials material){
        if (about == null | material == null){
            throw new InvalidParameterRuntimeException();
        }
        this.point = about;
        this.material = material;
    }
    public ExperienceOfPast getPoint(){
        return point;
    }

    public ListMaterials getPointM(){
        return material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advice advice = (Advice) o;
        return Objects.equals(getPoint(), advice.getPoint()) &&
                material == advice.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoint(), material);
    }

    @Override
    public String toString() {
        return "Advice{" +
                "point=" + point +
                '}';
    }
}
