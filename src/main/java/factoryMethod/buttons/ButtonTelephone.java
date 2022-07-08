package factoryMethod.buttons;

public class ButtonTelephone implements Button {

    private Boolean pression;

    public ButtonTelephone(){
        pression = false;
    }

    @Override
    public void toggle() {
        pression = !pression;
        System.out.println(pression ? "Bouton pressé" : "Bouton relaché");
    }
}
