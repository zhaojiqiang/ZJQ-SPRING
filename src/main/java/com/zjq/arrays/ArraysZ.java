package com.zjq.arrays;

import java.util.Arrays;

public class ArraysZ {
	
	private long[] a;
	private int nElems;
	
	public ArraysZ(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	public int find(long searchKey) {
		int low = 0;
		int high = nElems;
		int midd;
		
		while(low <= high) {
			midd = (low + high) / 2;
			if(a[midd] == searchKey) {
				return midd;
			}else if(a[midd] > searchKey){
				high = midd - 1;
			}else {
				low = midd + 1;
			}
		}
		return -1;
	}

	public void insert(long value) {
		if(a.length-1 == nElems) {
			//扩容
			long[] a2 = new long[a.length + a.length / 2];
			System.arraycopy(a, 0, a2, 0,
                     nElems);
			a = a2;
		}
		int i;
		for (i = 0; i < nElems; i++) {
			if(a[i] > value) {
				break;
			}
		}
		for (int j = nElems; j > i; j--) {
			a[j] = a[j-1];
		}
		a[i] = value;
		nElems ++ ;
	}
	
	public boolean delete(long value) {
		int index = find(value); 
		System.out.println(index);
		if(0 > index) {
			return false;
		}
		for (int i = index; i < nElems; i++) {
			a[i] = a[i + 1];
		}
		nElems --;
		return true;
	}
	
	public void display() {
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		ArraysZ a = new ArraysZ(20);
		for (int i = 0; i < 100000; i++) {
			a.insert(i);
			a.display();
		}

	}
}
