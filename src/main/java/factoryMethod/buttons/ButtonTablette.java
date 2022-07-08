package factoryMethod.buttons;

public class ButtonTablette implements Button{

    private Boolean pression;

    public ButtonTablette(){
        pression = false;
    }
    @Override
    public void toggle() {
        pression = !pression;
        System.out.println(pression ? "Bouton pressé" : "Bouton relaché");
    }
}
