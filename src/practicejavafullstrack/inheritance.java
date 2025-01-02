package practicejavafullstrack;
class A {
	String s="Bharath :";
	int RollNumber=8033;
	long PhoneNumber=6305917919L;
	float  classPresentage =8.7f;
	double DegreePresentage =68.3;
	public void m1() {
		System.out.println("mul:"+48*78);
		System.out.println("sub:"+21+96);
		System.out.println("divi:"+10/20);
	}
	public void m2(String s ) {
		System.out.println(RollNumber);
		System.out.println(PhoneNumber);
		System.out.println(classPresentage);
		System.out.println(DegreePresentage);
	}
}
public class inheritance extends A{
	public void m3() {
		System.out.println(315615+165);
	}
	public static void main(String[] args) {
		inheritance IN= new inheritance();
		System.out.println(IN.s);
		System.out.println("Skill DevelopementClass:"+IN.RollNumber);
		System.out.println("PoneNumber:"+IN.PhoneNumber);
		System.out.println("10 class Marks:"+IN.classPresentage);
		System.out.println("Degree Marks:"+IN.DegreePresentage);
		IN.m1();
		IN.m2("Kareem");
		IN.m3();
		
		
	}
	}