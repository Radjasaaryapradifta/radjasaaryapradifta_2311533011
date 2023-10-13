package Pekan2;
import java.util.*;
public class CekUmur {
	public static void main(String[] args) {
		int umur;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input Umur Anda");
		umur = keyboard.nextInt();
		keyboard.close();
		if(umur > 17) {
			System.out.println("Anda Sudah Dewasa");
		} else {
			System.out.println("Anda Belum Dewasa");
		}
	}
	

}
