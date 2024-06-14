//1.2.5 Our First Integer

public class Variables
{
    public static void main(String[] args)
    {
        // Start here!
        int year = 2023;
        System.out.print("The current year is ");
        System.out.println(year);
    }
}

//1.2.9 Answering Questions

public class Variables 
{
    public static void main(String[] args)
    {
        String bestFriendsName = "Tracy the Turtle";
        int luckyNumber = 3;
        double roomSqFootage = 115.46;
        boolean doesBallet = false;
        
        System.out.println(bestFriendsName);
        System.out.println(luckyNumber);
        System.out.println(roomSqFootage);
        System.out.println(doesBallet);
    }
}

//1.2.10 Team Rankings

public class TeamRanks
{
    public static void main(String[] args) {
        String team1 = "Alabama";
        String team2 = "Ohio State";
        String team3 = "Florida State";
        String team4 = "USC";
        String team5 = "Clemson";
        String team6 = "Penn State";
        String team7 = "Oklahoma";
        String team8 = "Maryland";
        String team9 = "Wisconsin";
        String team10 = "Michigan";
        
        String temp = team10;
        team10 = team2;
        team2 = team6;
        team6 = team5;
        team5 = team4;
        team4 = temp;
        temp = team3;
        team3 = team8;
        team8 = team9;
        team9 = temp;
        
        System.out.print("1. ");
        System.out.println(team1);
        System.out.print("2. ");
        System.out.println(team2);
        System.out.print("3. ");
        System.out.println(team3);
        System.out.print("4. ");
        System.out.println(team4);
        System.out.print("5. ");
        System.out.println(team5);
        System.out.print("6. ");
        System.out.println(team6);
        System.out.print("7. ");
        System.out.println(team7);
        System.out.print("8. ");
        System.out.println(team8);
        System.out.print("9. ");
        System.out.println(team9);
        System.out.print("10. ");
        System.out.println(team10);
    }
}

//1.3.6 Weight of a Pyramid
public class Pyramid 
{
    public static void main(String[] args)
    {
        double blockWeight = 2.5;
        double numBlocks = 2500000.0;
        
        double totalWeight = blockWeight * numBlocks;
        
        System.out.print("The pyramid weighs ");
        System.out.print(totalWeight);
        System.out.println(" tons");
    }
}

//1.3.7 Add Fractions
public class AddFractions 
{
    public static void main(String[] args)
    {
        int firstNum = 1; 
        int firstDen = 2;
        int secondNum = 9;
        int secondDen = 5;
        
        int newNum = (firstNum * secondDen + secondNum * firstDen);
        int newDen = firstDen * secondDen;

        System.out.print("The numerator of the first fraction is ");
        System.out.println(firstNum);
        System.out.print("The denominator of the first fraction is ");
        System.out.println(firstDen);
        System.out.print("The numerator of the second fraction is ");
        System.out.println(secondNum);
        System.out.print("The denominator of the second fraction is ");
        System.out.println(secondDen);
        
        System.out.print(firstNum);
        System.out.print("/");
        System.out.print(firstDen);
        System.out.print(" + ");
        System.out.print(secondNum);
        System.out.print("/");
        System.out.print(secondDen);
        System.out.print(" = ");
        System.out.print(newNum);
        System.out.print("/");
        System.out.println(newDen);
    }
}

//1.3.8 Freely Falling Bodies
public class FallingBodies
{
    public static void main(String[] args)
    {
        final double g = 9.8; 
        double t = 23;
        
        
        double h = 0.5 * g * t * t;
        double v = g * t; 
        
        System.out.print("The height of the waterfall is ");
        System.out.print(h);
        System.out.println(" m");
        System.out.print("The velocity of the pebble when it hits the ground is ");
        System.out.print(v);
        System.out.println(" m/s");
        
    }
}

//1.4.5 Work Shift
public class WorkShift
{
    public static void main(String[] args)
    {
        int hours = 20;
        int min = 42;
        int sec = 16;
        hours *= 60*60;
        min *= 60;
        int totalTime = hours + min + sec;
        System.out.println("The total time in seconds is:");
        System.out.println(totalTime);
      
    }
}

//1.4.6 Personalized T-shirts
public class Tshirt
{
    public static void main(String[] args)
    {
        int cost = 22;
        System.out.print("The t-shirt costs $"); 
        System.out.println(cost);
        cost++;
        System.out.print("A personalized t-shirt costs $");
        System.out.println(cost);
        cost--;
        System.out.print("Without personalization, the t-shirt costs $");
        System.out.println(cost);
      
    }
}

//1.5.6 Personalized T-shirts (User Input)
import java.util.Scanner;

public class Tshirt
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the cost of the t-shirt: "); 
        
        int cost = input.nextInt();
        System.out.print("The t-shirt costs $"); 
        System.out.println(cost);
        cost++;
        System.out.print("A personalized t-shirt costs $");
        System.out.println(cost);
        cost--;
        System.out.print("Without personalization, the t-shirt costs $");
        System.out.println(cost);
      
    }
}

//1.5.7 Night Out
import java.util.Scanner;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double dinner = 0;
        double laserTag = 0;
        double iceCream = 0;
        double total = 0;
        
        
        System.out.println("How much does dinner usually cost? ");
        dinner = input.nextDouble();
        
        // Compute cost of dinner for both people
        dinner += dinner * 2;
        
        System.out.println("How much is laser tag for one person? ");
        laserTag = input.nextDouble();
        
        // Compute cost of tag for both people
        laserTag *= 2;
        
        System.out.println("How much does a triple scoop cost? ");
        iceCream = input.nextDouble();
        
        // Compute cost of ice cream for both people
        iceCream += iceCream / 3;
        
        // Find total cost of the night
        total = dinner + laserTag + iceCream;
        
        System.out.println();
        
        // Print all totals
        System.out.print("Dinner: $");
        System.out.println(dinner);
        System.out.print("Laser Tag: $");
        System.out.println(laserTag);
        System.out.print("Ice cream: $");
        System.out.println(iceCream);
        System.out.print("Grand Total: $");
        System.out.println(total);

    }
}

//1.5.8 MLA Citation
import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        String author, title, publisher;
        int year;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the author's name as 'Last name, First name': ");
        author = input.nextLine();
        
        System.out.println("Enter the year the book was published: ");
        year = input.nextInt();
        input.nextLine();
        
        System.out.println("Enter the title of the book: ");
        title = input.nextLine();
        
        System.out.println("Enter the publisher of the book: ");
        publisher = input.nextLine();
        
 
        System.out.print(author);
        System.out.print(". ");
        System.out.print(title);
        System.out.println(".");
        System.out.print(publisher);
        System.out.print(", ");
        System.out.print(year);
        System.out.println(".");
        
    }
}

//1.6.4 Casting to an Int

import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Get double value
        System.out.println("Enter a double: ");
        double myDouble = input.nextDouble();
        
        // Cast double to an int
        int castValue = (int) myDouble;
        
        // Print double value and after double is cast
        System.out.println(myDouble);
        System.out.println(castValue);
        
        // Add 0.5 and print again
        myDouble += 0.5;
        castValue = (int) myDouble;
        
        System.out.println(myDouble);
        System.out.println(castValue);
        
    }
}

//1.6.5 Casting to a Double
import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your first integer ");
        int int1 = input.nextInt();
        System.out.println("Enter your second integer ");
        int int2 = input.nextInt();
        
        System.out.println("First int: " + int1);
        System.out.println("First int: " + int2);
        System.out.println((double)int1/(double)int2);
    }
}

//1.6.8 Movie Ratings
import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter movie rating (as a decimal)"); 
        double movieRating = input.nextDouble(); 
        
        // Round the movieRating to the nearest int and print it out!
        int rounded = (int) (movieRating + 0.5);
        System.out.print("Rating rounded: ");
        System.out.println(rounded);
    }
}
//1.6.11 Integer Overflow
public class IntegerOverflow
{
   public static void main(String[] args)
   {
     System.out.println(Integer.MIN_VALUE);
     System.out.println(Integer.MAX_VALUE);
     System.out.println(Integer.MIN_VALUE - 1);
     System.out.println(Integer.MAX_VALUE + 1);
   }
}

//2.1.8 Pizza Instance Variables

Pizza.java
// Sample solution
// Student code will vary based on what variables
//         students include
public class Pizza
{
    private String type;
    private String toppings;
    private int size;

}

PizzaTester.java
Solution Code
public class PizzaTester
{
    public static void main(String[] args)
    {
        System.out.println("You should be able to run this");
        System.out.println("if you added the instance variables correctly");
        
    }
}

//2.1.9 Game Skeleton
ConsoleGame.java
Solution Code
// Sample solution

/**
 * 
 * The ConsoleGame class represents a console game.
 * 
 * Every console game has a name, the console on which it's played,
 * recommended minimum age of user, and type of game.
 * 
 * 
 */ 

public class ConsoleGame
{

    // Attributes
    private String name;
    private String console;
    private int minAge;
    private String gameType;
    
    
    // Methods will go here

}

//2.2.6 Using the Rectangle Class
RectangleTester.java
Solution Code
public class RectangleTester 
{
    public static void main(String[] args)
    {
        // Create a rectangle with width 5 and height 12
        Rectangle rect = new Rectangle(5, 12);
        // Then print it out
        System.out.println(rect);
    }
}


Rectangle.java
Solution Code
public class Rectangle
{
    // Attributes
    private int width;
    private int height;
    
    // Constructor
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    
    // This method lets us print out the object
    // to see the values of the instance variables
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}

//2.2.7 New Student Field
StudentTester.java
Solution Code
public class StudentTester
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 9, 1);
        Student ada = new Student("Ada", "Lovelace", 11, 5);
        
        System.out.println(alan);
        System.out.println(ada);
    }
}

Student.java
Solution Code
public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    
    // Add an instance variable called numClubs here.
    private int numClubs;
    
    /**
     * This is a constructor.  A constructor is a method
     * that creates an object -- it creates an instance
     * of the class. What that means is it takes the input
     * parameters and sets the instance variables (or fields)
     * to the proper values.
     * 
     * Check out StudentTester.java for an example of how to use
     * this constructor and how to add numClubs to the constructor. 
     */
    public Student(String fName, String lName, int grade, int numberOfClubs)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        numClubs = numberOfClubs;
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + gradeLevel + 
            " and is in " + numClubs + " club(s).";
    }
}

//2.2.8 More Instance Variables
Parakeet.java
Solution Code
public class Parakeet 
{
    private String name;
    // Add an instance variable here for color.
    private String color;
    
    public Parakeet(String birdsName, String birdsColor)
    {
        name = birdsName;
        color = birdsColor;
    }
    
    // This method should work after you add the
    // new instance variable and update the constructor.
    // DO NOT modify this method.
    public String toString()
    {
        return name + " is a " + color + " parakeet";
  
    
    }
}

ParakeetTester.java
Solution Code
public class ParakeetTester
{
    public static void main(String[] args)
    {
        Parakeet budgie = new Parakeet("Ron", "green");
        System.out.println(budgie);
    }
}

//2.2.9 Pizza Time!
PizzaTester.java
Solution Code
public class PizzaTester 
{
    public static void main(String[] args)
    {
        // Test your Pizza class here.
        Pizza pizza1 = new Pizza("Veggie", "Tomatoes, onions, olives", 12);
        Pizza pizza2 = new Pizza("Cheese", "Cheese", 15);
        Pizza pizza3 = new Pizza("Meat", "Pepperoni, sausage, bacon", 20);
        
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }
}


Pizza.java
Solution Code
public class Pizza
{
    private String type;
    private String toppings;
    private int size;
    
    public Pizza(String theType, String theToppings, int theSize)
    {
        type = theType;
        toppings = theToppings;
        size = theSize;
    }
    
    public String toString()
    {
        return size + " inch " + type + " pizza with " + toppings;
    }
}

//2.3.6 Plain Coffee
Coffee.java
Solution Code
/*
* This class represents a cup of coffee
* 
*/
public class Coffee
{
    // Instance Variables
    private int brewStrength; // on a scale of 1 to 5, 5 being the darkest
    private boolean sugar;    // has sugar (true) or does not (false)
    
    // takes the values "none", "whole", "nonfat", "soy", or "almond"
    private String milkType; 
    
    // Add a default constructor to initialize the instance variables
    // to a default cup of coffee
    public Coffee()
    {
        brewStrength = 2;
        sugar = true;
        milkType = "nonfat";
    }
    
    // Specialized constructor
    public Coffee(int howStrong, boolean hasSugar, String milk)
    {
        brewStrength = howStrong;
        sugar = hasSugar;
        milkType = milk;
    }
    
    
    // String representation to print
    // Do not modify this function
    public String toString()
    {
        return "Coffee brewed to level " + brewStrength + " with " + milkType + " milk. Sugar? " + sugar;
    }
    
}

CoffeeTester.java
Solution Code
public class CoffeeTester
{
    public static void main(String[] args)
    {
        // Create Specialized Coffee
        Coffee latte = new Coffee(4, false, "soy");
        System.out.println(latte);
        
        // Create a default coffee
        // This should work after you create the default
        // constructor
        Coffee plain = new Coffee();
        System.out.println(plain);
        
    }
}

//2.3.7 Custom Piñatas

Pinata.java
Solution Code
public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;    
    private String shape;
    
    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    
    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables
    public Pinata(String candyInside, String pinataColor, String pinataShape)
    {
        candy = candyInside;
        color = pinataColor;
        shape = pinataShape;
    }
    
    // Add an overloaded constructor that allows the user
    // to customize the color and shape
    public Pinata(String pinataColor, String pinataShape)
    {
        candy = "hard candy";
        color = pinataColor;
        shape = pinataShape;
    }
    
    // Add an overloaded constructor that allows the user
    // to customize the candy
    public Pinata(String candyInside)
    {
        candy = candyInside;
        color = "rainbow";
        shape = "donkey";
    }
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
    
}

PinataTester.java
Solution Code
public class PinataTester
{
    public static void main(String[] args)
    {
        // Make Pinatas!
        Pinata ella = new Pinata();
        Pinata pete = new Pinata("chocolate", "blue", "star");
        Pinata sweetie = new Pinata("sour straws");
        
        // Print the pinatas
        System.out.println(ella);
        System.out.println(pete);
        System.out.println(sweetie);
        
        
    }
}


//2.3.8 Website Class
Website.java
Solution Code
public class Website
{
    // Instance Variables
    private String topLevelDomain;    // com, edu, gov, us ...
    private String domain;            // name of the website
    private int numUsers;            // number of registered users
    
    
    // Default constructor
    public Website()
    {
        topLevelDomain = "com";
        numUsers = 0;
        domain = "example";
    }
    
    // Specify website URL
    // Register a new website
    public Website(String domainName, String topDomain)
    {
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers = 0;
    }
    
    
    // Specify website URL
    // Register an old website
    public Website(String domainName, String topDomain, int numPeople)
    {
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers = numPeople;
    }
    
    
    
    public String toString()
    {
        String res =  "https://www." + domain + "." + topLevelDomain;
        res += " has " + numUsers + " users";
        
        return res;
    }
}


WebsiteTester.java
Solution Code
public class WebsiteTester
{
    public static void main(String[] args)
    {
        // Default website
        // domain is an empty string
        Website plain = new Website();
        System.out.println(plain);
        
        // New website
        // Specify the domain and top level domain, but
        // the number of users is set to the default value
        Website school = new Website("goodSchool", "edu");
        System.out.println(school);
        
        // Existing website
        // Specify the domain and top level domain and
        // the number of users 
        Website codehs = new Website("codehs", "com", 1000000);
        System.out.println(codehs);
        
    }

  
}

//2.3.9 Empty References
Rectangle.java
Solution Code
public class Rectangle
{
    // Attributes
    private int width;
    private int height;
    
    // Constructor
    // Copies the values of rectWidth and rectHeight
    // into width and height, respectively
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    // Constructor
    // Allows user to construct a square
    // Copies the value of sidelength
    // into both width and height
    public Rectangle(int sidelength)
    {
        width = sidelength;
        height = sidelength;
    }
    
    
    // This method lets us print out the object
    // to see the values of the instance variables
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}

RectangleTester.java
Solution Code
public class RectangleTester
{
    public static void main(String[] args)
    {
        // Fix this code so there are no more
        // null pointer exceptions
        Rectangle brick = new Rectangle(3, 6);
        Rectangle fencePost = new Rectangle(7, 2);
        
        System.out.println(brick);
        System.out.println(fencePost);
        
        // Change the fencePost dimensions
        fencePost = new Rectangle(2, 10);
        System.out.println(fencePost);
        
    }
}

//2.4.5 Hello!
HelloTester.java
Solution Code
import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        Hello greeting = new Hello(name);

        //Answers may vary slightly here
        greeting.english();
        greeting.russian();
        greeting.french();
    }
}

Hello.java
Solution Code
public class Hello {

    private String name;

    public Hello (String yourName){
        name = yourName;
    }

    public void english(){
        System.out.print("Hello ");
        System.out.print(name);
        System.out.println("!");
    }

    public void spanish(){
        System.out.print("Hola ");
        System.out.print(name);
        System.out.println("!");
    }

    public void french(){
        System.out.print("Bonjour ");
        System.out.print(name);
        System.out.println("!");
    }

    public void german(){
        System.out.print("Hallo ");
        System.out.print(name);
        System.out.println("!");
    }

    public void russian(){
        System.out.print("Privet ");
        System.out.print(name);
        System.out.println("!");
    }

    public void chinese(){
        System.out.print("Ni hao ");
        System.out.print(name);
        System.out.println("!");
    }
}


//2.4.6 Loose Change
CoinTester.java
Solution Code
public class CoinTester
{
    public static void main(String[] args) {

       Coins piggybank = new Coins(3, 2, 1, 4);
       piggybank.bankValue();
       piggybank.bankCount();
       
       piggybank.addQuarter();
       piggybank.addQuarter();
       piggybank.addDime();
       piggybank.addPenny();
       piggybank.addPenny();
       piggybank.addPenny();
       
       piggybank.bankCount();
       piggybank.bankValue();
       
       
    }
}
Coins.java
Solution Code
public class Coins {

    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

    public Coins(int numQuarters, int numDimes, int numNickels, int numPennies){
        quarters = numQuarters;
        dimes = numDimes;
        nickels = numNickels;
        pennies = numPennies;
    }

    public void addQuarter(){
        System.out.println("Adding a quarter ...");
        quarters ++;
    }

    public void addDime(){
        System.out.println("Adding a dime ...");
        dimes ++;
    }

    public void addNickel(){
        System.out.println("Adding a nickel ...");
        nickels ++;
    }

    public void addPenny(){
        System.out.println("Adding a penny ...");
        pennies ++;
    }

    public void quartersCount(){
        System.out.println(quarters);
    }

    public void quartersTotal(){
        System.out.println(quarters * 0.25);
    }

    public void dimesCount(){
        System.out.println(dimes);
    }

    public void dimesTotal(){
        System.out.println(dimes * 0.10);
    }

    public void nickelsCount(){
        System.out.println(nickels);
    }

    public void nickelsTotal(){
        System.out.println(nickels * 0.05);
    }

    public void penniesCount(){
        System.out.println(pennies);
    }

    public void penniesTotal(){
        System.out.println(pennies * 0.01);
    }

    public void bankValue(){
        System.out.println(quarters * 0.25 + dimes * 0.10
                + nickels * 0.05 + pennies * 0.01);
    }

    public void bankCount(){
        System.out.println(quarters + dimes + nickels + pennies);
    }
}

//2.4.7 Chat Bot
Bot.java
Solution Code
public class Bot {

    private String name;

    // Constructor
    public Bot (String yourName){
        name = yourName;
    }

    // Prints a greeting
    public void greeting(){
        System.out.print("Hello ");
        System.out.print(name);
        System.out.println("! My name is UNIVAC!");
        System.out.println("Are you having fun programming today?");
    }

    // Prints the help menu
    public void help(){
        System.out.println("You can ask me about the first computer bug, or");
        System.out.println("which countries use the imperial measurement system.");
        System.out.println("I can even convert miles to kilometers!");
    }

    // Prints the origin of the first computer bug
    public void firstBug(){
        System.out.println("It's said that the first computer bug was found ");
        System.out.println("on September 9, 1945 by Harvard technicians who ");
        System.out.println("found a moth in their computer!");
    }

    // Prints a list of countries that use the imperial system
    public void imperialCountries() {
        System.out.print("There are 3 countries that use the imperial ");
        System.out.println("measurement system.");
        System.out.print("They are the United States of America, ");
        System.out.println("Liberia, and Myanmar");
    }

    // Prints a good-bye message
    public void goodbye(){
        System.out.println("It's always nice to chat!");
        System.out.println("Have a great day!");
    }

    // Prints my favorite number and how close my number is to yours
    public void favoriteNumber(int yourNumber){
        System.out.println("My favorite number is 3.");
        System.out.print("That is ");
        System.out.print(yourNumber - 3);
        System.out.println(" away from your number");
    }

    // Converts miles to kilometers
    public double milesToKilometers(double miles){
        double kilometers = miles / 0.6214;
        return kilometers;
    }

}

BotTester.java
Solution Code
import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello! What is your name? ");
        String name = input.nextLine();
        
        Bot goodBot = new Bot(name);
        
        goodBot.greeting();
        goodBot.help();
        
        System.out.println();
        System.out.println("Tell me Bot, which countries use the imperial system?");
        goodBot.imperialCountries();
        
        System.out.println();
        System.out.println("Tell me Bot, what was the first computer bug?");
        goodBot.firstBug();
        
        System.out.println();
        goodBot.goodbye();
        
    }
}

//2.4.8 Greetings and Salutations
PointTester.java
Solution Code
public class PointTester
{
    public static void main(String[] args)
    {
        Point p = new Point(10, 5);
        System.out.println(p);
        p.move(3, 4);
        
        System.out.println(p);
        
        // Make a new point here at position (2, 4)
        Point p2 = new Point(2, 4);
        
        // Then print it out
        System.out.println(p2);
        
        // Move the point 5 units in the x direction and
        // 2 units in the y direction
        p2.move(5, 2);
        
        // Print out the point again to see that it moved
        System.out.println(p2);
        
    }
}

Point.java
Solution Code
public class Point
{
    private int x;
    private int y;
    
    public Point(int xCoord, int yCoord)
    {
        x = xCoord;
        y = yCoord;
    }
    
    public void move(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    
    public String toString()
    {
        return x + ", " + y;
    }
}

//2.5.7 Cricket Players
PlayerTester.java
Solution Code
public class PlayerTester
{
    public static void main(String[] args) {
       
       CricketPlayer brian = new CricketPlayer("Brian Lara", "Leo Lions");
       brian.addMatch(11, 72);
       brian.addMatch(9, 43);
       brian.addMatch(63, 0);
       brian.addMatch(35, 0);
       
       System.out.println("Brian Lara's Stats: ");
       brian.printRunsScored();
       brian.printBallsBowled();
       System.out.println(brian);
       
       
       CricketPlayer fabian = new CricketPlayer("Fabian Allen");
       fabian.addMatch(13, 54);
       fabian.addMatch(22, 106);
       fabian.addMatch(34, 0);
       fabian.addMatch(7, 18);
       
       System.out.println();
       System.out.println("Fabian Allen's Stats: ");
       fabian.printRunsScored();
       fabian.printBallsBowled();
       System.out.println(fabian);
    }
}

CricketPlayer.java
Solution Code
public class CricketPlayer {

    /* This class is complete. Take a look around
     * to make sure you understand how to use it,
     * but you do not need to make changes.
     */
     
	private String name;
	private String team;
	private int totalRunsScored;
    private int totalBallsBowled;
	private int matchesPlayed;


    public CricketPlayer(String playerName, String currentTeam) {
        name = playerName;
        team = currentTeam;
        
        // Note that primitive values are automatically initialized
        // so we don't actually need these lines
        totalRunsScored = 0;
        totalBallsBowled = 0;
        matchesPlayed = 0;
    }
    
    public CricketPlayer(String playerName){
        // this() is a shortcut to calling the other constructor
        // in this class. We will see more of 'this' in a later
        // unit, but it is shown here as a best practice.
		this(playerName, "no team");
    }
    
    public void addMatch(int runsScored, int ballsBowled){
        totalRunsScored += runsScored;
        totalBallsBowled += ballsBowled;
        matchesPlayed++;
    }
    
    public void printRunsScored(){
        System.out.print("Runs scored per match: ");
        System.out.println((double) totalRunsScored / matchesPlayed);
	}

    public void printBallsBowled() {
		System.out.print("Balls bowled per match: ");
        System.out.println((double) totalBallsBowled / matchesPlayed);
	}

	public String toString() {
		return name + " scored an average of " + ((double) totalRunsScored / matchesPlayed) +
		    " runs during these " + matchesPlayed + " matches.";
	}

}

//2.5.8 More Operations

Calculator.java
Solution Code
public class Calculator
{
    // This class does not need instance variables!
    
    // Prints the sum of x and y
    public void add(double x, double y)
    {
        double result = x + y;
        System.out.print(x);
        System.out.print(" + ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the product of x and y
    public void multiply(double x, double y)
    {
        double result = x * y;
        System.out.print(x);
        System.out.print(" * ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the quotient of x and y
    public void divide(double x, double y)
    {
        double result = x / y;
        System.out.print(x);
        System.out.print(" / ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the difference of x and y
    public void subtract(double x, double y)
    {
        double result = x - y;
        System.out.print(x);
        System.out.print(" - ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
}

CalculatorTester.java
Solution Code
import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        double x, y;
        
        System.out.println("Enter two doubles");
        x = input.nextDouble();
        y = input.nextDouble();
        
        calc.add(x,y);
        calc.subtract(x,y);
        calc.multiply(x,y);
        calc.divide(x,y);
        
    }
}


//2.5.9 Chat Bot 2.0
Bot2.java
Solution Code
public class Bot2 {

    private String name;

    public Bot2 (String yourName){
        name = yourName;
    }

    // Prints a greeting
    public void greeting(){
        System.out.print("Hello ");
        System.out.print(name);
        System.out.println("! My name is UNIVAC!");
        System.out.println("Are you having fun programming today?");
    }

    // Prints the help menu
    public void help(){
        System.out.println("You can ask me about the first computer bug, or");
        System.out.println("which countries use the imperial measurement system.");
        System.out.println("I can even convert miles to kilometers!");
    }

    // Prints the origin of the first computer bug
    public void firstBug(){
        System.out.println("It's said that the first computer bug was found ");
        System.out.println("on September 9, 1945 by Harvard technicians who ");
        System.out.println("found a moth in their computer!");
    }

    // Prints a list of countries that use the imperial system
    public void imperialCountries() {
        System.out.print("There are 3 countries that use the imperial ");
        System.out.println("measurement system.");
        System.out.print("They are the United States of America, ");
        System.out.println("Liberia, and Myanmar");
    }

    // Prints a good-bye message
    public void goodbye(){
        System.out.println("It's always nice to chat!");
        System.out.println("Have a great day!");
    }

    // Prints my favorite number and how close my number is to yours
    public void favoriteNumber(int yourNumber){
        System.out.println("My favorite number is 3.");
        System.out.print("That is ");
        System.out.print(yourNumber - 3);
        System.out.println(" away from your number");
    }

    // Prints your and my favorite animal
    public void favoriteAnimal(String yourAnimal){
        System.out.print("Neat. I think ");
        System.out.print(yourAnimal);
        System.out.println("s are pretty cool, too.");
        System.out.println("My favorite animal is a turtle. Have you met Tracy?");
    }

    // Prints your and my destination vacation place
    public void destination(String place){
        System.out.print("I've heard ");
        System.out.print(place);
        System.out.println(" is a nice place to visit!");
        System.out.println("If I could go anywhere, I'd visit the mooon!");
    }
    
    // Converts miles to kilometers
    public double milesToKilometers(double miles){
        double kilometers = miles / 0.6214;
        return kilometers;
    }


}


Bot2Tester.java
Solution Code
import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello! What is your name? ");
        String name = input.nextLine();
        
        Bot2 goodBot = new Bot2(name);

        goodBot.greeting();
        
        System.out.println();
        System.out.println("What is your favorite animal? ");
        String animal = input.nextLine();
        goodBot.favoriteAnimal(animal);
        
        System.out.println();
        System.out.println("If you could visit any place, where would you go? ");
        String vacation = input.nextLine();
        goodBot.destination(vacation);
        
        System.out.println();
        System.out.println("What is your favorite number? ");
        int favoriteNum = input.nextInt();
        goodBot.favoriteNumber(favoriteNum);
        
        System.out.println();
        goodBot.goodbye();
       
    }
}

//2.6.6 Number Games
public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames game = new NumberGames(5); // Create an object
        
        // Square the number
        // Print it out
        System.out.println(game.squareNumber()); // call with non void method
        // Double the number
        // Print it out
        System.out.println(game.doubleNumber());
        // Square the number again
        // Print it out
        System.out.println(game.squareNumber());
        // Get the number and store the value
        // Print out your stored value 
        
        double currentNum = game.getNumber();
        // Get the number again then store and print
        // the value
        
        System.out.println(currentNum);
        System.out.println(game.getNumber());
        
    }
}

//2.6.7 Construction Costs
Construction.java
Solution Code
public class Construction
{
    
    double lumber;  // price per board 
    double windows; // price per square inch of window
    double taxRate; 
   
    
    public Construction(double lumberPrice, double windowPrice, double taxes)
    {
        lumber = lumberPrice;
        windows = windowPrice;
        taxRate = taxes;
    }
    
    // Computes and returns the cost
    // of the lumber
    public double lumberCost(int numBoards)
    {
        return lumber * numBoards;   
    }
    
    // Computes and returns the cost of the windows
    public double windowCost(int numWindows)
    {
        return windows * numWindows;   
    }
    
    // Computes the grand total by adding
    // the tax amount to the total
    public double grandTotal(double total)
    {
        return total * (1 + taxRate);
    }
    
}

ConstructionTester.java
Solution Code
import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        int numBoards, numWindows;
        double taxRate;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the sales tax rate: ");
        taxRate = input.nextDouble();
        
        System.out.println("How many boards do you need? ");
        numBoards = input.nextInt();
        
        System.out.println("How many windows do you need? ");
        numWindows = input.nextInt();
        
        
        double total = 0;
        Construction calc = new Construction(8, 11, taxRate);
        
        total += calc.lumberCost(numBoards);
        total += calc.windowCost(numWindows);
        
        System.out.print("Total: ");
        System.out.println(total);
        
        System.out.print("Grand Total: ");
        System.out.println(calc.grandTotal(total));
    }
}

//2.6.8 How Far Away is ...?

GeoLocation.java
Solution Code
/*
 * This class stores information about a location on Earth.  Locations are
 * specified using latitude and longitude.  The class includes a method for
 * computing the distance between two locations.
 *
 * This implementation is based off of the example from Stuart Reges at 
 * the University of Washington.
 */

public class GeoLocation 
{
    // Earth radius in miles
    public static final double RADIUS = 3963.1676;  

    private double latitude;
    private double longitude;

    /**
     * Constructs a geo location object with given latitude and longitude
     */
    public GeoLocation(double theLatitude, double theLongitude) 
    {
        latitude = theLatitude;
        longitude = theLongitude;
    }

    /**
     * Returns the latitude of this geo location
     */
    public double getLatitude() 
    {
        return latitude;
    }

    /**
     * returns the longitude of this geo location
     */
    public double getLongitude() 
    {
        return longitude;
    }

    // returns a string representation of this geo location
    public String toString() 
    {
        return "latitude: " + latitude + ", longitude: " + longitude;
    }

    // returns the distance in miles between this geo location and the given
    // other geo location
    public double distanceFrom(GeoLocation other) 
    {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);
        // apply the spherical law of cosines with a triangle composed of the
        // two locations and the north pole
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * RADIUS;
    }
}

HowFarAway.java
Solution Code
import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the latitude of the starting location: ");
        double firstLat = scanner.nextDouble();        
        System.out.println("Enter the longitude of the starting location: ");
        double firstLong = scanner.nextDouble();        
        System.out.println("Enter the latitude of the ending location: ");
        double secondLat = scanner.nextDouble();        
        System.out.println("Enter the longitude of the ending location: ");
        double secondLong = scanner.nextDouble();        
        GeoLocation firstLoc = new GeoLocation(firstLat,firstLong);
        GeoLocation secondLoc = new GeoLocation(secondLat,secondLong);
        
        double distance = firstLoc.distanceFrom(secondLoc);
        
        System.out.println("The distance is " + distance + " miles.");
    }
}


//2.7.7 Pretty Printing Operations
Calculator.java
Solution Code
public class Calculator
{
    // This class does not need instance variables!
    // Since there are no instance variables,
    // this class also does not need a constructor.
    
    // Java will create an empty constructor for you.
    
    // Returns the sum of x and y
    public double sum(double x, double y)
    {
        return x + y;
        
    }
    
    // Returns the product of x and y
    public double multiply(double x, double y)
    {
        return x * y;
        
    }
    
    // Returns the quotient x / y
    public double divide(double x, double y)
    {
        return x / y;
    }
    
    // Returns the difference of x - y
    public double subtract(double x, double y)
    {
        return x - y;
    }
    
}

CalculatorTester.java
Solution Code
import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Create Scanner and Calculator objects
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        // Ask for two doubles
        double num1, num2;
        System.out.println("Enter two doubles: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        
        // Print sum, difference, product, quotient
        System.out.println(num1 + " + " +  num2 + " = " + calc.sum(num1,num2));
        System.out.println(num1 + " - " +  num2 + " = " + calc.subtract(num1,num2));
        System.out.println(num1 + " * " +  num2 + " = " + calc.multiply(num1,num2));
        System.out.println(num1 + " / " +  num2 + " = " + calc.divide(num1,num2));
        
    }
}

//2.7.8 Auto-fill
FormFill.java
Solution Code
public class FormFill
{
    private String fName;
    private String lName;
    private String email;
    private int birthMonth;
    private int birthYear;
    
    
    // Constructor that sets the first and last name
    // The other variables will initialize themselves
    public FormFill(String firstName, String lastName){
        fName = firstName;
        lName = lastName;
    }
    
    // Sets birthMonth and birthyear to the given
    // values
    public void setBirthday(int month, int year){
        birthMonth = month;
        birthYear = year;
    }
    
   
    // Sets the email address
    public void setEmailAddress(String emailAddress){
        email = emailAddress;
    }
    
    // Returns a string with the name formatted like
    // a doctor would write the name on a file
    // 
    // Return string should be formatted 
    // with the last name, then a comma and space, then the first name.
    // For example: LastName, FirstName
    public String fullName(){
        return lName + ", " + fName;
    }
    
     // Returns basic contact information formatted 
    // like this example:
    // 
    // LastName
    // Email: smith@emailprovider.com
    //
    // Fill in the last name and email address
    // with the instance variables.
    //
    // You will need to use the escape character \n
    // To create a new line in the String
    public String contactInformation(){
        String contact = lName + "\n";
        contact += "Email: " + email;
        return contact;
    }
    
    // Returns a string with the birthday
    // formatted like this:
    // 
    // month/year
    public String birthday(){
        return birthMonth + "/" + birthYear;
    }
    
}

FormFillTester.java
Solution Code
public class FormFillTester
{
    public static void main(String[] args)
    {
        FormFill filler = new FormFill("Karel", "The Dog");
        filler.setBirthday(5, 2012);
        filler.setEmailAddress("coolDog@email.com");
        
        System.out.println(filler.fullName());
        System.out.println(filler.birthday());
        System.out.println(filler.contactInformation());
        
    }
}

//2.7.9 QuoteMachine
QuoteMachine.java
Solution Code
import java.util.Scanner;

public class QuoteMachine
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a quote
        System.out.println("Enter a quote: ");
        String quote = input.nextLine();
        
        // Ask for the author
        System.out.println("Enter the author of the quote: ");
        String author = input.nextLine();
        
        // Create a new String that has the quote in quotation marks
        // Don't forget to escape the quotation marks
        String quotedQuote = "\"" + quote + "\"";
        
        // Print the quote, then the author on the next line 
        // But you can only use ONE print statement!
        System.out.println(quotedQuote + "\n" + author);
    }
}

//2.8.6 Speaking

Talker.java
Solution Code
public class Talker
{
    private String speech;
    
    // Constructor
    public Talker(String startingText)
    {
        speech = startingText;
    }
    
    // Returns the text in all uppercase letters
    // Find a method in the JavaDocs that
    // will allow you to do this with just
    // one method call
    public String outdoorVoice()
    {
        return speech.toUpperCase();   
    }
    
    // Returns the text in all lowercase letters
    // Find a method in the JavaDocs that
    // will allow you to do this with just
    // one method call
    public String indoorVoice()
    {
        return speech.toLowerCase();
    }
    
    // Reset the instance variable to the new text
    public void setSpeech(String text)
    {
        speech = text;
    }
    
    // Returns a String representation of this object
    // The returned String should look like
    // 
    // "Text goes here," said the talker
    // 
    // The quotes should appear in the String
    // The text displayed should be the value of the instance variable
    public String toString()
    {
        return "\"" + speech +  ",\"" + " said the talker";
    }
}

TalkerTester.java
Solution Code
import java.util.Scanner;

public class TalkerTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter some text: ");
        String words = input.nextLine();
        
        
        Talker talky = new Talker(words); 
        String yelling = talky.outdoorVoice();
        String whispers = talky.indoorVoice();
        
        System.out.println(talky);
        System.out.println("Yelling: " + yelling);
        System.out.println("Whispering: " + whispers);
        
    }
}


//2.8.7 toString for Animals
Animal.java
Solution Code
public class Animal
{
    private String commonName;
    private String habitat;
    private String diet;
    private int typicalAge;
    
    
    public Animal(String name, String animalHabitat, String animalDiet, int age)
    {
        commonName = name;
        habitat = animalHabitat;
        diet = animalDiet;
        typicalAge = age;
    }
    
    public String toString()
    {
        String res = commonName + " lives in " + habitat + ", eats " + diet;
        res += " and usually lives " + typicalAge + " years.";
        
        return res;
    }
}

AnimalTester.java
Solution Code
public class AnimalTester
{
    public static void main(String[] args)
    {
       Animal riverOtter = new Animal("North American River Otter", "rivers", "fish", 9);
       System.out.println(riverOtter);
    }
}

//2.8.8 Organizing Class Roster
RosterOrganizer.java
Solution Code
public class RosterOrganizer
{
    private String student;
    
    public RosterOrganizer(String studentName)
    {
        student = studentName;
    }
    
    // Returns the word
    public String getStudent()
    {
        return student;
    }
    
    // Returns true if student comes
    // before otherStudent.
    // Returns false otherwise.
    public boolean placeBefore(String otherStudent)
    {
        return student.compareTo(otherStudent) < 0;
    }
    
    
    // Returns true if student comes
    // after otherStudent.
    // Returns false otherwise.
    public boolean placeAfter(String otherStudent)
    {
        return student.compareTo(otherStudent) > 0;
    }
    
    
    // Returns true if student is equal to otherStudent.
    // Returns false otherwise.
    public boolean isEqual(String otherStudent)
    {
        return student.equals(otherStudent);
    }
    
    
}

RosterTester.java
Solution Code
import java.util.Scanner;

public class RosterTester
{
    public static void main(String[] args)
    {
        RosterOrganizer currentStudent = new RosterOrganizer("Jose");
        
        String name = "Silu";
        
        System.out.println(currentStudent.getStudent() + " place before " + name + "?");
        System.out.println(currentStudent.placeBefore(name));
        System.out.println(currentStudent.getStudent() + " place after " + name + "?");
        System.out.println(currentStudent.placeAfter(name));
        System.out.println(currentStudent.getStudent() + " is equal to  " + name + "?");
        System.out.println(currentStudent.isEqual(name));
        
        
        // Notice that the capitalization matters
        name = "adrian";
        System.out.println("\n\n");
        System.out.println(currentStudent.getStudent() + " place before " + name + "?");
        System.out.println(currentStudent.placeBefore(name));
        System.out.println(currentStudent.getStudent() + " place after " + name + "?");
        System.out.println(currentStudent.placeAfter(name));
        System.out.println(currentStudent.getStudent() + " is equal to  " + name + "?");
        System.out.println(currentStudent.isEqual(name));
        
        
        
        System.out.println("\n\n");
        System.out.print("Enter a name: ");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println(currentStudent.getStudent() + " place before " + name + "?");
        System.out.println(currentStudent.placeBefore(name));
        System.out.println(currentStudent.getStudent() + " place after " + name + "?");
        System.out.println(currentStudent.placeAfter(name));
        System.out.println(currentStudent.getStudent() + " is equal to  " + name + "?");
        System.out.println(currentStudent.isEqual(name));

    }
}


//2.8.9 Concatenating Fractions
Fraction.java
Solution Code
public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction(int numer, int denom)
    {
        numerator = numer;
        denominator = denom;
    }
    
    
    public int getNumerator()
    {
        return numerator;
    }
    
    public int getDenominator()
    {
        return denominator;
    }
    
    
    // Returns a string representing a fraction
    // in the form
    // numerator/denominator
    public String toString()
    {
        return numerator + "/" + denominator;
    }
    

}
FractionTester.java
Solution Code
import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner input = new Scanner(System.in);
        Fraction half = new Fraction(1, 2);
        
        // Ask for input
        System.out.println("Enter the numerator: ");
        int numer = input.nextInt();
        System.out.println("Enter the denominator: ");
        int denom = input.nextInt();
        
        // Create a new fraction
        Fraction other = new Fraction(numer, denom);
        
        // Add the fractions
        int totalNumer = denom * half.getNumerator() + numer * half.getDenominator();
        int totalDenom = denom * half.getDenominator();
        
        Fraction sum = new Fraction(totalNumer, totalDenom);
        
        
        // Print out the fractions as an equation
        System.out.println(half + " + " +  other + " = " + sum);
        
        
    }
}

//2.8.10 Word Games

WordGames.java
Solution Code
public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        // switch first half
        // and second half
        int length = word.length();
        int middle = length / 2;
        
        return word.substring(middle) + word.substring(0, middle);
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        return word.substring(0, insertIdx) + insertText + word.substring(insertIdx);
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        int idx = word.indexOf(insertChar);
        return word.substring(0, idx) + insertText + word.substring(idx);
    }
    
    
    public String toString()
    {
        // Games[word]
        return "[" + word + "]";
    }
    
    
}

WordGameTester.java
Solution Code
import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a word
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        
        WordGames games = new WordGames(word);
        
        // Scramble it
        // Print out scrambled word
        System.out.println(games.scramble());
        
        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();
        System.out.println("Enter another word: ");
        word = input.nextLine();
        
        
        // Add random word at index
        // Print out the word
        System.out.println(games.bananaSplit(idx, word));
        
        
        // Ask for a character
        // Ask for random word
        System.out.println("Enter a character in " + games + ": ");
        String letter = input.nextLine();
        System.out.println("Enter another word: ");
        word = input.nextLine();
        
        // Add random word at character
        // Print out the word
        System.out.println(games.bananaSplit(letter, word));
        

    }
}

//2.9.6 Order Up!
import java.util.Scanner;

public class PickupWindow
{
    public static void main(String[] args)
    {
        // Create scanner object
        Scanner input = new Scanner(System.in);
        
        // Display menu
        String menu = "1. Hamburger\n2. Cheeseburger\n3. Veggie Burger\n4. Nachos\n5. Hot Dog\n";
        
        System.out.println(menu);
        
        // Get customer order
        System.out.println("Enter label: ");
        String customerOrder = input.nextLine();
        
        // Use substring to get the first character (the number)
        String combo = customerOrder.substring(0,1);
        
        // Create an Integer object by using the static
        // method Integer.valueOf
        // to turn the string into an Integer
        Integer comboNumber = Integer.valueOf(combo);
        
        // Print out what the customer ordered
        System.out.println("Customer ordered number " + comboNumber);
        
        
    }
}


//2.9.7 Currency
Currency.java
Solution Code
public class Currency
{
    private Double value;
    
    public Currency(Double startValue)
    {
        value = startValue;
    }
    
    public void setValue(Double newValue)
    {
        value = newValue;
    }
    
    public Integer getDollars()
    {
        Integer res = (int) value.doubleValue();
        return res;
    }
    
    public Integer getCents()
    {
        Integer cents = (int)(value * 100) % 100;
        return cents;
    }
    
    public String toString()
    {
        return "$" + getDollars() + "." + getCents();
    }
}

CurrencyTester.java
Solution Code
public class CurrencyTester
{
    public static void main(String[] args)
    {
        Currency bankRoll = new Currency(12.45);
        
        System.out.println("Value of bankroll: " + bankRoll);
        System.out.println("Dollars: " + bankRoll.getDollars());
        System.out.println("Cents: " + bankRoll.getCents());
        
        
        bankRoll.setValue(20.56);
        System.out.println("Value of bankroll: " + bankRoll);
        System.out.println("Dollars: " + bankRoll.getDollars());
        System.out.println("Cents: " + bankRoll.getCents());
        
        bankRoll.setValue(67.78);
        System.out.println("Value of bankroll: " + bankRoll);
        System.out.println("Dollars: " + bankRoll.getDollars());
        System.out.println("Cents: " + bankRoll.getCents());
        
        
    }
}


//2.9.8 Guess the number!
ExtremeMain.java
Solution Code
import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Create an Extremes object
        Extremes bounds = new Extremes();
        
        // Ask the user to guess the maximum value of an Integer
        System.out.println("What do you think the maximum integer value is? ");
        int guess = input.nextInt();
        
        // Compute and display what they'd need to multiply by
        // to reach the maximum number
        int quotient = bounds.maxQuotient(guess);
        
        System.out.print("You'd need to multiply your number by " + quotient);
        System.out.println(" to reach the max value!");
        
        // Ask the user to guess the minimum value of an Integer
        System.out.println("What do you think the minimum integer value is? ");
        guess = input.nextInt();
        
        // Compute and display what they'd need to multiply by
        // to reach the minimum number
        quotient = bounds.minQuotient(guess);
        System.out.print("You'd need to multiply your number by " + quotient);
        System.out.println(" to reach the min value!");
        
    }
}

Extremes.java
Solution Code
public class Extremes
{
    private Integer min;
    private Integer max;
    
    // Constructor
    public Extremes()
    {
        //Set min and max values 
        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;
    }
    
    // Returns the quotient
    // max / number
    public Integer maxQuotient(Integer number)
    {
        return max / number;
    }

    // Returns the quotient
    // min / number
    public Integer minQuotient(Integer number)
    {
        return min / number;
    }
    
    // Returns a String representation
    // in the form
    // [min, max]
    public String toString()
    {
        return "[" + min + ", " + max + "]";   
    }
}



//2.10.6 Circle Area
Circle.java
Solution Code
public class Circle
{
    private double radius;
    
    public Circle(double theRadius)
    {
        radius = theRadius;
    }

    // Implement getArea using
    // Math.PI and
    // Math.pow
    // Area = pi * r^2
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }
    
    // Implement getSphereVolume using
    // Math.PI and
    // Math.pow
    // Volume = 4/3 * pi * r^3
    public double getSphereVolume()
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius,3);
    }
    
}

CircleTester.java
Solution Code
public class CircleTester 
{
    public static void main(String[] args)
    {
        Circle cup = new Circle(5);
        System.out.println("Area of a circle with radius 5: " + cup.getArea() + " units squared");   
        System.out.print("If this circle were this circle a sphere, ");
        System.out.println("its volume would be: " + cup.getSphereVolume() + " units cubed");      

        Circle hat = new Circle(12);
        System.out.println("\nArea of a circle with radius 12: " + hat.getArea() + " units squared");      
        System.out.print("If this circle were a sphere, ");
        System.out.println("its volume would be: " + hat.getSphereVolume() + " units cubed");     

    }
}


//2.10.7 The Unit Circle
UnitCircle.java
Solution Code
public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        
        double angle = 0;
        double cos = Math.cos(angle);
        double sin = Math.sin(angle);
        cos = Math.round(cos * 100) / 100.0;
        sin = Math.round(sin * 100) / 100.0;
        
        System.out.println("" + angle + ": " + cos + ", " + sin);
    
    
        angle = Math.PI/2;
        cos = Math.cos(angle);
        sin = Math.sin(angle);
        cos = Math.round(cos * 100) / 100.0;
        sin = Math.round(sin * 100) / 100.0;
        
        System.out.println("" + angle + ": " + cos + ", " + sin);
    
    
        angle = Math.PI;
        cos = Math.cos(angle);
        sin = Math.sin(angle);
        cos = Math.round(cos * 100) / 100.0;
        sin = Math.round(sin * 100) / 100.0;
        
        System.out.println("" + angle + ": " + cos + ", " + sin);
    
        
    }
}

//2.10.8 Racing
RaceMain.java
Solution Code
public class RaceMain
{
    public static void main(String[] args)
    {
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double accel1 = Math.round(Math.random() * 100) / 100.0 + 1;
        double accel2 = Math.round(Math.random() * 100) / 100.0 + 1;
        
        // Create two Racecar objects
        Racecar redCar = new Racecar(accel1, "Karel");
        Racecar blueCar = new Racecar(accel2, "Tracy");
        
        // Compute the finishing times for both cars
        double redFinish = redCar.computeTime(distance);
        double blueFinish = blueCar.computeTime(distance);
        
        // Print times of each car
        System.out.println("First car finished in " + redFinish + " seconds");
        System.out.println("Second car finished in " + blueFinish + " seconds");
        
        
    }
}

Racecar.java
Solution Code
public class Racecar
{
    private double accel; // acceleration
    private String name; // name of driver
    
    public Racecar(double acceleration, String driver)
    {
        accel = acceleration;
        name = driver;
    }
    
    // Returns the time it takes the racecar
    // to complete the track
    public double computeTime(double distance)
    {
        double time = Math.sqrt(2 * distance/ accel);
        return Math.round(time*100) / 100.0;
    }
    
    public String toString()
    {
        return "Racer " + name;
    }
}
//3.1.6 Meeting Goals
Goals.java
Solution Code
import java.util.Scanner;

public class Goals
{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        
        // Ask for goal amount
        System.out.println("Enter your goal: ");
        int goal = input.nextInt();
        
        // Ask for actual amount
        System.out.println("Enter your actual amount: ");
        int actual = input.nextInt();
        
        
        // Compare numbers by creating three booleans
        boolean over = actual > goal;
        boolean under = actual < goal;
        boolean metGoal = actual == goal;
        
        // Display results as instructed
        System.out.println("Went over goal? " + over);
        System.out.println("Did not meet goal? " + under);
        System.out.println("Met goal exactly? " + metGoal);

    }
}

//3.1.7 Sugar Tax
AddedSugar.java
Solution Code
import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Ask the user for the grams of sugar
        System.out.println("How many grams of sugar have you eaten today? ");
        int numGrams = input.nextInt();
        
        // Use a boolean expression to print if they can eat more sugar
        
        System.out.println("You can eat more sugar: " + (numGrams < 30));
    }
}


//3.1.8 Triple Double

TripleDouble.java
Solution Code
import java.util.Scanner;
public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for the three stats
        System.out.println("How many points did you score? ");
        int numPoints = input.nextInt();
        
        System.out.println("How many rebounds did you get? ");
        int numRebounds = input.nextInt();
        
        System.out.println("How many assists did you have? ");
        int numAssists = input.nextInt();
        
        // Create three boolean variables that
        // check if the stats are 10 or more
        boolean hasPoints = numPoints >= 10;
        boolean hasRebounds = numRebounds >= 10;
        boolean hasAssists = numAssists >= 10;
        
        // Print out the value of each boolean
        // variable.  Be sure to label them!
        System.out.println("You got 10 or more points: " + hasPoints);
        System.out.println("You got 10 or more rebounds: " + hasRebounds);
        System.out.println("You got 10 or more assists: " + hasAssists);
        
        
    }
}

//3.2.6 Discounts
Discounts.java
Solution Code
import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        
        // Ask how many hours were you parked
        System.out.println("How many hours were you parked? ");
        int hours = input.nextInt();
        
        // Compute cost - $4.25
        double hourlyRate = 4.25; // generally good to use variables!
        double cost = hours * hourlyRate;
        
        // If parked for more than 3 hours, apply 25% discount
        if(hours > 3)
        {
            cost -= cost * 0.25;
        }
        
        // If cost is under $7, set cost to $7
        if(cost < 7)
        {
            cost = 7.0;
        }
        
        // Display the final cost
        System.out.println("You owe $" + cost);
        
    }
}

//3.2.7 Sweet or Unsweet?
DrinkOrder.java
Solution Code
import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       
       // ask what they want to drink
       System.out.println("What do you want to drink? ");
       String drink = input.nextLine();
       
       // ask how much sugar
       System.out.println("How many teaspoons of sugar do you want? ");
       int sugar = input.nextInt();
       
       
       // confirm order
       System.out.println();
       System.out.println("Confirming your order.  You wanted: ");
       System.out.print(drink);
       
       // if they have more than 0 sugar, print with sugar
       if(sugar > 0)
       {
            System.out.println(" with sugar");  
       }
    }
}

MicrowaveCooking.java
Solution Code
public class MicrowaveCooking
{
    public static void main(String[] args)
    {
       // Generate a random number of seconds
       int seconds = (int) (Math.random() * 151 + 90);
       
       // Print the number of seconds
       System.out.println("Microwaving for " + seconds + " seconds.");
       
       // Use two if statements to print the temperature
       if(seconds <= 120)
       {
           System.out.println("Rolls will be the right temperature!");
       }
       if(seconds > 120)
       {
           System.out.println("Rolls will be boiling hot!");
       }
    }
}

//3.2.9 Rating
Rater.java
Solution Code
public class Rater
{
    private String name; // name of company
    private double rating; // number rating (1 - 5)
    
    
    public Rater(String company, double initialRating)
    {
        name = company;
        rating = initialRating;
    }
    
    // Set rating to newRating as long as
    // the new rating is no more than 5
    public void setRating(double newRating)
    {
        if(newRating <= 5)
        {
            rating = newRating;
        }
    }
    
    // Returns the rating of the company
    public double getRating()
    {
        return rating;
    }
    
    // Returns a string representation of the company
    // based on their ratings
    public String toString()
    {
        if(rating < 2)
            return "Not Recommended Company " + name;

        if(rating > 3.5)
            return "Gold Star Company " + name;
        
        
        return "Well Rated Company " + name;
    }
}

RaterTester.java
Solution Code
public class RaterTester
{
    public static void main(String[] args)
    {
        Rater jrs = new Rater("Jr Cookery", 2);
        
        
        // Test Case: In the middle
        System.out.println("Current Rating: " + jrs.getRating());
        System.out.println(jrs);
        
        
        // Test Case: High rating
        jrs.setRating(4.5);
        System.out.println("\nCurrent Rating: " + jrs.getRating());
        System.out.println(jrs);
        
        // Test Case: Setting rating too high
        jrs.setRating(100);
        System.out.println("\nCurrent Rating: " + jrs.getRating());
        System.out.println(jrs);
        
        
        // Test Case: Low rating
        jrs.setRating(1);
        System.out.println("\nCurrent Rating: " + jrs.getRating());
        System.out.println(jrs);
        
    }
}

//3.3.5 Running Speed
Numbers.java
Solution Code
import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter your mile time in seconds: ");
       int num = input.nextInt();
       
       if(num < 223)
       {
           System.out.println("Are you sure? That's a new world record!");
       }
       else
       {
           System.out.println("Right on! Keep running!");
       }
    }
}

//3.3.6 Battleships Move
Battleship.java
Solution Code
public class Battleship
{
    private String shipType;
    private int position;
    
    public Battleship(String type, int shipPosition)
    {
        shipType = type;
        position = shipPosition;
    }
    
    // Moves the ship
    // If safeToMove is true, add 10 to position
    // else subtract 1 from position
    public void move (boolean safeToMove)
    {
       if(safeToMove)
       {
           position += 10;
       }
       else 
       {
           position -= 1;
       }

    }
    
    // Returns the position of the ship
    public int getPosition()
    {
        return position;
    }
    
    
    public String toString()
    {
        return shipType + " at " + position;
    }
}


BattleshipTester.java
Solution Code
No solution code.
Starter Code
public class BattleshipTester
{
    public static void main(String[] args)
    {
        // Create objects
        Battleship submarine = new Battleship("Submarine", 4);
        Battleship carrier = new Battleship("Carrier", 10);
        
        // Check initial positions
        System.out.println(submarine);
        System.out.println(carrier);
        
        
        // Test: Safely move submarine
        System.out.println("Submarine cleared to proceed");
        submarine.move(true);
        System.out.println(submarine);
        
        
        // Test unsafe to move carrier
        System.out.println("Carrier NOT cleared to proceed");
        carrier.move(false);
        System.out.println(carrier);
        
        
    }
}

//3.3.7 Ratings
Rater.java
Solution Code
public class Rater
{
    private String name; // name of company
    private double rating; // number rating (1 - 5)
    private String review; // review shown with company name 
    
    
    public Rater(String company, double initialRating)
    {
        name = company;
        rating = initialRating;
        review = "";
        
    }
    
    // Set rating to newRating
    // As long as it's no more than 5
    public void setRating(double newRating)
    {
        if(newRating <= 5)
        {
            rating = newRating;
        }
        
    }
    
    // Updates review line based on rating
    public void updateReview()
    {
        if(rating >= 3)
        {
            review = "Proudly recommended";
        }
        else
        {
            review = "Needs more ratings";
        }
    }
    
    
    // Returns the rating of the company
    public double getRating()
    {
        return rating;
    }
    
    // Returns a string representation of the company
    // Uses the form
    // name: review
    public String toString()
    {
        return name + " : " + review;
    }
}


RaterTesting.java
Solution Code
public class RaterTesting
{
    public static void main(String[] args)
    {
        Rater tires = new Rater("Tina's Tires", 2);
        tires.updateReview();
        
        System.out.println(tires);
        
        tires.setRating(5);
        tires.updateReview();
        
        System.out.println(tires);
        
    }
}

//3.3.8 Player Score
Basketball.java
Solution Code
import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for player names
        System.out.println("Enter player one's name: ");
        String firstName = input.nextLine();
        
        System.out.println("Enter player two's name: ");
        String secondName = input.nextLine();
        
        
        // Ask for scores 
        System.out.println("Enter " + firstName + "'s score");
        int p1Score = input.nextInt();
        
        System.out.println("Enter " + secondName + "'s score");
        int p2Score = input.nextInt();
        
        // Print out scores in alphabetical order
        if(firstName.compareTo(secondName) < 0)
        {
            System.out.println(firstName + " scored " + p1Score + " points");
            System.out.println(secondName + " scored " + p2Score + " points");
            
        }
        else 
        {
            System.out.println(secondName + " scored " + p2Score + " points");
            System.out.println(firstName + " scored " + p1Score + " points");
        }
        
        // Print who scored more points
        if(p1Score > p2Score)
        {
            System.out.println(firstName + " wins!");
        }
        else 
        {
            System.out.println(secondName + " wins!");
        }

    }
}


//3.4.6 Positive, Negative, or Zero
Numbers.java
Solution Code
import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        
        if(num > 0)
        {
            System.out.println("The number is positive");
        }
        else if(num < 0)
        {
            System.out.println("The number is negative");
        }
        else 
        {
            System.out.println("The number is zero");
        }
    }
}

//3.4.7 Salmon Spawn
Salmon.java
Solution Code
import java.util.Scanner;

public class Salmon
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter month of year as a number: " );
        int month = input.nextInt();
        
        // Strings not necessary, but useful
        // since there's a lot of repetition
        String notSpawning = "Not spawning season";
        String fall = "Fall spawning season";
        String spring = "Spring spawning season";
        
        
        if(month < 3)
        {
            System.out.println(notSpawning);
        } 
        else if(month < 7)
        {
            System.out.println(spring);
        } 
        else if(month < 9)
        {
            System.out.println(notSpawning);
        }
        else if(month < 12)
        {
            System.out.println(fall);
        }
        else 
        {
            System.out.println(notSpawning);
        }
        
    }
}
//3.4.8 Berries
Berries.java
Solution Code
import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a berry 
        System.out.println("Enter the initial of the berry: ");
        String berry = input.nextLine();
        char initial = berry.charAt(0);
        
        // Branch E
        // Branch G
        // Branch L
        // Branch unknown (else)
        
        if(initial == 'E')
        {
            System.out.println("You ordered Elderberry");
        }
        else if(initial == 'G')
        {
            System.out.println("You ordered Gooseberry");
        }
        else if(initial == 'L')
        {
            System.out.println("You ordered Lingonberry");
        }
        else 
        {
            System.out.println("Berry not recognized");
        }

    }
}
//3.4.9 Battleships
ShipTester.java
Solution Code
No solution code.
Starter Code
public class ShipTester
{
    public static void main(String[] args)
    {
        Battleship sub = new Battleship("submarine", 6);
        Battleship raft = new Battleship("raft", 2);
        Battleship destroyer = new Battleship("destroyer", 11);
     
        System.out.println(sub);
        System.out.println("Sub has power " + sub.getPower());
        
        System.out.println(raft);
        System.out.println("Raft has power " + raft.getPower());
        
        System.out.println(destroyer);
        System.out.println("Destroyer has power " + destroyer.getPower());
        
        System.out.println("\nRaft attacks Sub");
        sub.updateDamage(raft.getPower());
        System.out.println(sub);
        
        System.out.println("\nDestroyer attacks Raft");
        raft.updateDamage(destroyer.getPower());
        System.out.println(raft);
        
        System.out.println("\nSub attacks Destroyer");
        destroyer.updateDamage(sub.getPower());
        System.out.println(destroyer);


    }
}

Battleship.java
Solution Code
public class Battleship
{
    private String name;  // type of ship
    private int power;   // power of attack in range [1 - 10]
    private int health; // health of the ship
    
    
    public Battleship(String shipType, int attackPower)
    {
        name = shipType;
        power = attackPower;
        health = 100;
    }
    
    // Modifies the health of the battleship
    public void updateDamage(int attackPower)
    {
        
        if(attackPower < 5)
        {
            health -= 2;
        } else if (attackPower < 10)
        {
            health -= 7;
        } else 
        {
            health -= 10;
        }
    }
    
    // Returns true if the health of
    // the ship is greater than 0
    public boolean stillFloating()
    {
        return health > 0;
    }
    
    // Returns the power of the ship
    public int getPower()
    {
        return power;
    }
    
    // Returns string representation in the form
    // Battleship name
    public String toString()
    {
        return name + "(" + health + ")";    
    }
    
}


//3.5.6 Roller Coaster
RollerCoaster.java
Solution Code
import java.util.Scanner;

public class RollerCoaster 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("How tall in inches are you? " );
        int height = input.nextInt();
        
        System.out.println("How old are you? " );
        int age = input.nextInt();
        
        if(height >= 42)
        {
            if (age >= 9)
            {
                System.out.println("Welcome aboard!");
            } 
            else
            {
                System.out.println("Sorry, you are not eligible to ride");
            }
        } 
        else 
        {
            System.out.println("Sorry, you are not eligible to ride");
        }
    }
}

//3.5.7 Compound Roller Coaster
RollerCoaster.java
Solution Code
import java.util.Scanner;

public class RollerCoaster 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("How tall in inches are you? " );
        int height = input.nextInt();
        
        System.out.println("How old are you? " );
        int age = input.nextInt();
        
        if(height >= 42 && age >= 9)
        {
            
            System.out.println("Welcome aboard!");
        } 
        else 
        {
            System.out.println("Sorry, you are not eligible to ride");
        }
    }
}


//3.5.8 Divisibility
Divisibility.java
Solution Code
import java.util.Scanner;

public class Divisibility 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the dividend: ");
        int dividend = input.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = input.nextInt();
   
        
        if(divisor != 0 && dividend / divisor == (double) dividend / divisor)
        {
            System.out.println(dividend + " is divisible by " + divisor + "!");
        }
        else
        {
            System.out.println(dividend + " is not divisible by " + divisor + "!");
        }
    }
}

//3.5.9 Find the Median
FindMedian.java
Solution Code
import java.util.Scanner;

public class FindMedian 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first integer: ");
        int first = input.nextInt();
        
        System.out.println("Enter the second integer: ");
        int second = input.nextInt();
        
        System.out.println("Enter the third integer: ");
        int third = input.nextInt();
        
        System.out.print("\nThe median is ");
         if((first > second && first < third) || (first < second && first > third))
         {
            System.out.println(first);    
        } 
        else if ((second > first && second < third) || (second < first && second > third) )
        {
            System.out.println(second);
        }
        else
        {
            System.out.println(third);
        }
    }
}

//3.6.5 Amusement Park
AmusementPark.java
Solution Code
import java.util.Scanner;

public class AmusementPark
{
    
    static int AGE_LIMIT = 12;
    static int HEIGHT_LIMIT = 48;
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your age: "); 
        int age = input.nextInt();
        
        System.out.println("Enter your height in inches: ");
        int height = input.nextInt();
        
        boolean oldEnough = age >= AGE_LIMIT;
        boolean tallEnough = height >= HEIGHT_LIMIT;
        
        // Converted using De Morgan's Law
        boolean cannotRide = !oldEnough || !tallEnough;
        
        if(cannotRide)
        {
            System.out.println("You may not ride the rollercoasters.");
        }
        else
        {
            System.out.println("You may ride the rollercoasters!");
        }
        
        System.out.println("Can you swim? Enter true or false.");
        boolean canSwim = input.nextBoolean();
        
        System.out.println("Do you have a life jacket? Enter true or false.");
        boolean hasLifeJacket = input.nextBoolean();
        
        // Converted using De Morgan's Law
        boolean cannotSwim = !canSwim && !hasLifeJacket;
        
        if(cannotSwim)
        {
            System.out.println("You may not swim in the pool.");
        }
        else
        {
            System.out.println("You may swim in the pool!");
        }
    }
}

//3.6.6 Negative Numbers
NegativeNumbers.java
Solution Code
import java.util.Scanner;

public class NegativeNumbers
{
    public static void main(String[] args)
    {
        //Ask user to enter 2 positive integers
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter 2 integers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        //Determine if both numbers are negative with bothOdd boolean
        // Do NOT remove this line!
        boolean bothNegative = num1 < 0 && num2 < 0;
        
        //ADD THE NEW LINE HERE
        boolean bothNegativeDeMorgan = !(num1 >= 0 || num2 >= 0);
        
        //Print out if both numbers are negative or not both negative
        if (bothNegative)
        {
           System.out.println("Both numbers are negative");
        }
        else
        {
            System.out.println("Both numbers are NOT negative.");
        }
        
        //Print out if both numbers are negative or not both negative
        if (bothNegativeDeMorgan)
        {
           System.out.println("Both numbers are negative with De Morgan's Laws.");
        }
        else
        {
            System.out.println("Both numbers are NOT negative with DeMorgan's Laws.");
        }
        
        //Check that both Boolean values evaluate to the same value
        if(bothNegative == bothNegativeDeMorgan)
        {
            System.out.println("DeMorgan was right, again!");
        }
   }
}    

//3.6.7 Odd and Even
OddEven.java
Solution Code
public class OddEven
{
    // Determines if num1 and num2 are both ODD
    public static boolean bothOdd(int n1, int n2)
    {
        return !(n1 % 2 == 0 || n2 % 2 == 0);
    }
    
    // Determines if num1 and num2 are both EVEN
    public static boolean bothEven(int n1, int n2)
    {
        return n1 % 2 == 0 && n2 % 2 == 0;
    }
    
}

//3.7.7 String Variable Trace
StringTrace.java
Solution Code
public class StringTrace
{
    public static void main(String[] args)
    {
        String str1 = null;
        String str2 = new String("Karel");
        String str3 = "Karel";
        
        if (str1 == null)
        {
            str1 = str2;
        }
        
        if (str1 == str2)
        {
            System.out.println("str1 and str2 refer to the same object");
        }
        
        /*if (str2 == str3)
        {
            System.out.println("str2 and str3 refer to the same object");
        }*/
        
        if (str1.equals(str2) && str2.equals(str3))
        {
            System.out.println("str1, str2, and str3 are equal");
        }
        
        /*if ((str1 == str2) && (str2 == str3))
        {
            System.out.println("str1, str2, and str3 are the same objects");
            
        }*/
        
    }
}

//3.7.9 Three Strings
ThreeStrings.java
Solution Code
import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String companyCode = "1298";
        
        System.out.println("Enter your password: ");
        String password = input.nextLine();
        
        System.out.println("Enter the company's secret code: ");
        String code = input.nextLine();
        
        String expected = password + companyCode;
        String userEntered = password + code;
        
        if(expected.equals(userEntered))
        {
            System.out.println("Access granted");
        } 
        else
        {
            System.out.println(userEntered + " is denied");
        }
    }
}

//3.7.10 Comparing Circles
Circle.java
Solution Code
public class Circle
{
    private int radius;
    private String color;
    private int x;
    private int y;
    
    public Circle(int theRadius, String theColor, int xPosition, int yPosition)
    {
        radius = theRadius;
        color = theColor;
        x = xPosition;
        y = yPosition;
    }
    
    public int getRadius()
    {
        return radius;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public String toString()
    {
        return color + " circle with a radius of " + radius + " at position (" + x + ", " + y + ")";
    }
    
    public boolean equals(Circle other)
    {
        return color.equals(other.getColor()) && radius == other.getRadius() && x == other.getX() && y == other.getY();
    }
}


CircleTester.java
Solution Code
public class CircleTester
{
    public static void main(String[] args)
    {
        Circle one = new Circle(10, "blue", 50, 35);
        Circle two = new Circle(10, "blue", 50, 35);
        Circle three = new Circle(20, "red", 0, 0);
        Circle four = three;
        
        if(one.equals(two))
        {
            System.out.println("Circles one and two are equal!");
            System.out.println(one);
            System.out.println(two);
        }
        
        if(three.equals(four))
        {
            System.out.println("Circles three and four are equal!");
            System.out.println(three);
            System.out.println(four);
        }
    }
}

//4.1.6 Making Taffy
TaffyTester.java
Solution Code
import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.println("\nStarting Taffy Timer...Enter the temperature.");
       
       int temperature = input.nextInt();
       
       while(temperature <  270){
           System.out.println("\nThe mixture isn't ready yet. Enter the temperature.");
           temperature = input.nextInt();
       }
       
       System.out.println("Your taffy is ready for the next step!");
    }
}

//4.1.7 Guess the Number
GuessTheNumber.java
Solution Code
import java.util.Scanner;
public class GuessTheNumber
{ 
    // This is the height of Mt. Everest.
    static int everestHeight = 8848;
    
    public static void main(String[] args)
    {
        
        System.out.println("Do you know how tall Mt. Everest is?");
        System.out.println("See if you can guess the height in meters.");
        
        // This calls the static method guessTheHeight. Notice that the method is outside 
        // of the main method. 
        guessTheHeight();
        
    }
    
    public static void guessTheHeight() 
    {  
         // Allow the user to keep guessing until they guess the correct height
        
        Scanner input = new Scanner(System.in);
        int guess = 0;
        while(true)
        {
            System.out.println("Guess the height: ");
            guess = input.nextInt();
            
            // Stop the loop if the guess is correct
            if(guess == everestHeight)
            {
                break;
            }
            
            System.out.println("That's not it!");
        }
        
        System.out.println("Right! Mt. Everest is 8848 meters tall!");
        
          
    }
}

//4.1.8 Divisibility
ExtractDigits.java
Solution Code
public class ExtractDigits
{
    public static void main(String[] args)
    {
        extractDigits(2938724);
        
    }
    
    public static void extractDigits(int num)
    {
        while(num > 0)
        {
            int digit = num % 10;
            num = num / 10;
            System.out.println(digit);
        }
    }
}

//4.1.9 Max and Min Values
MaxMin.java
Solution Code
import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        // Your code goes here!
        // It is useful to plan out your steps before you get started!
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number or 0 to quit: ");
        int num = input.nextInt();
        
        int max = num;
        int min = num;
        
        while(num != 0)
        {
            if(num > max)
            {
                max = num;
            }
            
            if(num < min)
            {
                min = num;
            }
            
            System.out.println("Results so far:");
            System.out.println("Largest number: " + max);
            System.out.println("Smallest number: " + min);
            
            System.out.println("Enter a number or 0 to quit: ");
            num = input.nextInt();
        
        }
    }
}

//4.2.6 Print the Odds
Odds.java
Solution Code
public class Odds
{
    public static void main(String[] args)
    {
        for(int i = 1; i < 100; i += 2)
        {
            System.out.println(i);
        }
    }
}

//4.2.7 Repeat
Repeat150.java
Solution Code
public class Repeat150
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 150; i++)
        {
            System.out.println("Are we there yet?");
        }
    }
}

//4.2.8 Replace WHILE with FOR Loop
Countdown.java
Solution Code
public class Countdown
{
    public static void main(String[] args)
    {
        for (int x = 10; x > 0; x = x - 1)
            System.out.println(x);
    }
}

//4.2.9 Replace FOR Loop with WHILE Loop
Loops.java
Solution Code
public class Loops
{
    public static void main(String[] args)
    {
        int x = 0;
        while (x <= 21)
        {
            System.out.println(x);
            x += 3;
        }
    }
}

//4.2.10 Multiplication Table
MultiplicationTable.java
Solution Code
public class MultiplicationTable 
{
    public static void main(String[] args) {
        int num = 4;
        for(int i = 1; i <= 10; ++i)
        {
            int answer = num * i;
            System.out.println(num + " * " + i + " = " + answer);
        }
    }
}

//4.3.6 Replace Letter
Letter.java
Solution Code
import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        
        System.out.println("Enter the letter to be replaced: ");
        String removeLetter = input.nextLine();
        
        System.out.println("Enter the new letter: ");
        String newLetter = input.nextLine();
        
        // Call the method replaceLetter and pass all 3 of these items to it for 
        // string processing.
        System.out.println();
        System.out.println("Result: " + replaceLetter(word, removeLetter, newLetter));
        
    }
    
    // Modify this method so that it will take a third parameter from a user --
    // the String with which they want to replace letterToReplace 
    // 
    // This method should replace all BUT the first occurence of letterToReplace
    // You may find .indexOf to be useful, though there are several ways to solve this problem.
    // This method should return the modified String.
    public static String replaceLetter(String word, String letterToReplace, String replacement)
    {
        
        int start = word.indexOf(letterToReplace);
        String result = word.substring(0, start + 1);
        
        for(int i = start + 1; i < word.length(); i++)
        {
            if(word.substring(i, i + 1).equals(letterToReplace))
            {
                result += replacement;
            }
            else 
            {
                result += word.substring(i, i + 1);
            }
        }
        return result;
    }
}

//4.3.7 Password Checker
Password.java
Solution Code
import java.util.Scanner;
public class Password
{
    public static void main(String[] args)
    {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String str = input.nextLine();
        System.out.println(passwordCheck(str));
    }
    
    public static boolean passwordCheck(String password)
    {
        if (password.length() < 8 )
        {
            return false;
        }
        String digits = "0123456789";
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String pass = password.toLowerCase();
    
        for (int i = 0; i < pass.length(); i++)
        {
            String letter = pass.substring(i, i + 1);
            if (digits.indexOf(letter) == -1 && alpha.indexOf(letter) == -1)
            {
                return false;
            }
        }
        return true;
    }
}

//4.3.8 Finding Palindromes
Palindromes.java
Solution Code
import java.util.Scanner;
public class Palindromes
{
    /**
     * This program lets the user input some text and
     * prints out whether or not that text is a palindrome.
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in your text: ");
        String text = input.nextLine();
        
        if(isPalindrome(text))
        {
            System.out.println("Your word is a palindrome!");
        }
        else
        {
            System.out.println("Not a palindrome :(");
        }
    }
    
    /**
     * This method determines if a String is a palindrome,
     * which means it is the same forwards and backwards.
     * 
     * @param text The text we want to determine if it is a palindrome.
     * @return A boolean of whether or not it was a palindrome.
     */
    public static boolean isPalindrome(String text)
    {
        String reversed = reverse(text);
        if(text.equals(reversed))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * This method reverses a String.
     * 
     * @param text The string to reverse.
     * @return The new reversed String.
     */
    public static String reverse(String text)
    {
        String result = "";
        for(int i = text.length() - 1; i >= 0; i--)
        {
            String cur = text.substring(i , i + 1);
            result += cur;
        }
        return result;
    }

}
//4.3.9 Fixing Grammar

Grammar.java
Solution Code
import java.util.Scanner;
public class Grammar
{
    public static void main(String[] args)
    {
        Scanner input  = new Scanner(System.in);
        
        System.out.println("Enter your text that uses 2 instead of to: ");
        String text = input.nextLine();
        
        System.out.println(useProperGrammar(text));
    }
    
    public static String useProperGrammar(String theText)
    {
        int numFixes = 0;
        String fixedText = "";
        for(int i = 0; i < theText.length(); i++)
        {
            String letter = theText.substring(i, i + 1);
            if(letter.equals("2"))
            {
                fixedText += "to";
                numFixes++;
            } else {
                fixedText += letter;
            }
        }
        System.out.println("Fixed " + numFixes +  " grammatical errors:");
        return fixedText;
    }

}

//4.3.10 Teen Talk
Teen.java
Solution Code
public class Teen 
{
    private String firstName;
    private String lastName;
    private int grade;
    private Boolean textMessages;

    // Constructor to make a teen with a first and last name, grade in school, 
    // and whether they text message others and need to write texts to others. 
    
    // This defines the state of the teen.
    public Teen(String theFirstName, String theLastName, int theGrade, Boolean canMessage)
    {
        firstName = theFirstName;
        lastName = theLastName;
        grade = theGrade;
        textMessages = canMessage;
    }
    
    // toString method to print out the state of teen object
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + grade + " and wants to send this text:";
    }
    
    // Create this method so that it changes the text message 
    // by replacing '.' and '!' with "!!".
    public String teenTalk(String text)
    {
        String result = "";
        for (int i = 0; i < text.length(); i++)
        {
            String letter = text.substring(i, i + 1);
            if (letter.equals(".") || letter.equals("!"))
            {
                result += "!!";
            } 
            else 
            {
                result += letter;
            }
        }
        return result; 
        
    }
    
}
//4.4.6 Upright Number Triangle
NumberTriangle.java
Solution Code
public class NumberTriangle
{
    public static void main(String[] args)
    {  
       // Call makeNumberTriangle 
       makeNumberTriangle();
    }
     
    // Makes an upright triangle with the numbers 1-5
    public static void makeNumberTriangle()
    {
        int rows = 5;
        for(int i = 1; i <= rows; i++)
        {
              for(int j = 1; j <= i; j++)
              {
                 System.out.print(j + " ");
              }
              System.out.println("");
        }
    }
}

//4.4.7 Make a Tree
TreeOfStars.java
Solution Code
public class TreeOfStars
{
    public static void main(String[] args)
    {
       // Call makeATree 
       makeATree();
    }
    public static void makeATree()
    {
        int numStars = 9;
        int spacer = 0;
        
        for(int row = 0; row < 9; row++)
        {
            for(int i = 0; i < spacer; i++)
            {
                System.out.print(" ");
            }
            
            for(int j = numStars; j > 0; j--)
            {
                System.out.print("* ");
            }
            
            System.out.println();
            spacer++;
            numStars--;
        }
        
    }
}

//4.4.8 Multiplication Table
MultiplicationTable.java
Solution Code
public class MultiplicationTable
{
    public static void main(String[] args)
    {  
       // Call makeMultiplicationTable 
       makeMultiplicationTable();
    }
     
    // Makes a multiplcation table
    public static void makeMultiplicationTable()
    {
        for (int i = 1;i <= 10;i++)
        {
        for (int j = 1;j <= 10 ;j++)
            {
                System.out.print(i * j + "\t");
            }
        System.out.println(); 
        }
    }
}

//4.5.7 Improving findChar Speed
findCharTester.java
Solution Code
public class findCharTester
{
    public static void main(String[] args)
    {
        // Start here!
        String word = "This is a sentence";
        String key = "a";
        System.out.println("The character "+ key+ " is in the String "+ word + ": " + findChar(word, key));
    }
    
    public static boolean findChar(String string, String key)
    {
        // Write a more efficient version of isChar than the one in the exercise description
        // Use the hint!
        return string.indexOf(key) >= 0;
    }
}


//5.1.4 Access for DNA Class
DNA.java
Solution Code
public class DNA
{
    private String rsid;
    private String genotype;
	
	public DNA(String RSID, String geno) {

	}
}

//5.1.5 Access for Employee Class
Employee.java
Solution Code
public class Employee
{
    private String firstName;
    private String lastName;
    private double salary;
    private int shiftHours;
    
    public Employee(String fName, String lName, double monthlyWage, int shiftLen)
    {
        
    }
}


//5.1.6 Fixing Circle
CircleTester.java
Solution Code
public class CircleTester {

	public static void main(String[] args) {

		Circle circ = new Circle(10);

        circ.setRadius(5);
        
        System.out.println(circ);

        System.out.println("The diameter is " + circ.getDiameter());
        System.out.println("The perimeter is " + circ.getPerimeter());

	}

}

//5.2.5 Batting Average
BaseballTester.java
Solution Code
public class BaseballTester
{
    public static void main(String[] args)
    {
        BaseballPlayer babeRuth = new BaseballPlayer("Babe Ruth", 2873, 8399);
        System.out.println(babeRuth);
        babeRuth.printBattingAverage();
    }
}


BaseballPlayer.java
Solution Code
public class BaseballPlayer
{
    private int hits;
    private int atBats;
    private String name;
    
    public BaseballPlayer(String theName, int theHits, int theAtBats)
    {
        name = theName;
        hits = theHits;
        atBats = theAtBats;
    }
    
    public void printBattingAverage()
    {
        double battingAverage = hits / (double) atBats;
        System.out.println(battingAverage);
    }
    
    public String toString()
    {
        return name + ": " + hits + "/" + atBats;
    }    
}


//5.2.6 Dog Class
DogTester.java
Solution Code
public class DogTester {
    public static void main(String[] args) {

        // Create 2 dog objects and then print them out
        Dog karel = new Dog("Karel", "Retriever", true);
        System.out.println(karel);

        Dog clover = new Dog("Clover", "Corgi");
        System.out.println(clover);
    }
}

Dog.java
Solution Code
public class Dog
{
    private String name;
    private String breed;
    private boolean hasShots;

    public Dog(String dogName, String dogBreed, boolean isVaccinated)
    {
        name = dogName;
        breed = dogBreed;
        hasShots = isVaccinated;
    }
    
    public Dog(String dogName, String dogBreed)
    {
        name = dogName;
        breed = dogBreed;
        hasShots = false;
    }

    public String toString(){
        String output = "Name: " + name;
        output += "\nBreed: " + breed;
        
        if(hasShots)
        {
            output += "\nUp to date on shots!";
        }
        else
        {
            output += "\nMissing shots";
        }
        
        return output;
    }
}


//5.2.7 Student Overload
StudentTester.java
Solution Code
public class StudentTester
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 11, "Liberty High School");
        Student ada = new Student("Ada", "Lovelace", 5);
        
        System.out.println(alan);
        System.out.println(ada);
        
    }
}

Student.java
Solution Code
public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String school;

    /**
     * 
     * Check out StudentTester.java for an example of how to use
     * this constructor. 
     */
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        
        if (grade >= 9) {
            school = "high school";
        } else if (grade >= 6) {
            school = "middle school";
        } else {
            school = "elementary school";
        }
        
    }
    
     public Student(String fName, String lName, int grade, String mySchool)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        school = mySchool;
    }
    
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + gradeLevel + " and goes to " + school;
    }
    
    public String getFirstName(){
        return firstName;
    }
}


//5.2.8 SchoolClub Class

StudentTester.java
Solution Code
public class StudentTester
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 11, "Liberty High School");
        Student ada = new Student("Ada", "Lovelace", 5);
        
        System.out.println(alan);
        System.out.println(ada);
        
        SchoolClub code = new SchoolClub(ada, "Girls Who Code");
        
        System.out.println(code);
    }
}

Student.java
Solution Code
public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String school;

    /**
     * 
     * Check out StudentTester.java for an example of how to use
     * this constructor. 
     */
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        
        if (grade >= 9) {
            school = "high school";
        } else if (grade >= 6) {
            school = "middle school";
        } else {
            school = "elementary school";
        }
        
    }
    
     public Student(String fName, String lName, int grade, String mySchool)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        school = mySchool;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + gradeLevel + " and goes to " + school;
    }
}

//5.3.5 Commenting Activity Tracker


ActivityTracker.java
Solution Code
public class ActivityTracker
{
    public static void main(String[] args)
    {
        /** Answers will vary slightly **/
        
        //Create a new activity tracker
        ActivityLog mylog = new ActivityLog();
        
        //Add miles and hours for day one
        mylog.addMiles(5);
        mylog.addHours(1);
        
        //Print out the total miles
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        
        // Save today's hours
        double hoursToday = mylog.getHours();
        
        // Add hours for next two days
        mylog.addHours(1.5);
        mylog.addHours(3);
        
        // Calculate the increase in hours
        double increase = mylog.getHours() - hoursToday;
        
        //Print out the results
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}


ActivityLog.java
Solution Code
public class ActivityLog
{
    private double numHours;
    private double numMiles;
    
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    
    public void addHours(double hours)
    {
        numHours += hours;
    }
    
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    
    public double getMiles()
    {
        return numMiles;
    }
    
    public double getHours() 
    {
        return numHours;
    }

}


//5.3.6 Commenting Activity Log
ActivityTracker.java
Solution Code
public class ActivityTracker
{
    public static void main(String[] args)
    {
        /** Answers will vary slightly **/
        
        //Create a new activity tracker
        ActivityLog mylog = new ActivityLog();
        
        //Add miles and hours for day one
        mylog.addMiles(5);
        mylog.addHours(1);
        
        //Print out the total miles
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        
        // Save today's hours
        double hoursToday = mylog.getHours();
        
        // Add hours for next two days
        mylog.addHours(1.5);
        mylog.addHours(3);
        
        // Calculate the increase in hours
        double increase = mylog.getHours() - hoursToday;
        
        //Print out the results
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}


ActivityLog.java
Solution Code
public class ActivityLog
{
    private double numHours;
    private double numMiles;
    
    /**
     * Constructor for Activity log. Initializes hours and miles to 0.
     */
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    /**
     * Adds hours to the total.
     * @param hours - Number of hours to add.
     */
    public void addHours(double hours)
    {
        numHours += hours;
    }
    /**
     * Adds miles to the total
     * @param miles - Number of miles to add.
     */
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    /**
     * Returns the miles back to the user
     * @return - Total miles
     */
    public double getMiles()
    {
        return numMiles;
    }
    /**
     * Returns the hours back to the user
     * @return - Total hours
     */
    public double getHours() 
    {
        return numHours;
    }
    
}

//5.3.7 C.Y.O.A. Layout
CYOA.java
Solution Code
import java.util.Scanner;

public class CYOA 
{
    public static void main(String[] args) 
    {
        /** Answers will vary **/
        
        // Intro

        // First choice: Poland or Japan

            // Poland Description

                //Second Choice (Activity): Szczeliniec, the Table Mountains or Czocha Castle 

                    // Table Mountains Ending

                    // Czocha Castle Ending

            // Japan Description

                //Second Choice (Activity): Meiji Jingu or Tokyo National Museum

                    //Meiji Jingu Ending

                    //Tokyo National Museum Ending

            
    }
}


//5.3.8 C.Y.O.A. Finishing the story
CYOA.java
Solution Code
import java.util.Scanner;

public class CYOA 
{
    public static void main(String[] args) 
    {
        /* Answers will vary */
        
        
        Scanner input = new Scanner(System.in);
        
        // Intro
        System.out.println("Are you ready to take destination vacation?");
        System.out.println("Answer a few simple questions to see your suggested adventure!");
        System.out.println();

        // First choice: Poland or Japan
        System.out.println("Our vacation experts have two spotlight destinations for this week!");
        System.out.println("Would you like to learn more about [P]oland or [J]apan?");
        
        
        String country = input.nextLine().substring(0,1).toUpperCase();

        if(country.equals("P"))
        {
            // Poland Description
            System.out.println("Here are some facts about Poland!");
            System.out.println("Population (2020): 37,865,542");
            System.out.println("Official language: Polish");
            System.out.println("Currency: Złoty");
            
            //Second Choice (Activity): Szczeliniec, the Table Mountains or Czocha Castle 
            System.out.println("Would you like to [H]ike or visit a [C]astle? ");
            String activity = input.nextLine().substring(0,1).toUpperCase();

            if(activity.equals("H"))
            {
                // Table Mountains Ending
                System.out.println("You'll love hiking in the Table Mountains (Stołowe Mountains)!");
                System.out.println("These mountains are full of extraordinary rock formations");
                System.out.println("and forests full of spruce trees and beech trees.");
                System.out.println("We're sure you'll love your hiking adventure!");
            }
            else if(activity.equals("C"))
            {
                // Czocha Castle Ending
                System.out.println("You'll love exploring the structures of Czocha Castle!");
                System.out.println("Originally built in the 13th century By Wenceslaus I of Bohemia,");
                System.out.println("it has been part of many wars.");
                System.out.println("Recently, it has made appearances in movies, TV and is open as a hotel!");
                System.out.println("Need another reason to visit?  It hosts the College of Wizardry!");
            }
            else 
            {
                System.out.println("That doesn't appear to be a certified activity!");
                System.out.println("We'll look into it and get back to you.");
            }
                    
        }
        else if(country.equals("J"))
        {
            // Japan Description
            System.out.println("Here are some facts about Japan!");
            System.out.println("Population (2021): 125,470,000");
            System.out.println("Official language: Japanese");
            System.out.println("Currency: Yen");
            
            //Second Choice (Activity): Meiji Jingu or Tokyo National Museum
            System.out.println("Would you like to visit a [S]hrine or a [M]useum? ");
            
            String activity = input.nextLine().substring(0,1).toUpperCase();

            if(activity.equals("S"))
            {
                //Meiji Jingu Ending
                System.out.println("Meiji Jingu is a Shinto shrine dedicated to Emperor Meiji");
                System.out.println("and his Empress Shoken.");
                System.out.println("You will be in awe as you explore the resilient manmade forest,");
                System.out.println("beautiful garden, and traditional sanctuaries.");
   
            }
            else if(activity.equals("M"))
            {
                //Tokyo National Museum Ending
                System.out.println("Want an extensive look into Japanese art and history?");
                System.out.println("You'll definitely want to visit Tokyo National Museum!");
                System.out.println("You'll see art, armor, ceramic pieces, sculptures, and more!");
                System.out.println("Too excited to wait? You can view some of the collection online!");
                
            }
            else 
            {
                System.out.println("That doesn't appear to be a certified activity!");
                System.out.println("We'll look into it and get back to you.");
            }
            
        }
        else 
        {
            System.out.println("I'm sorry, that's not one of our spotlight destinations.");
            System.out.println("Come again next week!");
        }

            
    }
}

//5.4.5 Add Some Getter Methods
Comment.java
Solution Code
public class Comment
{
    private String poster;
    private String text;
    private String date;
    
    public Comment(String personPosting, String message, String textDate)
    {
        poster = personPosting;
        text = message;
        date = textDate;
    }
    
    public String toString()
    {
        return text + "\n--" + poster + "(" + date + ")";
    }

    public String getPoster()
    {
        return poster;
    }
    
    public String getText()
    {
        return text;
    }
    
    public String getDate()
    {
        return date;
    }
    
}


Messages.java
Solution Code
public class Messages
{
    public static void main(String[] args)
    {
        Comment message1 = new Comment("Ada", "haha this is so funny", "06/17/2078");
        Comment message2 = new Comment("Alan", "this was super useful. thanks for posting!",
                                            "09/30/2081");
        
        System.out.println(message1);
        System.out.println(message2);
        
        System.out.println();
        System.out.println("OP: " + message1.getPoster());
        System.out.println("Text of comment: " + message1.getText());
        System.out.println("Date of comment: " + message1.getDate());
    }
}

//5.4.6 Full Dragon Class

DragonTester.java
Solution Code
public class DragonTester
{
    public static void main(String[] args)
    {
        Dragon pete = new Dragon(5, "%");
        System.out.println(pete);
        System.out.println(pete.getAttack());
        System.out.println(pete.getLevel());
        System.out.println(pete.fight());
    }
}


Dragon.java
Solution Code
public class Dragon 
{
    private String attack;
    private int level;
    
    // Write the constructor here!
    public Dragon(int startLevel, String fightCall)
    {
        attack = fightCall;
        level = startLevel;
    }
    
    // Put getters here
    public String getAttack()
    {
        return attack;
    }
    public int getLevel()
    {
        return level;
    }
    
    // Put other methods here
    public String fight()
    {
        String fightString = "";
        for(int i = 0; i < level; i++)
        {
            fightString += attack;
        }
        return fightString;
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}

//5.4.7 A Different Dragon Class

DragonTester.java
Solution Code
public class DragonTester
{
    public static void main(String[] args)
    {
        Dragon pete = new Dragon("Pete", 80);
        System.out.println(pete);
        System.out.println(pete.getName());
        System.out.println(pete.getLevel());
        System.out.println(pete.isFireBreather());
        
        pete.attack();
        
        System.out.println();
        
        Dragon raven = new Dragon("Raven", 65);
        System.out.println(raven);
        System.out.println("Raven can breathe fire: " + raven.isFireBreather());
        raven.attack();
        raven.gainExperience();
        System.out.println("Raven can breathe fire: " + raven.isFireBreather());
        raven.attack();
        
    }
}



Dragon.java
Solution Code
public class Dragon 
{
    private String name;
    private int level;
    private boolean canBreatheFire;
    
    // Write the constructor here!
    public Dragon(String dragonName, int dragonLevel){
        name = dragonName;
        level = dragonLevel;
        if(dragonLevel > 70){
            canBreatheFire = true;
        } else {
            canBreatheFire = false;
        }
    }
    
    // Put getters here
    public String getName(){ 
        return name;
    }
    public int getLevel(){
        return level;
    }
    public boolean isFireBreather(){
        return canBreatheFire;
    }
    
    
   // 
   public void gainExperience(){
       level += 10;
       if(level > 70){
           canBreatheFire = true;
       }
   }
   
   public void attack(){
       if(canBreatheFire){
           System.out.println(">>>>>>>>>>");
           System.out.println(">>>>>>>>>>>>>>");
           System.out.println(">>>>>>>>>>>>>>");
           System.out.println(">>>>>>>>>>");
           
       } else {
           System.out.println("~ ~ ~");
       }
   }
    

    // String representation of the object
    public String toString()
    {
        return "Dragon " + name + " is at level " + level;
    }
}


//5.4.8 A Chef's Best Meal
ChefTester.java
Solution Code
public class ChefTester
{
    public static void main(String[] args)
    {
        Meal macaroni = new Meal("Mac N Cheese", "Lunch", 8);
        Chef alex = new Chef("Alex", "Juniors Cheesecake", macaroni);
        
        System.out.println(alex);
        System.out.println(alex.getMealName());
        
        //Create your own Meal and Chef here:
        
        Meal dinner = new Meal("Vegetable Soup", "Dinner", 6);
        Chef kevin = new Chef("Kevin", "Kevin's Kitchen", dinner);
        
        System.out.println(kevin);
        System.out.println(dinner);
    }
}
Chef.java
Solution Code
public class Chef
{
    private String name;
    private String restaurant;
    private Meal bestMeal;
    
    public Chef(String theName, String theRestaurant, Meal theBest)
    {
        name = theName;
        restaurant = theRestaurant;
        bestMeal = new Meal(theBest.getName(), theBest.getCourse(), theBest.getNumberOfServings());
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getRestaurant()
    {
        return restaurant;
    }
    
    public String getMealName()
    {
        return bestMeal.getName();
    }
    
    public int getMealServings()
    {
        return bestMeal.getNumberOfServings();
    }
    
    public String getMealCourse()
    {
        return bestMeal.getCourse();
    }
    
    public String toString()
    {
        return "Chef " + name + " works at " + restaurant + " and is best known for " + bestMeal.toString();
    }
}


//5.5.5 Rectangle class

Rectangle.java
Solution Code
public class Rectangle
{
    private int width;
    private int height;
    
    /**
     * This is the constructor to create a Rectangle.
     * To create a Rectangle we need to know its width
     * and height.
     */
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    

    public void setWidth(int rectWidth)
    {
        width = rectWidth;
    }

    public int getWidth()
    {
        return width;
    }

    public void setHeight(int rectHeight)
    {
        height = rectHeight;
    }

    public int getHeight()
    {
        return height;
    }
    
    public int getArea()
    {
        return width * height;    
    }
    
    public int getPerimeter()
    {
        return 2 * width + 2 * height;
    }

    /**
     * This is the toString method. It returns a String
     * representation of the object. 
     */
    public String toString(){
        String res = "Rectangle width: " + width;
        res += ", Rectangle height: " + height;
        return res;
    }
        
}


RectangleTester.java
Solution Code
public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle room = new Rectangle(10, 20);
        System.out.println(room);
        System.out.print("Area: ");
        System.out.println(room.getArea());
        
        System.out.print("Perimeter: ");
        System.out.println(room.getPerimeter());
        
    }
}


//5.5.6 Full Fraction Class
FractionTester.java
Solution Code
public class FractionTester
{
    public static void main(String[] args)
    {
        // Add code here to test out your Fraction class!
    }
}

Fraction.java
Solution Code
public class Fraction
{
    private int numerator;
    private int denominator;

    public Fraction(int num, int denom) {
        numerator = num;
        denominator = denom;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void add(Fraction other) {
        numerator = numerator * other.getDenominator() + other.getNumerator() * denominator;
        denominator = denominator * other.getDenominator();
    }

    public void subtract(Fraction other) {
        numerator = numerator * other.getDenominator() - other.getNumerator() * denominator;
        denominator = denominator * other.getDenominator();
    }

    public void multiply(Fraction other) {
        numerator = numerator * other.getNumerator();
        denominator = denominator * other.getDenominator();
    }

    public String toString() {
        return numerator + " / " + denominator;
    }
}

//5.5.7 Weekly Routine
Routine.java
Solution Code
public class Routine
{
    private double school;
    private double hobbies;
    private double friends;
    private double sleep;
    
    public void setSchool(double schoolTime)
    {
        school = schoolTime;
    }
    
    public void setHobbies(double hobbyTime)
    {
        hobbies = hobbyTime;
    }
    
    public void setFriends(double friendTime)
    {
        friends = friendTime;
    }
    
    public void setSleep(double sleepTime)
    {
        sleep = sleepTime;
    }
    
    
    
    public double getSleep()
    {
        return sleep;
    }
    
    public double getHobbies()
    {
        return hobbies;
    }
    
    public double getFriends()
    {
        return friends;
    }
    
    public double getSchool()
    {
        return school;
    }
    
    
    public void printTotal()
    {
        double weeklySchool = school * 7;
        double weeklyHobby = hobbies * 7;
        double weeklyFriends = friends * 7;
        double weeklySleep = sleep * 7;
        
        double weeklyTotal = weeklySchool + weeklyHobby + weeklyFriends + weeklySleep;
        
        
        System.out.println("How You Spend Your Week");
        System.out.println("At School: " + weeklySchool);
        System.out.println("Sleeping: " + weeklySleep);
        System.out.println("With Friends: " + weeklyFriends);
        System.out.println("Doing fun stuff: " + weeklyHobby);
        System.out.println("You're busy " + weeklyTotal + " hours a week!");
        
    }
    
}

//5.6.5 Distance Conversions
Distance.java
Solution Code
public class Distance
{
    private double kilometers;
    
    public Distance(double startKilometers)
    {
        kilometers = startKilometers;
    }
    
    public double toMiles()
    {
        return kilometers / 1.609;
    }

    public double toLeagues()
    {
        return kilometers / 5.556;
    }

    public double doubleMiles()
    {
        return toMiles() * 2;
    }
    
    public double getKilometers()
    {
        return kilometers;
    }
    
}


DistanceTester.java
Solution Code
public class DistanceTester
{
    public static void main(String[] args)   
    {
        Distance school = new Distance(5);
        Distance park = new Distance(10);
        Distance underTheSea = new Distance(20);
        
        double milesToSchool = school.toMiles();
        double roundTripToPark = park.doubleMiles();
        double leagueUnderSea = underTheSea.toLeagues();
        
        System.out.print(school.getKilometers() + " km = ");
        System.out.println(milesToSchool + " miles");
        
        System.out.print(underTheSea.getKilometers() + " km = ");
        System.out.println(leagueUnderSea + " leagues");
        
        System.out.print(park.getKilometers() + " km (one way) = ");
        System.out.println(roundTripToPark + " miles (round trip)");
        
        
    }


  //5.6.6 Food App Demo
FoodRunner.java
Solution Code
import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Food burger = new Food("Hamburgers", 600);
        Food fries = new Food("French Fries", 350);
        Food soda = new Food("Coke", 200);

        System.out.println(burger);
        System.out.println("How many would you like? ");
        int burgerCount = input.nextInt();
        System.out.println();

        System.out.println(fries);
        System.out.println("How many would you like? ");
        int friesCount = input.nextInt();
        System.out.println();

        System.out.println(soda);
        System.out.println("How many would you like? ");
        int sodaCount = input.nextInt();
        System.out.println();

        int totalCalories = burgerCount * burger.getCalories() +
                            friesCount * fries.getCalories() +
                            sodaCount * soda.getCalories();

        System.out.print("Your meal will have a total of ");
        System.out.println(totalCalories + " calories.");

    }
}


Food.java
Solution Code
public class Food
{
    private String name;
    private int calories;

    public Food (String foodName, int foodCalories){
        name = foodName;
        calories = foodCalories;
    }

	public String getName() {
		return name;
	}

	public void setName(String foodName) {
		name = foodName;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int foodCalories) {
		calories = foodCalories;
	}

	public String toString() {
		return name + " have " + calories + " calories";
	}
}

//5.6.7 Car Class
Car.java
Solution Code
public class Car {
	private double efficiency; //Miles per gallon
	private double gas; //Gallons of gas
	private double tankCapacity; //Gallons
	private double totalMilesDriven; //Miles

	public Car(double carEfficiency, double carTankCapacity){
		efficiency=carEfficiency;
		tankCapacity=carTankCapacity;
		gas = 0;
		totalMilesDriven=0;
	}

    public void addGas(){
		gas = tankCapacity;
        System.out.println("Filling up ...");
	}

	public void addGas(double amount) {
		gas +=amount;
        System.out.println("Adding gas ...");
		if (gas > tankCapacity){
			gas = tankCapacity;
		}
	}

	public double getTotalMilesDriven(){
		return totalMilesDriven;
	}

	public void drive(double distance) {
		if (canDrive(distance)){
			gas -= distance/efficiency;
			totalMilesDriven += distance;
            System.out.println("Driving " + distance);
		}
		else {
            System.out.println("Can't drive " + distance + ". That's too far!");
		}
	}

	public boolean canDrive (double distance){
		if (gas*efficiency<distance){
			return false;
		}
		else {
			return true;
		}
	}
    public double milesAvailable(){
		return efficiency*gas;
	}
	public double getGas() {
		return gas;
	}

}


CarTester.java
Solution Code
public class CarTester {

    public static void main(String[] args) {
        //Create a car that gets 20 mpg and has a 15 gallon tank
        Car myWheels = new Car(20,15);
        //Fill up the gas tank
        myWheels.addGas();
        //Check the miles available
        System.out.println("Miles available: " + myWheels.milesAvailable());

        //Drive 100 miles
        myWheels.drive(100);

        //Check the miles available
        System.out.println("Miles available: " + myWheels.milesAvailable());

        //Add 2 gallons to the gas tank
        myWheels.addGas(2);

        //Check the miles available
        System.out.println("Miles available: " + myWheels.milesAvailable());

        //Try driving more miles than available
        myWheels.drive(1000);

        //Drive 200 miles
        myWheels.drive(200);

        //Check how much gas you have left
        System.out.println("Gas remaining: " + myWheels.getGas());

        //Print total miles driven
        System.out.println("Total Miles Driven: " + myWheels.getTotalMilesDriven());
    }
}

  
//5.6.7 Car Class
Car.java
Solution Code
public class Car {
	private double efficiency; //Miles per gallon
	private double gas; //Gallons of gas
	private double tankCapacity; //Gallons
	private double totalMilesDriven; //Miles

	public Car(double carEfficiency, double carTankCapacity){
		efficiency=carEfficiency;
		tankCapacity=carTankCapacity;
		gas = 0;
		totalMilesDriven=0;
	}

    public void addGas(){
		gas = tankCapacity;
        System.out.println("Filling up ...");
	}

	public void addGas(double amount) {
		gas +=amount;
        System.out.println("Adding gas ...");
		if (gas > tankCapacity){
			gas = tankCapacity;
		}
	}

	public double getTotalMilesDriven(){
		return totalMilesDriven;
	}

	public void drive(double distance) {
		if (canDrive(distance)){
			gas -= distance/efficiency;
			totalMilesDriven += distance;
            System.out.println("Driving " + distance);
		}
		else {
            System.out.println("Can't drive " + distance + ". That's too far!");
		}
	}

	public boolean canDrive (double distance){
		if (gas*efficiency<distance){
			return false;
		}
		else {
			return true;
		}
	}
    public double milesAvailable(){
		return efficiency*gas;
	}
	public double getGas() {
		return gas;
	}

}

//5.7.6 Rock, Paper, Scissors!

RockPaperScissors.java
Solution Code
import java.util.Scanner;

public class RockPaperScissors 
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
     
    /**
     * Function: getWinner
     * 
     * Parameters:
     * String user - a string holding the choice that the user player
     * made. Must either be "rock", "paper", or "scissors"
     * String computer - a string holding the choice that the computer
     * player made. Must either be "rock", "paper", or "scissors"
     * 
     * Determines the winner based on the rules of rock paper scissors.
     * Rock beats scissors and loses to paper
     * Paper beats rock and loses to scissors
     * Scissors beats paper and loses to rock
     * Identical choices tie
     * 
     * Return: a string holding a message describing the winner, either
     * USER_PLAYER, COMPUTER_PLAYER, or TIE
     */
    public static String getWinner(String user, String computer)
    {
        if(user.equals(computer))
        {
            return TIE;
        }
        if(user.equals("rock") && computer.equals("paper"))
        {
            return COMPUTER_PLAYER;
        }
        if(user.equals("rock") && computer.equals("scissors"))
        {
            return USER_PLAYER;
        }
        if(user.equals("paper") && computer.equals("rock"))
        {
            return USER_PLAYER;
        }
        if(user.equals("paper") && computer.equals("scissors"))
        {
            return COMPUTER_PLAYER;    
        }
        if(user.equals("scissors") && computer.equals("rock"))
        {
            return COMPUTER_PLAYER;
        }
        return USER_PLAYER;
    } 
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while(true){
            //Get the user's choice
            System.out.println("Enter your choice (rock, paper, or scissors): ");
            String choice = scanner.nextLine();
            choice = choice.toLowerCase();
            
            //End the game if the user entered a blank line
            if(choice.equals("")){
                break;
            }
            
            //Make sure it was a valid choice
            if(choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")){
                //Print the user choice
                System.out.println("User: " + choice);
                
                //Get the computer random choice
                int compChoiceNum = Randomizer.nextInt(0,2);
                String compChoice = "";
                if (compChoiceNum == 0)
                {
                    compChoice = "rock";
                }
                else if (compChoiceNum == 1)
                {
                    compChoice = "paper";
                }
                else
                {
                    compChoice = "scissors";
                }
                
                //Print the computer choice
                System.out.println("Computer: " + compChoice);
            
                //Print the winner
                System.out.println(getWinner(choice, compChoice));
            }
                
            else{
                System.out.println(choice + "is not a valid move. Please try again");
            }
        }
        
        //End the game with a nice message
        System.out.println("Thanks for playing!");
    }
}


/*
//Print the user choice
                System.out.println("User: " + choice);
            
                //Get the computer random choice
                String[] compChoices = new String[]{"rock", "paper", "scissors"};
                int compChoiceNum = Randomizer.nextInt(0, 2);
                String compChoice = compChoices[compChoiceNum];
                
                //Print the computer choice
                System.out.println("Computer: " + compChoice);
            
                //Print the winner
                System.out.println(getWinner(choice, compChoice));
            }
*/

Randomizer.java
Solution Code
public class Randomizer
{
    public static int nextInt()
    {
        //Implement this method to return a random number from 1-10
        return (int)(Math.random() * (10) +1);
    }
    
    public static int nextInt(int min, int max)
    {
        //Implement this method to return a random integer between min and max
        int range = max - min;
        return (int)(Math.random() * (range + 1) + min);
    }
}


//5.7.7 How Many Players in the Game?
TeamTester.java
Solution Code
public class TeamTester
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 8; i++)
        {
            // Create a team
            Team opponent = new Team();
            
            // Ready to play a tournament?
            System.out.println(i + 1 + " teams added");
            System.out.print("Ready for tournament? ");
            System.out.println(Team.tournamentReady());
        }
    }
}

Team.java
Solution Code
public class Team 
{
    // Static Variables
    public static int totalTeams = 0;
    public static int minTeams = 6;
    
    // Public Methods
    public Team() 
    {
        totalTeams++;
    }
    
    // Static Methods 
    public static boolean tournamentReady()
    {
        return totalTeams >= minTeams;
    }
}


//5.8.7 Scope
ScopeTester.java
Solution Code
public class ScopeTester
{
    public static void main(String[] args) {
        Scope scope = new Scope();

        scope.printScope();
    }
}


Scope.java
Solution Code
public class Scope
{
    private int x;
    private int y;
    private int z;

    public Scope(){
        x = 3;
        y = 18;
        z = 21;
    }

    public void printScope(){
       System.out.println("t = " + getT());
       System.out.println("w = " + getW());
       System.out.println("x = " + x);
       System.out.println("y = " + y);
       System.out.println("z = " + z);
       
    }

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

    public int getW(){
        int w = x + z;
        return w;
    }

	public int getT() {
        int t = y + z;
		return t;
	}
}

//5.8.8 Which Variables Exist?

MathOperations.java
Solution Code
public class MathOperations
{
    private static double PI = 3.14159;
    
    public static void main(String[] args)
    {
        int sumResult = sum(5, 10);
        int differenceResult = difference(20, 2);
        double productResult = product(3.5, 2);
        double circumferenceResult = circleCircumference(10);
        double areaResult = circleArea(12);
    }
    
    public static int sum(int one, int two)
    {
        // Printing Variables Example
        System.out.println("PI: " + PI);
        System.out.println("one: " + one);
        System.out.println("two: " + two);
        
        return one + two;
    }
    
    public static int difference(int one, int two)
    {
        // PRINT OUT VARIABLES HERE
        System.out.println("PI: " + PI);
        System.out.println("one: " + one);
        System.out.println("two: " + two);
        
        return one - two;
    }
    
    public static double product(double a, double b)
    {
        double result = a * b;
        
        // PRINT OUT VARIABLES HERE
        System.out.println("PI: " + PI);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("result: " + result);
        
        return result;
    }
    
    public static double circleCircumference(int radius)
    {
        // PRINT OUT VARIABLES HERE
        System.out.println("PI: " + PI);
        System.out.println("radius: " + radius);
        
        return 2 * radius * PI;
    }
    
    public static double circleArea(int radius)
    {
        double area = PI * radius * radius;
        
        // PRINT OUT VARIABLES HERE
        System.out.println("PI: " + PI);
        System.out.println("radius: " + radius);
        System.out.println("area: " + area);
        
        return area;
    }
}

//5.8.9 Broken Calculator
Calculator.java
Solution Code
public class Calculator {

    private int total;
    private int value;

    public Calculator(int startingValue){
        total = startingValue;
        value = 0;
    }

    public int add(int value){
        total = total + value;
        return total;
    }

    /**
    * Adds the instance variable value to the total
    */
    public int add(){
        total += value;
        return total;
    }

    public int multiple(int value){
        total *= value;
        return total;
    }

    public void setValue(int newValue){
        value = newValue;
    }

    public int getValue(){
        return value;
    }

}

CalculatorTester.java
Solution Code
public class CalculatorTester
{
    public static void main(String[] args) {

        System.out.println("Starting at 5");
        Calculator myTi = new Calculator(5);

        System.out.println("Adding 10 ...");
        System.out.print("Should print 15: ");
        System.out.println(myTi.add(10));

        System.out.println("Multiplying by 2 ...");
        System.out.print("Should print 30: ");
        System.out.println(myTi.multiple(2));

        System.out.println("Changing value to 20 ...");
        myTi.setValue(20);
        System.out.print("Adding. Should print 50: ");
        System.out.println(myTi.add());

    }
}

//5.9.5 Write Your Own CodeHS
Exercise.java
Solution Code
public class Exercise
{
    public String name;
    public String programmingLanguage;
    public int points;
    public int difficulty; // scale of 1 - 5
    
    // Default constructor.
    public Exercise() 
    {
        name = "Hello World";
        programmingLanguage = "Java";
        points = 10;
        difficulty = 3;
    }
    
    // Edit code in this constructor.
    public Exercise(String name, String programmingLanguage, int points, int difficulty) 
    {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.points =  points;
        this.difficulty = difficulty;
    }
    
    public String getName() {
        return name;
    }
}

ExerciseTester.java
  
public class ExerciseTester
{
    public static void main(String[] args)
    {
        Exercise exercise1 = new Exercise();
        Exercise exercise2 = new Exercise("Iteration Iteration Iteration", "Java", 45, 5);
        
        System.out.println(exercise1.getName());
        System.out.println(exercise2.getName());
    }
}


//5.9.6 Song Class

Song.java
Solution Code
public class Song
{
    private String artist;
    private String title;
    private int minutes;
    private int seconds;

    public Song(String artist, String title, int minutes, int seconds){
        this.artist = artist;
        this.title = title;
        this.minutes = minutes;
        this.seconds = seconds;
    }

	/**
	* Returns value of artist
	* @return artist
	*/
	public String getArtist() {
		return artist;
	}

	/**
	* Sets new value of artist
	* @param artist Updated artist
	*/
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/**
	* Returns value of title
	* @return title
	*/
	public String getTitle() {
		return title;
	}

	/**
	* Sets new value of title
	* @param title Updated title
	*/
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	* Returns value of minutes
	* @return minutes
	*/
	public int getMinutes() {
		return minutes;
	}

	/**
	* Sets new value of minutes
	* @param minutes Updated minutes
	*/
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	/**
	* Returns value of seconds
	* @return seconds
	*/
	public int getSeconds() {
		return seconds;
	}

	/**
	* Sets new value of seconds
	* @param seconds Updated seconds
	*/
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	/**
	* Create string representation of Song for printing
	* @return String of the song
	*/
	@Override
	public String toString() {
		return "artist= " + artist + "\ntitle= " + title + "\nTime= " + minutes + ":" + seconds;
	}
}

SongTester.java
Solution Code
public class SongTester
{
    /** Answers will vary **/
    
    public static void main(String[] args) {
        Song dancing = new Song("ABBA", "Dancing Queen", 3, 54);
        System.out.println(dancing);
        System.out.println();

        Song heart = new Song("Bruce Springsteen", "The Heart of Rock and Roll", 5, 14);
        System.out.println(heart);
        System.out.println();

        heart.setArtist("Huey Lewis & the News");
        heart.setMinutes(4);
        heart.setSeconds(59);
        System.out.println(heart);

    }
}

//5.9.7 Fraction Math
FractionTester.java
Solution Code
public class FractionTester
{
    public static void main(String[] args) {
        Fraction first = new Fraction(3, 4);

        Fraction half = new Fraction(1, 2);

        System.out.println(first);
        System.out.print("Multiplying: ");
        System.out.println(half);

        first.multiplyFraction(half);

        System.out.println("Answer: " + first);

        System.out.println();
        System.out.print("Adding: ");
        System.out.println(half);

        first.addFraction(half);

        System.out.println("Answer: " + first);
    }

}

FractionMath.java
Solution Code
public class FractionMath {
    
    /*
    * This is a static class that the Fraction class will use.
    * No updates are needed.
    */

    public static Fraction add(Fraction frac1, Fraction frac2){
        int numerator = frac1.getNumerator() * frac2.getDenominator() +
                        frac2.getNumerator() * frac1.getDenominator();

        int denominator = frac1.getDenominator() * frac2.getDenominator();

        Fraction solution = new Fraction(numerator, denominator);
        return solution;
    }

    public static Fraction multiply(Fraction frac1, Fraction frac2){
        int numerator = frac1.getNumerator() * frac2.getNumerator();
        int denominator = frac1.getDenominator() * frac2.getDenominator();
        Fraction solution = new Fraction(numerator, denominator);
        return solution;
    }
}

//6.1.6 Our First Array
FirstArray.java
Solution Code
public class FirstArray
{
    public static void main(String[] args)
    {
        // Create the 3 arrays here
        String[] cityNames = new String[]{"Las Vegas", "Minsk", "Sao Paulo"};
        int[] populations = new int[]{667501, 2038822, 12330000};
        double[] sunshine = new double[]{8.11, 1.36, 6.05 };
        
        
        // Print all 3 arrays according to the output in the description
        System.out.println(cityNames[0] + "'s population is " + populations[0] + ".");
        System.out.println(cityNames[1] + "'s population is "  + populations[1] + ".");
        System.out.println(cityNames[2] + "'s population is "  + populations[2] + ".");
        
        System.out.println();
        System.out.println("The least amount of sunshine " + cityNames[0] + " gets is " + sunshine[0] + " hours a day.");
        System.out.println("The least amount of sunshine " + cityNames[1] + " gets is " + sunshine[1] + " hours a day.");
        System.out.println("The least amount of sunshine " + cityNames[2] + " gets is " + sunshine[2] + " hours a day.");
        
    }
}

//6.1.7 Set Scores

Scores.java
Solution Code
public class Scores
{
     public static void main(String[] args)
     {
      int[] scores = {80, 95, 82, 67, 100};
    
      System.out.println(scores[0]);
      System.out.println(scores[1]);
      System.out.println(scores[2]);
      System.out.println(scores[3]);
      System.out.println(scores[4]);
      System.out.println();
      
      scores[2] = 72;
      scores[4] = 95; 
      
      System.out.println(scores[0]);
      System.out.println(scores[1]);
      System.out.println(scores[2]);
      System.out.println(scores[3]);
      System.out.println(scores[4]);
        
    }
}

//6.1.8 Last Element in Array
LastElement.java
Solution Code
public class LastElement
{
    public static void main(String[] args)
    {
        double[] unitCircle = {0, 1.57, 3.14, 6.28, 7.85};
        
        //get and print the last element of the array
        System.out.println("The final unit circle value is " + getLastElement(unitCircle));
    }

    public static double getLastElement(double[] arr)
    {
        return arr[arr.length - 1];
    }
}

//6.1.9 Snap Shot Splash Screen
SnapShot.java
Solution Code
public class SnapShot
{
    public static void main(String[] args)
    {
        String[] stringArr = {"Welcome", "to", "the snap shot", "app!"};
        
        System.out.println(stringArr[0]);
        System.out.println(stringArr[1]);
        System.out.println(stringArr[2]);
        System.out.println(stringArr[3]);
        System.out.println();
        
        stringArr[0] = "Upgrade";
        stringArr[3] = "premium app!";
        
        System.out.println(stringArr[0]);
        System.out.println(stringArr[1]);
        System.out.println(stringArr[2]);
        System.out.println(stringArr[3]);
    }
}

//6.2.7 Print Array

PrintArray.java
Solution Code
public class PrintArray
{
    public static void main(String[] args)
    {
        String[] arr = new String[]{"w", "x", "y", "z"};
        printArr(arr);
    }
    
    public static void printArr(String[] arr)
    {
        // Print everything in the array on its own line
        
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(i + ". " + arr[i]);
        }
    }
}

//6.2.8 Print Odd Array Indices
PrintOdd.java
Solution Code
public class PrintOdd 
{
    public static void main(String[] args)
    {
        int[] oddIndexArray = new int[] {1, 2, 3, 4, 5};
        printOddIndices(oddIndexArray);
    }
    
    public static void printOddIndices(int[] arr)
    {
        for (int i = 1; i < arr.length; i+=2)
        {
            System.out.println(arr[i]);
        }
    }
}
//6.2.9 Find Index of a String
MatchingStringTester.java
Solution Code
public class MatchingStringTester
{
   public static void main(String[] args)
   {
     System.out.println(MatchingString.findString("Karel"));
     
   }
}


//MatchingString.java
Solution Code
public class MatchingString
{
    private static String[] arr = {"Hello", "Karel", "CodeHS!", "Karel"};
    
    public static int findString(String myString)
    {
        String word = null;
    
        for (int index = 0; index < arr.length; index++)
        {
            word = arr[index];
           
                if (word.equals(myString))
                {
                    return index;
                }
        }
        return -1;
    }
}

//6.2.10 Fibonacci Sequence
Fibonacci.java
Solution Code
public class Fibonacci 
{
    public static void main(String[] args) 
    {
      
        //number of elements to generate in the sequence
		int max = 15;
		
		// create the array to hold the sequence of Fibonacci numbers
		int[] sequence = new int[max];
		
		//create the first 2 Fibonacci sequence elements
		sequence[0] = 0;
		sequence[1] = 1;
		
		//create the Fibonacci sequence and store it in int[] sequence
		for(int i = 2; i < max; i++)
		{
		    sequence[i] = sequence[i - 1] + sequence[i - 2];
		}
	
		
		//print the Fibonacci sequence numbers
		System.out.println("The first " + max + " elements in the Fibonacci sequence are: ");
        for(int i = 0; i < max; i++)
        {
            System.out.print(sequence[i] + " ");
        }
        
        System.out.println("\nThe element after 21 is " + findNextElement(sequence, 21));
        System.out.println("The element after 233 is " + findNextElement(sequence, 233));
        
        // Be careful! Where is 377 in the array? How should your function avoid problems?
        System.out.println("The element after 377 is " + findNextElement(sequence, 377));
        
        
    
    }
      
    // This method returns the element that comes after element 'toFind'
    public static int findNextElement (int[] arr, int toFind) 
    {
        if(arr == null)
        {
            return -1;
        }
        
        int i = 0;
        
        while(i < arr.length - 1)
        {
            if(arr[i] == toFind){
                return arr[i + 1];
            }
            
            i++;
        }
        
        
        return -1;
        
    }
}

//6.3.6 Print Odds
PrintOdds.java
Solution Code
public class PrintOdds
{
   public static void main(String[] args)
   {
     int[ ] values = {17, 34, 56, 2, 19, 100};
        
     for (int value : values)
     {
       if (value % 2 == 1)
           System.out.println(value + " is odd");
     }
   }
}

//6.3.7 Largest Value
LargestValue.java
Solution Code
public class LargestValue     
{ 
    public static void main(String[] arg) 
    { 
        { 
            int[] values = {32, 56, 79, 2, 150, 37}; 
              
            int highestValue = findMax(values); 
            System.out.println("The highest score is " + highestValue); 
        } 
    } 
    public static int findMax(int[] numbers) 
    {  
        int maxSoFar = numbers[0];
        
        // equivalent for loop 
        for (int i = 0; i < numbers.length; i++)  
        { 
            if (numbers[i] > maxSoFar) 
            { 
                maxSoFar = numbers[i]; 
            } 
        } 
        
        /* Alternate solution as a while loop
        
        int i = 0;
        while (i < numbers.length){
            if (numbers[i] > maxSoFar) 
            { 
                maxSoFar = numbers[i]; 
            }
            i ++;
        }
        */
    return maxSoFar; 
    } 
} 

//6.3.8 Classroom Array
Student.java
Solution Code
/**
 * The Student class holds data about a student.
 * The fields are firstName, lastName, and grade.
 */
public class Student
{
    // Attributes
    private String firstName;
    private String lastName;
    private int gradeLevel;
    
    // Constructor
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    // new getter
    public String getLastName()
    {
        return lastName;
    }
    
    // new getter 
    public int getGradeLevel()
    {
        return gradeLevel;
    }
    
    
    public String toString()
    {
        return "Student " + lastName + ", " + firstName;
    }
    
}

//6.3.9 Array Average
ArrayAverageTester.java
Solution Code
public class ArrayAverageTester
{

   public static void main(String[] args)
   {
     int[] numArray =  {12, 17, 65, 7, 30, 88};
     
     ArrayAverage myArray = new ArrayAverage(numArray);
     
     System.out.println("The average of the array is " + myArray.getAverage());
   }
}

ArrayAverage.java
Solution Code
public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
      values = theValues;
   }

   public double getAverage()
   {
     double total = 0;
     for (int val : values)
     {
       total  = total + val;
     }
     return total / values.length;
   }
}

//Median.java
Solution Code
import java.util.*;
public class Median
{

    public static void main(String[] args)
    {
        int[] numbers1 = {12, 75, 3, 17, 65, 22};
        System.out.print("The median value of the EVEN array is " + median(numbers1));
        
        int[] numbers2 = {12, 75, 3, 17, 65, 22, 105};
        System.out.print("\nThe median value of the ODD array is " + median(numbers2));
        
    }

    public static double median(int[] arr)
    {
        Arrays.sort(arr);
        
        // If array is even length, return the average of the middle values
        if(arr.length % 2 == 0)
        {
        	int index1 = arr.length / 2;
        	int index0 = index1 - 1;
            return (arr[index0] + arr[index1]) / 2.0;
        }
        
        // If array is odd length, return the middle value
        return arr[arr.length / 2];
    }
}


//6.4.7 Find the Last Multiple of 3
LastMultipleOfThree.java
Solution Code
public class LastMultipleOfThree
{

   public static void main(String[] args)
    {
        int[] numbers1 = {76, 75, 3, 17, 12, 22, 7};
        System.out.print("The last multiple of 3 is " + findMultipleOfThree(numbers1));
        
    }
    
    public static int findMultipleOfThree(int[] arr)
    {
        int multiple = -1;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 3 == 0)
            {
                multiple = arr[i];
            }
        }
        return multiple;
    }
}


//6.4.8 Most Improved

Student.java
Solution Code
public class Student
{
    private static final int NUM_EXAMS = 4;
    
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    
    private int[] exams;
    private int numExamsTaken;

    // Constructor
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        exams = new int[NUM_EXAMS];
        numExamsTaken = 0;
    }
    
    public int getExamImprovement()
    {
        int improvement = 0;
        
        for(int i = 0; i < this.numExamsTaken - 1; i++) {
            improvement += exams[i + 1] - exams[i];
        }
        
        
        return improvement;
    }
    
    public String getName()
    {
        return firstName + " " + lastName;
    }
    
    public void addExamScore(int score)
    {
        exams[numExamsTaken] = score;
        numExamsTaken++;
    }
    
    // This is a setter method to set the GPA for the Student.
    public void setGPA(double theGPA)
    {
        gpa = theGPA;
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}


//7.1.6 Initializing an ArrayList
Agency.java
Solution Code
import java.util.ArrayList;
public class Agency
{
    public static void main(String[] args)
    {
        //Initialize your ArrayLists here!
        ArrayList<String> companyName = new ArrayList<String>();
        ArrayList<Integer> contractValue = new ArrayList<Integer>();
    }
}

//7.1.7 Car Inventory
CarTracker.java
Solution Code
import java.util.ArrayList;

public class CarTracker
{
    public static void main(String[] args)
    {
        //Initialize your ArrayList here:
        ArrayList<ClassicCar> garage = new ArrayList<ClassicCar>();
    }
}

ClassicCar.java
Solution Code
public class ClassicCar
{
    String name;
    String model;
    int cost;
    
    public ClassicCar(String name, String model, int cost)
    {
        this.name = name;
        this.model = model;
        this.cost = cost;
    }
}

//7.2.6 Get First Element
Numbers.java
Solution Code
import java.util.ArrayList;

public class Numbers
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        // Add 5 numbers to `numbers`
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        
        // Print out the first element in `numbers`
        System.out.println(numbers.get(0));
    }
}

//7.2.7 ArrayList of Even Numbers
Evens.java
Solution Code
import java.util.ArrayList;

public class Evens
{
    public static void main(String[] args)
    {
        ArrayList<Integer> evens = new ArrayList<Integer>();
        //Create a for loop to add values 1-100 to the ArrayList
        for(int index = 100; index < 301; index++)
        {
            if(index % 2 == 0)
            {
                evens.add(index);
            }
        }
        
        printArray(evens);
    }
    
    public static void printArray(ArrayList<Integer> classList)
    {
        System.out.println("Array:");
        for(int name: classList)
        {
            System.out.print(name + " ");
        }
    }
    
    
}

//7.2.8 Teacher Class List
ClassListTester.java
Solution Code
public class ClassListTester
{
    public static void main(String[] args)
    {
        //You don't need to change anything here, but feel free to add more Students!
        Student alan = new Student("Alan", 11);
        Student kevin = new Student("Kevin", 10);
        Student annie = new Student("Annie", 12);
        System.out.println(Student.printClassList());
    }
    
    
    
}

//7.2.9 Teacher Class List Methods
Student.java
Solution Code
import java.util.ArrayList;

public class Student
{
    private String name;
    private int grade;
    //Implement classList here:
    private static ArrayList<Student> classList = new ArrayList<Student>();
    
    public Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
        classList.add(this);
    }
    
    public String getName()
    {
        return this.name;
    }
    //Add the static methods here:
    
    public static String getLastStudent()
    {
        return classList.get(classList.size()-1).getName();
    }
    
    public static int getClassSize()
    {
        return classList.size();
    }
    
    public static void addStudent(int index, Student student)
    {
        classList.add(index, student);
        classList.remove(classList.size()- 1);
    }
    
    public static String getStudent(int index)
    {
        return classList.get(index).getName();
    }


    public static String printClassList()
    {
        String names = "";
        for(Student name: classList)
        {
            names+= name.getName() + "\n";
        }
        return "Student Class List:\n" + names;
    }
}



ClassListTester.java
Solution Code
public class ClassListTester
{
    public static void main(String[] args)
    {
        //You don't need to change anything here, but feel free to add more Students!
        Student alan = new Student("Alan", 11);
        Student kevin = new Student("Kevin", 10);
        Student annie = new Student("Annie", 12);
        System.out.println(Student.printClassList());
        
        System.out.println(Student.getLastStudent());
        System.out.println(Student.getStudent(1));
    
        Student.addStudent(2, new Student("Trevor", 12));
        System.out.println(Student.printClassList());
        System.out.println(Student.getClassSize());
    }
}

//7.3.6 Traversing Odds
Odds.java
Solution Code
import java.util.ArrayList;

public class Odds
{
    public static void main(String[] args)
    {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        // Pre-load the array list with values.
        for(int index = 1; index < 21; index++)
        {
            odds.add(index);
            odds.add(index);
        }
        
        removeEvens(odds);
        
        for(int index = 0; index < odds.size(); index++)
        {
            System.out.println(odds.get(index));
        }
        
    }
    public static void removeEvens(ArrayList<Integer> array)
    {
        for(int index = 0; index < array.size(); index++)
        {
            if(array.get(index) % 2 == 0)
            {
                array.remove(index);
                index--;
            }
        }

    }
}


//7.3.7 ArrayList Helper Methods
ArrayListMethods.java
Solution Code
import java.util.ArrayList;


public class ArrayListMethods
{
    
    // Prints elements of nums with each element on its own line
    public static void print(ArrayList<Double> nums)
    {
        for(Double value : nums)
        {
            System.out.println(value);
        }
    }
    
    // Reduces the number of elements by multiplying
    // consecutive elements and replacing the elements
    // by the product
    public static void condense(ArrayList<Double> nums)
    {
        int i = 0;
        while(i < nums.size() - 1)
        {
            nums.set(i, nums.get(i) * nums.get(i + 1));
            nums.remove(i + 1);
            i++;
        }
    }
    
    // Doubles the size of the ArrayList by adding each element
    // to the end of the ArrayList
    public static void duplicate(ArrayList<Double> nums)
    {
        int len = nums.size();
        for(int i = 0; i < len; i++)
        {
            nums.add(nums.get(i));
        }
    }

}


ArrayListMethodsTester.java
Solution Code
No solution code.
Starter Code
import java.util.ArrayList;

public class ArrayListMethodsTester
{
    public static void main(String[] args)
    {
        ArrayList<Double> prices = new ArrayList<Double>();
        
        prices.add(13.45);
        prices.add(8.99);
        prices.add(2.95);
        prices.add(7.88);
        prices.add(12.56);
        prices.add(1.23);
        
        
        ArrayListMethods.print(prices);
        System.out.println("\nArrayList is condensing:");
        ArrayListMethods.condense(prices);
        ArrayListMethods.print(prices);
        System.out.println("\nArrayList is duplicating:");
        ArrayListMethods.duplicate(prices);
        ArrayListMethods.print(prices);
        
    }
}


//7.3.8 Road Trip!
RoadTripTester.java
Solution Code
public class RoadTripTester
{
    public static void main(String[] args)
    {
        RoadTrip rt = new RoadTrip();
        rt.addStop("San Francisco", 37.7833, -122.4167);
        rt.addStop("Los Angeles", 34.052235, -118.243683);
        rt.addStop("Las Vegas", 36.114647, -115.172813);

        
        System.out.println(rt);
        
        System.out.println("Stops: " + rt.getNumberOfStops());
        System.out.println("Total Miles: " + rt.getTripLength());
    }
}

RoadTrip.java
Solution Code
import java.util.*;

public class RoadTrip
{
    // Your instance variables here
    private ArrayList<GeoLocation> stops;
    
    public RoadTrip()
    {
        stops = new ArrayList<GeoLocation>();
        
    }
    
    public void addStop(String name, double lat, double longitude)
    {
        GeoLocation stop = new GeoLocation(name, lat, longitude);
        stops.add(stop);
    }
    
    public int getNumberOfStops()
    {
        return stops.size();
    }
    
    public String toString()
    {
        String result = "";
        for(int i = 0; i < stops.size(); i++)
        {
            GeoLocation cur = stops.get(i);
            result += (i + 1) + ". " + cur + "\n";
        }
        return result;
    }
    
    public double getTripLength()
    {
        double length = 0;
        for(int i = 0; i < stops.size() - 1; i++)
        {
            // Add the distance from i to i + 1
            GeoLocation start = stops.get(i);
            GeoLocation end = stops.get(i + 1);
            double distance = start.distanceFrom(end);
            length += distance;
        }
        return length;
    }
    
    
    // Your methods here
}

GeoLocation.java
Solution Code
/*
 * This class stores information about a location on Earth.  Locations are
 * specified using latitude and longitude.  The class includes a method for
 * computing the distance between two locations.
 *
 * This implementation is based off of the example from Stuart Reges at 
 * the University of Washington.
 */

public class GeoLocation 
{
    // Earth radius in miles
    public static final double RADIUS = 3963.1676;  

    private double latitude;
    private double longitude;
    private String name;

    /**
     * Constructs a geo location object with given latitude and longitude
     */
    public GeoLocation(String name, double theLatitude, double theLongitude) 
    {
        this.name = name;
        latitude = theLatitude;
        longitude = theLongitude;
    }
    
    public String getName()
    {
        return this.name;
    }

    /**
     * Returns the latitude of this geo location
     */
    public double getLatitude() 
    {
        return latitude;
    }

    /**
     * returns the longitude of this geo location
     */
    public double getLongitude() 
    {
        return longitude;
    }

    // returns a string representation of this geo location
    public String toString() 
    {
        return name + " (" + latitude + ", " + longitude + ")";
    }

    // returns the distance in miles between this geo location and the given
    // other geo location
    public double distanceFrom(GeoLocation other) 
    {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);
        // apply the spherical law of cosines with a triangle composed of the
        // two locations and the north pole
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * RADIUS;
    }
}

//7.4.5 ArrayList equals
isEqual.java
Solution Code
import java.util.ArrayList;
public class isEqual
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(9);
        list1.add(5);
        list1.add(2);
        list1.add(9);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(9);
        list2.add(5);
        list2.add(2);
        list2.add(9);
        boolean isEqual = equals(list1, list2);
        System.out.println("List 1 is equal to List 2: "+isEqual);
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(1);
        list3.add(9);
        list3.add(5);
        list3.add(2);
        list3.add(9);
        boolean isEqual2 = equals(list2, list3);
        System.out.println("List 2 is equal to List 3: "+isEqual2);
        
    }
    
    public static boolean equals(ArrayList<Integer> array1, ArrayList<Integer> array2)
    {
        if(array1.size() != array2.size())
        {
            return false;
        }
        for(int index = 0; index < array1.size();index++)
        {
            if(array1.get(index) != array2.get(index))
            {
                return false;
            }
        }
        return true;
    }
}

//7.4.6 Airline Tickets
AirlineTicket.java
Solution Code
public class AirlineTicket
{
    private String[] seats = {"A","B","C","D","E","F"};
    private String name;
    private String seat;
    private int boardingGroup;
    private int row;
    
    public AirlineTicket(String name, String seat, int boardingGroup, int row)
    {
        this.name = name;
        if(isValidSeat(seat))
        {
            this.seat = seat;
        }
        this.boardingGroup = boardingGroup;
        this.row = row;
        
    }
    
    private boolean isValidSeat(String seat)
    {
        boolean isValidSeat = false;
        for(String elem: seats)
        {
            if(seat.equals(elem))
            {
                isValidSeat = true;
            }
        }
        return isValidSeat;
    }
    
    public String getSeat()
    {
        return this.seat;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getBoardingGroup()
    {
        return this.boardingGroup;
    }
    
    public int getRow()
    {
        return this.row;
    }
    
    public String toString()
    {
        return name + " Seat: " +seat + " Row: " + row + " Boarding Group: " + boardingGroup;
    }
}

AirlineTicketTester.java
Solution Code
import java.util.ArrayList;

public class AirlineTicketTester
{
    public static void main(String[] args)
    {
        ArrayList<AirlineTicket> tickets = new ArrayList<AirlineTicket>();
        //This creates a randomized list of passengers
        addPassengers(tickets);
        for(AirlineTicket elem: tickets)
        {
            System.out.println(elem);
        }
       //This creates a TicketOrganizer object
        TicketOrganizer ticketOrganizer = new TicketOrganizer(tickets);
        
        //These are the methods of the ticketOrganizer in action
        System.out.println("\nPassengers Ordered by Boarding Group:");
        ticketOrganizer.printPassengersByBoardingGroup();
        System.out.println("\nPassengers in line who can board together:");
        ticketOrganizer.canBoardTogether();
    }
    
    //Do not touch this method! It is adding random passengers to the AirlineTicket array
    public static void addPassengers(ArrayList<AirlineTicket> tickets)
    {
        String[] names = {"Xander", "Siena", "Ella-Louise", "Dawn", "Sharon", "Ayla", "Delores", "Adrian", "Candice", "Everly", "Nevaeh", "Patricia", "Saba", "Austin", "Deanna"};
        String[] seats = {"A","B","C","D","E","F"};
        for(int index = 0; index< 15; index++)
        {
            int random = (int)(Math.random() * 5);
            AirlineTicket ticket = new AirlineTicket(names[index], seats[random], ((int)(Math.random()*5)+1), ((int)(Math.random()*8)+1));
            tickets.add(ticket);
        }
    }
    
}

//7.4.7 Billboard Top 10
BillboardTester.java
Solution Code
public class BillboardTester
{
    public static void main(String[] args)
    {
        Billboard top10 = new Billboard();
        top10.add(new Musician("Beyonce", 316, 100000000));
        top10.add(new Musician("The Beatles", 365, 600000000));
        top10.add(new Musician("Drake", 425, 150000000));
        top10.add(new Musician("Pink Floyd", 34, 250000000));
        top10.add(new Musician("Mariah Carey", 287, 200000000));
        top10.add(new Musician("Rihanna", 688, 250000000));
        top10.add(new Musician("Queen", 327, 170000000));
        top10.add(new Musician("Ed Sheeran", 536, 150000000));
        top10.add(new Musician("Katy Perry", 317, 143000000));
        top10.add(new Musician("Justin Bieber", 398, 140000000));

        //This musician should not be added to the top10 because they don't have enough records sold        
        top10.add(new Musician("Karel the Dog", 332, 60));
        
        //This musician should replace the artist with the least Weeks on the top 40 charts.
        top10.add(new Musician("Tracy the Turtle", 332, 150000000));
        
        //This musician should not replace an artist, but is a Platinum artist
        top10.add(new Musician("Alex Eacker", 100, 23400000));
        
        top10.printTop10();



    } 
}

Billboard.java
Solution Code
import java.util.ArrayList;
public class Billboard
{
    private ArrayList<Musician> top10 = new ArrayList<Musician>();
    
    public void add(Musician singer)
    {
        if(singer.getIsPlatinum() && top10.size() < 10)
        {
            top10.add(singer);
        }
        else if(singer.getIsPlatinum() && top10.size() == 10)
        {
            replace(singer);
        }
        else
        {
            System.out.println("Sorry, "+ singer.getName() + " does not qualify for Top 10");
        }
    }
    
    public void replace(Musician singer)
    {
        int min = top10.get(0).getWeeksInTop40();
        int minIndex = 0;
        for(int index = 0; index < top10.size(); index++)
        {
            int numWeeksTop40 = top10.get(index).getWeeksInTop40();
            if(numWeeksTop40 < min)
            {
                min =  numWeeksTop40;
                minIndex = index;
            }
        }
        if(min < singer.getWeeksInTop40())
        {
            System.out.println("The musician "+ top10.get(minIndex).getName() + " has been replaced by " + singer.getName() + ".");
            top10.set(minIndex, singer);
        }
        else
        {
            System.out.println("Sorry, " + singer.getName() + " has less weeks in the Top 40 than the other musicians."); 
        }
    }
    
    public void printTop10()
    {
        System.out.println(top10);
    }
}

//7.4.8 User Data Cleanup
DataPurge.java
Solution Code
import java.util.ArrayList;

public class DataPurge
{
    public static void removeDuplicates(ArrayList<String> members)
    {
        int j = 0;
        
        for(int i = 0; i < members.size(); i++)
        {
            j = i + 1;
            while(j < members.size())
            {
                if(members.get(i).equals(members.get(j)))
                {
                    System.out.println("Duplicate "+ members.get(j) + " removed");
                    members.remove(j);
                }
                else 
                {
                    j++;
                }
            }
        }
    }
    
    public static void removeName(ArrayList<String> members, String name)
    {
        int i = 0;
        while(i < members.size())
        {
            if(members.get(i).contains(name))
            {
                System.out.println("Removing " + members.get(i));
                members.remove(i);
            }
            else 
            {
                i++;
            }
        }
    }
    
    
    public static boolean correctlyFormatted(ArrayList<String> members)
    {
        boolean result = true;
        
        for(String person : members)
        {
            if(!person.contains(" "))
            {
                return false;
            }
            
            String firstLetter = person.substring(0, 1);
            if(firstLetter != firstLetter.toUpperCase())
            {
                return false;
            }
            
            int lastNameIndex = person.indexOf(" ") + 1;
            String last = person.substring(lastNameIndex, lastNameIndex + 1);
            if(last != last.toUpperCase())
            {
                return false;
            }
        }
        
        return result;
    }
}

DataPurgeTester.java
Solution Code
import java.util.ArrayList;

public class DataPurgeTester
{
    public static void main(String[] args)
    {
        ArrayList<String> members = new ArrayList<String>();
        addMembers(members);
        System.out.println("All names formatted correctly? " + DataPurge.correctlyFormatted(members));
        DataPurge.removeName(members, "Araceli Castaneda");
        DataPurge.removeDuplicates(members);
        System.out.println(members);
    }
    
    
    
    public static void addMembers(ArrayList<String> emails)
    {
        emails.add("London Braun");
        emails.add("Jaslyn Chavez");
        emails.add("Daphne Kane");
        emails.add("Aden Brock");
        emails.add("Jaime Wolf");
        emails.add("finley Wood");
        emails.add("Trent maynard");
        emails.add("Jaiden Krause");
        emails.add("London Braun");
        emails.add("Jaiden Krause");
        emails.add("Davon Mccormick");
        emails.add("JosieFreeman");
        emails.add("Jaslyn Chavez");
        emails.add("Zaiden Harding");
        emails.add("Araceli Castaneda");
        emails.add("Jaime Wolf");
        emails.add("London Braun");
        
    }
}

//7.5.4 Linear Search on ArrayList with While Loop
ArrayListSearch.java
Solution Code
import java.util.ArrayList;

public class ArrayListSearch
{
    public static void main(String[] args) {
        ArrayList<Double> array = new ArrayList<Double>();
        array.add(4.5);
        array.add(6.7);
        array.add(5.0);
        array.add(2.9);
        array.add(7.0);
        System.out.println(search(array, 5.0));
    }

    public static int search(ArrayList<Double> array, double key)
    {
        int counter = 0;
        while(counter < array.size())
        {
            if(key == array.get(counter))
            {
                return counter;
            }
            counter++;
        }
        return -1;
    }
}

//Fantasy Football Roster
FantasyFootball.java
Solution Code
import java.util.ArrayList;
import java.util.Scanner;

public class FantasyFootball
{
    public static void main(String[] args)
    {
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);
        String[] myPlayers = new String[5];
        Scanner input = new Scanner(System.in);
        
        int counter = 0;
        while(counter < 5)
        {
            System.out.println("Enter name of player to add: ");
            String player = input.nextLine();
            int index = search(availablePlayers, player);
            if(index > -1)
            {
                myPlayers[counter] = player;
                counter++;
                availablePlayers.remove(index);
                System.out.println("Successfully added player\n");
            }
            else
            {
                System.out.println(player + " is not an available player.\n");
            }
        }
        
        System.out.println("Final Team Roster: ");
        for( String elem: myPlayers)
        {
            System.out.println(elem);
        }
    }
    
    public static int search(ArrayList<String> array, String player)
    {
        for(int i = 0; i < array.size(); i++)
        {
            String element = array.get(i);
            if(element.equals(player))
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void addPlayers(ArrayList<String> array)
    {
        array.add("Cam Newton");
        array.add("Antonio Brown");
        array.add("Leveon Bell");
        array.add("Patrick Mahomes");
        array.add("Saquon Barkley");
        array.add("Mike Evans");
        array.add("Odell Beckham Jr.");
        array.add("Travis Kelce");
        array.add("Baker Mayfield");
        array.add("Michael Thomas");
        array.add("Julio Jones");
        array.add("Ezekial Elliott");
        array.add("Alvin Kamara");
        array.add("Davante Adams");
        array.add("Aaron Rogers");
    }
}


//7.6.4 Explore Selection Sort
SelectionSort.java
Solution Code
import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] array1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};
        
        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        // sort first array
        selectionSort(array1);
        // sort second array
        selectionSort(array2);

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array sorted: ");
        System.out.println(Arrays.toString(array2));
    }
    
    /*
     * Selection sort takes in an array of integers and
     * returns a sorted array of the same integers.
     */
    public static int[] selectionSort(int[] arr)
    {
        int numSwaps = 0;
        int currentMinIndex;
        for (int i = 0; i < arr.length - 1; i++)
        {
            currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[currentMinIndex])
                {
                    currentMinIndex = j;
                }
            }
            
            // swap numbers if needed
            if (i != currentMinIndex)
            {
                numSwaps++;
                int temp = arr[currentMinIndex];
                arr[currentMinIndex] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(numSwaps);
        return arr;
    }
}

//7.6.9 Explore Insertion Sort
InsertionSort.java
Solution Code
import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] array1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};
        
        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        // sort first array
        insertionSort(array1);
        // sort second array
        insertionSort(array2);

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array sorted: ");
        System.out.println(Arrays.toString(array2));
    }
    
    /*
     * Insertion sort takes in an array of integers and
     * returns a sorted array of the same integers.
     */
    public static void insertionSort(int[] arr)
    {
        // note: we start with 1 instead of 0
        for (int i = 1; i < arr.length; i++)
        {
            int curNumber = arr[i];
            int curIndex = i-1;
            while ( curIndex > -1 && arr[curIndex] < curNumber)
            {
                arr[curIndex+1] = arr[curIndex];
                curIndex--;
            }
            arr[curIndex+1] = curNumber;
        }
    }
}

//7.6.12 Phonebook
Phonebook.java
Solution Code
import java.util.ArrayList;

public class Phonebook
{
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    
    public void addContact(Contact newFriend)
    {
        contacts.add(newFriend);   
        sort();
    }
    
    
    public void sort()
    {
        for(int index = 1; index < contacts.size(); index++)
        {
            
            Contact currentIndexContact = contacts.get(index);
            
            String currentIndexValue = currentIndexContact.getName();
            
            int sortedIndex = index - 1;
            
            
            while(sortedIndex > -1 && currentIndexValue.compareTo(contacts.get(sortedIndex).getName()) < 0)
            {
            	contacts.set((sortedIndex + 1), contacts.get(sortedIndex));
            	
            	sortedIndex--;
            }
            
            contacts.set((sortedIndex + 1), currentIndexContact);
        }
    }
    
    public void printPhonebook()
    {
        for(Contact friend : contacts)
        {
            System.out.println(friend.getName());
        }
    }
}

PhonebookTester.java
Solution Code
No solution code.
Starter Code
public class PhonebookTester
{
    public static void main(String[] args)
    {
        Phonebook test = new Phonebook();
        test.addContact(new Contact("Sherry", "Facebook", "sherrygold"));
        test.addContact(new Contact("Dylan", "Snap", "@d_oaktree"));
        test.addContact(new Contact("Kevin", "phone", "12312312"));
        test.addContact(new Contact("Bob", "phone", "12312312"));
        test.addContact(new Contact("Alex", "Tweeeter", "@alexxx"));
        test.printPhonebook();
    }
}


Contact.java
Solution Code
No solution code.
Starter Code
public class Contact
{
    private String name;
    private String method; 
    private String handle;

    public Contact(String name, String contactMethod, String handle)
    {
        this.name = name;
        method = contactMethod;
        this.handle = handle;
    }

    public String getName()
    {
        return name;
    }
    
    public String howToContact()
    {
        return method;
    }

    public String getHandle()
    {
        return handle;
    }
}

//8.1.5 Manipulating 2D Arrays
ArrayPractice.java
Solution Code
public class ArrayPractice
{
    public static void main(String[] args)
    {
        int[][] array = {{3, 5, 7, 8, 0}, {500, 250, 125, 784, 267, 674, 0}, {9, 8, 0}};
        
        // Call the fixArray method three times on this array:
        
        // update last value of first row to length of array
        updateValue(array, 0, array[0].length-1, array.length);
        
        // update last value of second row to sum of the lengths of rows
        int totalLenRows = array[0].length + array[1].length + array[2].length;
        updateValue(array, 1, array[1].length-1, totalLenRows);
        
        // update last value of third row to sum of first and last values in array
        int sumFirstLast = array[0][0] + array[2][array[2].length-1];
        updateValue(array, 2, array[2].length-1, sumFirstLast);
        
        print(array);
    }
    
    //Create a method to add the correct value to the array at the correct col, row
    public static void updateValue(int[][] arr, int row, int col, int value)
    {
        arr[row][col] = value;
    }
    
    
    
    //Do not make alterations to this method!
    public static void print(int[][] array)
    {
        for(int[] row: array)
        {
            for(int num: row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

//8.1.6 Complete Chessboard
ChessBoard.java
Solution Code
public class ChessBoard
{
    public static void main(String[] args)
    {
        String[][] chess = new String[8][8];
        String[] pieces = {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
        String[] pawns = {"Pawn", "Pawn","Pawn","Pawn","Pawn","Pawn","Pawn","Pawn"};
        String[] spaces = {"-", "-", "-", "-", "-", "-", "-", "-"};
        chess[0] = pieces;
        chess[1] = pawns;
        for(int i=2; i<7; i++)
        {
            chess[i]= spaces;
        }
        chess[chess.length-2] = pawns;
        chess[chess.length-1] = pieces;
        print(chess);
        

    }
    
    
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}

//8.1.7 Tic Tac Toe Board
TicTacToe.java
Solution Code
public class TicTacToe
{
    private String[][] board;

    public TicTacToe()
    {
        board = new String[][] {
            {"-", "-", "-"},
            {"-", "-", "-"},
            {"-", "-", "-"}
        };
    }
    
    public String[][] getBoard()
    {
        return board;
    }
}


TicTacToeTester.java
Solution Code
public class TicTacToeTester
{
    public static void main(String[] args)
    {
        TicTacToe board = new TicTacToe();
        printBoard(board.getBoard());
    }
    
    public static void printBoard(String[][] array)
    {
        for(String[] row: array)
        {
            for(String play: row)
            {
                System.out.print(play+ " ");
            }
            System.out.println();
        }
    }
}

//8.2.7 Sum Rows in a 2D Array
Sum.java
Solution Code
public class Sum
{
    public static void main(String[] args)
    {
        int[][] array = {{42, 14, 54, 5, 93, 5},
                        {14, 22, 353, 341, 865, 32},
                        {12345, 123, 1234, 123456, 23, 1}};
                        
        
        System.out.println("The sum of the array's elements is " + sumArray(array));
                        
                        
    }
    
    public static int sumRow(int[][] array, int row)
    {
        int sum = 0;
        for(int elem : array[row])
        {
            sum += elem;
        }
        
        return sum;
    }
    
    public static int sumArray(int[][] array)
    {
        int sum = 0;
        
        for(int i = 0; i < array.length; i++)
        {
            sum += sumRow(array, i);
        }
        
        return sum;
    }
}

//8.2.8 Tic Tac Toe Methods
TicTacToe.java
Solution Code
public class TicTacToe
{
    private String[][] board = new String[3][3];
    private int turn = 0;
    
    public TicTacToe()
    {
        for(int row = 0; row < board.length; row++)
        {
            for(int col = 0; col< board[row].length; col++)
            {
                board[row][col] = "-";
            }
        }
    }
    
    public int getTurn()
    {
        return turn;
    }
    
    public void printBoard()
    {
        System.out.println("  0 1 2");
        int row = 0;
        for(String[] array:board)
        {
            System.out.print(row+ " ");
            for(String item: array)
            {
                System.out.print(item + " ");
                
            }
            row++;
            System.out.println();
        }
    }
    
    public void takeTurn(int row, int col)
    {
        if(turn %2 == 0)
        {
            board[row][col] = "X";
        }
        else
        {
            board[row][col] = "O";
        }
        turn++;
    }
    
    public boolean pickLocation(int row, int col)
    {
        if(row < 3 && col < 3)
        {
            if(board[row][col].equals("-"))
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean checkRow()
    {
        boolean win = false;
        for (int i = 0; i < board.length; i++)
        {
            if (!board[i][0].equals("-"))
            {
                 if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]))
                 {
                    win = true;
                 }
            }
        }
        return win;
    }
    
    public boolean checkWin()
    {
        return checkCol() || checkRow() || checkDiag();
        
    }
    
    public boolean checkCol()
    {
        boolean win = false;
        for (int i = 0; i < board[0].length; i++)
        {
            if (!board[0][i].equals("-"))
            {
                 if (board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i]))
                 {
                    win = true;
                 }
            }
        }
        return win;
    }
    
    public boolean checkTurn()
    {
        return turn < 9;
    }
    
    public boolean checkDiag()
    {
        boolean win = false;
        
        if (!board[0][0].equals("-")) {
            if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]))
                win = true; 
        }
        
        if (!board[0][2].equals("-")) {
            if (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]))
                win = true; 
        }
        
        return win;
    }
}


TicTacToeTester.java
Solution Code
public class TicTacToeTester
{
    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe();
        System.out.println("Initial Game Board:");
        game.printBoard();
        
        //Prints the first row of turns taken
        for(int row = 0; row < 3; row++)
        {
            if(game.pickLocation(0, row))
            {
                game.takeTurn(0, row);
            }
        }
        System.out.println("\nAfter three turns:");
        game.printBoard();
        
        
    
    }
}

//9.1.6 Person / Student Object
PersonRunner.java
Solution Code
 public class PersonRunner {
    public static void main(String[] args) {

        Person mozart = new Person("Wolfgang Amadeus Mozart", "January 27, 1756");

        Student hummel = new Student("Johann Nepomuk Hummel", "November 14, 1778", 10, 4.0);

        System.out.println(mozart.getName());
        System.out.println(mozart.getBirthday());
        System.out.println(hummel.getName());
        System.out.println(hummel.getBirthday());
        System.out.println(hummel.getGrade());
        System.out.println(hummel.getGpa());
    }
}

Person.java
Solution Code
public class Person {

    private String name;
    private String birthday;

    public Person (String name, String birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }

    public String getBirthday(){ 
        return birthday;
    }

    public String getName(){
        return name;
    }


}

Student.java
Solution Code
public class Student extends Person {

    private int grade;
    private double gpa;

    public Student(String name, String birthday, int grade, double gpa){
        super(name, birthday);
        this.grade = grade;
        this.gpa = gpa;
    }

    public int getGrade(){
        return grade;
    }

    public double getGpa(){
        return gpa;
    }
}


//9.1.7 Books
BookTester.java
Solution Code
public class BookTester
{
    public static void main(String[] args)
    {
        Mystery oneIsLying = new Mystery();
        
        oneIsLying.setPages(374);
        oneIsLying.setTitle("One of Us Is Lying");
        oneIsLying.setAuthor("Karen M. McManu");
        oneIsLying.setSubgenre("Crime Mystery");
        
        
        Encyclopedia britannica = new Encyclopedia();
        britannica.setPages(1009);
        britannica.setTitle("Original Encyclopedia Britannica, Vol. 3");
        britannica.setArticles(30);
        britannica.setStartLetter("C");
        britannica.setEndLetter("L");
        
        
        System.out.println(oneIsLying.getTitle());
        System.out.println(britannica.getTitle());
    }
}

Book.java
Solution Code
public class Book
{
    private int pages;
    private String title;
    
    public int getPages() {
        return pages;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    } 

}

Encyclopedia.java
Solution Code
public class Encyclopedia extends Book
{
    private int articles;
    private String startLetter;
    private String endLetter;
    
    
    public int getArticles(){
        return articles;
    }
    
    public void setArticles(int numArticles){
        articles = numArticles;
    }

    public String getStartLetter(){
        return startLetter;
    }
    
    public void setStartLetter(String startLetter){
        this.startLetter = startLetter;
    }
    
    public String getEndLetter(){
        return endLetter;
    }
    
    public void setEndLetter(String endLetter){
        this.endLetter = endLetter;
    }
    
}

Mystery.java
Solution Code
public class Mystery extends Book
{
    private String subgenre;
    private String author;
    
    
    public String getSubgenre() {
        return subgenre;
    }
    
    public void setSubgenre(String subgenre) {
        this.subgenre = subgenre;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
}

//9.1.8 Computers
ComputerTester.java
Solution Code
public class ComputerTester
{
    public static void main(String[] args)
    {
        Laptop macBook = new Laptop();
        macBook.setBatteryLife(8.5);
        macBook.setMemory(4);
        
        Desktop dell = new Desktop();
        dell.setScreenSize(18);
        
        Computer surface = new Computer();
        surface.setScreenSize(11);
        surface.setMemory(8);
        
        System.out.println(macBook.getBatteryLife());
        System.out.println(macBook.getMemory());
        System.out.println(dell.getScreenSize());
        System.out.println(surface.getScreenSize());
        System.out.println(surface.getMemory());
    }
}


Computer.java
Solution Code
public class Computer
{
    private int screenSize;
    private int memory;
    
    public int getScreenSize() {
        return screenSize;
    }
    public int getMemory() {
        return memory;
    }
    
    public void setMemory(int memory) {
        this.memory = memory;
    }
    
    public void setScreenSize(int n) {
        screenSize= n;
    }
}

//9.1.9 More Animals!
Animal.java
Solution Code
public class Animal
{
    private String type;

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
}

Pet.java
Solution Code
public class Pet extends Animal
{
    
    private String name;
    private String size;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }
}

Dog.java
Solution Code
public class Dog extends Pet
{
    private boolean trained;

    public boolean isTrained(){
        return trained;
    }

    public void setTrained(boolean trained){
        this.trained = trained;
    }

}

Fish.java
Solution Code
public class Fish extends Pet
{
    private String saltFresh;

    public String getSaltFresh(){
        return saltFresh;
    }

    public void setSaltFresh(String saltFresh){
        this.saltFresh = saltFresh;
    }
}

AnimalTester.java
Solution Code
public class AnimalTester
{
    public static void main(String[] args)
    {
        Fish nemo = new Fish();
        
        nemo.setType("Fish");
        nemo.setName("Nemo");
        nemo.setSaltFresh("salt");
        
        Dog pluto = new Dog();
        pluto.setTrained(true);
        pluto.setName("Pluto");
        
        System.out.println(nemo.getName() + " is a " +
            nemo.getType() + " that lives in " + 
            nemo.getSaltFresh() + " water.");
            
        System.out.println(pluto.getName() + " is trained: " 
        + pluto.isTrained());
    }
}


//9.2.6 Students
StudentTester.java
Solution Code
public class StudentTester
{
    public static void main(String[] args)
    {
        
        /**
         * Create a student with id # 123987, GPA: 2.56
         */
         Student hannah = new Student("Hannah Smith", 123987, 2.56);
         
         /**
         * Create a student athlete with id # 987456, GPA: 3.47,
         * who plays lacrosse for the varsity team and is clear to travel
         */
         StudentAthlete ana = new StudentAthlete("Ana Jones", 987456, 3.47, "lacrosse", "varsity");
         
         // Print out both objects
         System.out.println(hannah);
         System.out.println(ana);
    }
}


Student.java
Solution Code
public class Student
{
    private String name;
    private int id;
    private double gpa;
    
    public Student(String name, int idNumber, double gpa)
    {
        this.name = name;
        id = idNumber;
        this.gpa = gpa;
    }
    
    public String getName(){
       return name;
    }
   
    public int getID(){
       return id;
    }
    
    public double getGPA(){
        return gpa;
    }
   
    public String toString(){
        return name + " (" + id + ")";
    }
}

StudentAthlete.java
Solution Code
public class StudentAthlete extends Student
{
    private String sport;
    private String level;

 
    public StudentAthlete(String name, int id, double gpa,
                String sport, String level)
    {
        super(name, id, gpa);
        this.sport = sport;
        this.level = level;
    }
    
    public String getSport(){
       return sport;
   }
   
   public String getLevel(){
       return level;
   }
   
    @Override
    public String toString(){
        return super.toString() + " plays " + sport;
    }
}

//9.2.7 Instruments
InstrumentTester.java
Solution Code
public class InstrumentTester
{
    public static void main(String[] args)
    {
        /**
         * Don't Change This Tester Class!
         * 
         * When you are finished, this should run without error.
         */ 
        Wind tuba = new Wind("Tuba", "Brass", false);
        Wind clarinet = new Wind("Clarinet", "Woodwind", true);
        
        Strings violin = new Strings("Violin", true);
        Strings harp = new Strings("Harp", false);
        
        System.out.println(tuba);
        System.out.println(clarinet);
        
        System.out.println(violin);
        System.out.println(harp);
    }
}

Instrument.java
Solution Code
public class Instrument
{
    private String name;
    private String family;
    
    public Instrument(String name, String family){
        this.name = name;
        this.family = family;
    }
    
    public String getName(){
        return name;
    }
    
     public void setName(String name){
        this.name = name;
    }
    
    public String getFamily(){
        return family;
    }
    
     public void setFamily(String family){
        this.family = family;
    }
    
    public String toString(){
        return name + " is a member of the " + family + " family.";
    }
}

Wind.java
Solution Code
public class Wind extends Instrument
{
    private boolean reed;
    
    public Wind(String name, String family, boolean hasReed){
        
        super(name, family);
        reed = hasReed;
    }
    
    public boolean hasReed(){
        return reed;
    }
    
    public void setReed(boolean hasReed){
        reed = hasReed;
    }
    
}

Strings.java
Solution Code
public class Strings extends Instrument
{
    private boolean bow;
    
    public Strings (String name, boolean hasBow){
        
        super(name, "Strings");
        bow = hasBow;
    }
    
    public boolean hasBow(){
        return bow;
    }
    
    public void setBow(boolean hasBow){
        bow = hasBow;
    }
    
}

//9.2.8 Foods
FoodTester.java
Solution Code
public class FoodTester
{
    public static void main(String[] args)
    {
        Food curry = new Food("curry", 320);
        HealthyFood brownRice = new HealthyFood("brown rice", 170, "grain", "brown");
        Fruit mango = new Fruit("mango", 60, "yellow", false, "C, B6, A");
        
        System.out.println(curry);
        System.out.println(curry.getName());
        System.out.println(curry.getCalories());
        System.out.println();
        
        System.out.println(brownRice);
        System.out.println(brownRice.getName());
        System.out.println(brownRice.getCalories());
        System.out.println(brownRice.getGroup());
        System.out.println(brownRice.getColor());
        System.out.println();
        
        System.out.println(mango);
        System.out.println(mango.getName());
        System.out.println(mango.getCalories());
        System.out.println(mango.getGroup());
        System.out.println(mango.getColor());
        System.out.println(mango.isInSeason());
        System.out.println(mango.getVitamins());
    }
}


Food.java
Solution Code
public class Food
{
    private String name;
    private int calories;
 
    public Food(String foodName, int calories){
        name = foodName;
        this.calories = calories;
    }
    
    public String getName(){
        return name;
    }
    
    public int getCalories(){
        return calories;
    }
    
    public String toString(){
        return name + " has " + calories + " calories";
    }
     
}


HealthyFood.java
Solution Code
public class HealthyFood extends Food
{
    private String group;
    private String color;
    
    public HealthyFood(String foodName, int calories, String foodGroup, String foodColor){
        super(foodName, calories);
        group = foodGroup;
        color = foodColor;
    }
    
    public String getGroup(){
        return group;
    }
    
    public String getColor(){
        return color;
    }
    
}

Fruit.java
Solution Code
public class Fruit extends HealthyFood
{

    private boolean inSeason;
    private String vitamins;
    
    public Fruit(String foodName, int calories, String foodColor, boolean isInSeason, String majorVitamins){
        super(foodName, calories, "fruit", foodColor);
        inSeason = isInSeason;
        vitamins = majorVitamins;
    }
    
    public boolean isInSeason(){
        return inSeason;
    }
    
    public String getVitamins(){
        return vitamins;
    }
}


//9.2.9 Clothing Store
ClothingTester.java
Solution Code
public class ClothingTester
{
    public static void main(String[] args)
    {
       
        TShirt tShirt = new TShirt("large", "white", "cotton");

        Sweatshirt sweatShirt = new Sweatshirt("XL", "blue", true);

        Jeans jeans = new Jeans("10");
        
        Clothing clothing = new Clothing("small", "red");

        System.out.println("You want a " + tShirt.getSize() + " "
            + tShirt.getFabric() + " t-shirt in " + tShirt.getColor() + ".");
        if (sweatShirt.hasHood())
        {
            System.out.println("And a " + sweatShirt.getSize() + " "
                + sweatShirt.getColor() + " hooded sweatshirt.");
        } else {
            System.out.println("And a " + sweatShirt.getSize() + " "
                + sweatShirt.getColor() + " sweatshirt.");
        }
        System.out.println("Also, " + jeans.getSize() + " " + jeans.getColor()
            + " jeans.");
            
        System.out.println("Finally, " + clothing.getSize() + " " + clothing.getColor()
            + " clothes.");
    }
}

Clothing.java
Solution Code
public class Clothing
{
    private String size;
    private String color;

    public Clothing (String size, String color)
    {
        this.size = size;
        this.color = color;
    }

    public String getSize()
    {
        return size;
    }

    public String getColor()
    {
        return color;
    }
}


TShirt.java
Solution Code
public class TShirt extends Clothing
{
    private String fabric;

    public TShirt(String size, String color, String fabric)
    {
        super(size, color);
        this.fabric = fabric;
    }

    public String getFabric()
    {
        return fabric;
    }
}

Jeans.java
Solution Code
public class Jeans extends Clothing
{
    public Jeans(String size)
    {
        super(size, "blue");
    }
}


Sweatshirt.java
Solution Code
public class Sweatshirt extends Clothing
{
    private boolean hooded;

    public Sweatshirt(String size, String color, boolean hooded)
    {
        super(size, color);
        this.hooded = hooded;
    }

    public boolean hasHood()
    {
        return hooded;
    }
}

//9.3.6 Dogs Bark
Dog.java
Solution Code
public class Dog
{
    private String name;
    
     public Dog(String name){
       this.name = name;
   }
   
   public String getName(){
       return name;
   }
   
   public String speak(){
       return "Bark!";
   }
   
   public String toString(){
       return name + " likes to " + speak();
   }
}

DogTester.java
Solution Code
public class DogTester
{
    public static void main(String[] args)
    {
        Dog karel = new Dog("Karel");
        
        LoudDog clover = new LoudDog("Clover");
        
        System.out.println(karel);
        System.out.println(clover);
    }
}

LoudDog.java
Solution Code
public class LoudDog extends Dog
{
   
    public LoudDog(String name){
       super(name);
    }
   
    @Override
    public String speak(){
       return "BARK!";
    }
   
    @Override
    public String toString(){
       return super.getName() + " is loud and likes to " + speak();
    }
}
//9.3.7 Electric Cars
CarTester.java
Solution Code
public class CarTester
{
    public static void main(String[] args)
    {
        // Create a Car object
        Car compact = new Car("S3", 8);
        
        // Print out the model
        System.out.println("Model: " + compact.getModel());
        
        // Print out the fuelLevel
        System.out.println("Gallons Left: " + compact.getFuelLevel());
        
        // Print how many miles are left with 23 mpg
        System.out.println("Miles Left: " + compact.milesLeft(23));
        
        // Print the object
        System.out.println(compact);
        
        // Create an ElectricCar object
        ElectricCar zappy = new ElectricCar("BattMax", 73);
        
        // Print out the model
        System.out.println("Model: " + zappy.getModel());
        
        // Print out the fuelLevel
        System.out.println("Battery Level: " + zappy.getFuelLevel());
        
        // Print how many miles are left with 400 miles per charge
        System.out.println("Miles Left: " + zappy.milesLeft(400));
        
        // Print the object
        System.out.println(zappy);
    }
}

Car.java
Solution Code
public class Car {
    
    // This code is complete
    private String model;
    private int fuelLevel;
    
    public Car(String model, int fuelLeft){
        this.model = model;
        this.fuelLevel = fuelLeft;
    }
    
    public String getModel(){
        return model;
    }
    
    public double getFuelLevel(){
        return fuelLevel;
    }
    
    // Returns how many more miles the car can go
    // with the fuel left
    public double milesLeft(double mpg){
        return fuelLevel * mpg;
    }
    
    public String toString(){
        return model + " car";
    }
}

ElectricCar.java
Solution Code
public class ElectricCar extends Car {

    // Complete the constructor
    public ElectricCar(String model, int batteryLevel){
       super(model, batteryLevel);
    }

    // Override getFuelLevel
    // Reinterprets fuelLevel as a percentage
    // Remember super.getFuelLevel will return fuelLevel!
    @Override
    public double getFuelLevel(){
        return super.getFuelLevel() / 100.0;
    }

    // Override milesLeft
    // Computes miles left by interpreting fuelLevel as a percentage
    @Override
    public double milesLeft(double milesPerCharge){
        return getFuelLevel() * milesPerCharge;
    }
    
    // Override toString
    // Should print: model electric car
    @Override
    public String toString(){
        return super.getModel() + " electric car";
    }
}

//9.3.8 Online Companies
CompanyTester.java
Solution Code
public class CompanyTester {

    public static void main(String[] args) {

        Company disney = new Company("Disney", "123 Main Street", "Anahiem", "CA");
        OnlineCompany codeHS = new OnlineCompany("CodeHS", "www.codehs.com");

        System.out.println(disney);
        System.out.println();
        System.out.println(codeHS);
    }

}


Company.java
Solution Code
public class Company {

    private String name;
    private String streetAddress;
    private String city;
    private String state;

    // Set missing values to null
    public Company(String name){
        this(name, null, null, null);
    }

    public Company(String name, String streetAddress, String city, String state){
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
    }

    public String getName(){
        return name;
    }

    /**
    * Example output:
    * 123 Main St
    * Springfield, OH
    */
    public String address(){
        return streetAddress + "\n" + city + ", " + state;
    }

    /**
    * Example output:
    * Widget Company
    * 123 Main St
    * Springfield, OH
    */
    public String toString(){
        return name + "\n" + address();
    }
}


OnlineCompany.java
Solution Code
public class OnlineCompany extends Company{

    private String webAddress;

    public OnlineCompany(String name, String webAddress){
        super(name, null, null, null);
        this.webAddress = webAddress;
    }

    //Return the website address
    @Override
    public String address(){
        return webAddress;
    }

    /**
    * Remember To get name from superclass, use super.getName()
    * 
    * Example Output:
    * CodeHS
    * www.codehs.com
    */
    @Override
    public String toString(){
        return super.getName() + "\n"  + webAddress;
    }
}
//9.4.6 Squares
SquareTester.java
Solution Code
public class SquareTester {

    public static void main(String[] args) {

        Square block = new Square(10);
        System.out.println(block);

        block.setSideLength(5);

        System.out.println("New Side Lengths: " + block.getWidth());
        System.out.println("New Side Lengths: " + block.getHeight());
        
        System.out.println("Area: " + block.area());
        System.out.println("Perimeter: " + block.perimeter());
    }

}

Square.java
Solution Code
public class Square extends Rectangle {

    // Call to the Rectangle constructor
    public Square(double sideLength){
       super(sideLength, sideLength);
    }

    //Set both the width and height in the superclass
    public void setSideLength(double sideLength){
        super.setWidth(sideLength);
        super.setHeight(sideLength);
    }
    
    // Get the width and/or the height from the superclass
    public double area(){
      return super.getHeight() * super.getWidth();
    }
    
    // Get the width and/or the height from the superclass
    public double perimeter(){
        return 4 * super.getHeight();  
    } 

    // Override to read: ___ x ____ Square
    @Override
    public String toString(){
        return super.getWidth() + " x " + super.getWidth() + " Square";
    }
}


Rectangle.java
Solution Code
No solution code.
Starter Code
public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String toString(){
        return width + " x " + height + " Rectangle";
    }
}


//9.4.7 Bank Accounts
BankTester.java
Solution Code
public class BankTester
{
    public static void main(String[] args)
    {
        Account checking = new Account(12345, 34.56);
        
        System.out.println(checking);
        System.out.println(checking.getBalance());
        
        System.out.println("Depositing $40.25");
        checking.deposit(40.25);
        System.out.println(checking);
        
        System.out.println("Withdrawing $20");
        checking.withdraw(20);
        System.out.println(checking);
        
        System.out.println("Withdrawing $2000");
        checking.withdraw(2000);
        System.out.println(checking);
        
        
        System.out.println();
        StudentAccount student = new StudentAccount(98765, 100);
        
        System.out.println(student);
        System.out.println(student.getBalance());
        
        System.out.println("Depositing $50.50");
        student.deposit(50.50);
        System.out.println(student);
        
        System.out.println("Withdrawing $25");
        student.withdraw(25);
        System.out.println(student);
        
        System.out.println("Withdrawing $2000");
        student.withdraw(2000);
        System.out.println(student);
        
        
    }
}

Account.java
Solution Code
public class Account
{
    private int accountNumber;
    private double balance;
    
    // Initialize values in constructor
    public Account(int accountNumber, double openingBal){
       this.accountNumber = accountNumber;
       balance = openingBal;
    }
    
    // Complete the accessor method
    public double getBalance(){
        return balance;
        
    }
    
    // Add amount to balance
    public void deposit(double amount){
       balance += amount;
       
    }
    
    // Subtract amount from balance
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }
        
    }
    
    // Should read: Regular account current balance $__.__
    public String toString(){
       return "Regular account current balance $" + balance;
       
    }
}

StudentAccount.java
Solution Code
public class StudentAccount extends Account
{
    // Complete this class with Override methods.   
    
    public StudentAccount(int accountNumber, double openingBal){
        super(accountNumber, openingBal);
    }
    
    // Students get a 10% bonus on depositing
    @Override
    public void deposit(double amount){
        super.deposit(1.10 * amount);
    }
    
    
    
    // Students pay a $1.50 fee for withdrawing
    @Override
    public void withdraw(double amount){
        super.withdraw(amount + 1.5);
    }
    
    
    // toString() Should read: Student account current balance $__.__
    @Override
    public String toString(){
        return "Student account current balance $" + super.getBalance();
    }
    
}


//9.4.8 Employees
Employee.java
Solution Code
public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double annualSalary){
        this.name = name;
        salary = annualSalary;
    }

    public String getName(){
        return name;
    }

    public double getAnnualSalary(){
        return salary;
    }

    public void setAnnualSalary(double annualSalary){
        salary = annualSalary;
    }

    public String toString(){
        return name + " makes $" + salary + " per year";
    }
}

EmployeeTester.java
Solution Code
public class EmployeeTester {

    public static void main(String[] args) {

        Employee teacher = new Employee("Mr. Karel", 75000);
        System.out.println(teacher);

        HourlyEmployee cashier = new HourlyEmployee("Mike", 14.25, 25);

        System.out.println(cashier);

        cashier.setHourlySalary(18);
        System.out.println(cashier);
        System.out.println(cashier.getName() + " will make $" + cashier.getAnnualSalary() + " a year.");
    }

}


//9.4.9 Student Test Scores
StudentTester.java
Solution Code
import java.util.Scanner;

public class StudentTester {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the student's name: ");
        String name = input.nextLine();

        System.out.println("Please enter the Math Score: ");
        int mathScore = input.nextInt();

        System.out.println("Please enter the ELA Score: ");
        int elaScore = input.nextInt();

        System.out.println("Please enter the Service Hours: ");
        int serviceHours = input.nextInt();

        HSStudent student = new HSStudent(name, mathScore, elaScore, serviceHours);

        System.out.println("Pass Math? " + student.passMath());
        System.out.println("Pass ELA? " + student.passEla());
        System.out.println("Completed Service Hours? " + student.completeService());
        System.out.println(student);

    }

}

StudentTest.java
Solution Code
public class StudentTest {

    private int mathScore;
    private int elaScore;
    private String name;

    public StudentTest(String name, int mathScore, int elaScore){
        this.name = name;
        this.mathScore = mathScore;
        this.elaScore = elaScore;
    }

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getElaScore() {
		return elaScore;
	}

	public void setElaScore(int elaScore) {
		this.elaScore = elaScore;
	}

	public String getName() {
		return name;
	}

}

HSStudent.java
Solution Code
public class HSStudent extends StudentTest {

    private int serviceHours;

    public HSStudent(String name, int mathScore, int elaScore, int serviceHours){
        super(name, mathScore, elaScore);
        this.serviceHours = serviceHours;
    }

    public int getServiceHours(){
        return serviceHours;
    }

    public void setServiceHours(int serviceHours){
        this.serviceHours = serviceHours;
    }

    public boolean passMath(){
        return super.getMathScore() >= 525;
    }

    public boolean passEla(){
        return super.getElaScore() >= 560;
    }

    public boolean completeService(){
        return serviceHours >= 75;
    }

    public boolean gradQualify(){
        return passMath() && passEla() && completeService();
    }

    @Override
    public String toString(){
        if (gradQualify()){
            return super.getName() + " has qualified for graduation.";
        }

        return super.getName() + " has not yet qualified for graduation.";
    }
}

//9.5.6 Pies
PieTester.java
Solution Code
import java.util.ArrayList;

public class PieTester
{
    public static void main(String[] args)
    {
        ArrayList<Pie> pies = new ArrayList<Pie>();
        pies.add(new PecanPie(8, "honey"));
        pies.add(new ApplePie(6));
        pies.add(new Pie("Rubarb", 12));
        
        // Can also use an array
        /*
        Pie[] pies = new Pie[3];
        pies[0] = new PecanPie(8, "honey");
        pies[1] = new ApplePie(6);
        pies[2] = new Pie("Rubarb", 12);
        */
        
        for(Pie pie : pies){
            System.out.println(pie.getSlices() + " slice " + pie.getType() + " pie");
        }
        
    }
}

Pie.java
Solution Code
public class Pie {

    private String type;
    private int slices;
    
    public Pie (String type, int slices) {
        this.type = type;
        this.slices = slices;
    }
    
    public int getSlices (){
        return slices;
    }
    
    public void eatSlice(){
        slices --;
    }
    
    public String getType(){
        return type;
    }
}
ApplePie.java
Solution Code
public class ApplePie extends Pie {

    public ApplePie (int slices) 
    {
        super("Apple", slices);
    }
    
    public boolean hasSlice()
    {
        return super.getSlices() > 0;
    }
    
    @Override
    public void eatSlice()
    {
        if (this.hasSlice())
        {
        	super.eatSlice();
        }
    }
}

PecanPie.java
Solution Code
public class PecanPie extends Pie {
    
    private String syrupType;

    public PecanPie (int slices, String syrupType) 
    {
        super("Pecan", slices);
        this.syrupType = syrupType;
    }
    
    public String getSyrupType()
    {
        return syrupType;
    }
    
}


//9.5.7 Creating .equals
PersonTester.java
Solution Code
import java.util.Scanner;

public class PersonTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the Person's name: ");
        String name = input.nextLine();
        
        System.out.print("Please enter the Person's birthday: ");
        String birthday = input.nextLine();
        
        Person person = new Person(name, birthday);
        
        System.out.print("Please enter the Student's name: ");
        name = input.nextLine();
        
        System.out.print("Please enter the Student's birthday: ");
        birthday = input.nextLine();
        
        System.out.print("Please enter the Student's grade: ");
        int grade = input.nextInt();
        
        Student student = new Student(name, birthday, grade);
        
        System.out.println("Same: " + person.equals(student));
    }
}

Person.java
Solution Code
public class Person {

    private String name;
    private String birthday;

    public Person (String name, String birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }

    public String getBirthday(){
        return birthday;
    }

    public String getName(){
        return name;
    }

    public boolean equals(Person other) {
        return name.equals(other.getName()) &&
               birthday.equals(other.getBirthday());
    }
}
Student.java
Solution Code
public class Student extends Person {

    private int grade;

    public Student(String name, String birthday, int grade){
        super(name, birthday);
        this.grade = grade;
    }

    public int getGrade(){
        return grade;
    }
}
//9.5.8 Online Companies Revisited
CompanyTester.java
Solution Code
import java.util.*;

public class CompanyTester
{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<Company> companies = new ArrayList<Company>();
        
        while (true) {
            System.out.print("Please enter a company name, enter 'exit' to quit: ");
            String name = input.nextLine();
            if (name.toLowerCase().equals("exit")) {
                break;
            }
            System.out.print("Is this an online company, 'yes' or 'no': ");
            if (input.nextLine().toLowerCase().equals("yes")) {
                System.out.print("Please enter the website address: ");
                String webSite = input.nextLine();
                companies.add(new OnlineCompany(name, webSite));
            } else {
                System.out.print("Please enter the street address: ");
                String street = input.nextLine();
                System.out.print("Please enter the city: ");
                String city = input.nextLine();
                System.out.print("Please enter the state: ");
                String state = input.nextLine();
                companies.add(new Company(name, street, city, state));
            }
        }
        
        for(Company company : companies) {
            System.out.println();
            System.out.println(company);
        }
    }
}
OnlineCompany.java
Solution Code
public class OnlineCompany extends Company{

    private String webAddress;

    public OnlineCompany(String name, String webAddress){
        super(name, null, null, null);
        this.webAddress = webAddress;
    }

    //Return the website address
    @Override
    public String address(){
        return webAddress;
    }

    /**
    * Remember: To get name from superclass, use super.getName()
    * Example:
    * CodeHS
    * www.codehs.com
    */
    @Override
    public String toString(){
        return super.getName() + "\n" + "Website: " + webAddress;
    }
}


Company.java
Solution Code
public class Company {

    private String name;
    private String streetAddress;
    private String city;
    private String state;

    // Set missing values to null
    public Company(String name){
        this(name, null, null, null);
    }

    public Company(String name, String streetAddress, String city, String state){
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
    }

    public String getName(){
        return name;
    }

    /**
    * Example output:
    * 123 Main St
    * Springfield, OH
    */
    public String address(){
        return streetAddress + "\n" + city + ", " + state;
    }

    /**
    * Example output:
    * Widget Company
    * 123 Main St
    * Springfield, OH
    */
    public String toString(){
        return name + "\n" + address();
    }
}

//9.5.9 Assignments
AssignmentRunner.java
Solution Code
import java.util.*;

public class AssignmentRunner {

    public static void main(String[] args) {

        ArrayList<Assignment> assignments = new ArrayList<Assignment>();
        
        Scanner input = new Scanner(System.in);
        String name = "", date = "";
        String assignmentType = "", testType = "";
        double totalPoints = 0, score = 0;
        boolean groups = false, present = false;
        
        while(true){
            System.out.print("Enter the assignment's name (exit to quit): ");
            name = input.nextLine();
            if(name.equals("exit")){
                break;
            }
            
            System.out.print("Enter the due date: ");
            date = input.nextLine();
            
            System.out.print("How many points is the assignment worth? ");
            totalPoints = input.nextDouble();
            
            System.out.print("How many points were earned? ");
            score = input.nextDouble();
            input.nextLine();
            
            System.out.print("Is this a (T)est or a (P)roject? ");
            assignmentType = input.nextLine();
            
            if(assignmentType.substring(0,1).toUpperCase().equals("T")){
                // assignment is a test
                System.out.print("What type of test is it? ");
                testType = input.nextLine();
                
                assignments.add(new Test(name, date, totalPoints, score, testType));
                
            } else {
                // assignment is a project
                System.out.println("Does this project require (true/false) ... ");
                
                System.out.print("Groups? ");
                groups = input.nextBoolean();
                
                System.out.print("A presentation? ");
                present = input.nextBoolean();
                input.nextLine();
                
                assignments.add(new Project(name, date, totalPoints, score, groups, present));
                
            } 
            
            System.out.println();
            
        }
        
        printSummary(assignments);

    }

    // Print due date and score percentage on the assignment
    public static void printSummary(ArrayList<Assignment> assignments) {
        for(Assignment work: assignments){
            System.out.print(work.getName() + " - ");
            System.out.println(work.getEarnedPoints() / work.getAvailablePoints() * 100);

        }   
       
    }
}

Assignment.java
Solution Code
public class Assignment
{
    private String name;
    private String dueDate;
    private double availablePoints;
    private double earnedPoints;
    
    public Assignment(String name, String dueDate, double availablePoints, double earnedPoints){
        this.name = name;
        this.dueDate = dueDate;
        this.availablePoints = availablePoints;
        this.earnedPoints = earnedPoints;
    }
    
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getDueDate(){
        return dueDate;
    }
    
    public void setDueDate(String date){
        dueDate = date;
    }
    
    public double getAvailablePoints(){
        return availablePoints;
    }
    
    public void setAvailablePoints(double points){
        availablePoints = points;
    }
    
    public double getEarnedPoints(){
        return earnedPoints;
    }
    
    public void getEarnedPoints(double points){
        earnedPoints = points;
    }
}

Test.java
Solution Code
public class Test extends Assignment {
    
    private String testType;
    
    public Test(String name, String date, double availablePoints, 
            double earnedPoints, String testType)
    {
        super(name, date, availablePoints, earnedPoints);
        this.testType = testType;
    }
    
    public String getTestType(){
        return testType;
    }
    
    public void setTestType(String testType){
        this.testType = testType;
    }
}

Project.java
Solution Code
public class Project extends Assignment {
    
    private boolean groups;
    private boolean presentation;
    
    public Project(String name, String date, double availablePoints, 
        double earnedPoints, boolean hasGroups, boolean hasPresentation)
    {
        super(name, date, availablePoints, earnedPoints);
        
        groups = hasGroups;
        presentation = hasPresentation;
    }
    
    public boolean hasGroups(){
        return groups;
    }
    
    public void setGroups(boolean hasGroups){
        groups = hasGroups;
    }
    
    public boolean hasPresentation(){
        return presentation;
    }
    
    public void setPresentation(boolean hasPresentation){
        presentation = hasPresentation;
    }
    
}

//9.6.6 Which Team?
TeamTester.java
Solution Code
public  class TeamTester {

    public static void main(String[] args) {
        FootballTeam dolphins = new FootballTeam("Dolphins", "Miami", 8, 4, 1);
        Team cubs = new BaseballTeam("Cubs", "Chicago", 80, 65, "National");
        Team lizards = new Team("Lizards", "New York", 9, 5);

        //Print out all available information for the Dolphins
        System.out.println(dolphins.getName());
        System.out.println(dolphins.getLocation());
        System.out.println(dolphins.getWins());
        System.out.println(dolphins.getLosses());
        System.out.println(dolphins.getTies());
        System.out.println(dolphins);

        //Print out all available information for the Cubs
        System.out.println(cubs.getName());
        System.out.println(cubs.getLocation());
        System.out.println(cubs.getWins());
        System.out.println(cubs.getLosses());
        System.out.println(cubs);

        //Print out all available information for the Lizards

        System.out.println(lizards.getName());
        System.out.println(lizards.getLocation());
        System.out.println(lizards.getWins());
        System.out.println(lizards.getLosses());
        System.out.println(lizards);
    }
}

Team.java
Solution Code
public class Team {

    private String name;
    private String location;
    private int wins;
    private int losses;

	public Team(String name, String location, int wins, int losses) {
		this.name = name;
		this.location = location;
		this.wins = wins;
		this.losses = losses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

     public String toString(){
        return wins + " - " + losses;
    }
}

BaseballTeam.java
Solution Code
public class BaseballTeam extends Team {

    private String league;

	public BaseballTeam(String name, String location,
                    int wins, int losses, String league) {
		super(name, location, wins, losses);
		this.league = league;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

}


FootballTeam.java
Solution Code
public  class FootballTeam extends Team {

    private int ties;


	public FootballTeam(String name, String location,
                    int wins, int losses, int ties) {
		super(name, location, wins, losses);
		this.ties = ties;
	}

	public int getTies() {
		return ties;
	}

	public void setTies(int ties) {
		this.ties = ties;
	}

	@Override
    public String toString(){
        return super.getWins() + " - " + super.getLosses() + " - " + ties;
    }
}


//9.6.7 Cars

CarTester.java
Solution Code
import java.util.*;

public class CarTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String model = "", electric = "";
        int fuel = 0;
        
        ArrayList<Car> cars = new ArrayList<Car>();
        
        System.out.println("Enter your cars' information: ");
        while(true){
            System.out.print("Model (exit to quit): ");  
            
            model = input.nextLine();
            if(model.equals("exit")){
                break;
            }
            
            System.out.print("Electric car (y/n): ");
            electric = input.nextLine();
            
            if(electric.substring(0,1).toLowerCase().equals("y")){
                // is electric
                System.out.print("Percent of battery left (as a whole number): ");
                fuel = input.nextInt();
                input.nextLine();
                
                cars.add(new ElectricCar(model, fuel));
            } else {
                // is not electric
                System.out.print("Gallons of fuel left: ");
                fuel = input.nextInt();
                input.nextLine();
                
                cars.add(new Car(model, fuel));
            }

        }
        
        System.out.println();
        for(Car car : cars){
            System.out.println(car);
            System.out.println();
        }

    }
}

Car.java
Solution Code
public class Car {
    
    // This code is complete
    private String model;
    private int fuelLevel;
    
    public Car(String model, int fuelLeft){
        this.model = model;
        this.fuelLevel = fuelLeft;
    }
    
    public String getModel(){
        return model;
    }
    
    public double getFuelLevel(){
        return fuelLevel;
    }
    
    // Returns how many more miles the car can go
    // with the fuel left
    public double milesLeft(double mpg){
        return fuelLevel * mpg;
    }
    
    public String toString(){
        return model + " car";
    }
}

ElectricCar.java
Solution Code
public class ElectricCar extends Car {

    // Complete the constructor
    public ElectricCar(String model, int batteryLevel){
       super(model, batteryLevel);
    }

    // Override getFuelLevel
    @Override
    public double getFuelLevel(){
        return super.getFuelLevel() / 100.0;
    }

    // Override milesLeft
    @Override
    public double milesLeft(double milesPerCharge){
        return getFuelLevel() * milesPerCharge;
    }
    
    // Override toString
    @Override
    public String toString(){
        return super.getModel() + " electric car";
    }
}

//9.6.8 Library Books
BookTester.java
Solution Code
import java.util.ArrayList;

public class BookTester {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<Book>();

        TextBook java1 = new TextBook("Java Methods",
            "Litvin / Litvin", 3, false);
        TextBook java2 = new TextBook("Java Software Solutions",
            "Lewis / Loftus/ Cocking", 2, true);
        TextBook java3 = new TextBook("A Guide to Programming Java",
            "Brown", 1, false);

        Novel ender = new Novel("Ender's Game", "Orson Scott Card", 5, "Science Fiction");
        Novel potter = new Novel("Harry Potter and the Sorcerer's Stone",
                "J.K. Rowling", 4, "Fantasy");
        Novel maze = new Novel("The Maze Runner", "James Dashner", 7, "Action and Adventure");

        library.add(java1);
        library.add(java2);
        library.add(java3);

        library.add(ender);
        library.add(potter);
        library.add(maze);

        for (Book book : library) {
            System.out.println(book);
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println();
        }
    }
}

Book.java
Solution Code
public class Book {

    private String title;
    private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString(){
	    return "Book: " + title;
	}
}


Novel.java
Solution Code
public class Novel extends Book
{
    
    private int readingLevel;
    private String genre;
    
    public Novel(String title, String author, int readingLevel, String genre){
        super(title, author);
        this.readingLevel = readingLevel;
        this.genre = genre;
    }
    
    public int getReadingLevel(){
        return readingLevel;
    }
    
    public void setReadingLevel(int level){
        readingLevel = level;
    }
    
    public String getGenre(){
        return genre ;
    }
    
    public void setGenre(String genre){
        this.genre = genre;
    }
    
    @Override
    public String toString(){
        return genre + " Novel";    
    }
}


TextBook.java
Solution Code
public class TextBook extends Book
{

    private int edition;
    private boolean ebook;
    
    public TextBook(String title, String author, int edition, boolean isEbook){
        super(title, author);
        this.edition = edition;
        ebook = isEbook;
    }
    
    public int getEdition(){
        return edition;
    }
    
    public void setEdition(int newEdition){
        edition = newEdition;
    }

    public void setEbook(boolean isEbook){
        ebook = isEbook;
    }
    
    public boolean isEbook(){
        return ebook;
    }    
    
    @Override
    public String toString(){
        return "Textbook edition # " + edition;
    }
    

}

//9.6.9 Fun with Solids
SolidTester.java
Solution Code
public class SolidTester
{
    public static void main(String[] args)
    {
        String name;
        double volume;
        double surfaceArea;

        // Pyramid constructor should take name, length, width, height
        // in that order
        Pyramid pyramid = new Pyramid("My pyramid", 1, 3, 5);
        name = pyramid.getName();
        volume = round(pyramid.volume(), 2);
        surfaceArea = round(pyramid.surfaceArea(), 2);
        System.out.println("Pyramid '" + name + "' has volume: " + volume +
            " and surface area: " + surfaceArea + ".");

        // Sphere constructor should take name then radius
        Sphere sphere = new Sphere("My sphere", 4);
        name = sphere.getName();
        volume = round(sphere.volume(), 2);
        surfaceArea = round(sphere.surfaceArea(), 2);
        System.out.println("Sphere '" + name + "' has volume: " + volume +
            " and surface area: " + surfaceArea + ".");
            
        // RectangularPrism constructor should take name, 
        // length, width, height in that order
        RectangularPrism rectangularPrism = new RectangularPrism("My rectangular prism",
            5, 8, 3);
        name = rectangularPrism.getName();
        volume = round(rectangularPrism.volume(), 2);
        surfaceArea = round(rectangularPrism.surfaceArea(), 2);
        System.out.println("RectangularPrism '" + name + "' has volume: " +
            volume + " and surface area: " + surfaceArea + ".");

        // Cylinder constructor should take name, radius, height
        // in that order
        Cylinder cylinder = new Cylinder("My cylinder", 4, 9);
        name = cylinder.getName();
        volume = round(cylinder.volume(), 2);
        surfaceArea = round(cylinder.surfaceArea(), 2);
        System.out.println("Cylinder '" + name + "' has volume: " + volume +
            " and surface area: " + surfaceArea + ".");

        // Cube constructor should take name then side length
        Cube cube = new Cube("My cube", 4);
        name = cube.getName();
        volume = round(cube.volume(), 2);
        surfaceArea = round(cube.surfaceArea(), 2);
        System.out.println("Cube '" + name + "' has volume: " + volume +
            " and surface area: " + surfaceArea + ".");
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}

Solid.java
Solution Code
public class Solid
{
    private String myName;

    public Solid(String name)
    {
        myName = name;
    }

    public String getName()
    {
        return myName;
    }

    // This should be overriden in the subclass
    public double volume()
    {
        return 0;
    }
    
    // This should be overriden in the subclass
    public double surfaceArea()
    {
        return 0;
    }
}

Sphere.java
Solution Code
import java.lang.Math;

public class Sphere extends Solid
{
    private double radius;

    public Sphere(String name, double radius)
    {
        super(name);
        this.radius = radius;
    }

    @Override
    public double volume()
    {
        return (4.0/3.0) * Math.PI * Math.pow(this.radius, 3);
    }

    @Override
    public double surfaceArea()
    {
        return 4.0 * Math.PI * Math.pow(this.radius, 2);
    }
}

Cube.java
Solution Code
public class Cube extends RectangularPrism
{
    public Cube(String name, double side)
    {
        super(name, side, side, side);
    }
}


Cylinder.java
Solution Code
import java.lang.Math;

public class Cylinder extends Solid
{
    private double radius;
    private double height;

    public Cylinder(String name, double radius, double height)
    {
        super(name);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume()
    {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double surfaceArea()
    {
        return 2 * Math.PI * radius * (radius + height);
    }
}


Pyramid.java
Solution Code
import java.lang.Math;

public class Pyramid extends Solid
{
    private double length;
    private double width;
    private double height;

    public Pyramid(String name, double l, double w, double h)
    {
        super(name);
        length = l;
        width = w;
        height = h;
    }

    @Override
    public double volume()
    {
        return length * width * height / 3.0;
    }
    
    @Override
    public double surfaceArea()
    {
        return length * width + length * Math.sqrt(Math.pow(width / 2.0, 2) +
            Math.pow(height, 2)) + width * Math.sqrt(Math.pow(length / 2.0, 2) +
            Math.pow(height, 2));
    }
}

RectangularPrism.java
Solution Code
public class RectangularPrism extends Solid
{
    private double length;
    private double width;
    private double height;

    public RectangularPrism(String name, double l, double w, double h)
    {
        super(name);
        length = l;
        width = w;
        height = h;
    }
    
    @Override
    public double volume()
    {
        return length * width * height;
    }

    @Override
    public double surfaceArea()
    {
        return 2 * (length * width + width * height + length * height);
    }
}



//9.7.6 Equal?
TestEquals.java
Solution Code
public class TestEquals
{
    public static void main(String[] args)
    {
        System.out.println("** Object **");
        Object first = new Object();
        Object second = first;
        Object third = new Object();
        
        // Print out all three objects
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        
        
        // Print a true statement using 2 objects and ==
        System.out.println(second == first);

        // Print a false statement using 2 objects and ==
        System.out.println(second == third);

        // Print a true statement using 2 objects and .equals()
        System.out.println(first.equals(second));
        
        // Print a false statement using 2 objects and .equals()
        System.out.println(first.equals(third));

        
        System.out.println("** Ball **");
        
        
        Ball golfball = new Ball(1.5);
        Ball minigolf = golfball;
        Ball largeGolf = new Ball(1.5);
        
        // Print out all three objects
        System.out.println(golfball);
        System.out.println(minigolf);
        System.out.println(largeGolf);
        
        // Print a true statement using 2 objects and ==
        System.out.println(minigolf == golfball);
        
        // Print a false statement using 2 objects and ==
        System.out.println(golfball == largeGolf);
        
        // Print a true statement using 2 objects and .equals()
        System.out.println(minigolf.equals(golfball));

        
        // Print a false statement using 2 objects and .equals()
        System.out.println(golfball.equals(largeGolf));
    }
}

Ball.java
Solution Code
public class Ball
{
   private double diameter;
   
   public Ball(double diameter){
       this.diameter = diameter;
   }
   
    public double getDiameter(){
       return diameter;
   }
}

//9.7.7 Equals? - Part 2
TestEquals.java
Solution Code
public class TestEquals
{
    public static void main(String[] args)
    {
        System.out.println("** Object **");
        Object first = new Object();
        Object second = first;
        Object third = new Object();
        
        // Print out all three objects
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        
        
        // Print a true statement using 2 objects and ==
        System.out.println(second == first);

        // Print a false statement using 2 objects and ==
        System.out.println(second == third);

        // Print a true statement using 2 objects and .equals()
        System.out.println(first.equals(second));
        
        // Print a false statement using 2 objects and .equals()
        System.out.println(first.equals(third));

        
        System.out.println("** Ball **");
        
        
        Ball golfball = new Ball(1.5);
        Ball minigolf = golfball;
        Ball largeGolf = new Ball(1.5);
        
        // Print out all three objects
        System.out.println(golfball);
        System.out.println(minigolf);
        System.out.println(largeGolf);
        
        // Print a true statement using 2 objects and ==
        System.out.println(minigolf == golfball);
        
        // Print a false statement using 2 objects and ==
        System.out.println(golfball == largeGolf);
        
        // Print a true statement using 2 objects and .equals()
        System.out.println(minigolf.equals(golfball));

        
        // Print a false statement using 2 objects and .equals()
        System.out.println(golfball.equals(largeGolf));
   }
}

Ball.java
Solution Code
public class Ball
{
   private double diameter;
   
   public Ball(double diameter){
       this.diameter = diameter;
   }
   
    public double getDiameter(){
       return diameter;
   }
   
   public boolean equals(Ball other){
       // == works here because we're comparing primative values!
       return this.diameter == other.getDiameter();
   }
   
   public String toString(){
       return "Diameter: " + diameter;
   }

//9.7.8 Equal Rectangles
RectangleTester.java
Solution Code
public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle(5, 4);
        Rectangle rect2 = new Rectangle(5, 4);
        Rectangle rect3 = new Rectangle(10, 4);
        
        // Print all three rectangles
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);
        
        // Print one true statement comparing rectangles
        System.out.println(rect1.equals(rect2));
        
        // Print one false statment comparing rectangles
        System.out.println(rect1.equals(rect3));
    }
}

  Rectangle.java
Solution Code
public class Rectangle {

    private int width;
    private int height;
     
    public Rectangle(int width, int height) {
    	this.width = width;
    	this.height = height;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public String toString()
    {
        return "A rectangle with a width of " + width 
            + " and a height of " + height;
    }
    
    public boolean equals(Rectangle other){
        return width == other.getWidth() && height == other.getHeight();
        
    }
}

//9.7.9 2D Array Tester
TwoDTester.java
Solution Code
public class TwoDTester {

    public static void main(String[] args) {


        Integer[][] firstArray = {{2,3}, {3,4}, {4,5}};
        Integer[][] secondArray = {{2,3}, {3,4}, {4,5}};
        TwoDArray first = new TwoDArray(firstArray);
        
        System.out.println(first.equals(secondArray));
        
        String[][] thirdArray = {{"Hello", "Goodbye"}, 
                                 {"Hola", "Adios"},
                                 {"Bonjour", "Au revoir"}};
        String[][] fourthArray = {{"Hello", "Goodbye"}, 
                                 {"Ciao", "Addio"},
                                 {"Bonjour", "Au revoir"}};
        TwoDArray third = new TwoDArray(thirdArray);
        
        System.out.println(third.equals(fourthArray));
    }

}

TwoDArray.java
Solution Code
  
public class TwoDArray {

    private Object[][] myArray;

    public TwoDArray(Object[][] input){
        myArray = input;
    }

    public boolean equals(Object[][] other){

        if(other.length != myArray.length || other[0].length != myArray[0].length)
        {
            return false;
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (!myArray[i][j].equals(other[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

}

  
  

  

  



















































  






























  



































































































