/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import constants.Constants;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author minab
 */
public class Dealer implements IDealer {

    @Override
    public int hitOrStand() {
     
        // if player wants to hit then HIT otherwise STAND
        if(score  < Constants.DEALER_HIT)
            return Constants.HIT;
        else 
            return Constants.STAND;
    }

    @Override
    public Card deal(Deck deck) {
        // instantiating card and iterator to loop through deck
        Card card = new Card();
        Iterator<Card> ld = deck.getDeck().iterator();
        
        if(ld.hasNext())  
            card = ld.next();
        
        deck.getDeck().remove(card);
        return card;
    }
    private ArrayList <Card> hand;
    private int score;

    /**
     * @return the hand
     */
    public ArrayList <Card> getHand() {
        return hand;
    }

    /**
     * @param hand the hand to set
     */
    public void setHand(ArrayList <Card> hand) {
        this.hand = hand;
    }

    /**
     * @return the score
     */
    public int getScore() {
          score = 0;
           
           // loop through hand arraylist, add up the cards and store it in score
          for(Card card : hand) {
                score += card.getValue();
          }
          return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }
    
}
