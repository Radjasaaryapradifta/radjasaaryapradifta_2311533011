package Pekan3;

import java.util.Scanner;

public class multiif {
	public static void main(String[] args) {
		int umur;
		char sim;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input Umur Anda = ");
		umur = keyboard.nextInt();
		
		System.out.println("Apakah Anda Sudah Punya Sim? (Y/N) = ");
		sim = keyboard.next().charAt(0);
		keyboard.close();
		
		if((umur >= 17) &&(sim == 'Y')) {
			System.out.println("Anda Sudah Dewasa Dan Boleh membawa motor");
		}
		if((umur >= 17) &&(sim != 'Y')) {
			System.out.println("Anda Sudah Dewasa namun Boleh membawa motor");
		}
		if((umur < 17) &&(sim == 'Y')) {
			System.out.println("Anda Belum Dewasa namun Boleh membawa motor");
		}
		else {
			System.out.println("Anda masih Anak -anak dan belum boleh mengemudi");
		}
	}
}