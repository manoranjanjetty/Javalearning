public class ArithmeticFun {
    public static void main(String[] args) {
        int a = 14;
        int b = 86;
        int result = a + b;
        int result1 = a - b;

        System.out.println("result is " + result);
        System.out.println("result is " + result1);
        result += 28;
        System.out.println("result is " + result);
        result++;
        System.out.println("result is " + result);
        result--;
        System.out.println("result is " + result);
        int product;
        product = a * b;
        System.out.println(a);
        System.out.println(b);
        product = product*2;
        System.out.println("result is " + product);
        product *= product;
        System.out.println("result is " + product);
    }
}
