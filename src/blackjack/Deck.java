/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;


import java.util.HashSet;
import java.util.Set;
import constants.Constants.FACE_VALUE;
import constants.Constants.SUIT;
import constants.Constants.COLOR;
import constants.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author minab
 */
public class Deck {
    
    // add member variable 
    private Set<Card> deck;                     
    
    // Write a customer constructor 
    public Deck()   {
        generateDeck();
        displayDeck();
        shuffleDeck();
       // displayDeck();
    }
    
    // create generateDeck method
    private void generateDeck()  {
        
        deck = new HashSet<Card> (Constants.DECK);
        
        // Loop through Suit and Face emuns
        for( FACE_VALUE face: FACE_VALUE.values())   {
            for(SUIT suit: SUIT.values())   {
                // Instantiate an instance of class Card    
                Card card1= new Card();
                card1.setSuit(suit);
                card1.setFace(face);
                // set color based on suit of card
                if(suit == SUIT.CLUBS || suit == SUIT.SPADES)  {
                    card1.setColor(COLOR.BLACK);
                }
                else {
                    card1.setColor(COLOR.RED);
                }
                // Verifies the instance of Card created is not contained in the HashSet of cards
                if(!deck.contains(card1))  {
                    // if true, add it to the deck
                    deck.add(card1);
                }
            }
        }
    }
    
    // create displayDeck method 
    private void displayDeck()    {
        System.out.println("*******************************");  
        System.out.println("DISPLAYING DECK OF CARDS");
        System.out.println("*******************************"); 
        System.out.println("Deck includes: ");
        System.out.println("Deck size:" + deck.size() + "card(s)");
        
        // iterate through hashset collection otherwise known as Deck
        deck.forEach((card1) -> {
            // display color, face, and suit of each card in the deck
            System.out.println("Card: " +card1.getFace() + " of " +card1.getSuit() + " is color " +card1.getColor());
        });
    }
    
    // create deck shuffle method
    private void shuffleDeck()       {
        System.out.println("*******************************");  
        System.out.println("SHUFFLING DECK OF CARDS");
        System.out.println("*******************************");  


        // Instantiate an arraylist of type Card that implements passes set deck as a parameter  
          ArrayList <Card> al = new ArrayList <>(deck);
          // use collection method to shuffle arraylist/deck
          Collections.shuffle(al);
          // make shuffle deck your new deck by reinstantiating it
          deck = new HashSet<> (al);
    }
    


    /**
     * @return the deck
     */
    public Set<Card> getDeck() {
        return deck;
    }

    /**
     * @param deck the deck to set
     */
    public void setDeck(Set<Card> deck) {
        this.deck = deck;
    }
}
