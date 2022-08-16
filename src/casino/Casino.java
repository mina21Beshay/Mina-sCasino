/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;
// import scanner and classes into casino package//

import java.util.Scanner;
import blackjack.BlackJack;
import scratchoffs.ScratchOffs;
import slots.Slots;
import constants.Constants;
import userInterface.CasinoUI;
/**
 *
 * @author minab
 */
public class Casino {

    // declare private static classes //
    private static BlackJack BlackJack;
    private static ScratchOffs scratchoffs;
    private static Slots slots;
    private static Player player;
    private static Scanner scan;
    private static CasinoUI ui;
    /**
     *
     * @param args
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int game;
        scan = new Scanner(System.in);

        //instantiate player object
        player = new Player();
       
        // instantiate CasinoUi
        ui = new CasinoUI (new Casino() );
        /*
         game = displayMenu();

        // Write a switch statement to go to the correct game based on user's input // 
        switch (game) {
            case Constants.Black_Jack:
                BlackJack = new BlackJack(player);
                BlackJack.play();
                break;

            case Constants.Scratch_Offs:
                 scratchoffs = new ScratchOffs (player); 
                scratchoffs.play();
                break;

            case Constants.Slots:
                slots = new Slots(player);
                slots.play();
                break;

            default:
                System.out.println("Wrong game option, try again ");

        }
        
        */

    }

    // method displayMenu to display the player's game options //
    private static int displayMenu() {

        int select;
        // keep looping displayMenu while user's input is <1 or >3  //
        do {
            System.out.println("WELCOME TO MINA'S CASINO! \n");
            System.out.println("Select a game to play");
            System.out.println("1. Black Jack");
            System.out.println("2. Scratch Off Tickets");
            System.out.println("3. Slot Machines");
            select = scan.nextInt();

        } while (select < Constants.Black_Jack || select > Constants.Slots);

        return select;
    }

    /**
     * @return the BlackJack
     */
    public static BlackJack getBlackJack() {
        return BlackJack;
    }

    /**
     * @param aBlackJack the BlackJack to set
     */
    public static void setBlackJack(BlackJack aBlackJack) {
        BlackJack = aBlackJack;
    }

    /**
     * @return the scratchoffs
     */
    public static ScratchOffs getScratchoffs() {
        return scratchoffs;
    }

    /**
     * @param aScratchoffs the scratchoffs to set
     */
    public static void setScratchoffs(ScratchOffs aScratchoffs) {
        scratchoffs = aScratchoffs;
    }

    /**
     * @return the slots
     */
    public static Slots getSlots() {
        return slots;
    }

    /**
     * @param aSlots the slots to set
     */
    public static void setSlots(Slots aSlots) {
        slots = aSlots;
    }

    /**
     * @return the player
     */
    public static Player getPlayer() {
        return player;
    }

    /**
     * @param aPlayer the player to set
     */
    public static void setPlayer(Player aPlayer) {
        player = aPlayer;
    }

}
