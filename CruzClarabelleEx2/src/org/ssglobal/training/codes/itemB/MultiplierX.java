package org.ssglobal.training.codes.itemB;

public class MultiplierX {
		// declare data
		public double firstNum;
		public double secondNum;
		public double product;
	
		public void multiply() {
			//initialize values
			firstNum = 10;
			secondNum = 20.5;
		
			// calculate result
			product = secondNum * firstNum;
		
			// output results
			System.out.print(firstNum + " * ");
			System.out.print(secondNum + " = ");
			System.out.println(product);
		}
}
