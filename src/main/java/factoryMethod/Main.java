package factoryMethod;

import factoryMethod.bo.ObjectConnecte;
import factoryMethod.bo.TypeObject;
import factoryMethod.buttons.Button;
import factoryMethod.buttons.ButtonEnceinte;
import factoryMethod.buttons.ButtonTablette;
import factoryMethod.buttons.ButtonTelephone;
import factoryMethod.factory.ObjectConnecteFactory;

public class Main {
    public static void main(String[] args) {
        ObjectConnecte objPortable = ObjectConnecteFactory.getObjectConnecte(TypeObject.PORTABLE);
        ObjectConnecte objTablette = ObjectConnecteFactory.getObjectConnecte(TypeObject.TABLETTE);
        ObjectConnecte objEnceinte = ObjectConnecteFactory.getObjectConnecte(TypeObject.ENCEINTE);

        System.out.println(objPortable + " " + objTablette + " " + objEnceinte);

        Button btnPortable = new ButtonTelephone();
        btnPortable.toggle();
        btnPortable.toggle();

        Button btnTablette = new ButtonTablette();
        btnTablette.toggle();
        btnTablette.toggle();

        Button btnEnceinte = new ButtonEnceinte();
        btnEnceinte.toggle();
        btnEnceinte.toggle();
    }
}
