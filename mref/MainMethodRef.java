package mref;//
//instance method
//static method
//constructor
//:: refrence operator
class Circle{
	Circle(){
		System.out.println("constructor");
	}
	Circle(int num){
		System.out.println("constructor 2");
	}
 	double area(int r) {
		return  Math.PI*r*r;
	}
}
interface CircleInfo{
	void getInfo();
}
interface Area{
double  getArea(int num);
}

public class MainMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		Area ca=c::area;//method refrencing  
		System.out.println("Area="+ca.getArea(34));
		CircleInfo ci=Circle::new;
		ci.getInfo();

	}

}
