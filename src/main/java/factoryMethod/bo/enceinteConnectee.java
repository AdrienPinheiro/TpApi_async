package factoryMethod.bo;

import factoryMethod.buttons.Button;
import factoryMethod.buttons.ButtonEnceinte;

public class enceinteConnectee extends ObjectConnecte{
    public enceinteConnectee(int limiteVolt) {
        super(limiteVolt);
    }

    @Override
    public Button createButton() {
        return new ButtonEnceinte();
    }
}
