package operrr;

public class Second {

	public static void main(String[] args) {
		int n = 295;
		int b = n / 100;
		int c = n % 100 / 10;
		int d = n % 10;
		if (b >= c && b >= d) {
			System.out.println(b+ " <-- ����������� �����");
		}else if (c >= b && c>= d) {
			System.out.println(c+ " <-- ����������� �����");
		}else {
			System.out.println(d+ " <-- ����������� �����");
		}
	}

}
