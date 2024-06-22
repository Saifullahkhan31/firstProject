//importing scanner class
import java.util.Scanner;

public class FirstCode{
    
    void display(String name,int  age){
        System.out.println("Name and Age Entered: " + name + " " + age);
        }

    public static void main(String[] args) {
        // Create an instance of the class
        FirstCode fC = new FirstCode();

        //creating scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = scan.nextLine();

        System.out.println("Enter your Age: ");
        int age = scan.nextInt();

        fC.display(name, age);

        //Closing scanner object
        scan.close();
    }
}