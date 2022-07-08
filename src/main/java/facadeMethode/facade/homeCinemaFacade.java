package facadeMethode.facade;

import facadeMethode.bo.*;

public class homeCinemaFacade {
    private homeCinemaFacade(){}

    public static void regarderFilm(){
        popcorn.marche();
        popcorn.eclater();
        light.attenuer();
        screen.baisser();
        projeter.marche();
        projeter.modeGrandEcran();
        amplificateur.marche();
        amplificateur.setSonSurround();
        amplificateur.setVolume(5);
        amplificateur.setDvd();
    }
    public static void arreterFilm(){
        lecteurDvd.arret();
        amplificateur.arret();
        projeter.arret();
        screen.monter();
        popcorn.arret();
        light.arret();
    }
    public static void ecouterCD(){
        light.attenuer();
        amplificateur.marche();
        amplificateur.setSonSurround();
        amplificateur.setVolume(10);
        amplificateur.setCd();
    }
    public static void arreterCD(){
        lecteurCd.stop();
        amplificateur.arret();
        light.arret();
    }
    public static void ecouterRadio(){
        amplificateur.marche();
        tuner.marche();
        tuner.setFrequence(100);
    }
    public static void arreterRadio(){
        tuner.arret();
        amplificateur.arret();
    }
}
