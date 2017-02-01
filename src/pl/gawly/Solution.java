package pl.gawly;

public class Solution {

    public int[] solution(int[] A) {
        int[] nonDivisors = new int[A.length];
        for (int j = 0; j < A.length; j++) {
            for (int k = 0; k < A.length; k++) {
                if (j != k && A[j] % A[k] != 0) {
                    nonDivisors[j]++;
                }
            }
        }

        return nonDivisors;
    }
}
