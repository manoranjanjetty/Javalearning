import java.util.Scanner;
public class project_avgof3 {
    public static void main(String[] args) {
            double realnumbers;
            Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter the 3 Real numbers");
        realnumbers = keyboard.nextDouble();
        double realnumbers1 = keyboard.nextDouble();
        double realnumbers3 = keyboard.nextDouble();
        keyboard.nextLine();
        double result = (realnumbers + realnumbers1 + realnumbers3)/3;
        System.out.println("The average of 3 real numbers is " + result);
    }//end main
}
