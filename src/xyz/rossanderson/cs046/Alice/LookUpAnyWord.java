package xyz.rossanderson.cs046.Alice;

/**
 * Created by randerson on 8/18/2016.
 */
// BlueJ Project: lesson4/book7
// Video: Working with the Book Text

import java.util.Scanner;

public class LookUpAnyWord
{
    public static void main(String[] args)
    {
        System.out.print("Type a word and I'll tell you how many times it appears: ");
        // TODO: Create an scanner object to read the user input
        // Read a word from the scanner and assign it to a String variable named word
        Scanner userInput = new Scanner(System.in);
        String word = userInput.nextLine();

        // TODO: Create a book object that reads from aliceInWonderland.txt
        Book newBook = new Book("aliceInWonderland.txt");
        int occurrences = newBook.occurrencesOf(word);


        // TODO: Find the number of occurences of that word and assign it to a variable named occurences
        System.out.println(word + " occurs " + occurrences + " times!");
    }
}
