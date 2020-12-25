package geographic;

import java.util.Objects;

public final class Canal extends GeographicObject implements GeoObject{
    private String name;

    public Canal(String name) {
        setTypeObject("Канал");
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
    public String toString() {
        return "Canal{" +
                "Name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Canal canal = (Canal) o;
        return Objects.equals(name, canal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
