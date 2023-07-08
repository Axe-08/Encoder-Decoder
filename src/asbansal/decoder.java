package asbansal;

import java.util.Scanner;

public class decoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter parameters");
		System.out.println("1st parameter");
			int p1 = sc.nextInt();
		System.out.println("2nd parameter");
			int p2 = sc.nextInt();
		System.out.println("3rd parameter");
			int p3 = sc.nextInt();
		System.out.println("4th parameter");
			int p4 = sc.nextInt();
		System.out.println("5th parameter");
			int p5 = sc.nextInt();
		System.out.println("6th parameter");
	 		int p6 = sc.nextInt();
	//rule tab
	
		int rule1 = 3 + 2*p1*p5;
		int rule2 = 8*p1 - 3*p1 + p4 ;
		int rule3 = p3*p6 - p2 + p4*p1;
		int rule4 = p1 + p2 + p4 + p6 - p2*p5;
		int rule5 = p3*p3 + p2*p4 - p2*p5;
		int rule6 = p6*p1 + p2 + p3*p5 - p3;	
	
	// word input
		System.out.println("enter 6 charactered word you want to encode :");
		  	String word = sc.next();
		sc.close();
	
	// word coding
		char char1 = word.charAt(0);
			int intChar1 = char1;
				intChar1 = intChar1 - rule1;
			char modChar1 = (char)intChar1;
		
		char char2 = word.charAt(1);
			int intChar2 = char2;
				intChar2 = intChar2 - rule2;
			char modChar2 = (char)intChar2;
		
		char char3 = word.charAt(2);
			int intChar3 = char3;
				intChar3 = intChar3 - rule3;	
			char modChar3 = (char)intChar3;

		char char4 = word.charAt(3);
			int intChar4 = char4;
				intChar4 = intChar4 - rule4;	
			char modChar4 = (char)intChar4;

		char char5 = word.charAt(4);
			int intChar5 = char5;
				intChar5 = intChar5 - rule5;	
			char modChar5 = (char)intChar5;

		char char6 = word.charAt(5);
			int intChar6 = char6;
				intChar6 = intChar6 - rule6;	
			char modChar6 = (char)intChar6;
	// code output
	System.out.println("decoded word is:");
	System.out.print(modChar1);
	System.out.print(modChar2);
	System.out.print(modChar3);
	System.out.print(modChar4);
	System.out.print(modChar5);
	System.out.println(modChar6);
	
	}

}
