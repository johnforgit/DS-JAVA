/*

Program to increment all the elements in an array by 1

*/

import java.util.*;
class arrayIncrement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("  Enter the length: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("  Enter the array: ");
		for(int i = 0;i < n;i++)
			arr[i] = sc.nextInt();
		
		/* incrementing all the elements by 1 */
		for(int i = 0;i < n;i++) {
			arr[i] = arr[i] + 1;
		}
		for(int i = 0;i < n;i++) System.out.print(arr[i]+" ");
		System.out.println();
	}
}
