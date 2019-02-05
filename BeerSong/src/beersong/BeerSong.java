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
    public static void main(String[] args) {
        // Main function calls the Ninety_Nine_Bottles_of_Beer function.
        Ninety_Nine_Bottles_of_Beer ();
    }
    
    public static void Ninety_Nine_Bottles_of_Beer () {
        // Variable declarations
        int numofBeer = 99;
        String word = "bottles";
        
        
        while (numofBeer > 0) {
            System.out.println(numofBeer + " " + word + " of beer on the wall, " + numofBeer + " " + word + " of beer");
            numofBeer = numofBeer - 1;
            
            if (numofBeer == 1) {
                word = "bottle";
            }
            
            if (numofBeer > 0) {
                System.out.println("take one down, pass it round, " + numofBeer + " " + word + " of beer on the wall.");
            }
            
            if (numofBeer == 0) {
                word = "bottles";
            System.out.println("take one down, pass it round, " + "no more " + word + " of beer on the wall.");
           }
        }
    }
    
}
