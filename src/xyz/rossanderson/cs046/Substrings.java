package xyz.rossanderson.cs046;

/**
 * Created by randerson on 8/19/2016.
 */
public class Substrings
{
    /**
     * Gets the first character of the parameter
     * @param text the string we want the first character of
     * @return a string containing the first character
     */
    public String firstCharacter(String text)
    {
        String firstChar = text.substring(0,1);
        return firstChar;
    }

    public String lastCharacter(String text)
    {
        int strLength = text.length();
        String lastChar = text.substring(strLength-1,strLength);
        return lastChar;
    }
}
