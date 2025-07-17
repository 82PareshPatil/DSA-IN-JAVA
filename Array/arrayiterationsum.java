package Array;

public class arrayiterationsum {
    public static void main(String args[]) {
        int A[] = {2, 4, 6, 8, 10};
        int B[] = new int[A.length];

        // Build prefix sum array
        B[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            B[i] = B[i - 1] + A[i];
        }

        // Iterate over all subarrays
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                int sum = (i == 0) ? B[j] : B[j] - B[i - 1];

                // Print subarray A[i...j] and its sum
                for (int k = i; k <= j; k++) {
                    System.out.print(A[k] + " ");
                }
                System.out.println(": " + sum);
            }
            System.out.println();
        }
    }
}
