package com.cdac.Tester;

public class SmallestLetter744 {

	public static void main(String[] args) {
		char[] letters = {'c','f','j'};
		System.out.println(" letter : "+nextGreatestLetter(letters,'a'));
	}
	 public static char nextGreatestLetter(char[] letters, char target) {
	        int left = 0;
	        int right = letters.length-1;
	        int mid=0;
	        while(left<=right) {
	        	mid = left + (right-left)/2;
//	        	System.out.println("left "+left+" right "+right+" mid "+mid);
	        	if(letters[mid]>target) {
	        		right = mid-1;
	        	}else {
	        		left = mid+1;
	        	}
	        	
	        }
	        return letters[left%letters.length];
	        
	    }
}
