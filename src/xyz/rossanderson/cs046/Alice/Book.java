package xyz.rossanderson.cs046.Alice;
// BlueJ Project: lesson4/book1
// Video: Working with the Book Text

import java.util.Scanner;
import java.io.File;

public class Book
{
    private String bookText;

    public Book(String fileName)
    {
        readBook(fileName);
    }

    /**
     * Calculates the number of characters (as in letters and
     * symbols, not people) in the book.
     * @return the number of letters and symbols in the book.
     */
    public int getNumCharacters()
    {

        return bookText.length();
        // TODO: Complete this method
        // You will want to use the fact sheet linked in the instructor comments.
        // Which string method do you want to use?
    }

    /**
     * Finds where the string "Mad Hatter" occurs for the first time in the book.
     * @return the location of the first occurrence of the string
     */
    public int firstOccurrenceOfMadHatter()
    {
        // TODO: Complete this method


        // Check the fact sheet. There is a String function
        // that can do this for you.
        return bookText.indexOf("Mad Hatter") ;
    }

    /**
     * Gets the first sentence of this book.
     * @return the first sentence (including the period) of this book.
     */
    public String getFirstSentence()
    {
        // TODO: Return the first sentence
        return bookText.substring(0,bookText.indexOf(".")+1);
    }

    /**
     * Gets the second sentence of this book.
     * @return the second sentence (including the period) of this book.
     */
    public String getSecondSentence()
    {
        // TODO: Get the second sentence
        int secondSentenceStart = bookText.indexOf(".")+1;
        int secondSentenceEnd = bookText.indexOf(".",secondSentenceStart+1)+1;
        return bookText.substring(secondSentenceStart,secondSentenceEnd);
        // Locate the period of the first sentence
        // Return the substring consisting of everything after that period up to
        // the second period
    }

    /**
     *  Counts how many times "Alice" occurs in this book.
     *  @return the number of occurrences
     */
    public int occurrencesOfAlice()
    {
        // TODO: Find the number of times the word "Alice" occurs in this book

        int lengthOfBook = bookText.length();
        String shortenedBookText = bookText.replace("Alice","");
        int lengthOfShortened = shortenedBookText.length();
        int bookDifference = lengthOfBook-lengthOfShortened;
        int numberOfAlices = bookDifference/5;
        return numberOfAlices;

    }

    public int occurrencesOf(String word)
    {
        // TODO: Complete this method
        int lengthOfBook = bookText.length();
        String shortenedBookText = bookText.replace(word,"");
        int lengthOfShortened = shortenedBookText.length();
        int bookDifference = lengthOfBook-lengthOfShortened;
        int numberOfTimes = bookDifference/(word.length());
        return numberOfTimes;
    }


    /**
     * A method to help read the book out of the file.
     * You don't have to read this unless you want to.
     * the "try" and "catch" are java's way of dealing with
     * runtime errors or "exceptions".
     */
    public String readBook(String fileName)
    {
        bookText = "";
        try
        {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNextLine())
            {
                String line = file.nextLine();
                bookText += line + "\n";
            }
            file.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return fileName;
    }
}
