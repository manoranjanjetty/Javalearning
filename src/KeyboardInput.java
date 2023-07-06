import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String name = keyboard.nextLine();
        System.out.println("please enter your age :");
        int age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Please enter the real numbers :");
        double realnumbers = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Please enter your city name :");
        String city = keyboard.nextLine();
        System.out.println("your name is :" + name);
        System.out.println("your age is : " + age);
        System.out.println("your city is : " + city);


        realnumbers = realnumbers * 2 ;//realnumbers *= 2;
        System.out.println(" twice of your number is :" + realnumbers);

    }//end main
}
