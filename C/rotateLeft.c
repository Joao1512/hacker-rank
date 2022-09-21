#include <stdlib.h>


/*
A left rotation operation on an array of size n shifts each of the array`s elements 1 unit to the left.
Given an integer, D, rotate the array that many steps left and return the result.
Example:
d = 2
arr = [1, 2, 3, 4, 5]
after 2 rotations, arr` = [3, 5, 5, 1, 2]

rotateLeft has the following parameters:
int d: the amount to rotate by
int arr[n]: the array to rotate
*/

int* rotateLeft(int d, int arr_count, int* arr, int* result_count) {
//    it`s necessary for the HackerRanck`s editor
    *result_count = arr_count;
    int *a = malloc(arr_count * sizeof(int));
    for (int i = 0; i < arr_count; i++) {
        *(a + i) = i + 1;
    }
//    main code
    for (int i = 0; i < d; i++) {
        int aux = arr[0];
        for (int j = 0; j <= arr_count; j++) {
            arr[j] = arr[j + 1];
        }
        arr[arr_count - 1] = aux;
    }
    for (int i = 0; i < arr_count; i++) {
        a[i] = arr[i];
    }
    return a;
}