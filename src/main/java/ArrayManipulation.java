import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayManipulation {

    /*Read the problem statement here:
     https://hackerrank-challenge-pdfs.s3.amazonaws.com/1636-crush-English?AWSAccessKeyId=AKIAR6O7GJNX5DNFO3PV&Expires=1681517881&Signature=s2Sh7x%2FDwiW6fvBSV7t0YWahmVs%3D&response-content-disposition=inline%3B%20filename%3Dcrush-English.pdf&response-content-type=application%2Fpdf
     */
    public static void main(String[] args) {
        List<List<Integer>> queries = mockInput();
        System.out.println("Higher int in array: " + arrayManipulationFinal(10, queries));
    }

    public static long arrayManipulationFinal(int n, List<List<Integer>> queries) {
        long[] arr = new long[n + 1];

        long max = Long.MIN_VALUE;
        for (int i = 0; i < queries.size(); i++) { // primeira query
            if (queries.get(i).size() > 2) {
                Integer value;
                value = queries.get(i).get(2);
                Integer startIndex = queries.get(i).get(0) - 1;
                Integer endIndex = queries.get(i).get(1) - 1;
                arr[startIndex] += value;
                if (endIndex + 1 < n) {
                    arr[endIndex + 1] -= value;
                }
            }
        }
        long sum = 0;
        for (int j = 0; j < n; j++) {
            sum += arr[j];
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }

    public static List<List<Integer>>  mockInput() {
        List<List<Integer>> queries = new ArrayList<>();
        List<Integer> line1 = new ArrayList<>(Arrays.asList(1, 5, 3));
        List<Integer> line2 = new ArrayList<>(Arrays.asList(4,8,7));
        List<Integer> line3 = new ArrayList<>(Arrays.asList(6,9,1));
        queries.addAll(new ArrayList<>(Arrays.asList(line1, line2, line3)));
        return queries;
    }
}
