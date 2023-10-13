package Pekan3;
import java.util.*;
public class CekUmur2 {
	public static void main(String[] args) {
		int umur;
		char sim;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input Umur Anda");
		umur = keyboard.nextInt();
		System.out.println("Apakah Anda Sudah Punya Sim? (Y/N) = ");
		sim = keyboard.next().charAt(0);
		keyboard.close();
		
		if((umur >= 17) &&(sim == 'Y')) {
			System.out.println("Anda Sudah Dewasa Dan Boleh membawa motor");
		} else {
			System.out.println("Anda masih anak - anak dan belum boleh membawa motor");
			
			
			
			
		}
	}
	

}
