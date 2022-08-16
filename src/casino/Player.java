/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import java.util.Scanner;
import constants.Constants;
import java.util.ArrayList;
import blackjack.Card;
import constants.Constants.FACE_VALUE;

/**
 *
 * @author minab
 */
public class Player implements IPlayer    {

    @Override
    public int hitOrStand() {
        int choice; 
        // ask player if he wants to HIT or STAND and get his input
        System.out.println("Do you want to HIT or STAND?  (1 = HIT, 0 = STAND)");
        choice = scan.nextInt();
        // if player wants to hit then HIT otherwise STAND
        if(choice == Constants.HIT)
            return Constants.HIT;
        else 
            return Constants.STAND;
    }
    private String name;
    private int cash; 
    private Scanner scan;
    
// blackJack 2 member variables
    private ArrayList <Card> hand;
    private int score;
    private boolean busted;
    private boolean play;
    
    // method playAgain 
    public boolean playAgain()   {
        int choice; 
        // ask player if he wants another hand and get input 
        System.out.println("Do you want to play again? (0 = No, 1 = Yes)");
        choice = scan.nextInt();
       // if player wants to play again return true otherwise return false
        if(choice == 1) 
            return true;
        else 
            return false;
    }
    
    public Player()  {
        
/*
         // Update clas Player to inform the user they need a minimum of $10 to play     FIXME
        scan = new Scanner(System.in);
        String playerName;
        int money;
        // prompt player to enter his name and $$ he wants to use and store it in name, money varualbes
        System.out.println("\n Enter your name");
        playerName = scan.next();
        
        System.out.println("\n Enter $$ ");
        money = scan.nextInt();
        
        setName(playerName);
        setCash(money);
        */
        
        
    }
    
    /**
     * @return the name
     */
    public String getName() {
        
        
        return name;
    }

    /**
     * @return the cash
     */
    public int getCash() {
        return cash;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param cash the cash to set
     */
    public void setCash(int cash) {
        this.cash = cash;
    }

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
        // loop through hand arraylist, add up the cards, and store it in score 
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

    /**
     * @return the busted
     */
    public boolean isBusted() {
        return busted;
    }

    /**
     * @param busted the busted to set
     */
    public void setBusted(boolean busted) {
        this.busted = busted;
    }

    /**
     * @return the play
     */
    public boolean isPlay() {
        return play;
    }

    /**
     * @param play the play to set
     */
    public void setPlay(boolean play) {
        this.play = play;
    }
}
