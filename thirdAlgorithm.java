import java.util.Arrays;

public class ThirdAlgorithm {

    public static void main(String[] args) {
        int[] arr = { 99,33,44,23,51,632,4,1 };

        System.out.println(findMaximum(arr));
    }

    public static int findMaximum(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
    
        // Base case: If there's only one element, return it
        if (arr.length == 1) {
            return arr[0];
        }
    
        // Recursive case: Divide the array into two parts
        int mid = arr.length / 2;
    
        // Recursively find the maximum in the left and right halves
        int[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
        int[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);
    
        int leftMax = findMaximum(leftHalf);
        int rightMax = findMaximum(rightHalf);
    
        // Compare and return the maximum of the left and right halves
        return Math.max(leftMax, rightMax);
    }
    
}