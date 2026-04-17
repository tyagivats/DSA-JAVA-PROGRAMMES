package varp;
//in java 10 var keyword use 
//local variable type infrence(typecasting)
//initialization is must in var 
class Message{
	void getMessage() {
		System.out.println("this is var!");
	}
}

public class MianVar {

	public static void main(String[] args) {
		//text block 
		String msg="""
				line 1;
				line 2;
				line 4;
				""";
		System.out.println(msg);
	var m=new Message();
	m.getMessage();
	var n1=10;
	var n2=20;
	var s=n1+n2;
		System.out.println("Sum="+s);

	}

}
