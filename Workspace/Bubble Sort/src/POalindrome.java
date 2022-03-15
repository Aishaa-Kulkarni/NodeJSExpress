import java.util.Scanner;

public class POalindrome {

	Scanner s = new Scanner(System.in);
	System.out.println("String :");
	 String input = s.nextLine();
	 
	 int i=0;
	 int j=input.length()-1;
	 
	 while(i<j) {
		 if(input.charAt(i) != input.charAt(j)) {
			return false; 
		 }
	 }
}
