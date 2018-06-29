package com.zjq.spring.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.stereotype.Service;

@Service
public class Test1 {

	
		public static void main2(String[] args) {
			int [] p = {5,6,9,4,2,10,99,36,99,56,3,100};

			ddd(p,0,p.length-1);
			
			System.out.println(Arrays.toString(p));
			
		}
		
		private static void ddd(int[] p,int start,int end) {
			if(start < end) {
				int l = qusort(p,start,end);
				ddd(p, start, l-1);
				ddd(p, l+1, end);
			}
		}

		public static int qusort(int[] a ,int i ,int j){
			int in = a[i];

				while(i < j) {
					while(i < j && in <= a[j]) {
						j--;
					}
					a[i] = a[j];
					while(i < j && in >= a[i]) {
						i++;
					}
					a[j] = a[i];

				}
				a[i] = in;
			return i;
		}
		public static void main23(String[] args) {
			int [] p = {5,6,9,4,2,10,99,36,99,56,3,100};
			
			long currentTimeMillis = System.currentTimeMillis();
			
			int tem ;
			for (int i = 0; i < p.length; i++) {
				for (int j = 0; j < p.length - i -1; j++) {
					if(p[j+1] < p[j]) {
						tem = p[j];
						p[j] = p[j+1];
						p[j+1] = tem;
					}
				}
			}
			System.out.println(Arrays.toString(p));
			System.out.println(System.currentTimeMillis()-currentTimeMillis);

		}
		public static void main12(String[] args) {
			int [] p = {5,6,9,4,2,14,99,36,99,56,3,100};

			ddd(p,0,p.length-1);
			System.out.println(Arrays.toString(p));
			
			int jj = jj(p,99);
			System.out.println(jj);
			

		}

		private static int jj(int[] p ,int a) {
			int lo=0;
	        int hi=p.length-1;
	        int mid;
	        while(lo<=hi){
	            mid=(lo+hi)/2;
	            if(p[mid]==a){
	                return mid;
	            }else if(p[mid]<a){
	                lo=mid+1;
	            }else{
	                hi=mid-1;
	            }
	        }
	        return -1;
	    }
		
		 public static void main2222(String[] args) {
			 Test1 test = new Test1();
		        test.oomMethod();
		    }

		    public void oomMethod(){
		        while(true){
		            new Thread(new Runnable() {
		                @Override
		                public void run() {
		                    loopMethod();
		                }
		            }).start();;
		        }
		    }

		    private void loopMethod(){
		        while(true){

		        }
		    }

		public static void main(String[] args) {
			
			List<String> list1 = new ArrayList<>();
			List<String> list2 = new ArrayList<>();

			List<String> list3 = new ArrayList<>();
			
			System.out.println(list1);
			System.out.println(list2);
			System.out.println(list3);

			list3.add("kk");
			list1.add("ww");
			list2.add("mm");
			System.out.println("--------------------------");

			System.out.println(list1);
			System.out.println(list2);
			System.out.println(list3);
			System.out.println("--------------------------");

			list2=list1;
			list1=list3;
			
			System.out.println(list1);
			System.out.println(list2);
			System.out.println(list3);
			System.out.println("--------------------------");

			System.out.println(list1==list2);
			System.out.println(list3==list2);
			System.out.println(list3==list1);


		}
}
