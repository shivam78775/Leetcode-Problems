public class MaxMinArray {
    //Find the maximum and minimum elements in an array.
    public void maxMinArray(int[] arr) {
        int n = arr.length;
        int max = 0;
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max: " + max + ", Min: " + min);
    }

    public static void main(String[] args) {
        MaxMinArray maxMinArray = new MaxMinArray();
        int[] arr = { 3, 1, 4, 8, 1, 5 };
        maxMinArray.maxMinArray(arr);
    }
}
