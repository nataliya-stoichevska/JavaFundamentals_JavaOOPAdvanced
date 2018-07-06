package _04_EnumerationsAndAnnotations_Exercises._03_CardsWithPower;

public class Card {

    private CardRank rank;
    private CardSuit suit;

    public Card(CardRank rank, CardSuit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getCardPower() {
        return (this.rank.getValue() + this.suit.getValue());
    }

    public CardRank getRank() {
        return this.rank;
    }

    public CardSuit getSuits() {
        return this.suit;
    }

    @Override
    public String toString() {
        return "Card name: " + this.rank + " of " + this.suit + "; Card power: " + getCardPower();
    }
}
