import java.util.*;

public class MagicSquare {

    public static int formingMagicSquare(List<List<Integer>> s) {
        int[][] possibleMS = {
                {8, 1, 6, 3, 5, 7, 4, 9, 2},
                {6, 1, 8, 7, 5, 3, 2, 9, 4},
                {4, 9, 2, 3, 5, 7, 8, 1, 6},
                {2, 9, 4, 7, 5, 3, 6, 1, 8},
                {8, 3, 4, 1, 5, 9, 6, 7, 2},
                {4, 3, 8, 9, 5, 1, 2, 7, 6},
                {6, 7, 2, 1, 5, 9, 8, 3, 4},
                {2, 7, 6, 9, 5, 1, 4, 3, 8}
        };
        int[] actualSquare = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        int count = 0;
        // Converting List Object to array.
        for (int i = 0; i < s.size(); i++) {
            for (int j = 0; j < s.get(i).size(); j++) {
                actualSquare[count] = s.get(i).get(j);
                count++;
            }
        }

        int minDiff = Integer.MAX_VALUE;

        // Going through the possibleSquares to compare with the actual square.
        for (int i = 0; i < possibleMS.length; i++) {
            int diff = 0;
            int indexActSquare = 0;
            for (int j = 0; j < possibleMS[i].length; j++) {
                if (actualSquare[indexActSquare] != possibleMS[i][j]) {
                    // True means that actuaSquare should replace number in current position to the number saved in possibleMS[i][j].
                    diff += Math.abs(actualSquare[indexActSquare] - possibleMS[i][j]);
                }
                indexActSquare++;
            }
            if (diff < minDiff){
                minDiff = diff;
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {

        //Test case. Output must be 7.
        List<List<Integer>> matrix = new ArrayList<>(Arrays.asList(
                Arrays.asList(5, 3, 4),
                Arrays.asList(1, 5, 8),
                Arrays.asList(6, 4, 2)
        ));
        System.out.println(formingMagicSquare(matrix));
    }
}
