/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reversewords;
import java.util.Scanner;
/**
 *
 * @author Megha
 */
public class ReverseWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = sc.nextLine();
        char [] letters = new char[word.length()];
        for(int i=0; i<word.length();i++)
        {
            letters[i] = word.charAt(i);
        }
        
        for(int i=letters.length-1; i>=0; i--)
        {
            System.out.print(letters[i]);
        }
        System.out.println();

    }
    
}
