package cards;

import java.util.ArrayList;

public class Deck {
    public ArrayList<PokerCard> cards;
    public int size;
    public Deck() {
        this.cards = new ArrayList<PokerCard>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] names = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        //for of loop
        for (String suit : suits) {
            for (String name : names) {
                PokerCard newCard = new PokerCard(suit, name);
                this.cards.add(newCard);
            }
        }
        this.size = this.cards.size();
        this.shuffle();
    }
    public void shuffle() {
        //loop through the deck
        for (int i = 0; i < this.cards.size(); i++) {
            //generate a random index
            int randIndex = (int) Math.floor(Math.random() * this.cards.size());
            //swap the card at i with the card at randIndex
            PokerCard temp = this.cards.get(i);
            this.cards.set(i, this.cards.get(randIndex));
            this.cards.set(randIndex, temp);
        }
    }
    public PokerCard deal(){
        PokerCard dealt = this.cards.get(0);
        this.cards.remove(0);
        this.size--;
        return dealt;
    };
    public void reset() {
        this.cards = new ArrayList<PokerCard>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] names = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        //for of loop
        for (String suit : suits) {
            for (String name : names) {
                PokerCard newCard = new PokerCard(suit, name);
                this.cards.add(newCard);
            }
        }
        this.size = this.cards.size();
        this.shuffle();
    }
}
