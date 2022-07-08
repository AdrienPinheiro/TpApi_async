package factoryMethod.factory;

import factoryMethod.bo.*;

public class ObjectConnecteFactory {
    public static ObjectConnecte getObjectConnecte(Enum<TypeObject> type){
        if(type.equals(TypeObject.PORTABLE)){
            return new telephonePortable(5);
        } else if (type.equals(TypeObject.ENCEINTE)) {
            return new enceinteConnectee(5);
        } else if (type.equals(TypeObject.TABLETTE)){
            return new tablette(5);
        }
        return null;
    }
}
