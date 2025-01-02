package practicejavafullstrack;

import java.util.Scanner;

public class ExceptionHandling {
	  float Id =14.2f;
	static  void checkID( int  Id) {
			if( Id<5282002){
				throw new  ArithmeticException(" I Am Sorry ; Your Oder is Not Found please May I check Your details.... ");
			}
			else {
				System.out.println(" Your Oder is Booked");
			}
		}
			public static void main(String[] args) {
			Scanner E1 = new Scanner (System.in);
			System.out.println(" Enter Your OTP Code :");
			int Id =E1.nextInt();
			checkID(Id);
			E1.close();
			
	}
}

