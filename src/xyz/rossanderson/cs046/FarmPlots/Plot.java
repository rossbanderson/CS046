package xyz.rossanderson.cs046.FarmPlots;

/**
 * Created by randerson on 8/18/2016.
 */
// BlueJ Project: lesson4/fields

public class Plot
{
    private int width;
    private int length;

    /**
     Constructs a plot of a given size.
     @param width the width of the plot
     @param length the length of the plot
     */
    public Plot(int width, int length)
    {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the number of circular fields that can fit on this plot.
     */
    public int getNumberOfFields(int radius)
    {
        // TODO: Using the formulas that we developed, compute
        // the total number of rows, then
        // the number of even and odd rows,
        // the number of columns in each even and odd row,
        // and finally the total number of fields
        int diameter = radius*2;

        int columnsOdd = (int) (width/diameter);
        int columnsEven = (int) ((width-radius)/diameter);

        int totalRows = (int) (((length-diameter)/
                (radius*Math.sqrt(3)))
                +1);
        int rowsEven = (int) (totalRows/2);
        int rowsOdd = (int) (totalRows-rowsEven);

        int totalFields = (rowsEven*columnsEven)+(rowsOdd*columnsOdd);
        return totalFields;


    }
}
