package easy;

/**
 * Let's call an array A a mountain if the following properties hold: A.length
 * >= 3 There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ...
 * A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] Given an array that is
 * definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i]
 * > A[i+1] > ... > A[A.length - 1].
 * 
 * @author LanceWu
 *
 *         Example 1:
 * 
 *         Input: [0,1,0] Output: 1
 * 
 *         Example 2:
 * 
 *         Input: [0,2,1,0] Output: 1
 */
//���ַ�

public class Solution5 {
	public static int peakIndexInMountainArray(int[] A) {
		int middle = (A.length-1) / 2;
		int n = 0;
		if (A[middle] >=A[middle + 1]) {
			for (int i = middle; i >= 0; i--) {
				if (A[i - 1] < A[i]) {
					n = i;
					break;
				}
			}
		} else {
			for (int i = middle + 1; i < A.length; i++) {
				if (A[i + 1] < A[i]) {
					n = i;
					break;
				}
			}
		}
		return n;
	}

	public static void main(String[] args) {
		int[] A = { 0,1,0 };
		System.out.println(peakIndexInMountainArray(A));
	}

}
