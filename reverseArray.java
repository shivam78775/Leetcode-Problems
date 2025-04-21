import java.util.Arrays;

class ReverseArray {
    public int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] reversedArr = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArr[i] = arr[n - 1 - i];
        }
        return reversedArr;
    }
    public static void main(String[] args) {
        ReverseArray Rarr = new ReverseArray();
        int[] arr = {3, 5, 6, 9, 0};
        System.out.println(Arrays.toString(Rarr.reverseArray(arr)));
    }
}
