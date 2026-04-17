package Sorting;

public class Merge {
	public static void main(String[]args) {
		Object arr;
		if(arr.length<=1) {
			return;
			int mid=arr.length/2;
			int[] l=new int [mid];
			int[] r=new int [arr.length-mid];
			for(int i=0;i<mid;i++) {
				l[i]=arr[i];
				for(int i=mid;i<arr.length;i++) {
					r[i-mid]=arr[i];
					merge(l);
					merge(r);
					merge(arr,l,r);
				}
			}
		}
		public static void merges(int[]arr,int[]l,int[]r) {
			int i=0,j=0,k=0;
			while (i<length && j<r.length) {
				if(l[i]<=r[j]) {
					arr[k++]=l[i++];
				}
				else
					arr[k++]=r[j++];
			}
			while (i<length)
				arr[k++]=l[i++];
			while(j<r.length)
				arr[k++]=r[j++];
			
		}
		public static void main(String[]args) {
			int[]arr= {78,67,34,82,88,9,5};
			merges(arr);
					
			}
		
	}

}
