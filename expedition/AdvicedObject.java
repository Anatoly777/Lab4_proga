package expedition;

public final class AdvicedObject {
    private final String name;
    private final ListMaterials baseMat;

    public AdvicedObject(String nm, ListMaterials material){
        this.baseMat = material;
        this.name = nm;
    }

    public ListMaterials getBaseMat(){
        return baseMat;
    }

    public String getName() {
        return name;
    }
}
