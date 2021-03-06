package xyz.rossanderson.cs046.Coloring;

// BlueJ Project: lesson4/fewerColors
// Video: Color Reduction 2

// Please see instructor notes below for more explanation about this problem!

public class Color
{
    private int red;
    private int green;
    private int blue;

    /**
     * Uses only six values for red, green, blue.
     */
    public void reduce2() {
        this.red = (red/51)*51;
        this.green = (green/51)*51;
        this.blue = (blue/51)*51;
    }
    public void reduce()
    {
        this.red = (red*6/256)*51;
        this.blue = (blue*6/256)*51;
        this.green = (green*6/256)*51;
        // TODO: Change the values for red, green, and blue
        // to one of the following: 0, 51, 102, 153, 204, 255
    }
    public void turnGray()
    {
        // TODO: Change this color to its equivalent gray value.
        // The red, green, and blue variables should all be
        // set to the gray level, which is computed as a weighted
        // average of the original red, blue, and green levels.
        // The weights (corresponding to the sensitivity of the
        // cone cells in the human eye) are:
        // red - 0.2126
        // green - 0.7152
        // blue - 0.0722
        double avgValue = ((red*0.2126)+(green*0.7152)+(blue*0.0722));
        this.red = (int)(avgValue);
        this.green = (int)(avgValue);
        this.blue = (int)(avgValue);
    }
    public void redden(int addToRed)
    {

        final int MAX_RED = 255;
        red = Math.min(red+addToRed,MAX_RED);
        // TODO

    }

    /**
     *  Constructs a new Color object.
     * @param red the red value of the color (between 0 and 255)
     * @param green the green value of the color (between 0 and 255)
     * @param blue the blue value of the color (between 0 and 255)
     */
    public Color(int red, int green, int blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**
     *   Gets the red value of this color.
     *   @return the red value (between 0 and 255)
     */
    public int getRed()
    {
        return red;
    }

    /**
     *   Gets the green value of this color.
     *   @return the green value (between 0 and 255)
     */
    public int getGreen()
    {
        return green;
    }

    /**
     *   Gets the blue value of this color.
     *   @return the blue value (between 0 and 255)
     */
    public int getBlue()
    {

        return blue;
    }

    // Color constants

    public static final Color RED = new Color(255, 0, 0);
    public static final Color GREEN = new Color(0, 255, 0);
    public static final Color BLUE = new Color(0, 0, 255);
    public static final Color WHITE = new Color(255, 255, 255);
    public static final Color LIGHT_GRAY = new Color(192, 192, 192);
    public static final Color GRAY = new Color(128, 128, 128);
    public static final Color DARK_GRAY = new Color(64, 64, 64);
    public static final Color BLACK = new Color(0, 0, 0);
    public static final Color CYAN = new Color(0, 255, 255);
    public static final Color MAGENTA = new Color(255, 0, 255);
    public static final Color YELLOW = new Color(255, 255, 0);
    public static final Color PINK = new Color(255, 175, 175);
    public static final Color ORANGE = new Color(255, 200, 0);
}
