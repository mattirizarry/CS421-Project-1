public class FirstAlgorithm {

    public static void main(String[] args) {
        int[] arr = { 99,33,44,23,51,632,4,1 };

        System.out.println(findMaximum(arr));
    }

    public static int findMaximum(int[] arr) {
        int max = arr[0]; // Assume the first element is the maximum

        for (int num = 1; num < arr.length; num++) {
            if (arr[num] > max) {
                max = arr[num]; // Update max if a larger number is found
            }
        }

        return max;
    }
}
