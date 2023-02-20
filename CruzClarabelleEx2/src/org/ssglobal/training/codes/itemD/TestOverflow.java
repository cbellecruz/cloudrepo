package org.ssglobal.training.codes.itemD;

public class TestOverflow {

	public static void main(String[] args) {
		byte x = 108;
		byte y = -34;
		
		System.out.println(Overflow.sumOverflow(x,y));
	}
}
