/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dini Aryani
 */
import java.util.Scanner;
 
/**
 * Java Program to Delete Vowels from String
 */
public class DeleteWordFromSentence {
    public static void main(String args[]) {
        String sentence, sentencee, word;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter a Sentence");
        sentence = scanner.nextLine();
 
        System.out.println("Enter word you want to delete from Sentence");
        word = scanner.nextLine();
        // Deleting word from
        sentencee = sentence.replaceAll(word, "");
 
        System.out.println("Output Sentence\n" + sentencee);
    }
}