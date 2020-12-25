package geographic;

import java.util.Objects;

public final class City extends GeographicObject implements GeoObject{
    private String name;

    public City(String name) {
        setTypeObject("Город");
        setNameObject(name);
        setName(getTypeObject() + " " + getNameObject());
        System.out.println("Создан географический объект: " + getName());
    }

    public void setName(String nm){
        this.name = nm;
    }

    @Override
    public String toString() {
        return "City{" +
                "Name='" + name + '\'' +
                '}';
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        City city = (City) o;
        return Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
