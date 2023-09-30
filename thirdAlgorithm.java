import java.util.Arrays;

public class ThirdAlgorithm {

    public static int findMaximum(int[] arr, int segmentSize) {

        int n = arr.length;

        if (n <= segmentSize) {
            return findLargestBruteforce(arr);
        }

        int[] largestInSegments = new int[(n + segmentSize - 1) / segmentSize];

        for (int i = 0; i < n; i += segmentSize) {
            int segmentEnd = Math.min(i + segmentSize, n);
            int[] segment = Arrays.copyOfRange(arr, i, segmentEnd);
            largestInSegments[i / segmentSize] = findLargestBruteforce(segment);
        }

        return findLargestBruteforce(largestInSegments);
    }

    // Brute-force algorithm to find the largest element in an array
    public static int findLargestBruteforce(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        int largest = arr[0];
        for (int element : arr) {
            if (element > largest) {
                largest = element;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        
        int[] case1 = { 99,33,44,23,51,632,4,1 };
        int[] case2 = { 51,4156,456,489,589,48924,28};
        int[] case3 = { 4564,456,456,4898489,21,87998,1234899,2145};

        // Justification / Proving the algorithm works

        System.out.println(findMaximum(case1, 4) + "\n");
        System.out.println(findMaximum(case2, 4) + "\n");
        System.out.println(findMaximum(case3, 4) + "\n");
    }
}
