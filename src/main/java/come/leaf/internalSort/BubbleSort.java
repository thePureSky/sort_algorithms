package com.leaf.internalSort;

/**
 * 2016-07-10
 * @author leaf
 *
 */
public class BubbleSort {

	public void printResult(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public void bubbleSort() {
		int a[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		
		printResult(a);
		
		// the bubble sort algorithm
		int temp = 0;
		for(int i = 0; i < a.length - 1; i ++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if(a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
		printResult(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BubbleSort().bubbleSort();
	}

}
