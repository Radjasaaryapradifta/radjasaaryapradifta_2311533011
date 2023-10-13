package Pekan3;
import java.util.*;

public class Nilai {
	
	public static void main(String [] args) {
		int nilai;
		System.out.println("Input Nilai = ");
		Scanner keyboard = new Scanner (System.in);
		nilai = keyboard.nextInt();
		keyboard.close();
		
		if (nilai > 80); {
			System.out.println("A");
			
		}
		
		if (nilai >= 70) {
			System.out.println("B");
		}
		
		else if (nilai >= 60) {
			System.out.println("C");
		}
		
		else if (nilai >= 50) {
			System.out.println("D");
		}
		
		else {
			System.out.println("E");
			
		}
	}

}
