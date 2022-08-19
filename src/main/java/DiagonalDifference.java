
public class DiagonalDifference {

    // Given a square matrix, calculate the absolute difference between the sums of its diagonals.
    // For example, the square matrix
    // is shown below: 
    // 1 2 3
    // 4 5 6
    // 9 8 9  
    // The left-to-right diagonal = 1 + 5 + 9 = 15. The right to left diagonal = 3 + 5 + 9 = 17.  Their absolute difference is [15 - 17] = 2.
    public static void main(String args[]) {

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        Integer d1 = 0;
        Integer d2 = 0;
        
        //SOLUCAO 1
        // for (int i = 0; i < arr.size(); i++) {
        //     d1 = d1 + arr.get(i).get(i);
        //     d2 = d2 + arr.get(i).get(arr.size() - i - 1);
        // }
        
        //SOLUCAO 2
        int lines = arr.size();
        int colums = arr.get(0).size();
        int i = 0;
        int j = colums - 1;
        while(i < arr.size()) {
          d1 = d1 + arr.get(i).get(i);
          d2 = d2 + arr.get(i).get(j);
          i++;
          j--;
        }
        return Math.abs(d1-d2);       
    }

}
