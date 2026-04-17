package linear;

public class LS {

	public static void main(String[] args) {
		int[]arr= {5,2,8,1,9,3};
		int index=8;
		int res=1;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==index) {
				System.out.println(index+"found");
				res=1;
				break;
			}
		}
		if(res==-1) {
			System.out.println(index+"not found");
		}
		// TODO Auto-generated method stub

	}

}
