package baitapclass.sohoc;

import java.util.Scanner;

public class SoHocMain {

	public static void main(String[] args) {
		SoHoc sh = new SoHoc();

		System.out.println("Enter two number: ");
		sh.inputInfo();

		System.out.println("Two number just entered: ");
		sh.outputInfo();

		System.out.println("Addition: " + sh.addition());
		System.out.println("Subtract: " + sh.subtract());
		System.out.println("Multi: " + sh.multi());
		System.out.println("Division: " + sh.division());
	}
}
