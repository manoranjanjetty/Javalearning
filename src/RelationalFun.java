import java.sql.SQLOutput;

public class RelationalFun {
    public static void main(String[] args) {
        boolean Myboolean = true;
        boolean yourBool = false;
        int myage = 35;
        int yourage = 40;
        int bobsage = 23;

        String Myname  = "mano";
        String yourname = "mano";

        System.out.println("myage =" + myage);
        System.out.println("your age =" + yourage);
        System.out.println("bobsage = " + bobsage);

        //relational operations
        boolean ageComparision = myage < yourage;
        System.out.println("myage < yourage:?" + ageComparision);
        ageComparision = myage == bobsage;
        System.out.println("myage == bobsage;?" + ageComparision);
        ageComparision = yourage <= bobsage;
        System.out.println("yourage <= bobsage:?" +ageComparision);
        ageComparision = Myname == yourname;
        System.out.println("do name matches>?" + ageComparision);

    }//end main
}
