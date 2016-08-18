package xyz.rossanderson.cs046;

/**
 * Created by randerson on 8/17/2016.
 */
public class CheckerBoardPainter {
    /**
     * Spaces are red if one of the coordinates is even and the other is odd
     * Spaces are blue if both coordinates are even
     * Spaces are blue if both coordinates are odd
     *
     * @return 1 for red spaces and 0 for blue
     * @param row the row of the space to paint
     * @param col the column of the space to paint.
     */
    private int colorValue;

    public int getColor(int row, int col)
    {
        colorValue = ((row+col)%2);

        return colorValue;
    }
        //To do!



    }

