package facadeMethode.bo;

public class projeter {
    public static void marche(){
        System.out.println("Le projeteur se met en marche");
    }
    public static void arret(){
        System.out.println("Le projeteur se met en arret");
    }
    public static void modeTv(){
        System.out.println("Le projetur se met en mode tv");
        lecteurCd.marche();
    }
    public static void modeGrandEcran(){
        System.out.println("Le projetur se met en mode grand ecran");
        lecteurDvd.marche();
    }
}
