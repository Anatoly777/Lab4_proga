package geographic;

import java.util.Objects;

public class GeographicObject {
    private String nameObject;
    private String typeObject;

    public String getNameObject(){
        return nameObject;
    }

    public void setNameObject(String name){
        nameObject = name;
    }

    public String getTypeObject(){
        return typeObject;
    }

    public void setTypeObject(String type){
        typeObject = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeographicObject that = (GeographicObject) o;
        return Objects.equals(nameObject, that.nameObject) &&
                Objects.equals(typeObject, that.typeObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameObject, typeObject);
    }

    @Override
    public String toString() {
        return "GeographicObject{" +
                "NameObject='" + nameObject + '\'' +
                ", TypeObject='" + typeObject + '\'' +
                '}';
    }
}
