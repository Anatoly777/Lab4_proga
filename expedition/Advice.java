package expedition;

import java.util.Objects;

public final class Advice {
    private final ExperienceOfPast point;
    private final ListMaterials material;

    public Advice(ExperienceOfPast about, ListMaterials material){
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
        return getPoint() == advice.getPoint();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoint());
    }

    @Override
    public String toString() {
        return "Advice{" +
                "point=" + point +
                '}';
    }
}
