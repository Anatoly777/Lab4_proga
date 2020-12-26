package geographic;

import exception.InvalidParameterRuntimeException;
import exception.WrongTemperatureRuntimeException;

public class Polus extends GeographicObject implements GeoObject{
    private String name;

    public Polus(String name) {
        if (name == null){
            throw new InvalidParameterRuntimeException();
        }
        setTypeObject("Холодная земля");
        setNameObject(name);
        setName(getTypeObject() + " " + getNameObject());
        System.out.println("Создан географический объект: " + getName());
    }

    class IceBerg{
        private final int size;

        public IceBerg(int temp){
            if (temp <= 0){
                throw new InvalidParameterRuntimeException();
            }
            this.size = (int)Math.sqrt(-temp);
            System.out.println("Создан айсберг размера " + size);
            showMirage();
        }

        public void showMirage(){
            if (this.size > 3){
                System.out.println("Удивительный мираж открылся их глазам.");
            }
        }
    }
    public void makeIceberg(int temperature){
        if (temperature > 0){
            throw new WrongTemperatureRuntimeException();
        }
        IceBerg ice = new IceBerg(temperature);
    }


    public void setName(String nm){
        this.name = nm;
    }

    public String getName(){
        return this.name;
    }
}
