import java.util.zip.CheckedOutputStream;

public class logicalfun {
    public static void main(String[] args) {
        boolean israining = true;
        boolean iscold = false;

        boolean combined = israining && iscold ;
        System.out.println("is raining and cold;?" + combined);

        combined = israining || iscold;
        System.out.println("is raining not cold:>?" + combined);

        combined = !israining;
        System.out.println("is not raining:>?" + combined);


    }//end main
}
