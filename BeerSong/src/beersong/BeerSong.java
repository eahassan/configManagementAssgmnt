/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author ehassan
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    
    /* Main function */
    
    public static void main(String[] args) {
        // Main function calls the Ninety_Nine_Bottles_of_Beer function.
        Ninety_Nine_Bottles_of_Beer ();
    }
    
    /* Ninety_Nine_Bottles_of_Beer */
    
    public static void Ninety_Nine_Bottles_of_Beer () {
        // Variable declarations
        int numofBeer = 99;
        String word = "bottles";
        
        // Loop through numbers 99 to 0.
        //Print out beer song.
        while (numofBeer > 0) {
            System.out.println(numofBeer + " " + word + " of beer on the wall, " + numofBeer + " " + word + " of beer");
            numofBeer = numofBeer - 1;
            
            // If number of beers equal to 1, then set word to bottle.
            if (numofBeer == 1) {
                word = "bottle";
            }
            
            // If number of beers greater than 0, then print statement.
            if (numofBeer > 0) {
                System.out.println("take one down, pass it round, " + numofBeer + " " + word + " of beer on the wall.");
            }
            
            // If number of beers equal to 0, then set word to bottle and print statement.
            if (numofBeer == 0) {
                word = "bottles";
            System.out.println("take one down, pass it round, " + "no more " + word + " of beer on the wall.");
           }
        }
    }
    
}
