/*

An array arr is a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
You must solve it in O(log(arr.length)) time complexity.

*/

public class MountainArrayPeak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,3,2,0};
		int target = peakFinder(arr);
		System.out.println("index : " + target);
	}

	public static int peakFinder(int[] arr) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length - 1;
		int mid;
		while (start <= end) {
			mid = start + (end - start) / 2;
			System.out.println(" start "+start+" end "+end+" mid "+mid);
			System.out.println(" mid-1 " +arr[mid - 1]);
			if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
				return mid;
			} else if (arr[mid - 1] > arr[mid]) {
				end = mid ;
			} else if (arr[mid + 1] > arr[mid]) {
				start = mid ;
			}
		}
		return -1;
	}

}
