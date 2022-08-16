/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constants;

/**
 *
 * @author minab
 */
public class Constants {
    
    // make constants Black_Jack, Scratch_Offs, Slots for main //
    public static final int Black_Jack = 1;
    public static final int Scratch_Offs = 2;
    public static final int Slots = 3; 
    
    // Add constant integers BET, PAIR_PAYOUT and TRIIPLE_PAYOUT and set them aproperiately
    public static final int BET = 5;
    public static final int PAIR_PAYOUT = 5;
    public static final int TRIPLE_PAYOUT  = 50;
    
    // add deck constant emulators and integers for Black Jack card and deck
    public static final int DECK = 52;
    public static final int BLACK_JACK_BET = 10;
    public static final int BLACK_JACK_WIN = 20;
    public enum COLOR {RED, BLACK};
    public enum SUIT{CLUBS, DIAMONDS, HEARTS, SPADES};
    public enum FACE_VALUE {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE};
    
    // add blackjack game constants 
    public static final int HIT = 1;
    public static final int STAND = 0;
    public static final int DEALER_HIT = 16;
    public static final int DEALER_STAND = 17;
    public static final int ZERO = 0;
    public static final int BUST = 21;
    public static final int DEALERBUST_TIED_PWINS = 10;

// add scratchOff constants
public static final int ONEDOLLAR = 1;
public static final int  FIVEDOLLAR =5;
public static final int TENDOLLAR = 10;
    

    
    
}
