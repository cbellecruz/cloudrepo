package org.ssglobal.training.codes.itemC;

class GeneralMethods {
	
	public void powersOfTwo() {
		int powers = 1;
		
		for (int count = 1; count <= 10; count++) {
			powers *= 2;
			System.out.println(powers);
		}
	}
	
	public void alarm(int prints) {
		for (int count = 1; count <= prints; count++) {
			System.out.println("Alarm!");	
		}
	}
	
	public short sum100() {
		short sum = 0;
		
		for (int count = 1; count <= 100; count++) {
			sum += count;		
		}
		return sum;
	}
	
	public int sumRange(int x, int y) {
		int sum = 0;
		
		for (int count = x; count <= y; count++) {
			sum += count;		
		}
		return sum;
	}
	
	public int maxOfTwo(int a, int b) {
		int result = a;
		
		if (a < b) {
			result = b;
		} else {
			result = a;
		}
		return result;	
	}
	
	public boolean larger(double number1, double number2) {
		return (number1 > number2) ? true : false;
	}
	
	public boolean evenlyDivisible (int num1, int num2) {
		return (num1 % num2) == 0 ? true : false; 	
	}
	
}
