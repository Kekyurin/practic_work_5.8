package operrr;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		System.out.println("������ ����� � �������(50 - 100) ");   //��� ������ (50 - 100)
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println("-- "+x);
		
		if (x < 50) {
			System.out.println("����� �� �������� � ������� (25; 100)");   //� ��� ������ (25 - 100)
		}else if (x > 100) {
			System.out.println("����� �� �������� � ������� (25; 100)");
		}else {
			System.out.println("����� �������� � ������� (25; 100)");
		}
	}

}
