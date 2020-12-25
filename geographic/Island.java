package geographic;

import java.util.Objects;

public final class Island extends GeographicObject implements GeoObject{
    private String name;

    public Island(String name) {
        setTypeObject("Острова");
        setNameObject(name);
        setName(getTypeObject() + " " + getNameObject());
        System.out.println("Создан географический объект: " + getName());
    }

    public String getName(){
        return this.name;
    }

    public void setName(String nm){
        this.name = nm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Island islands = (Island) o;
        return Objects.equals(name, islands.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "Islands{" +
                "Name='" + name + '\'' +
                '}';
    }
}
