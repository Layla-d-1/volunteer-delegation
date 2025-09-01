//Program to assign a volunteer to price a donated item based on clothing type
// Layla Dawood - 19-08-2025 - module 3//

import java.util.Scanner;
public class AssignVolunteer
{
    public static void main(String[] args)
    {

    //Declare variables and constants this application will use. //

    int donationType;
    String volunteer;
    final int CLOTHING_CODE = 1;
    final int OTHER_CODE = 2;
    final String CLOTHING_PRICER = "Regina";
    final String OTHER_PRICER = "Layla";

    //Prompt user to enter code for their donation type, to assign appropiate volunteer//

    Scanner input = new Scanner(System.in);
    System.out.println("What type of donation is this?");
    System.out.print("Enter: " + CLOTHING_CODE + "for clothing, for anything else enter: " + OTHER_CODE );

    donationType = input.nextInt();


    //Use an if...else statement to choode name of volunteer to be assigned to the volunteer sring//

    if(donationType == CLOTHING_CODE)
       volunteer = CLOTHING_PRICER;
    else
       volunteer = OTHER_PRICER;

    //Display chose code and corresponding volunteers name//

    System.out.println("You entered" + donationType);
    System.out.println(volunteer + " is the volunteer who will be pricing your item.");

    }
}
