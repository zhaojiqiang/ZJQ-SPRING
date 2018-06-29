package com.zjq.arrays;

import java.util.Arrays;

public class ArrayBub {

	
		private long[] a;
		
		private int nElems;
		
		public ArrayBub(int max) {
			a = new long[max];
			nElems = 0;
		}
		
		public void insert(long v) {
			a[nElems] = v;
			nElems ++;
		}
		
		public void disPlay() {
			System.out.println(Arrays.toString(a));
		}
		
		public void bubbleSort() {
			for (int i = 0; i < nElems; i++) {
				for (int j = 0; j < nElems - i; j++) {
					if(a[j] > a[j + 1]) {
						long temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp; 
					}
				}
			}
		}
		
		public static void main(String[] args) {
			ArrayBub al = new ArrayBub(20);
			al.insert(12);
			al.insert(45);
			al.insert(23);
			al.insert(3);
			al.insert(6);
			al.insert(10);
			al.disPlay();
			al.bubbleSort();
			al.disPlay();
		}
		
}
