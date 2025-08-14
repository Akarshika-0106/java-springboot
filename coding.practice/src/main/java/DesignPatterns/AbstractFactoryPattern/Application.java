package DesignPatterns.AbstractFactoryPattern;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void renderUi(){
        button.render();
        checkbox.render();
    }


}
