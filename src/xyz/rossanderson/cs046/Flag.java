package xyz.rossanderson.cs046;

/**
 * Created by randerson on 8/19/2016.
 */
// Bluej project: lesson5/indonesianFlag

// Please use the >= operator
public class Flag
{
    private Picture pic;
    private int width;
    private int height;

    // This constructor creates a new flag object and draws it.
    // You don't need to change this.
    public Flag(int width, int height)
    {
        this.width = width;
        this.height = height;
        pic = new Picture(width, height);
        pic.draw();
        for (int x = 0; x < width; x++)
        {
            for (int y = 0; y < height; y++)
            {
                Color c = getColorAt(x, y);
                pic.setColorAt(x, y, c);
            }
        }
    }

    public Color getColorAt(int x, int y)
    {
        // TODO: add correct conditions between the parentheses after the if statement
        // to determine which color needs to be used at any (x, y) coordinate
        // TODO: set the variable c to that color
        Color c;
        if (x < (width/3))
        {
            c = Color.BLUE;
        }
        else if (x < (width*2/3))
        {
            c = Color.WHITE;
        }
        else
        {
            c = Color.RED;
        }
        return c;
//        if (y >= (height/2))
//        {
//            c = Color.WHITE;
//        }
//        else
//        {
//            c = Color.RED;
//        }


        return c;
    }

}
