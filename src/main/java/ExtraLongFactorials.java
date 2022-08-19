import java.math.BigInteger;

public class ExtraLongFactorials {
// Factorial of a number can be calculated by simply multiplying 
// values N * N-1 * N-2 * ... * 2 * 1. But for N > 20, this value becomes quite large and doesn't
// fit even in a 64 bit long long variable. Languages like Java, Python, Ruby etc.
// provide support for Big Integers. We can solve this problem easily in these languages
// by using the Big integer libraries provided. 
    public static void main(String args[]) {
        extraLongFactorials(200);

    }

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger fatorial = BigInteger.valueOf(n);
        for (int index = n; index > 1; index--) {
            fatorial = fatorial.multiply( BigInteger.valueOf(index - 1));
        }
        System.out.println(fatorial);
    }

}
