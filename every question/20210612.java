import java.util.*;

public class MaxGap {
    public int findMaxGap(int[] A, int n) {
        // write code here
        int max = A[0];
        int min = 0;
        for(int i=0;i<n;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        min = A[0]>A[n-1]?A[n-1]:A[0];
        return max-min;
    }
}