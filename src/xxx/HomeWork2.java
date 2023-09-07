package xxx;
//• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
public class HomeWork2 {
	public static void main (String[]args) {
		int eggs=200;
		int a_few_dozen=eggs/12;
		int a_few=eggs%12;
			System.out.println("200顆蛋共是"+a_few_dozen+"打"+"加"+a_few+"顆");
	}
}
