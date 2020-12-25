package expedition;

import exception.NotEnoughMoneyException;

public interface ResourceOfExpedition {
    void supplyFood () throws NotEnoughMoneyException;
    void useAllAdv();
    int getMoney();
    int getFood();
}
