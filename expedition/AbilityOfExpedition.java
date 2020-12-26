package expedition;

import exception.NotEnoughMoneyException;

public interface AbilityOfExpedition {
    String getName();
    void changeLocation(geographic.GeoObject GObj);
    void moveTo(geographic.GeoObject GObj) throws NotEnoughMoneyException;
    geographic.GeoObject getLocation();
    void takeAdvice(Advice[] adv);
}
