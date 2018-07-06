package _04_EnumerationsAndAnnotations_Exercises._01_CardSuit;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Suits:");

        for (CardSuits cardSuit : CardSuits.values()) {
            System.out.println("Ordinal value: " + cardSuit.ordinal() + "; Name value: " + cardSuit.name());
        }
    }
}
