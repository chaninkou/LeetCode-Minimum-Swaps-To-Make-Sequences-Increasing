package leetcode801;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] A = {1,3,5,4};
		
		int[] B = {1,2,3,7};
		
		System.out.println("A: " + Arrays.toString(A));
		
		System.out.println("B: " + Arrays.toString(B));
		
		FindMinSwapToABFunction solution = new FindMinSwapToABFunction();
		
		System.out.println("Solution: " + solution.minSwap(A, B));
	}
}
