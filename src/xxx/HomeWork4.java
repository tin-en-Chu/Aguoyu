package xxx;
//• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
public class HomeWork4 {
	public static void main (String[] args) {
		final double PI = 3.1415;
		double  radius = 5;
		double  circumference = radius*2*PI;
			System.out.println("圓周長為:"+circumference);
		double areas  = Math.pow(radius, 2)*PI;
			System.out.println("圓面積為:"+areas);
	}
}
