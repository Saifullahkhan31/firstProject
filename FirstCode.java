import java.util.Scanner;

public class FirstCode{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you Name: ");
        String name = scan.nextLine();

        System.out.println("Name Entered: " + name);

        scan.close();
    }
}