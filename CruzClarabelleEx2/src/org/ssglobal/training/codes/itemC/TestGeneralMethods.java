package org.ssglobal.training.codes.itemC;

public class TestGeneralMethods {

	public static void main(String[] args) {
		GeneralMethods gm = new GeneralMethods();
		gm.powersOfTwo();
		
		int prints = 5;
		gm.alarm(prints);

		gm.sum100();
		
		int x = 12, y = 20;
		gm.sumRange(x, y);
		
		int a = 5, b = 10;
		gm.maxOfTwo(a, b);
		
		double number1 = 40.1, number2 = 22.1;
		gm.larger(number1, number2);
		
		int num1 = 201, num2 = 345;
		gm.evenlyDivisible(num1, num2);
	}
}
