package factoryMethod.bo;

import factoryMethod.buttons.Button;

public abstract class ObjectConnecte {
    private int limiteVolt;
    public ObjectConnecte(int limiteVolt) {
        this.limiteVolt = limiteVolt;
    }

    public abstract Button createButton();
}
