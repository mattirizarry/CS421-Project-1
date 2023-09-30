public class SecondAlgorithm {
    public static void main(String[] args) {
        int[] arr = { 99,33,44,23,51,632,4,1 };

        System.out.println(findMaximum(arr));
    }

    public static int findMaximum(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left]; // Base case: When there's only one element left
        }

        int mid = (left + right) / 2;

        // Recursively find the maximum in the left and right subarrays
        int leftMax = findMaximum(arr, left, mid);
        int rightMax = findMaximum(arr, mid + 1, right);

        // Combine the results to find the maximum
        return Math.max(leftMax, rightMax);
    }

    // Wrapper function to start the recursion
    public static int findMaximum(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        return findMaximum(arr, 0, arr.length - 1);
    }
}



