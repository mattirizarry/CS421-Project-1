public class FirstAlgorithm {

    public static void main(String[] args) {
        int[] case1 = { 99,33,44,23,51,632,4,1 };
        int[] case2 = { 51,4156,456,489,589,48924,28};
        int[] case3 = { 4564,456,456,4898489,21,87998,1234899,2145};

        // Justification / Proving the algorithm works

        System.out.println(findMaximum(case1));
        System.out.println(findMaximum(case2));
        System.out.println(findMaximum(case3));
    }

    public static int findMaximum(int[] arr) {
        int max = arr[0];

        for (int num = 1; num < arr.length; num++) {
            if (arr[num] > max) {
                max = arr[num];
            }
        }

        return max;
    }
}
