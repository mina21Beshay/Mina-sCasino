/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import constants.Constants.COLOR;
import constants.Constants.FACE_VALUE;
import constants.Constants.SUIT;
import constants.Constants;

/**
 *
 * @author minab
 */
public class Card {
    
    // add Enumeration data types Face, Suit and Color
    private COLOR color;
    private SUIT suit;
    private FACE_VALUE face;
    
    // add member variable value
    private int value;
    // make hashCode method to create and return int hashcode
    public int hashCode()   {
        int hashcode = 0;;
        return hashcode;
    }
    
    public boolean equals(Object obj)   {

     if(obj instanceof Card)  {
        //Explicitly convert the parameter to an instance of class Card          
        Card card = (Card)obj;
        // compare the face, color and suit of card to existing object and return result
        return (card.face.equals(this.face) && card.color.equals(this.color) && card.suit.equals(this.suit));
    }
    else 
        return false;
    }
    // method for debugging purposes 
    public String toString()  {
       String card;
       card = this.face + " of "+ this.suit;
       return card;
    }
// getters and setters for Enumeration Color, suit and face 
    /**
     * @return the color
     */
    public COLOR getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(COLOR color) {
        this.color = color;
    }

    /**
     * @return the suit
     */
    public SUIT getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(SUIT suit) {
        this.suit = suit;
    }

    /**
     * @return the face
     */
    public FACE_VALUE getFace() {
        return face;
    }

    /**
     * @param face the face to set
     */
    public void setFace(FACE_VALUE face) {
        this.face = face;
    }

    /**
     * @return the value
     */
    public int getValue() {
          value = 0;
          switch(face) {
                case TWO:
                    value = 2;
                    break;
                
                case THREE:
                    value = 3;
                    break;
               
                case FOUR:
                    value = 4;
                    break;
               
                case FIVE:
                    value = 5;
                    break;
               
                case SIX:
                    value = 6;
                    break;
               
                case SEVEN:
                    value = 7;
                    break;
               
                case EIGHT:
                    value = 8;
                    break;
               
                case NINE:
                    value = 9;
                    break;
               
                case TEN:
                case JACK:
               case QUEEN:
               case KING:
                   value = 10;
                   break;
               
               case ACE:
                   value = 11;
                   break;
          }
        
        return value;
    }

    }
    
    
    
    // Getters and setters for Color, Suit and Face member variables below
    /**
     * @return the Color
     */

    
    

