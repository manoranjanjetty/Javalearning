

import java.util.Scanner;
public class project_madlibclone {
    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);
        String Adjective1, Girls_name, Adjective2, occupation1, place, clothing, hobby, Adjective3, occupation2, Boys_name, mans_name;
        System.out.println("enter the adjective 1 :");
        Adjective1 = userinput.nextLine();
        System.out.println("enter the Girls Name :");
        Girls_name = userinput.nextLine();
        System.out.println("enter the adjective 2 :");
        Adjective2 = userinput.nextLine();
        System.out.println("enter the Occupation1 :");
        occupation1 = userinput.nextLine();
        System.out.println("enter the place Name :");
        place = userinput.nextLine();
        System.out.println("enter the Clothing :");
        clothing = userinput.nextLine();
        System.out.println("enter the Hobby :");
        hobby = userinput.nextLine();
        System.out.println("enter the Adjective3 :");
        Adjective3 = userinput.nextLine();
        System.out.println("enter the occupation2 :");
        occupation2 = userinput.nextLine();
        System.out.println("enter the Boys_name :");
        Boys_name = userinput.nextLine();
        System.out.println("enter the mans_name :");
        mans_name = userinput.nextLine();
        System.out.println("There once was a " + Adjective1 + " girl named " + Girls_name + " \n who was a" +Adjective2+ " " +occupation1+ " in the kingdom of \n" + place + " she loved wear " + clothing + " and " + hobby + ". She wanted to marry the " + Adjective3 + " " +occupation2 + " named " + Boys_name + " But her Father \n " + mans_name + " Forbid her and ignoring him.");
    }
}