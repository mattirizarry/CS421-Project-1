public class FirstAlgorithm {

    public static void main(String[] args) {
        int[] arr = { 99,33,44,23,51,632,4,1 };

        System.out.println(findMaximum(arr));
    }

    public static int findMaximum(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = arr[0]; // Assume the first element is the maximum

        for (int num : arr) {
            if (num > max) {
                max = num; // Update max if a larger number is found
            }
        }

        return max;
    }
}