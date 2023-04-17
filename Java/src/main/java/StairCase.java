import java.math.BigInteger;

public class StairCase {
    // This is a staircase of size : n = 4
    //    #
    //   ##
    //  ###
    // ####
    // Its base and height are both equal to n.
    // It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
    // Write a program that prints a staircase of size n
    // The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n= 4.
    public static void main(String args[]) {

    }

    public static void staircase(int n) {
            for (int index = 1; index <= n; index++) {
                for (int j = n; j > 0; j--) {
                    if (j <= index) {
                        System.out.print("#");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
    }

}
