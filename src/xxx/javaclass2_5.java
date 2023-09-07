package xxx;

public class javaclass2_5 {
	public static void main(String[] args) {
		int count = 0;
		int x = 0;

		while (x < 49) {
			x++;

			if (x % 10 == 4 || x / 10 == 4) {
				continue;

			}
			count++;
			System.out.print(x + " ");
		}
		System.out.println("共有:" + count);
	}

}
