package Sorting;

public class Bubble {
	public static int bubbleSort(int[]arr) {
		int Count=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					Count++;
					
				}
				
			}
			
		}
		return Count;
			
		}
	public static void main(String[]args) {
		int[]arr= {66,45,33,22,89,90};
		int swaps=bubbleSort(arr);
		System.out.println("Sorted Array:");
		for(int num:arr) {
			System.out.println(num+" ");
			
				
			}
		System.out.println("\nNumber of swaps: "+swaps);
		}
	}
	