package leetcode801;

public class FindMinSwapToABFunction {
    public int minSwap(int[] A, int[] B) {
        
    	int prevNoSwap = 0;
        
    	int prevSwap = 1;
        
        for(int i = 1; i < A.length; i++){
            boolean bothIncrease = A[i - 1] < A[i] && B[i - 1] < B[i];
            
            boolean switchABToIncrease = A[i - 1] < B[i] && B[i - 1] < A[i];
            
            if(bothIncrease && switchABToIncrease){ // AB could swap or not swap
                int temp = Math.min(prevNoSwap, prevSwap);
                
                prevSwap = temp + 1;
                
                prevNoSwap = temp;
            } else if(bothIncrease){ // AB does not need to swap
                prevSwap++;
            } else { // AB need to swap
                int temp = prevSwap;
                
                prevSwap = prevNoSwap + 1;
                
                prevNoSwap = temp;
            }
        }
        
        return Math.min(prevSwap, prevNoSwap);
    }
}
