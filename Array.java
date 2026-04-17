
public class Array {
	//Time complexity is O(n)

	public static void main(String[] args){
	int arr[]= {3,5,6,3,9,3};
	int target=8;
	int i=0;
	int j=arr.length-1;
	while(i<j) {
		int sum=arr[i]+arr[j];
		if(sum==target) {
			System.out.println("Pair found" +arr[i]+"and"+arr[j]);
			return ;
		}
			if(sum<target) {
				i++;
			}
			else {
				j--;
			}
		}
		System.out.println("Pair not found");
	}
}
////how to find negative number in array 

	
	
	
		// TODO Auto-generated method stub

	


