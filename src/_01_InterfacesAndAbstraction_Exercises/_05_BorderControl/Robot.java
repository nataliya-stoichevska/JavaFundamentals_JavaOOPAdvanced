package _01_InterfacesAndAbstraction_Exercises._05_BorderControl;

public class Robot implements Identity {

    private String id;

    public Robot(String id) {
        this.id = id;
    }

    @Override
    public String getID() {
        return this.id;
    }
}