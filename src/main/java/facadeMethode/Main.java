package facadeMethode;

import facadeMethode.facade.homeCinemaFacade;

public class Main {
    public static void main(String[] args) {
        homeCinemaFacade.regarderFilm();
        System.out.println("----------------------------------------------------------");
        homeCinemaFacade.arreterFilm();
        System.out.println("----------------------------------------------------------");
        homeCinemaFacade.ecouterCD();
        System.out.println("----------------------------------------------------------");
        homeCinemaFacade.arreterCD();
        System.out.println("----------------------------------------------------------");
        homeCinemaFacade.ecouterRadio();
        System.out.println("----------------------------------------------------------");
        homeCinemaFacade.arreterRadio();
    }
}
