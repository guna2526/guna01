package org.scanner;

import java.util.Scanner;

public class scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		String Id = scan.nextLine();
		long tamil = scan.nextLong();
		long eng = scan.nextLong();
		long math = scan.nextLong();
		long scin = scan.nextLong();
		long social = scan.nextLong();
		
		
		System.out.println("Hi! "+name+" Your Id is "+Id+"Your Total is "+(tamil+eng+math+scin+social)+"your avrg is"+((tamil+eng+math+scin+social)/5));
	}
	
	

}
