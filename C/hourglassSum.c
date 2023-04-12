#include <stdint.h>



/*
  Given a 6x6 2D Array:
    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0
An hourglass in A is a subset of values with indices falling in arr`s this pattern in `s graphical representation

a b c
  d
e f g

There are 16 hourglasses in arr. An hourglass sum is the sum of an hourglass` values.
Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum. The array will always be 6x6.

  The function is expected to return an INTEGER.
  The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */


int hourglassSum(int arr_rows, int arr_columns, int** arr) {
    int sum = INT32_MIN;
    for(int row = 0; row <= 3; row++) {
        for (int column = 0; column <= 3; column++) {
            int hourGlassSum = 0;
            hourGlassSum = hourGlassSum + arr[row][column] + arr[row][column + 1] + arr[row][column + 2];
            hourGlassSum = hourGlassSum + arr[row + 1][column + 1];
            hourGlassSum = hourGlassSum + arr[row + 2][column] + arr[row + 2][column + 1] + arr[row + 2][column + 2];
            if (hourGlassSum >= sum) {
                sum = hourGlassSum;
            }
        }
    }
    return sum;
}