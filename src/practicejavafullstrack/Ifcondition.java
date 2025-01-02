package practicejavafullstrack;

public class Ifcondition {
		String s="Bharat"; 
	    static int age=18;
			public static void main(String[] args) {
				Ifcondition t=new Ifcondition();
				if(age<14) {
			System.out.println("CONGRATULATION YOUR ELGIBLE FOR VOTE");
				}
				else {
					System.out.println("OPPS,SORRY ARE A KID, YOUR NOT ELGIBLE FOR VOTE");
					System.out.println("VOTER NAME="+t.s);
					System.out.println("VOTER AGE ="+t.age);
				}
		}
	}


