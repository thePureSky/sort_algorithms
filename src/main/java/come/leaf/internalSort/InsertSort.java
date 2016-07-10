package com.leaf.internalSort;

public class InsertSort
{

	public void printResult(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public void insertSort() {

		int a[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};

		printResult(a);

		// insert sort algorithm
		int temp = 0;
		for (int i = 1; i < a.length; i++) {
			int j = i - 1;
			temp = a[i];
			for (; j >= 0 && temp < a[j]; j--) {
				a[j+1] = a[j];
			}
			a[j+1] = temp;
		}

		printResult(a);

	}

	public static void main(String [] args) {
		InsertSort is = new InsertSort();
		is.insertSort();
	}
}
