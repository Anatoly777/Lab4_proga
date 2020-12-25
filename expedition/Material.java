package expedition;

import java.util.Objects;

public abstract class Material {
    private String nameOfMaterial;

    public abstract void moveTo (geographic.GeoObject gobj);

    public String getName(){
        return this.nameOfMaterial;
    }

    public void setName(String name){
        nameOfMaterial = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material materials = (Material) o;
        return Objects.equals(nameOfMaterial, materials.nameOfMaterial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfMaterial);
    }

    @Override
    public String toString() {
        return "Materials{" +
                "NameOfMaterial='" + nameOfMaterial + '\'' +
                '}';
    }
}
