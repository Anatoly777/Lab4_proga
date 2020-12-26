package expedition;

import exception.InvalidParameterRuntimeException;

public final class MaterialsForExpedition extends Material{
    private geographic.GeoObject location;

    public MaterialsForExpedition(ListMaterials m) {
        if (m == null){
            throw new InvalidParameterRuntimeException();
        }
        this.location = null;
        switch (m){
            case DOGS:
                setName("Собаки");
                break;
            case FOOD:
                setName("Продовольствие");
                break;
            case TENTS:
                setName("Палатки");
                break;
            case SLEIGH:
                setName("Сани");
                break;
            case EQUIPMENT:
                setName("Необходимое снаряжение");
                break;
            case PARTS_OF_PLANE:
                setName("Части самолета");
                break;
            default:
                setName("Не материал");
                break;
        }
        System.out.println("Создан материал " + getName());
    }

    public void changeLocation(geographic.GeoObject GObj){
        if (GObj == null){
            throw new InvalidParameterRuntimeException();
        }
        this.location = GObj;
    }

    @Override
    public void moveTo (geographic.GeoObject gobj){
        changeLocation(gobj);
        System.out.println("Материал " + getName() + " доставляется в " + gobj.getName());
    }

    @Override
    public String toString() {
        return "MaterialsForExpedition{}";
    }
}
