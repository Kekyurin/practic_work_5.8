package operrr;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		
		Scanner direction = new Scanner(System.in);
		System.out.println("Підніматись чи Спуститись?");
		String direction_chosen = direction.nextLine();
		System.out.println(direction_chosen);
		
		
		Scanner floor = new Scanner(System.in);
		System.out.println("На який поверх хочете відправитись?");
		int x = floor.nextInt();
		
		
		if (direction_chosen.equals("Підніматись")) {
			if(x > 9 || x < 1) {
				System.out.println("Неможливо відправитись на даний поверх");
			}else if (x == 2) {
				System.out.println("Помилка");
				System.out.println("Ви піднялись на --> 3 <-- поверх");
			}else if (x == 1) {
				System.out.println("Не можливо піднятись на цей поверх");
			}else {
				System.out.println("Ви піднялись на --> " + x + " <-- поверх");
			}
		}else if (direction_chosen.equals("Спуститись")) {
			if(x > 9 || x < 1) {
				System.out.println("Неможливо відправитись на даний поверх");
			}else if (x == 2) {
				System.out.println("Помилка");
				System.out.println("Ви спустились на --> 3 <-- поверх");
			}else if (x == 9) {
				System.out.println("Неможливо спуститись на це поверх");
			}else {
				System.out.println("Ви спустились на --> " + x + " <-- поверх");
			}
		}
	}

}
