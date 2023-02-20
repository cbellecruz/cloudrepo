package org.ssglobal.training.codes.itemB;

public class ArithmeticX {
		// declare variables
		float num1, num2, num3, average;
		
		public void compute() {
			// input data
			num1 = 1.1f;
			num2 = 2.2f;
			num3 = 3.3f;
			
			// calculate average
			average = (num1 + num2 + num3) / 3;
			
			// print results
			System.out.print(num1 + ", " + num2 + " & " + num3 );
			System.out.println(" averages to " + average);
		}
}
