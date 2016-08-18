package xyz.rossanderson.cs046;

/**
 * Created by randerson on 8/17/2016.
 */
// BlueJ project: Tiles
// Video: Your turn to do it by hand

import java.util.Scanner;

public class Tiles
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Width of wall: ");
        double width = in.nextDouble();

        System.out.print("Tile size: ");
        double tileSize = in.nextDouble();

        // TODO: Complete these computations
        int pairs = (int)((width-tileSize)/tileSize);
        int redTiles = pairs/2;
        int whiteTiles = (pairs/2)+1;

        System.out.println("Red tiles: " + redTiles);
        System.out.println("Whites tiles: " + whiteTiles);
    }
}

