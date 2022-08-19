
public class MiniMaxSum {
    // Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
    // Then print the respective minimum and maximum values as a single line of two space-separated long integers. 
    // EXAMPLE: arr = [1,3,5,7,9]
    // The minimum sum is 1 + 3 + 5 + 7 = 16 and the maximum sum is 3 + 5 + 7 + 9 = 24. The function prints "16 24"
    public static void main(String args[]) {

    }

    public static void miniMaxSum(List<Integer> arr) {
        Long auxMin = arr.get(0).longValue();
        Long auxMax = arr.get(0).longValue();
        Long totalSum = 0L;

        for (int index = 0; index < arr.size(); index++) {
            totalSum += arr.get(index);
            if (arr.get(index).longValue() > auxMax) auxMax = arr.get(index).longValue();
            if (arr.get(index).longValue() < auxMin) auxMin = arr.get(index).longValue();
        }

        System.out.println((totalSum - auxMax) + " " + (totalSum - auxMin));
    }

}
