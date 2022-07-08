package factoryMethod.buttons;

public class ButtonEnceinte implements Button{

    private Boolean pression;

    public ButtonEnceinte(){
        pression = false;
    }

    @Override
    public void toggle() {
        pression = !pression;
        System.out.println(pression ? "Bouton pressé" : "Bouton relaché");
    }
}
