package xxx;

public class Homework_loop2 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			int j = 0;
			do {

				j++;
				System.out.println(i + "*" + j + "=" + i * j + "\t");
			} while (j < 9);

		}
	}
}
