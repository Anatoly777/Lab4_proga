package expedition;

import exception.InvalidParameterRuntimeException;

public final class AdvicedObject {
    private final String name;
    private final ListMaterials baseMat;

    public AdvicedObject(String nm, ListMaterials material){
        if (nm == null | material == null){
            throw new InvalidParameterRuntimeException();
        }
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
