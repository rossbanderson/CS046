package xyz.rossanderson.cs046.Ballons;

/**
 * Created by randerson on 8/19/2016.
 */
//Implement a class Balloon that models a spherical balloon that is being filled with air.
//The constructor constructs an empty balloon (That is, the volume is 0).

//Supply these methods:
//	void addAir(double amount) adds the given amount of air
//	double getVolume() gets the current volume
//	double getSurfaceArea() gets the current surface area
//	double getRadius() gets the current radius

// Need help starting this question? In the lesson titled
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 3 - Question 3" for some tips on
// how to begin.

//See this link for formulas for volume and surface area:
//    http://math.about.com/od/formulas/ss/surfaceareavol.htm

//Hints
//	You can find the nth root of a number by using the pow method from the Math class
//  where the exponent is 1/n.
//	You will need to solve the volume formula for radius.


/**
 * models a spherical balloon that is being filled with air
 */
public class Balloon
{
    private double airVol = 0;
    private Double radius;
    private Double surfaceArea;

    public void addAir(double amount) {
        this.airVol = this.airVol + amount;
        this.radius = (Math.cbrt((this.airVol*(3./4.)/Math.PI)));
        this.surfaceArea = (4*Math.PI*(Math.pow(radius,2)));
    }
    public double getVolume(){
        return airVol;
    }
    public double getSurfaceArea(){
        return surfaceArea;
    }
    public double getRadius(){
        return radius;
    }


}
