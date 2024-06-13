//importing scanner class
import java.util.Scanner;

public class FirstCode{
    public static void main(String[] args) {
        //creating scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = scan.nextLine();

        System.out.println("Enter your Age: ");
        int age = scan.nextInt();

        System.out.println("Name and Age Entered: " + name + " " + age);

        //Closing scanner object
        scan.close();
    }
}