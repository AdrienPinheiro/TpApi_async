package facadeMethode.bo;

public class tuner {
    public static void marche(){
        System.out.println("Le tuner se met en marche");
    }
    public static void arret(){
        System.out.println("Le tuner se met en arret");
    }
    public static void setAm(){
        System.out.println("Le tuner met les frequence AM");
    }
    public static void setFrequence(int frequence){
        System.out.println("Le tuner met la frequence " + frequence+".");
    }
}
