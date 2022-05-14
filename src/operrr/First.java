package operrr;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		System.out.println("Введіть число з проміжку(50 - 100) ");   //Тут пишуть (50 - 100)
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println("-- "+x);
		
		if (x < 50) {
			System.out.println("Число не міститься в проміжку (25; 100)");   //А Тут пишуть (25 - 100)
		}else if (x > 100) {
			System.out.println("Число не міститься в проміжку (25; 100)");
		}else {
			System.out.println("Число міститься в проміжку (25; 100)");
		}
	}

}
