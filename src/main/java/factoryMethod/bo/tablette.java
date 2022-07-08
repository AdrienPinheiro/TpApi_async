package factoryMethod.bo;

import factoryMethod.buttons.Button;
import factoryMethod.buttons.ButtonTablette;

public class tablette extends ObjectConnecte{
    public tablette(int limiteVolt) {
        super(limiteVolt);
    }

    @Override
    public Button createButton() {
        return new ButtonTablette();
    }
}
