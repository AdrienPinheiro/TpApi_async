package factoryMethod.bo;

import factoryMethod.buttons.Button;
import factoryMethod.buttons.ButtonTelephone;

public class telephonePortable extends ObjectConnecte{
    public telephonePortable(int limiteVolt) {
        super(limiteVolt);
    }
    @Override
    public Button createButton() {
        return new ButtonTelephone();
    }
}
