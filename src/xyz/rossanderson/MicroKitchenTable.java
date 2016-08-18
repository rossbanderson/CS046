package xyz.rossanderson.cs046;

// BlueJ project: lesson4/formattedOutput
// Video: Formatted Output Practice Part 2

public class MicroKitchenTable
{
    public static void main(String[] args)
    {
        int saraCookiesPerDay = 3;
        double saraCerealPerDay = .06;
        String saraName = "Sara";
        int cayCookiesPerDay = 1;
        double cayCerealPerDay = 0;
        String cayName = "Cay";
        System.out.println("cookies | cereal | name");
        System.out.println("------------------------");

        // TODO: Print entries for Sara
        // Be sure to line up the entries in the columns using printf
        // Print floating-point numbers with two digits after the decimal point

        System.out.printf("%8d", saraCookiesPerDay);
        System.out.printf("|");
        System.out.printf("%8.2f", saraCerealPerDay);
        System.out.printf("|");
        System.out.printf("%s\n",saraName);
        // TODO: Print entries for Cay
        System.out.printf("%8d", cayCookiesPerDay);
        System.out.printf("|");
        System.out.printf("%8.2f", cayCerealPerDay);
        System.out.printf("|");
        System.out.printf("%s\n",cayName);
    }
}
