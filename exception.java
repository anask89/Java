package handling;

import java.util.Scanner;

public class exception {
	void divideNumbers() throws ArithmeticException {
		Scanner inp = new Scanner(System.in);
		  System.out.println("Enter number 1 : ");
		  int int1 = inp.nextInt();
		  System.out.println("Enter number 2 : ");
		  int int2 = inp.nextInt();
		  
		  int ans = int1/int2;
		  
		  if(int1 != (int)(int1) || int2 == (int)(int1)) {
			  throw new ArithmeticException("Input is invalid,Please give integer number etc.");
		  }else {
			  System.out.println("Answer is : " + ans);
		  }
		}
		
	  
	public static void main(String[] args) {
       exception k =  new exception();
       k.divideNumbers();
       
}
}