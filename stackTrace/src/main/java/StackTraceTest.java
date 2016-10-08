/**
 * Created by ScorpionOrange on 2016/10/03.
 */
public class StackTraceTest {
    public static int factorial(int n){
        System.out.println("factorial(" + n + "):");
        Throwable throwable = new Throwable();
        StackTraceElement[] frames = throwable.getStackTrace();
        for(StackTraceElement f : frames){
            System.out.println(f);
        }
        int r;
        if(n <= 1) {
            r = 1;
        }
        else {
            r = n * factorial(n - 1);
        }
        System.out.println("return " + r);
        return r;
    }

    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        factorial(n);
    }
}
