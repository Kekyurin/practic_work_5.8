package operrr;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		
		Scanner direction = new Scanner(System.in);
		System.out.println("ϳ�������� �� ����������?");
		String direction_chosen = direction.nextLine();
		System.out.println(direction_chosen);
		
		
		Scanner floor = new Scanner(System.in);
		System.out.println("�� ���� ������ ������ �����������?");
		int x = floor.nextInt();
		
		
		if (direction_chosen.equals("ϳ��������")) {
			if(x > 9 || x < 1) {
				System.out.println("��������� ����������� �� ����� ������");
			}else if (x == 2) {
				System.out.println("�������");
				System.out.println("�� �������� �� --> 3 <-- ������");
			}else if (x == 1) {
				System.out.println("�� ������� �������� �� ��� ������");
			}else {
				System.out.println("�� �������� �� --> " + x + " <-- ������");
			}
		}else if (direction_chosen.equals("����������")) {
			if(x > 9 || x < 1) {
				System.out.println("��������� ����������� �� ����� ������");
			}else if (x == 2) {
				System.out.println("�������");
				System.out.println("�� ���������� �� --> 3 <-- ������");
			}else if (x == 9) {
				System.out.println("��������� ���������� �� �� ������");
			}else {
				System.out.println("�� ���������� �� --> " + x + " <-- ������");
			}
		}
	}

}
