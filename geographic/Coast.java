package geographic;

import java.util.Objects;

public final class Coast extends GeographicObject implements GeoObject{
    private String name;
    public Coast(String name) {
        setTypeObject("Побережье");
        setNameObject(name);
        setName(getNameObject() + " " + getTypeObject());
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
        Coast coast = (Coast) o;
        return Objects.equals(name, coast.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "Coast{" +
                "Name='" + name + '\'' +
                '}';
    }
}