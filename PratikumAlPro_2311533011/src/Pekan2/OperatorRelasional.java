package Pekan2;
import java.util.*;
public class OperatorRelasional {
	public static void main(String[] args) {
		int n1;
		int n2;
		boolean hasil;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input angka-1");
		n1 = keyboard.nextInt();
		System.out.print("Input angka-2");
		n2 = keyboard.nextInt();
		System.out.println();
		hasil = n1 < n2; // 
		System.out.println("N1 < N2 = " + hasil);
		hasil = n1 > n2; // 
		System.out.println("N1 > N2 = " + hasil);
		hasil = n1 <= n2; // 
		System.out.println("N1 <= N2 = " + hasil);
		hasil = n1 >= n2; // 
		System.out.println("N1 >= N2 = " + hasil);
		hasil = n1 == n2; // 
		System.out.println("N1 == N2 = " + hasil);
		hasil = n1 != n2; // 
		System.out.println("N1 != N2 = " + hasil);

}
}