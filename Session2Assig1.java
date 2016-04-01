package Variable;

import java.util.Scanner;

public class Session2Assig1 {
	public static void main(String[] args) {				
		Scanner age = new Scanner (System.in);
		System.out.println("Please enter Your Age:");
		int user_input_number = age.nextInt();
		
		if (user_input_number >=18)
			{ System.out.println("Congratulations! You are Eligible to Vote.");
			}
		else { System.out.println("Sorry! You are not Eligible to Vote.");
			}	
		
}
}
