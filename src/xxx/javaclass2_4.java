package xxx;

public class javaclass2_4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == j) { // 判斷1,4,9,16,25....為1*1,2*2,3*3....故下判斷句為內外圈數值相等時才印出
					System.out.println(i * j);
				}
			}
		}
	}
}
