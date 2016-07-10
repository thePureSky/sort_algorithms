package com.leaf.internalSort;

public class MergeSort {

	public void printResult(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public void binaryDivide(int[] data, int left, int right) {
		if (left < right) {
			int center = (left + right) / 2;
			binaryDivide(data, left, center);
			binaryDivide(data, center + 1, right);
			merge(data, left, center, right);
		}
	}
	
	public void merge(int[] data, int left, int center, int right) {
		int [] tmpArr = new int[data.length];
		int mid = center + 1;
		
		int third = left;
		int tmp = left;
		
		while (left <= center && mid <= right) {
			if (data[left] <= data[mid]) {
				tmpArr[third++] = data[left++];
			}
			else {
				tmpArr[third++]  = data[mid++];
			}
		}
		
		while (mid <= right) {
			tmpArr[third++] = data[mid++];
		}
		
		while (left <= center) {
			tmpArr[third++] = data[left++];
		}
		
		while(tmp <= right) {
			data[tmp] = tmpArr[tmp++];
		}
		
	}
	
	public void mergeSort() {
		int a[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		
		printResult(a);
		
		// the merge sort algorithm
		binaryDivide(a, 0, a.length - 1);
		
		
		printResult(a);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MergeSort().mergeSort();
	}

}
