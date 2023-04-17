import java.util.List;

public class PlusMinus {
    // Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with 6 places after the decimal.
    // EXAMPLE arr = [1, 1, 0 , -1, -1]
    //There are 5 elements, two positive, two negative and one zero. Their ratios are 2/5 = 0.400000, 2/5 = 0.400000 and 1/5 = 0.200000
    public static void main(String args[]) {

    }

    public static void plusMinus(List<Integer> arr) {
        Integer denominador = arr.size();
        Double positive = 0.0;
        Double negative = 0.0;
        Double zeros = 0.0;
        for (int index = 0; index < arr.size(); index++) {
            if (arr.get(index) > 0) {
                positive++;
            }
            else if (arr.get(index) == 0) {
                zeros++;
            }
            else {
                negative++;
            }
        }
        System.out.println(String.format("%.6f", (positive / denominador)));
        System.out.println(String.format("%.6f", (negative / denominador)));
        System.out.println(String.format("%.6f", (zeros / denominador)));

    }

}
