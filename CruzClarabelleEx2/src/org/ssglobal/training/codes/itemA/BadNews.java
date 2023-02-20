package org.ssglobal.training.codes.itemA;

public class BadNews {
	
	public static int maxOdd = 21;
		
		/* 
		 * print each odd number 
		 */
		public static void writeOdds() {
			for (int count = 1; count <= (maxOdd); count += 2) {
				System.out.println(count + " ");
			}
			
			// print the last odd number
			System.out.print("\n");
		}
		
		public static void main(String[] args) {
			// write all odds up to 21
			writeOdds();
			
			// now, write all odds up to 11
			maxOdd = 11;
			writeOdds();
		}
}
