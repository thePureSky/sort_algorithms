package com.leaf.internalSort;

/**
 * 2016-07-10
 * @author leaf
 *
 */

public class SelectSort {
	
	public void printResult(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
	
	public void selectSort() {
		int a[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};

        printResult(a);

        // select sort algorithm
        int position = 0;
        for(int i = 0; i < a.length; i++) {
        	position = i;
        	int temp = a[i];
        	for (int j = i + 1; j < a.length; j++) {
        		if (a[j] < temp) {
        			temp = a[j];
        			position = j;
        		}
        	}
        	a[position] = a[i];
        	a[i] = temp;
        }
        
        printResult(a);
	}
	
	public static void main(String[] args) {
		new SelectSort().selectSort();
	}

}
