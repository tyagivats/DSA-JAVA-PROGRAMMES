package switchex;

public class MainSwitchEx {
	//Difference between switch and expression
	//expression returns value
	//when statement returns value called expression

	public static void main(String[] args) { {
////		case "wednesday"->"Monday";
////		case"tuesday" ->"Tuesday";
////		default->"no day";
	int day=4;
		String result=switch(day) {
		
		case 1,4->{
		System.out.println("this is case 1,4");
		yield"Monday";//YIELD KEYWORD
		}
		
		case 2,8,6->{
			System.out.println("this is case 2,8,6");
			yield"Saturday";			
		}
		default->"No day";
		};
		
		System.out.println(result);		// TODO Auto-generated method stub

	

}
	}
}

