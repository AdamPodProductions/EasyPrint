package easyprint.testing;

import easyprint.api.EasyPrint;

public class Main {
	public static void main(String[] args) {
		EasyPrint.print("Hello");
		EasyPrint.print(" World");
		
		EasyPrint.lineBreak();
		
		EasyPrint.println("Hello");
		EasyPrint.println("World");
		
		int[] ints = {7, 2, 1, 3, 12, 5, 3, 14, 120, 4};
		EasyPrint.println(ints);
		EasyPrint.println(EasyPrint.arrayContains(ints, 2));
		EasyPrint.println(EasyPrint.bubbleSort(ints));
		
		EasyPrint.lineBreak();

		EasyPrint.println(EasyPrint.reverse("tseT"));
		EasyPrint.println(EasyPrint.Lowercase("HELLO"));
		EasyPrint.println(EasyPrint.Uppercase("world"));
		
		EasyPrint.lineBreak(2);
		
		EasyPrint.println(EasyPrint.ProperNoun("hElLO"));
	}
}
