
import java.util.Scanner;

public class New {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int Height, weight_kg, height_cm;
        String Name;
        double Weight;

        System.out.print("What's your name?");
        Name = keyboard.next();

        System.out.print("How tall are you?");
        Height = keyboard.nextInt();

        System.out.print("How much do you weight?");
        Weight = keyboard.nextDouble();

        weight_kg = (int) (Weight * 0.453); //kg
        height_cm = (int) (Height * 30.48); //cm

        System.out.print("Your name is " + Name + "," + " you weight " + Weight + "pounds (or " + weight_kg);
        System.out.print("you are" + Height + "(or " + height_cm + ".)");

    }

}
