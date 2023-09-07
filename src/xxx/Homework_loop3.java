package xxx;

public class Homework_loop3 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 9) {
			i++;
			int j = 0;
			do {
				j++;
				System.out.println(i + "*" + j + "=" + i * j + "\t");
			} while (j < 9);
		}
	}
}
