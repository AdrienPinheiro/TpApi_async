package facadeMethode.bo;

public class amplificateur {
    public static void marche(){
        System.out.println("L'amplificateur fonctionne");
    }
    public static void arret(){
        System.out.println("L'amplificateur s'arrête.");
    }
    public static void setCd(){
        lecteurCd.marche();
        lecteurCd.jouer();
    }
    public static void setDvd(){
        lecteurDvd.marche();
        lecteurDvd.jouer();
    }
    public static void setSonStereo(){
        lecteurDvd.setAudioStereo();
    }
    public static void setSonSurround(){
        lecteurDvd.setAudioSurround();
    }
    public static void setTuner(){
        tuner.marche();
    }
    public static void setVolume(int volume){
        System.out.println("Vous mettez le volume à "+volume+".");
    }
}
