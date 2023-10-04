/*
program to find the max element of contiguous subarray of an array
*/

import java.util.Scanner;

class MaxSubArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n  Enter the size of the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("  Enter K: ");
		int k = sc.nextInt();
		if(k > n)
			System.out.print("  Enter a no less than the size of the array!!");
		int max = 0;
		System.out.print("  Enter the array: ");
		for(int i = 0;i < n;i++)
			arr[i] = sc.nextInt();
		
		for(int i = 0;i <= n - k;i++) { // loop for iterating through the array
			for(int j = i;j < i + k;i++) { // loop for making contiguous subarrays
				for(int l = j;l < j+k;j++) { // loop for comparing each contiguous array
					max = arr[l];
					if(arr[l+1] > arr[l]) {
						max = arr[l+1];
						System.out.print("  "+max);
					}
						
				}

			}
		}
	}
}
