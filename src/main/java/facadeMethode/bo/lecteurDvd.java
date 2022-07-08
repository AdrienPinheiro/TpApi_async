package facadeMethode.bo;

public class lecteurDvd{
    public static void marche(){
        System.out.println("Le lecteur dvd se met en marche");
    }
    public static void arret(){
        System.out.println("Le lecteur dvd s'arrête.");
    }
    public static void ejecter(){
        System.out.println("Le lecteur dvd ejecte le disque.");
    }
    public static void pause(){
        System.out.println("Le lecteur met en pause le dvd");
    }
    public static void jouer(){
        System.out.println("Le lecteur joue le dvd");
    }
    public static void stop(){
        System.out.println("Le lecteur arrete le dvd");
    }
    public static void setAudioSurround(){
        System.out.println("Le lecteur dvd passe en mode Surround");
    }
    public static void setAudioStereo(){
        System.out.println("Le lecteur dvd passe en mode Stereo");
    }
}
