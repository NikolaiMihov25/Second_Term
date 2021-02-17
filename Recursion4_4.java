package edu;

public class Recursion4_4 {

	public static void main(String[] args) {
		int arr[] = {5, 10, 15};
		int lenght = arr.length;
		System.out.println(average(arr, lenght));
	}

	
		static double average(int x[], int n) {
			return avgRecursive(x, 0, n);
		}
		
		static double avgRecursive(int a[], int i, int n) {
			if(i==n-1)
				return a[i];
			if(i==0)
				return((a[i] + avgRecursive(a, i+1, n))/n);
			
			return(a[i] + avgRecursive(a, i+1, n));
		}
}
