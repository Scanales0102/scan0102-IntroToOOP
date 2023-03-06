/**
 * 
 * Problem:
 * As of right now, Java comes with 8 primitive datatypes. 
 * What if we wanted to create our own datatypes?
 * 
 * Solution:
 * Classes allow us to define a custom datatype.
 * When we create a variable with a class as its datatype, that variable is considered an object.
 * NOTE: We have already seen objects with the String class.  
 *          Try "ctrl + left-click" on the text "String" to see the source code of the String class.
 * 
 * An object is an instantiation of a class.
 * We would like objects to be able to:
 *      a) contain some data
 *      and
 *      b) change its behavior based off of the data that it individually contains.
 *
 * Let's say we're working on a birdwatching app.
 * Using OOP, we could maintain many bird objects which individually contain their own
 * age, and can generate their own sound. This concept of an object controlling its own data can be
 * referred to as encapsulation.
 *
 * In the app, an individual bird should be able to "Tweet" if ageMonths is less than 3 and "Chirp" if ageMonths is
 * greater than or equal to 3.
 * 
 * 
 */


public class Application {
    /**
     * This class contains a main method that allows you to manually test creation of Bird objects modelled after
     * the Bird class.
     * No changes you make here affect the test case results. You must still run & pass the test cases.
     * All implementation code should be written in the Bird class.
     *
     * Bird objects should follow the behavior outlines in the documentation of the Bird class.
     */
    public static void main(String[] args) {

        System.out.println("This bird is 2 months old, and should Tweet. Here's the current sound: ");
        Bird b1 = new Bird();
        b1.ageMonths = 2;
        System.out.println(b1.sound());

        System.out.println("This bird is 6 months old, and should Chirp. Here's the current sound: ");
        Bird b2 = new Bird();
        b2.ageMonths = 6;
        System.out.println(b2.sound());

        System.out.println("This bird is 3 months old, and should Chirp. Here's the current sound: ");
        Bird b3 = new Bird();
        b3.ageMonths = 3;
        System.out.println(b3.sound());
    }
}
